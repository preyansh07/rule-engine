
package ai.alphastream.model2;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import jakarta.validation.Valid;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "totalSnippetCount",
    "requiredSnippetCount",
    "snippetExtractionLevel"
})
@Generated("jsonschema2pojo")
public class ExtractionAnalytics implements Serializable
{

    @JsonProperty("totalSnippetCount")
    private String totalSnippetCount;
    @JsonProperty("requiredSnippetCount")
    private String requiredSnippetCount;
    @JsonProperty("snippetExtractionLevel")
    private String snippetExtractionLevel;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
    private final static long serialVersionUID = -8170742720271438559L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ExtractionAnalytics() {
    }

    /**
     * 
     * @param snippetExtractionLevel
     * @param totalSnippetCount
     * @param requiredSnippetCount
     */
    public ExtractionAnalytics(String totalSnippetCount, String requiredSnippetCount, String snippetExtractionLevel) {
        super();
        this.totalSnippetCount = totalSnippetCount;
        this.requiredSnippetCount = requiredSnippetCount;
        this.snippetExtractionLevel = snippetExtractionLevel;
    }

    @JsonProperty("totalSnippetCount")
    public String getTotalSnippetCount() {
        return totalSnippetCount;
    }

    @JsonProperty("totalSnippetCount")
    public void setTotalSnippetCount(String totalSnippetCount) {
        this.totalSnippetCount = totalSnippetCount;
    }

    public ExtractionAnalytics withTotalSnippetCount(String totalSnippetCount) {
        this.totalSnippetCount = totalSnippetCount;
        return this;
    }

    @JsonProperty("requiredSnippetCount")
    public String getRequiredSnippetCount() {
        return requiredSnippetCount;
    }

    @JsonProperty("requiredSnippetCount")
    public void setRequiredSnippetCount(String requiredSnippetCount) {
        this.requiredSnippetCount = requiredSnippetCount;
    }

    public ExtractionAnalytics withRequiredSnippetCount(String requiredSnippetCount) {
        this.requiredSnippetCount = requiredSnippetCount;
        return this;
    }

    @JsonProperty("snippetExtractionLevel")
    public String getSnippetExtractionLevel() {
        return snippetExtractionLevel;
    }

    @JsonProperty("snippetExtractionLevel")
    public void setSnippetExtractionLevel(String snippetExtractionLevel) {
        this.snippetExtractionLevel = snippetExtractionLevel;
    }

    public ExtractionAnalytics withSnippetExtractionLevel(String snippetExtractionLevel) {
        this.snippetExtractionLevel = snippetExtractionLevel;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public ExtractionAnalytics withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ExtractionAnalytics.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("totalSnippetCount");
        sb.append('=');
        sb.append(((this.totalSnippetCount == null)?"<null>":this.totalSnippetCount));
        sb.append(',');
        sb.append("requiredSnippetCount");
        sb.append('=');
        sb.append(((this.requiredSnippetCount == null)?"<null>":this.requiredSnippetCount));
        sb.append(',');
        sb.append("snippetExtractionLevel");
        sb.append('=');
        sb.append(((this.snippetExtractionLevel == null)?"<null>":this.snippetExtractionLevel));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.snippetExtractionLevel == null)? 0 :this.snippetExtractionLevel.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.totalSnippetCount == null)? 0 :this.totalSnippetCount.hashCode()));
        result = ((result* 31)+((this.requiredSnippetCount == null)? 0 :this.requiredSnippetCount.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ExtractionAnalytics) == false) {
            return false;
        }
        ExtractionAnalytics rhs = ((ExtractionAnalytics) other);
        return (((((this.snippetExtractionLevel == rhs.snippetExtractionLevel)||((this.snippetExtractionLevel!= null)&&this.snippetExtractionLevel.equals(rhs.snippetExtractionLevel)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.totalSnippetCount == rhs.totalSnippetCount)||((this.totalSnippetCount!= null)&&this.totalSnippetCount.equals(rhs.totalSnippetCount))))&&((this.requiredSnippetCount == rhs.requiredSnippetCount)||((this.requiredSnippetCount!= null)&&this.requiredSnippetCount.equals(rhs.requiredSnippetCount))));
    }

}
