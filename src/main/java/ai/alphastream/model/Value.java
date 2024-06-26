
package ai.alphastream.model;

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
    "D1001",
    "D1006",
    "D1008",
    "D5518"
})
@Generated("jsonschema2pojo")
public class Value implements Serializable
{

    @JsonProperty("D1001")
    @Valid
    private DataPoint d1001;
    @JsonProperty("D1006")
    @Valid
    private DataPoint d1006;
    @JsonProperty("D1008")
    @Valid
    private DataPoint d1008;
    @JsonProperty("D5518")
    @Valid
    private DataPoint d5518;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
    private final static long serialVersionUID = 8404035808212704425L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Value() {
    }

    /**
     * 
     * @param d1006
     * @param d5518
     * @param d1008
     * @param d1001
     */
    public Value(DataPoint d1001, DataPoint d1006, DataPoint d1008, DataPoint d5518) {
        super();
        this.d1001 = d1001;
        this.d1006 = d1006;
        this.d1008 = d1008;
        this.d5518 = d5518;
    }

    @JsonProperty("D1001")
    public DataPoint getD1001() {
        return d1001;
    }

    @JsonProperty("D1001")
    public void setD1001(DataPoint d1001) {
        this.d1001 = d1001;
    }

    public Value withD1001(DataPoint d1001) {
        this.d1001 = d1001;
        return this;
    }

    @JsonProperty("D1006")
    public DataPoint getD1006() {
        return d1006;
    }

    @JsonProperty("D1006")
    public void setD1006(DataPoint d1006) {
        this.d1006 = d1006;
    }

    public Value withD1006(DataPoint d1006) {
        this.d1006 = d1006;
        return this;
    }

    @JsonProperty("D1008")
    public DataPoint getD1008() {
        return d1008;
    }

    @JsonProperty("D1008")
    public void setD1008(DataPoint d1008) {
        this.d1008 = d1008;
    }

    public Value withD1008(DataPoint d1008) {
        this.d1008 = d1008;
        return this;
    }

    @JsonProperty("D5518")
    public DataPoint getD5518() {
        return d5518;
    }

    @JsonProperty("D5518")
    public void setD5518(DataPoint d5518) {
        this.d5518 = d5518;
    }

    public Value withD5518(DataPoint d5518) {
        this.d5518 = d5518;
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

    public Value withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Value.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("d1001");
        sb.append('=');
        sb.append(((this.d1001 == null)?"<null>":this.d1001));
        sb.append(',');
        sb.append("d1006");
        sb.append('=');
        sb.append(((this.d1006 == null)?"<null>":this.d1006));
        sb.append(',');
        sb.append("d1008");
        sb.append('=');
        sb.append(((this.d1008 == null)?"<null>":this.d1008));
        sb.append(',');
        sb.append("d5518");
        sb.append('=');
        sb.append(((this.d5518 == null)?"<null>":this.d5518));
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
        result = ((result* 31)+((this.d1006 == null)? 0 :this.d1006 .hashCode()));
        result = ((result* 31)+((this.d5518 == null)? 0 :this.d5518 .hashCode()));
        result = ((result* 31)+((this.d1008 == null)? 0 :this.d1008 .hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.d1001 == null)? 0 :this.d1001 .hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Value) == false) {
            return false;
        }
        Value rhs = ((Value) other);
        return ((((((this.d1006 == rhs.d1006)||((this.d1006 != null)&&this.d1006 .equals(rhs.d1006)))&&((this.d5518 == rhs.d5518)||((this.d5518 != null)&&this.d5518 .equals(rhs.d5518))))&&((this.d1008 == rhs.d1008)||((this.d1008 != null)&&this.d1008 .equals(rhs.d1008))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.d1001 == rhs.d1001)||((this.d1001 != null)&&this.d1001 .equals(rhs.d1001))));
    }

}
