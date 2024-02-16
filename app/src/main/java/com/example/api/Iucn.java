
package com.example.api;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class Iucn {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("category")
    @Expose
    private String category;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Iucn() {
    }

    /**
     * 
     * @param id
     * @param category
     */
    public Iucn(String id, String category) {
        super();
        this.id = id;
        this.category = category;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Iucn.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("category");
        sb.append('=');
        sb.append(((this.category == null)?"<null>":this.category));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
