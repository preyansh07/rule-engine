
package ai.alphastream.model2;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
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
    "pdf",
    "parsedData",
    "extractionAnalytics"
})
@Generated("jsonschema2pojo")
public class Data implements Serializable
{

    @JsonProperty("pdf")
    private String pdf;
    @JsonProperty("parsedData")
    @Valid
    private List<ParsedDatum> parsedData = new ArrayList<ParsedDatum>();
    @JsonProperty("extractionAnalytics")
    @Valid
    private ExtractionAnalytics extractionAnalytics;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
    private final static long serialVersionUID = -6374700302292989347L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Data() {
    }

    /**
     * 
     * @param pdf
     * @param extractionAnalytics
     * @param parsedData
     */
    public Data(String pdf, List<ParsedDatum> parsedData, ExtractionAnalytics extractionAnalytics) {
        super();
        this.pdf = pdf;
        this.parsedData = parsedData;
        this.extractionAnalytics = extractionAnalytics;
    }

    @JsonProperty("pdf")
    public String getPdf() {
        return pdf;
    }

    @JsonProperty("pdf")
    public void setPdf(String pdf) {
        this.pdf = pdf;
    }

    public Data withPdf(String pdf) {
        this.pdf = pdf;
        return this;
    }

    @JsonProperty("parsedData")
    public List<ParsedDatum> getParsedData() {
        return parsedData;
    }

    @JsonProperty("parsedData")
    public void setParsedData(List<ParsedDatum> parsedData) {
        this.parsedData = parsedData;
    }

    public Data withParsedData(List<ParsedDatum> parsedData) {
        this.parsedData = parsedData;
        return this;
    }

    @JsonProperty("extractionAnalytics")
    public ExtractionAnalytics getExtractionAnalytics() {
        return extractionAnalytics;
    }

    @JsonProperty("extractionAnalytics")
    public void setExtractionAnalytics(ExtractionAnalytics extractionAnalytics) {
        this.extractionAnalytics = extractionAnalytics;
    }

    public Data withExtractionAnalytics(ExtractionAnalytics extractionAnalytics) {
        this.extractionAnalytics = extractionAnalytics;
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

    public Data withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Data.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("pdf");
        sb.append('=');
        sb.append(((this.pdf == null)?"<null>":this.pdf));
        sb.append(',');
        sb.append("parsedData");
        sb.append('=');
        sb.append(((this.parsedData == null)?"<null>":this.parsedData));
        sb.append(',');
        sb.append("extractionAnalytics");
        sb.append('=');
        sb.append(((this.extractionAnalytics == null)?"<null>":this.extractionAnalytics));
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
        result = ((result* 31)+((this.pdf == null)? 0 :this.pdf.hashCode()));
        result = ((result* 31)+((this.extractionAnalytics == null)? 0 :this.extractionAnalytics.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.parsedData == null)? 0 :this.parsedData.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Data) == false) {
            return false;
        }
        Data rhs = ((Data) other);
        return (((((this.pdf == rhs.pdf)||((this.pdf!= null)&&this.pdf.equals(rhs.pdf)))&&((this.extractionAnalytics == rhs.extractionAnalytics)||((this.extractionAnalytics!= null)&&this.extractionAnalytics.equals(rhs.extractionAnalytics))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.parsedData == rhs.parsedData)||((this.parsedData!= null)&&this.parsedData.equals(rhs.parsedData))));
    }

}
