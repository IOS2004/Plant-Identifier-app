package com.example.api;

import android.content.Intent;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.gson.Gson;

import java.io.File;
import java.io.IOException;
import java.util.List;

import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class MainActivity extends AppCompatActivity {

    boolean success = false;
    private static final String API_KEY = "2b10TIqR8QWfmkbHYhHqF3zru";
    private static final String PROJECT = "all";
    private static final String ORGAN1 = "leaf";
    private static final String API_URL = "https://my-api.plantnet.org/v2/identify/" + PROJECT + "?api-key=";
    private static final String API_SIMSEARCH_OPTION = "&include-related-images=true"; // optional: get most similar images
    private static final String API_LANG = "&lang=fr"; // default: en
    File imageFile1;
    Uri img1u;
    TextView disp;
    ProgressBar prog;
    ImageView img;
    Drawable defImg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        prog = findViewById(R.id.progressBar4);
        prog.setVisibility(View.GONE);
        Button img1 = findViewById(R.id.button);
        Button reset = findViewById(R.id.button2);
        TextView a = findViewById(R.id.textView3);
        disp = findViewById(R.id.textView);
        img = findViewById(R.id.imageView);
        defImg = img.getDrawable();

        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a.setText("");
                Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
                intent.setType("image/*");
                startActivityForResult(intent, 1); // Start activity for result
            }
        });
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                disp.setText("");
                a.setText("");
                img.setImageDrawable(defImg);
                prog.setVisibility(View.GONE);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == RESULT_OK) {
            if (requestCode == 1) {
                img1u = data.getData();
                imageFile1 = getFileFromUri(img1u);
            }
            // Now check if both images have been selected and process them
            if (imageFile1 != null && imageFile1.exists()) {
                img.setImageURI(img1u);
                processImages();
            }
        }
    }

    private void processImages() {
        disp.setText("loading....");
        prog.setVisibility(View.VISIBLE);
        new ImageProcessingTask().execute(imageFile1);
    }

    private class ImageProcessingTask extends AsyncTask<File, Void, String> {
        @Override
        protected String doInBackground(File... files) {
            OkHttpClient client = new OkHttpClient();
            RequestBody requestBody = new MultipartBody.Builder()
                    .setType(MultipartBody.FORM)
                    .addFormDataPart("images", "image_1.jpeg",
                            RequestBody.create(MediaType.parse("image/jpeg"), files[0]))
                    .addFormDataPart("organs", ORGAN1)
                    .build();
            Request request = new Request.Builder().url(API_URL + API_KEY).post(requestBody).build();
            try {
                Response response = client.newCall(request).execute();
                if (response.isSuccessful()) {
                    assert response.body() != null;
                    success = true;
                    return response.body().string();
                } else {
                    success = false;
                    return "Request failed with code: " + response.code();
                }
            } catch (IOException e) {
                e.printStackTrace();
                success = false;
                return "Exception: " + e.getMessage();
            }
        }

        @Override
        protected void onPostExecute(String result)
        {
            prog.setVisibility(View.GONE);
            disp.setText(result);
            if (result.compareTo("Request failed with code: 404") == 0)
            {
                disp.setText("Plant species not found.");
            }

            if (success)
            {
                parseAndDisplay(result);
            }
        }
    }
    private File getFileFromUri(Uri uri) {
        String filePath = null;
        if (uri != null) {
            if ("content".equals(uri.getScheme())) {
                try (Cursor cursor = getContentResolver().query(uri, new String[]{MediaStore.Images.Media.DATA}, null, null, null)) {
                    if (cursor != null && cursor.moveToFirst()) {
                        int columnIndex = cursor.getColumnIndexOrThrow(MediaStore.Images.Media.DATA);
                        filePath = cursor.getString(columnIndex);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else if ("file".equals(uri.getScheme())) {
                filePath = uri.getPath();
            }
        }
        if (filePath != null) {
            return new File(filePath);
        }
        return null;
    }
    private void parseAndDisplay(String json)
    {
        Gson gson = new Gson();
        Example example = gson.fromJson(json, Example.class);
        List<Result> results = example.getResults();
        Result best = results.get(0);
        Species species = best.getSpecies();
        String matched = "Best Matched: " + example.getBestMatch() + '\n';
        TextView re = findViewById(R.id.textView3);
        disp.setText(matched);
        String ret = "Scientific Name: " + species.getScientificName() + '\n';
        ret += "Common Names: ";
        List<String> common = species.getCommonNames();
        for (String c: common)
        {
            ret += c + ", ";
        }
        ret = ret.substring(0, ret.length() - 2);
        ret += '.';
        re.setText(ret);
        success = false;
    }

}