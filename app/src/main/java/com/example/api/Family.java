
package com.example.api;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class Family {

    @SerializedName("scientificNameWithoutAuthor")
    @Expose
    private String scientificNameWithoutAuthor;
    @SerializedName("scientificNameAuthorship")
    @Expose
    private String scientificNameAuthorship;
    @SerializedName("scientificName")
    @Expose
    private String scientificName;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Family() {
    }

    /**
     * 
     * @param scientificNameAuthorship
     * @param scientificName
     * @param scientificNameWithoutAuthor
     */
    public Family(String scientificNameWithoutAuthor, String scientificNameAuthorship, String scientificName) {
        super();
        this.scientificNameWithoutAuthor = scientificNameWithoutAuthor;
        this.scientificNameAuthorship = scientificNameAuthorship;
        this.scientificName = scientificName;
    }

    public String getScientificNameWithoutAuthor() {
        return scientificNameWithoutAuthor;
    }

    public void setScientificNameWithoutAuthor(String scientificNameWithoutAuthor) {
        this.scientificNameWithoutAuthor = scientificNameWithoutAuthor;
    }

    public String getScientificNameAuthorship() {
        return scientificNameAuthorship;
    }

    public void setScientificNameAuthorship(String scientificNameAuthorship) {
        this.scientificNameAuthorship = scientificNameAuthorship;
    }

    public String getScientificName() {
        return scientificName;
    }

    public void setScientificName(String scientificName) {
        this.scientificName = scientificName;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Family.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("scientificNameWithoutAuthor");
        sb.append('=');
        sb.append(((this.scientificNameWithoutAuthor == null)?"<null>":this.scientificNameWithoutAuthor));
        sb.append(',');
        sb.append("scientificNameAuthorship");
        sb.append('=');
        sb.append(((this.scientificNameAuthorship == null)?"<null>":this.scientificNameAuthorship));
        sb.append(',');
        sb.append("scientificName");
        sb.append('=');
        sb.append(((this.scientificName == null)?"<null>":this.scientificName));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
