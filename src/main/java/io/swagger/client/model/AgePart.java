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
 * AgePart
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-01-29T17:21:25.566Z")
public class AgePart {
  @SerializedName("AgeLower")
  private Boolean ageLower = null;

  @SerializedName("AgeLowerSpecified")
  private Boolean ageLowerSpecified = null;

  @SerializedName("AgeUpper")
  private Boolean ageUpper = null;

  @SerializedName("AgeUpperSpecified")
  private Boolean ageUpperSpecified = null;

  public AgePart ageLower(Boolean ageLower) {
    this.ageLower = ageLower;
    return this;
  }

   /**
   * Get ageLower
   * @return ageLower
  **/
  @ApiModelProperty(value = "")
  public Boolean getAgeLower() {
    return ageLower;
  }

  public void setAgeLower(Boolean ageLower) {
    this.ageLower = ageLower;
  }

  public AgePart ageLowerSpecified(Boolean ageLowerSpecified) {
    this.ageLowerSpecified = ageLowerSpecified;
    return this;
  }

   /**
   * Get ageLowerSpecified
   * @return ageLowerSpecified
  **/
  @ApiModelProperty(value = "")
  public Boolean getAgeLowerSpecified() {
    return ageLowerSpecified;
  }

  public void setAgeLowerSpecified(Boolean ageLowerSpecified) {
    this.ageLowerSpecified = ageLowerSpecified;
  }

  public AgePart ageUpper(Boolean ageUpper) {
    this.ageUpper = ageUpper;
    return this;
  }

   /**
   * Get ageUpper
   * @return ageUpper
  **/
  @ApiModelProperty(value = "")
  public Boolean getAgeUpper() {
    return ageUpper;
  }

  public void setAgeUpper(Boolean ageUpper) {
    this.ageUpper = ageUpper;
  }

  public AgePart ageUpperSpecified(Boolean ageUpperSpecified) {
    this.ageUpperSpecified = ageUpperSpecified;
    return this;
  }

   /**
   * Get ageUpperSpecified
   * @return ageUpperSpecified
  **/
  @ApiModelProperty(value = "")
  public Boolean getAgeUpperSpecified() {
    return ageUpperSpecified;
  }

  public void setAgeUpperSpecified(Boolean ageUpperSpecified) {
    this.ageUpperSpecified = ageUpperSpecified;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgePart agePart = (AgePart) o;
    return Objects.equals(this.ageLower, agePart.ageLower) &&
        Objects.equals(this.ageLowerSpecified, agePart.ageLowerSpecified) &&
        Objects.equals(this.ageUpper, agePart.ageUpper) &&
        Objects.equals(this.ageUpperSpecified, agePart.ageUpperSpecified);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ageLower, ageLowerSpecified, ageUpper, ageUpperSpecified);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgePart {\n");
    
    sb.append("    ageLower: ").append(toIndentedString(ageLower)).append("\n");
    sb.append("    ageLowerSpecified: ").append(toIndentedString(ageLowerSpecified)).append("\n");
    sb.append("    ageUpper: ").append(toIndentedString(ageUpper)).append("\n");
    sb.append("    ageUpperSpecified: ").append(toIndentedString(ageUpperSpecified)).append("\n");
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

