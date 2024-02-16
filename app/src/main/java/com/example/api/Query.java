
package com.example.api;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Query {

    @SerializedName("project")
    @Expose
    private String project;
    @SerializedName("images")
    @Expose
    private List<String> images;
    @SerializedName("organs")
    @Expose
    private List<String> organs;
    @SerializedName("includeRelatedImages")
    @Expose
    private Boolean includeRelatedImages;
    @SerializedName("noReject")
    @Expose
    private Boolean noReject;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Query() {
    }

    /**
     * 
     * @param images
     * @param organs
     * @param noReject
     * @param project
     * @param includeRelatedImages
     */
    public Query(String project, List<String> images, List<String> organs, Boolean includeRelatedImages, Boolean noReject) {
        super();
        this.project = project;
        this.images = images;
        this.organs = organs;
        this.includeRelatedImages = includeRelatedImages;
        this.noReject = noReject;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public List<String> getImages() {
        return images;
    }

    public void setImages(List<String> images) {
        this.images = images;
    }

    public List<String> getOrgans() {
        return organs;
    }

    public void setOrgans(List<String> organs) {
        this.organs = organs;
    }

    public Boolean getIncludeRelatedImages() {
        return includeRelatedImages;
    }

    public void setIncludeRelatedImages(Boolean includeRelatedImages) {
        this.includeRelatedImages = includeRelatedImages;
    }

    public Boolean getNoReject() {
        return noReject;
    }

    public void setNoReject(Boolean noReject) {
        this.noReject = noReject;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Query.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("project");
        sb.append('=');
        sb.append(((this.project == null)?"<null>":this.project));
        sb.append(',');
        sb.append("images");
        sb.append('=');
        sb.append(((this.images == null)?"<null>":this.images));
        sb.append(',');
        sb.append("organs");
        sb.append('=');
        sb.append(((this.organs == null)?"<null>":this.organs));
        sb.append(',');
        sb.append("includeRelatedImages");
        sb.append('=');
        sb.append(((this.includeRelatedImages == null)?"<null>":this.includeRelatedImages));
        sb.append(',');
        sb.append("noReject");
        sb.append('=');
        sb.append(((this.noReject == null)?"<null>":this.noReject));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
