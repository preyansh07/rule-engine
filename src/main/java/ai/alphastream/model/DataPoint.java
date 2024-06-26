
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
        "dataPointName",
        "keyPointId",
        "keyPointText",
        "highlightValue",
        "value",
        "pageNum",
        "snippet",
        "mlSnippet",
        "type",
        "displayId",
        "attempting",
        "dataPointId",
        "clientData",
        "status",
        "isEdit",
        "score",
        "lineNumber",
        "x0",
        "y0",
        "x1",
        "y1",
        "para_x0",
        "para_y0",
        "para_x1",
        "para_y1",
        "manualAccuracy",
        "errorFactor",
        "netScore",
        "isReferred",
        "validations"
})
@Generated("jsonschema2pojo")
public class DataPoint implements Serializable
{

    @JsonProperty("dataPointName")
    private String dataPointName;
    @JsonProperty("keyPointId")
    private Long keyPointId;
    @JsonProperty("keyPointText")
    private String keyPointText;
    @JsonProperty("highlightValue")
    private String highlightValue;
    @JsonProperty("value")
    private String value;
    @JsonProperty("pageNum")
    private String pageNum;
    @JsonProperty("snippet")
    private String snippet;
    @JsonProperty("mlSnippet")
    private String mlSnippet;
    @JsonProperty("type")
    private String type;
    @JsonProperty("displayId")
    private String displayId;
    @JsonProperty("attempting")
    private String attempting;
    @JsonProperty("dataPointId")
    private Long dataPointId;
    @JsonProperty("clientData")
    private Object clientData;
    @JsonProperty("status")
    private Boolean status;
    @JsonProperty("isEdit")
    private Boolean isEdit;
    @JsonProperty("score")
    private Double score;
    @JsonProperty("lineNumber")
    private Long lineNumber;
    @JsonProperty("x0")
    private Double x0;
    @JsonProperty("y0")
    private Double y0;
    @JsonProperty("x1")
    private Double x1;
    @JsonProperty("y1")
    private Double y1;
    @JsonProperty("para_x0")
    private Long paraX0;
    @JsonProperty("para_y0")
    private Long paraY0;
    @JsonProperty("para_x1")
    private Long paraX1;
    @JsonProperty("para_y1")
    private Long paraY1;
    @JsonProperty("manualAccuracy")
    private Long manualAccuracy;
    @JsonProperty("errorFactor")
    private Long errorFactor;
    @JsonProperty("netScore")
    private Long netScore;
    @JsonProperty("isReferred")
    private Boolean isReferred;
    @JsonProperty("validations")
    @Valid
    private Map<String, Object> validations = new LinkedHashMap<String, Object>();
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
    private final static long serialVersionUID = -5183459118172005221L;

    /**
     * No args constructor for use in serialization
     *
     */
    public DataPoint() {
    }

    /**
     *
     * @param snippet
     * @param mlSnippet
     * @param type
     * @param score
     * @param dataPointName
     * @param paraX0
     * @param paraX1
     * @param keyPointId
     * @param dataPointId
     * @param y0
     * @param y1
     * @param keyPointText
     * @param validations
     * @param value
     * @param highlightValue
     * @param attempting
     * @param pageNum
     * @param paraY1
     * @param manualAccuracy
     * @param isEdit
     * @param x0
     * @param x1
     * @param clientData
     * @param displayId
     * @param lineNumber
     * @param netScore
     * @param paraY0
     * @param errorFactor
     * @param isReferred
     * @param status
     */
    public DataPoint(String dataPointName, Long keyPointId, String keyPointText, String highlightValue, String value, String pageNum, String snippet, String mlSnippet, String type, String displayId, String attempting, Long dataPointId, Object clientData, Boolean status, Boolean isEdit, Double score, Long lineNumber, Double x0, Double y0, Double x1, Double y1, Long paraX0, Long paraY0, Long paraX1, Long paraY1, Long manualAccuracy, Long errorFactor, Long netScore, Boolean isReferred, Map<String, Object> validations) {
        super();
        this.dataPointName = dataPointName;
        this.keyPointId = keyPointId;
        this.keyPointText = keyPointText;
        this.highlightValue = highlightValue;
        this.value = value;
        this.pageNum = pageNum;
        this.snippet = snippet;
        this.mlSnippet = mlSnippet;
        this.type = type;
        this.displayId = displayId;
        this.attempting = attempting;
        this.dataPointId = dataPointId;
        this.clientData = clientData;
        this.status = status;
        this.isEdit = isEdit;
        this.score = score;
        this.lineNumber = lineNumber;
        this.x0 = x0;
        this.y0 = y0;
        this.x1 = x1;
        this.y1 = y1;
        this.paraX0 = paraX0;
        this.paraY0 = paraY0;
        this.paraX1 = paraX1;
        this.paraY1 = paraY1;
        this.manualAccuracy = manualAccuracy;
        this.errorFactor = errorFactor;
        this.netScore = netScore;
        this.isReferred = isReferred;
        this.validations = validations;
    }

