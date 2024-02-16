
package com.example.api;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Species {

    @SerializedName("scientificNameWithoutAuthor")
    @Expose
    private String scientificNameWithoutAuthor;
    @SerializedName("scientificNameAuthorship")
    @Expose
    private String scientificNameAuthorship;
    @SerializedName("genus")
    @Expose
    private Genus genus;
    @SerializedName("family")
    @Expose
    private Family family;
    @SerializedName("commonNames")
    @Expose
    private List<String> commonNames;
    @SerializedName("scientificName")
    @Expose
    private String scientificName;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Species() {
    }

    /**
     * 
     * @param commonNames
     * @param scientificNameAuthorship
     * @param genus
     * @param scientificName
     * @param scientificNameWithoutAuthor
     * @param family
     */
    public Species(String scientificNameWithoutAuthor, String scientificNameAuthorship, Genus genus, Family family, List<String> commonNames, String scientificName) {
        super();
        this.scientificNameWithoutAuthor = scientificNameWithoutAuthor;
        this.scientificNameAuthorship = scientificNameAuthorship;
        this.genus = genus;
        this.family = family;
        this.commonNames = commonNames;
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

    public Genus getGenus() {
        return genus;
    }

    public void setGenus(Genus genus) {
        this.genus = genus;
    }

    public Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {
        this.family = family;
    }

    public List<String> getCommonNames() {
        return commonNames;
    }

    public void setCommonNames(List<String> commonNames) {
        this.commonNames = commonNames;
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
        sb.append(Species.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("scientificNameWithoutAuthor");
        sb.append('=');
        sb.append(((this.scientificNameWithoutAuthor == null)?"<null>":this.scientificNameWithoutAuthor));
        sb.append(',');
        sb.append("scientificNameAuthorship");
        sb.append('=');
        sb.append(((this.scientificNameAuthorship == null)?"<null>":this.scientificNameAuthorship));
        sb.append(',');
        sb.append("genus");
        sb.append('=');
        sb.append(((this.genus == null)?"<null>":this.genus));
        sb.append(',');
        sb.append("family");
        sb.append('=');
        sb.append(((this.family == null)?"<null>":this.family));
        sb.append(',');
        sb.append("commonNames");
        sb.append('=');
        sb.append(((this.commonNames == null)?"<null>":this.commonNames));
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
