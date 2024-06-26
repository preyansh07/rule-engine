
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
    "requestToken",
    "data",
    "success",
    "message",
    "errorCode"
})
@Generated("jsonschema2pojo")
public class ParsedOriginalPdf implements Serializable
{

    @JsonProperty("requestToken")
    private String requestToken;
    @JsonProperty("data")
    @Valid
    private Data data;
    @JsonProperty("success")
    private Boolean success;
    @JsonProperty("message")
    private Object message;
    @JsonProperty("errorCode")
    private Object errorCode;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
    private final static long serialVersionUID = 4551626124709739545L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ParsedOriginalPdf() {
    }

    /**
     * 
     * @param data
     * @param success
     * @param errorCode
     * @param requestToken
     * @param message
     */
    public ParsedOriginalPdf(String requestToken, Data data, Boolean success, Object message, Object errorCode) {
        super();
        this.requestToken = requestToken;
        this.data = data;
        this.success = success;
        this.message = message;
        this.errorCode = errorCode;
    }

    @JsonProperty("requestToken")
    public String getRequestToken() {
        return requestToken;
    }

    @JsonProperty("requestToken")
    public void setRequestToken(String requestToken) {
        this.requestToken = requestToken;
    }

    public ParsedOriginalPdf withRequestToken(String requestToken) {
        this.requestToken = requestToken;
        return this;
    }

    @JsonProperty("data")
    public Data getData() {
        return data;
    }

    @JsonProperty("data")
    public void setData(Data data) {
        this.data = data;
    }

    public ParsedOriginalPdf withData(Data data) {
        this.data = data;
        return this;
    }

    @JsonProperty("success")
    public Boolean getSuccess() {
        return success;
    }

    @JsonProperty("success")
    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public ParsedOriginalPdf withSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    @JsonProperty("message")
    public Object getMessage() {
        return message;
    }

    @JsonProperty("message")
    public void setMessage(Object message) {
        this.message = message;
    }

    public ParsedOriginalPdf withMessage(Object message) {
        this.message = message;
        return this;
    }

    @JsonProperty("errorCode")
    public Object getErrorCode() {
        return errorCode;
    }

    @JsonProperty("errorCode")
    public void setErrorCode(Object errorCode) {
        this.errorCode = errorCode;
    }

    public ParsedOriginalPdf withErrorCode(Object errorCode) {
        this.errorCode = errorCode;
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

    public ParsedOriginalPdf withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ParsedOriginalPdf.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("requestToken");
        sb.append('=');
        sb.append(((this.requestToken == null)?"<null>":this.requestToken));
        sb.append(',');
        sb.append("data");
        sb.append('=');
        sb.append(((this.data == null)?"<null>":this.data));
        sb.append(',');
        sb.append("success");
        sb.append('=');
        sb.append(((this.success == null)?"<null>":this.success));
        sb.append(',');
        sb.append("message");
        sb.append('=');
        sb.append(((this.message == null)?"<null>":this.message));
        sb.append(',');
        sb.append("errorCode");
        sb.append('=');
        sb.append(((this.errorCode == null)?"<null>":this.errorCode));
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
        result = ((result* 31)+((this.data == null)? 0 :this.data.hashCode()));
        result = ((result* 31)+((this.success == null)? 0 :this.success.hashCode()));
        result = ((result* 31)+((this.errorCode == null)? 0 :this.errorCode.hashCode()));
        result = ((result* 31)+((this.requestToken == null)? 0 :this.requestToken.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.message == null)? 0 :this.message.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ParsedOriginalPdf) == false) {
            return false;
        }
        ParsedOriginalPdf rhs = ((ParsedOriginalPdf) other);
        return (((((((this.data == rhs.data)||((this.data!= null)&&this.data.equals(rhs.data)))&&((this.success == rhs.success)||((this.success!= null)&&this.success.equals(rhs.success))))&&((this.errorCode == rhs.errorCode)||((this.errorCode!= null)&&this.errorCode.equals(rhs.errorCode))))&&((this.requestToken == rhs.requestToken)||((this.requestToken!= null)&&this.requestToken.equals(rhs.requestToken))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.message == rhs.message)||((this.message!= null)&&this.message.equals(rhs.message))));
    }

}
