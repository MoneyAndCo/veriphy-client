/*
 * Veriphy API
 * This API provides access to the ID/AML, Company and Lawyer check services provided by Veriphy. This API is secured - please contact us to request test credentials.<br/>The API can send and receive either JSON or XML - please explore the API methods and the return types/parameters below.
 *
 * OpenAPI spec version: v1
 * Contact: support@veriphy.co.uk
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * OccupantPart
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-01-29T17:21:25.566Z")
public class OccupantPart {
  @SerializedName("Name")
  private String name = null;

  @SerializedName("DOB")
  private String DOB = null;

  @SerializedName("Recency")
  private String recency = null;

  @SerializedName("Residency")
  private String residency = null;

  @SerializedName("ResidencyScore")
  private String residencyScore = null;

  @SerializedName("Telephone")
  private String telephone = null;

  @SerializedName("TelephoneName")
  private String telephoneName = null;

  @SerializedName("Source")
  private String source = null;

  public OccupantPart name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public OccupantPart DOB(String DOB) {
    this.DOB = DOB;
    return this;
  }

   /**
   * Get DOB
   * @return DOB
  **/
  @ApiModelProperty(value = "")
  public String getDOB() {
    return DOB;
  }

  public void setDOB(String DOB) {
    this.DOB = DOB;
  }

  public OccupantPart recency(String recency) {
    this.recency = recency;
    return this;
  }

   /**
   * Get recency
   * @return recency
  **/
  @ApiModelProperty(value = "")
  public String getRecency() {
    return recency;
  }

  public void setRecency(String recency) {
    this.recency = recency;
  }

  public OccupantPart residency(String residency) {
    this.residency = residency;
    return this;
  }

   /**
   * Get residency
   * @return residency
  **/
  @ApiModelProperty(value = "")
  public String getResidency() {
    return residency;
  }

  public void setResidency(String residency) {
    this.residency = residency;
  }

  public OccupantPart residencyScore(String residencyScore) {
    this.residencyScore = residencyScore;
    return this;
  }

   /**
   * Get residencyScore
   * @return residencyScore
  **/
  @ApiModelProperty(value = "")
  public String getResidencyScore() {
    return residencyScore;
  }

  public void setResidencyScore(String residencyScore) {
    this.residencyScore = residencyScore;
  }

  public OccupantPart telephone(String telephone) {
    this.telephone = telephone;
    return this;
  }

   /**
   * Get telephone
   * @return telephone
  **/
  @ApiModelProperty(value = "")
  public String getTelephone() {
    return telephone;
  }

  public void setTelephone(String telephone) {
    this.telephone = telephone;
  }

  public OccupantPart telephoneName(String telephoneName) {
    this.telephoneName = telephoneName;
    return this;
  }

   /**
   * Get telephoneName
   * @return telephoneName
  **/
  @ApiModelProperty(value = "")
  public String getTelephoneName() {
    return telephoneName;
  }

  public void setTelephoneName(String telephoneName) {
    this.telephoneName = telephoneName;
  }

  public OccupantPart source(String source) {
    this.source = source;
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  @ApiModelProperty(value = "")
  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OccupantPart occupantPart = (OccupantPart) o;
    return Objects.equals(this.name, occupantPart.name) &&
        Objects.equals(this.DOB, occupantPart.DOB) &&
        Objects.equals(this.recency, occupantPart.recency) &&
        Objects.equals(this.residency, occupantPart.residency) &&
        Objects.equals(this.residencyScore, occupantPart.residencyScore) &&
        Objects.equals(this.telephone, occupantPart.telephone) &&
        Objects.equals(this.telephoneName, occupantPart.telephoneName) &&
        Objects.equals(this.source, occupantPart.source);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, DOB, recency, residency, residencyScore, telephone, telephoneName, source);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OccupantPart {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    DOB: ").append(toIndentedString(DOB)).append("\n");
    sb.append("    recency: ").append(toIndentedString(recency)).append("\n");
    sb.append("    residency: ").append(toIndentedString(residency)).append("\n");
    sb.append("    residencyScore: ").append(toIndentedString(residencyScore)).append("\n");
    sb.append("    telephone: ").append(toIndentedString(telephone)).append("\n");
    sb.append("    telephoneName: ").append(toIndentedString(telephoneName)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