    @JsonProperty("dataPointName")
    public String getDataPointName() {
        return dataPointName;
    }

    @JsonProperty("dataPointName")
    public void setDataPointName(String dataPointName) {
        this.dataPointName = dataPointName;
    }

    public DataPoint withDataPointName(String dataPointName) {
        this.dataPointName = dataPointName;
        return this;
    }

    @JsonProperty("keyPointId")
    public Long getKeyPointId() {
        return keyPointId;
    }

    @JsonProperty("keyPointId")
    public void setKeyPointId(Long keyPointId) {
        this.keyPointId = keyPointId;
    }

    public DataPoint withKeyPointId(Long keyPointId) {
        this.keyPointId = keyPointId;
        return this;
    }

    @JsonProperty("keyPointText")
    public String getKeyPointText() {
        return keyPointText;
    }

    @JsonProperty("keyPointText")
    public void setKeyPointText(String keyPointText) {
        this.keyPointText = keyPointText;
    }

    public DataPoint withKeyPointText(String keyPointText) {
        this.keyPointText = keyPointText;
        return this;
    }

    @JsonProperty("highlightValue")
    public String getHighlightValue() {
        return highlightValue;
    }

    @JsonProperty("highlightValue")
    public void setHighlightValue(String highlightValue) {
        this.highlightValue = highlightValue;
    }

    public DataPoint withHighlightValue(String highlightValue) {
        this.highlightValue = highlightValue;
        return this;
    }

    @JsonProperty("value")
    public String getValue() {
        return value;
    }

    @JsonProperty("value")
    public void setValue(String value) {
        this.value = value;
    }

    public DataPoint withValue(String value) {
        this.value = value;
        return this;
    }

    @JsonProperty("pageNum")
    public String getPageNum() {
        return pageNum;
    }

    @JsonProperty("pageNum")
    public void setPageNum(String pageNum) {
        this.pageNum = pageNum;
    }

    public DataPoint withPageNum(String pageNum) {
        this.pageNum = pageNum;
        return this;
    }

    @JsonProperty("snippet")
    public String getSnippet() {
        return snippet;
    }

    @JsonProperty("snippet")
    public void setSnippet(String snippet) {
        this.snippet = snippet;
    }

    public DataPoint withSnippet(String snippet) {
        this.snippet = snippet;
        return this;
    }

    @JsonProperty("mlSnippet")
    public String getMlSnippet() {
        return mlSnippet;
    }

    @JsonProperty("mlSnippet")
    public void setMlSnippet(String mlSnippet) {
        this.mlSnippet = mlSnippet;
    }

