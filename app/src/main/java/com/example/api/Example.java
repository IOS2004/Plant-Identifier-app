
package com.example.api;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class Example {

    @SerializedName("query")
    @Expose
    private Query query;
    @SerializedName("language")
    @Expose
    private String language;
    @SerializedName("preferedReferential")
    @Expose
    private String preferedReferential;
    @SerializedName("bestMatch")
    @Expose
    private String bestMatch;
    @SerializedName("results")
    @Expose
    private List<Result> results;
    @SerializedName("version")
    @Expose
    private String version;
    @SerializedName("remainingIdentificationRequests")
    @Expose
    private Integer remainingIdentificationRequests;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Example() {
    }

    /**
     * 
     * @param preferedReferential
     * @param bestMatch
     * @param query
     * @param language
     * @param results
     * @param version
     * @param remainingIdentificationRequests
     */
    public Example(Query query, String language, String preferedReferential, String bestMatch, List<Result> results, String version, Integer remainingIdentificationRequests) {
        super();
        this.query = query;
        this.language = language;
        this.preferedReferential = preferedReferential;
        this.bestMatch = bestMatch;
        this.results = results;
        this.version = version;
        this.remainingIdentificationRequests = remainingIdentificationRequests;
    }

    public Query getQuery() {
        return query;
    }

    public void setQuery(Query query) {
        this.query = query;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getPreferedReferential() {
        return preferedReferential;
    }

    public void setPreferedReferential(String preferedReferential) {
        this.preferedReferential = preferedReferential;
    }

    public String getBestMatch() {
        return bestMatch;
    }

    public void setBestMatch(String bestMatch) {
        this.bestMatch = bestMatch;
    }

    public List<Result> getResults() {
        return results;
    }

    public void setResults(List<Result> results) {
        this.results = results;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Integer getRemainingIdentificationRequests() {
        return remainingIdentificationRequests;
    }

    public void setRemainingIdentificationRequests(Integer remainingIdentificationRequests) {
        this.remainingIdentificationRequests = remainingIdentificationRequests;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Example.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("query");
        sb.append('=');
        sb.append(((this.query == null)?"<null>":this.query));
        sb.append(',');
        sb.append("language");
        sb.append('=');
        sb.append(((this.language == null)?"<null>":this.language));
        sb.append(',');
        sb.append("preferedReferential");
        sb.append('=');
        sb.append(((this.preferedReferential == null)?"<null>":this.preferedReferential));
        sb.append(',');
        sb.append("bestMatch");
        sb.append('=');
        sb.append(((this.bestMatch == null)?"<null>":this.bestMatch));
        sb.append(',');
        sb.append("results");
        sb.append('=');
        sb.append(((this.results == null)?"<null>":this.results));
        sb.append(',');
        sb.append("version");
        sb.append('=');
        sb.append(((this.version == null)?"<null>":this.version));
        sb.append(',');
        sb.append("remainingIdentificationRequests");
        sb.append('=');
        sb.append(((this.remainingIdentificationRequests == null)?"<null>":this.remainingIdentificationRequests));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
