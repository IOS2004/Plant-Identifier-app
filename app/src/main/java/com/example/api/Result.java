
package com.example.api;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Result {

    @SerializedName("score")
    @Expose
    private Double score;
    @SerializedName("species")
    @Expose
    private Species species;
    @SerializedName("gbif")
    @Expose
    private Gbif gbif;
    @SerializedName("powo")
    @Expose
    private Powo powo;
    @SerializedName("iucn")
    @Expose
    private Iucn iucn;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Result() {
    }

    /**
     * 
     * @param score
     * @param powo
     * @param species
     * @param iucn
     * @param gbif
     */
    public Result(Double score, Species species, Gbif gbif, Powo powo, Iucn iucn) {
        super();
        this.score = score;
        this.species = species;
        this.gbif = gbif;
        this.powo = powo;
        this.iucn = iucn;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public Species getSpecies() {
        return species;
    }

    public void setSpecies(Species species) {
        this.species = species;
    }

    public Gbif getGbif() {
        return gbif;
    }

    public void setGbif(Gbif gbif) {
        this.gbif = gbif;
    }

    public Powo getPowo() {
        return powo;
    }

    public void setPowo(Powo powo) {
        this.powo = powo;
    }

    public Iucn getIucn() {
        return iucn;
    }

    public void setIucn(Iucn iucn) {
        this.iucn = iucn;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Result.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("score");
        sb.append('=');
        sb.append(((this.score == null)?"<null>":this.score));
        sb.append(',');
        sb.append("species");
        sb.append('=');
        sb.append(((this.species == null)?"<null>":this.species));
        sb.append(',');
        sb.append("gbif");
        sb.append('=');
        sb.append(((this.gbif == null)?"<null>":this.gbif));
        sb.append(',');
        sb.append("powo");
        sb.append('=');
        sb.append(((this.powo == null)?"<null>":this.powo));
        sb.append(',');
        sb.append("iucn");
        sb.append('=');
        sb.append(((this.iucn == null)?"<null>":this.iucn));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