    public DataPoint withMlSnippet(String mlSnippet) {
        this.mlSnippet = mlSnippet;
        return this;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    public DataPoint withType(String type) {
        this.type = type;
        return this;
    }

    @JsonProperty("displayId")
    public String getDisplayId() {
        return displayId;
    }

    @JsonProperty("displayId")
    public void setDisplayId(String displayId) {
        this.displayId = displayId;
    }

    public DataPoint withDisplayId(String displayId) {
        this.displayId = displayId;
        return this;
    }

    @JsonProperty("attempting")
    public String getAttempting() {
        return attempting;
    }

    @JsonProperty("attempting")
    public void setAttempting(String attempting) {
        this.attempting = attempting;
    }

    public DataPoint withAttempting(String attempting) {
        this.attempting = attempting;
        return this;
    }

    @JsonProperty("dataPointId")
    public Long getDataPointId() {
        return dataPointId;
    }

    @JsonProperty("dataPointId")
    public void setDataPointId(Long dataPointId) {
        this.dataPointId = dataPointId;
    }

    public DataPoint withDataPointId(Long dataPointId) {
        this.dataPointId = dataPointId;
        return this;
    }

    @JsonProperty("clientData")
    public Object getClientData() {
        return clientData;
    }

    @JsonProperty("clientData")
    public void setClientData(Object clientData) {
        this.clientData = clientData;
    }

    public DataPoint withClientData(Object clientData) {
        this.clientData = clientData;
        return this;
    }

    @JsonProperty("status")
    public Boolean getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(Boolean status) {
        this.status = status;
    }

    public DataPoint withStatus(Boolean status) {
        this.status = status;
        return this;
    }

    @JsonProperty("isEdit")
    public Boolean getIsEdit() {
        return isEdit;
    }

    @JsonProperty("isEdit")
    public void setIsEdit(Boolean isEdit) {
        this.isEdit = isEdit;
    }

    public DataPoint withIsEdit(Boolean isEdit) {
        this.isEdit = isEdit;
        return this;
    }

    @JsonProperty("score")
    public Double getScore() {
        return score;
    }

    @JsonProperty("score")
    public void setScore(Double score) {
        this.score = score;
    }

    public DataPoint withScore(Double score) {
        this.score = score;
        return this;
    }

    @JsonProperty("lineNumber")
    public Long getLineNumber() {
        return lineNumber;
    }

    @JsonProperty("lineNumber")
    public void setLineNumber(Long lineNumber) {
        this.lineNumber = lineNumber;
    }

    public DataPoint withLineNumber(Long lineNumber) {
        this.lineNumber = lineNumber;
        return this;
    }

    @JsonProperty("x0")
    public Double getX0() {
        return x0;
    }

    @JsonProperty("x0")
    public void setX0(Double x0) {
        this.x0 = x0;
    }

    public DataPoint withX0(Double x0) {
        this.x0 = x0;
        return this;
    }

    @JsonProperty("y0")
    public Double getY0() {
        return y0;
    }

    @JsonProperty("y0")
    public void setY0(Double y0) {
        this.y0 = y0;
    }

    public DataPoint withY0(Double y0) {
        this.y0 = y0;
        return this;
    }

    @JsonProperty("x1")
    public Double getX1() {
        return x1;
    }

    @JsonProperty("x1")
    public void setX1(Double x1) {
        this.x1 = x1;
    }

    public DataPoint withX1(Double x1) {
        this.x1 = x1;
        return this;
    }

    @JsonProperty("y1")
    public Double getY1() {
        return y1;
    }

    @JsonProperty("y1")
    public void setY1(Double y1) {
        this.y1 = y1;
    }

    public DataPoint withY1(Double y1) {
        this.y1 = y1;
        return this;
    }

    @JsonProperty("para_x0")
    public Long getParaX0() {
        return paraX0;
    }

    @JsonProperty("para_x0")
    public void setParaX0(Long paraX0) {
        this.paraX0 = paraX0;
    }

    public DataPoint withParaX0(Long paraX0) {
        this.paraX0 = paraX0;
        return this;
    }

    @JsonProperty("para_y0")
    public Long getParaY0() {
        return paraY0;
    }

    @JsonProperty("para_y0")
    public void setParaY0(Long paraY0) {
        this.paraY0 = paraY0;
    }

    public DataPoint withParaY0(Long paraY0) {
        this.paraY0 = paraY0;
        return this;
    }

    @JsonProperty("para_x1")
    public Long getParaX1() {
        return paraX1;
    }

    @JsonProperty("para_x1")
    public void setParaX1(Long paraX1) {
        this.paraX1 = paraX1;
    }

    public DataPoint withParaX1(Long paraX1) {
        this.paraX1 = paraX1;
        return this;
    }

    @JsonProperty("para_y1")
    public Long getParaY1() {
        return paraY1;
    }

    @JsonProperty("para_y1")
    public void setParaY1(Long paraY1) {
        this.paraY1 = paraY1;
    }

    public DataPoint withParaY1(Long paraY1) {
        this.paraY1 = paraY1;
        return this;
    }

    @JsonProperty("manualAccuracy")
    public Long getManualAccuracy() {
        return manualAccuracy;
    }

    @JsonProperty("manualAccuracy")
    public void setManualAccuracy(Long manualAccuracy) {
        this.manualAccuracy = manualAccuracy;
    }

    public DataPoint withManualAccuracy(Long manualAccuracy) {
        this.manualAccuracy = manualAccuracy;
        return this;
    }

    @JsonProperty("errorFactor")
    public Long getErrorFactor() {
        return errorFactor;
    }

    @JsonProperty("errorFactor")
    public void setErrorFactor(Long errorFactor) {
        this.errorFactor = errorFactor;
    }

    public DataPoint withErrorFactor(Long errorFactor) {
        this.errorFactor = errorFactor;
        return this;
    }

    @JsonProperty("netScore")
    public Long getNetScore() {
        return netScore;
    }

    @JsonProperty("netScore")
    public void setNetScore(Long netScore) {
        this.netScore = netScore;
    }

    public DataPoint withNetScore(Long netScore) {
        this.netScore = netScore;
        return this;
    }

    @JsonProperty("isReferred")
    public Boolean getIsReferred() {
        return isReferred;
    }

    @JsonProperty("isReferred")
    public void setIsReferred(Boolean isReferred) {
        this.isReferred = isReferred;
    }

    public DataPoint withIsReferred(Boolean isReferred) {
        this.isReferred = isReferred;
        return this;
    }

    @JsonProperty("validations")
    public Map<String, Object> getValidations() {
        return validations;
    }

    @JsonProperty("validations")
    public void setValidations(Map<String, Object> validations) {
        this.validations = validations;
    }

    public DataPoint withValidations(Map<String, Object> validations) {
        this.validations = validations;
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

    public DataPoint withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DataPoint .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("dataPointName");
        sb.append('=');
        sb.append(((this.dataPointName == null)?"<null>":this.dataPointName));
        sb.append(',');
        sb.append("keyPointId");
        sb.append('=');
        sb.append(((this.keyPointId == null)?"<null>":this.keyPointId));
        sb.append(',');
        sb.append("keyPointText");
        sb.append('=');
        sb.append(((this.keyPointText == null)?"<null>":this.keyPointText));
        sb.append(',');
        sb.append("highlightValue");
        sb.append('=');
        sb.append(((this.highlightValue == null)?"<null>":this.highlightValue));
        sb.append(',');
        sb.append("value");
        sb.append('=');
        sb.append(((this.value == null)?"<null>":this.value));
        sb.append(',');
        sb.append("pageNum");
        sb.append('=');
        sb.append(((this.pageNum == null)?"<null>":this.pageNum));
        sb.append(',');
        sb.append("snippet");
        sb.append('=');
        sb.append(((this.snippet == null)?"<null>":this.snippet));
        sb.append(',');
        sb.append("mlSnippet");
        sb.append('=');
        sb.append(((this.mlSnippet == null)?"<null>":this.mlSnippet));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("displayId");
        sb.append('=');
        sb.append(((this.displayId == null)?"<null>":this.displayId));
        sb.append(',');
        sb.append("attempting");
        sb.append('=');
        sb.append(((this.attempting == null)?"<null>":this.attempting));
        sb.append(',');
        sb.append("dataPointId");
        sb.append('=');
        sb.append(((this.dataPointId == null)?"<null>":this.dataPointId));
        sb.append(',');
        sb.append("clientData");
        sb.append('=');
        sb.append(((this.clientData == null)?"<null>":this.clientData));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("isEdit");
        sb.append('=');
        sb.append(((this.isEdit == null)?"<null>":this.isEdit));
        sb.append(',');
        sb.append("score");
        sb.append('=');
        sb.append(((this.score == null)?"<null>":this.score));
        sb.append(',');
        sb.append("lineNumber");
        sb.append('=');
        sb.append(((this.lineNumber == null)?"<null>":this.lineNumber));
        sb.append(',');
        sb.append("x0");
        sb.append('=');
        sb.append(((this.x0 == null)?"<null>":this.x0));
        sb.append(',');
        sb.append("y0");
        sb.append('=');
        sb.append(((this.y0 == null)?"<null>":this.y0));
        sb.append(',');
        sb.append("x1");
        sb.append('=');
        sb.append(((this.x1 == null)?"<null>":this.x1));
        sb.append(',');
        sb.append("y1");
        sb.append('=');
        sb.append(((this.y1 == null)?"<null>":this.y1));
        sb.append(',');
        sb.append("paraX0");
        sb.append('=');
        sb.append(((this.paraX0 == null)?"<null>":this.paraX0));
        sb.append(',');
        sb.append("paraY0");
        sb.append('=');
        sb.append(((this.paraY0 == null)?"<null>":this.paraY0));
        sb.append(',');
        sb.append("paraX1");
        sb.append('=');
        sb.append(((this.paraX1 == null)?"<null>":this.paraX1));
        sb.append(',');
        sb.append("paraY1");
        sb.append('=');
        sb.append(((this.paraY1 == null)?"<null>":this.paraY1));
        sb.append(',');
        sb.append("manualAccuracy");
        sb.append('=');
        sb.append(((this.manualAccuracy == null)?"<null>":this.manualAccuracy));
        sb.append(',');
        sb.append("errorFactor");
        sb.append('=');
        sb.append(((this.errorFactor == null)?"<null>":this.errorFactor));
        sb.append(',');
        sb.append("netScore");
        sb.append('=');
        sb.append(((this.netScore == null)?"<null>":this.netScore));
        sb.append(',');
        sb.append("isReferred");
        sb.append('=');
        sb.append(((this.isReferred == null)?"<null>":this.isReferred));
        sb.append(',');
        sb.append("validations");
        sb.append('=');
        sb.append(((this.validations == null)?"<null>":this.validations));
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
        result = ((result* 31)+((this.snippet == null)? 0 :this.snippet.hashCode()));
        result = ((result* 31)+((this.mlSnippet == null)? 0 :this.mlSnippet.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.score == null)? 0 :this.score.hashCode()));
        result = ((result* 31)+((this.dataPointName == null)? 0 :this.dataPointName.hashCode()));
        result = ((result* 31)+((this.paraX0 == null)? 0 :this.paraX0 .hashCode()));
        result = ((result* 31)+((this.paraX1 == null)? 0 :this.paraX1 .hashCode()));
        result = ((result* 31)+((this.keyPointId == null)? 0 :this.keyPointId.hashCode()));
        result = ((result* 31)+((this.dataPointId == null)? 0 :this.dataPointId.hashCode()));
        result = ((result* 31)+((this.y0 == null)? 0 :this.y0 .hashCode()));
        result = ((result* 31)+((this.y1 == null)? 0 :this.y1 .hashCode()));
        result = ((result* 31)+((this.keyPointText == null)? 0 :this.keyPointText.hashCode()));
        result = ((result* 31)+((this.validations == null)? 0 :this.validations.hashCode()));
        result = ((result* 31)+((this.value == null)? 0 :this.value.hashCode()));
        result = ((result* 31)+((this.highlightValue == null)? 0 :this.highlightValue.hashCode()));
        result = ((result* 31)+((this.attempting == null)? 0 :this.attempting.hashCode()));
        result = ((result* 31)+((this.pageNum == null)? 0 :this.pageNum.hashCode()));
        result = ((result* 31)+((this.paraY1 == null)? 0 :this.paraY1 .hashCode()));
        result = ((result* 31)+((this.manualAccuracy == null)? 0 :this.manualAccuracy.hashCode()));
        result = ((result* 31)+((this.isEdit == null)? 0 :this.isEdit.hashCode()));
        result = ((result* 31)+((this.x0 == null)? 0 :this.x0 .hashCode()));
        result = ((result* 31)+((this.x1 == null)? 0 :this.x1 .hashCode()));
        result = ((result* 31)+((this.clientData == null)? 0 :this.clientData.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.displayId == null)? 0 :this.displayId.hashCode()));
        result = ((result* 31)+((this.lineNumber == null)? 0 :this.lineNumber.hashCode()));
        result = ((result* 31)+((this.netScore == null)? 0 :this.netScore.hashCode()));
        result = ((result* 31)+((this.paraY0 == null)? 0 :this.paraY0 .hashCode()));
        result = ((result* 31)+((this.errorFactor == null)? 0 :this.errorFactor.hashCode()));
        result = ((result* 31)+((this.isReferred == null)? 0 :this.isReferred.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DataPoint) == false) {
            return false;
        }
        DataPoint rhs = ((DataPoint) other);
        return ((((((((((((((((((((((((((((((((this.snippet == rhs.snippet)||((this.snippet!= null)&&this.snippet.equals(rhs.snippet)))&&((this.mlSnippet == rhs.mlSnippet)||((this.mlSnippet!= null)&&this.mlSnippet.equals(rhs.mlSnippet))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.score == rhs.score)||((this.score!= null)&&this.score.equals(rhs.score))))&&((this.dataPointName == rhs.dataPointName)||((this.dataPointName!= null)&&this.dataPointName.equals(rhs.dataPointName))))&&((this.paraX0 == rhs.paraX0)||((this.paraX0 != null)&&this.paraX0 .equals(rhs.paraX0))))&&((this.paraX1 == rhs.paraX1)||((this.paraX1 != null)&&this.paraX1 .equals(rhs.paraX1))))&&((this.keyPointId == rhs.keyPointId)||((this.keyPointId!= null)&&this.keyPointId.equals(rhs.keyPointId))))&&((this.dataPointId == rhs.dataPointId)||((this.dataPointId!= null)&&this.dataPointId.equals(rhs.dataPointId))))&&((this.y0 == rhs.y0)||((this.y0 != null)&&this.y0 .equals(rhs.y0))))&&((this.y1 == rhs.y1)||((this.y1 != null)&&this.y1 .equals(rhs.y1))))&&((this.keyPointText == rhs.keyPointText)||((this.keyPointText!= null)&&this.keyPointText.equals(rhs.keyPointText))))&&((this.validations == rhs.validations)||((this.validations!= null)&&this.validations.equals(rhs.validations))))&&((this.value == rhs.value)||((this.value!= null)&&this.value.equals(rhs.value))))&&((this.highlightValue == rhs.highlightValue)||((this.highlightValue!= null)&&this.highlightValue.equals(rhs.highlightValue))))&&((this.attempting == rhs.attempting)||((this.attempting!= null)&&this.attempting.equals(rhs.attempting))))&&((this.pageNum == rhs.pageNum)||((this.pageNum!= null)&&this.pageNum.equals(rhs.pageNum))))&&((this.paraY1 == rhs.paraY1)||((this.paraY1 != null)&&this.paraY1 .equals(rhs.paraY1))))&&((this.manualAccuracy == rhs.manualAccuracy)||((this.manualAccuracy!= null)&&this.manualAccuracy.equals(rhs.manualAccuracy))))&&((this.isEdit == rhs.isEdit)||((this.isEdit!= null)&&this.isEdit.equals(rhs.isEdit))))&&((this.x0 == rhs.x0)||((this.x0 != null)&&this.x0 .equals(rhs.x0))))&&((this.x1 == rhs.x1)||((this.x1 != null)&&this.x1 .equals(rhs.x1))))&&((this.clientData == rhs.clientData)||((this.clientData!= null)&&this.clientData.equals(rhs.clientData))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.displayId == rhs.displayId)||((this.displayId!= null)&&this.displayId.equals(rhs.displayId))))&&((this.lineNumber == rhs.lineNumber)||((this.lineNumber!= null)&&this.lineNumber.equals(rhs.lineNumber))))&&((this.netScore == rhs.netScore)||((this.netScore!= null)&&this.netScore.equals(rhs.netScore))))&&((this.paraY0 == rhs.paraY0)||((this.paraY0 != null)&&this.paraY0 .equals(rhs.paraY0))))&&((this.errorFactor == rhs.errorFactor)||((this.errorFactor!= null)&&this.errorFactor.equals(rhs.errorFactor))))&&((this.isReferred == rhs.isReferred)||((this.isReferred!= null)&&this.isReferred.equals(rhs.isReferred))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }

}
