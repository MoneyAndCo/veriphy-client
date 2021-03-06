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
 * PassportPart
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-01-29T17:21:25.566Z")
public class PassportPart {
  @SerializedName("MRZValid")
  private Boolean mrZValid = null;

  @SerializedName("DOBValid")
  private Boolean doBValid = null;

  @SerializedName("GenderValid")
  private Boolean genderValid = null;

  @SerializedName("ExpiryValid")
  private Boolean expiryValid = null;

  public PassportPart mrZValid(Boolean mrZValid) {
    this.mrZValid = mrZValid;
    return this;
  }

   /**
   * Get mrZValid
   * @return mrZValid
  **/
  @ApiModelProperty(value = "")
  public Boolean getMrZValid() {
    return mrZValid;
  }

  public void setMrZValid(Boolean mrZValid) {
    this.mrZValid = mrZValid;
  }

  public PassportPart doBValid(Boolean doBValid) {
    this.doBValid = doBValid;
    return this;
  }

   /**
   * Get doBValid
   * @return doBValid
  **/
  @ApiModelProperty(value = "")
  public Boolean getDoBValid() {
    return doBValid;
  }

  public void setDoBValid(Boolean doBValid) {
    this.doBValid = doBValid;
  }

  public PassportPart genderValid(Boolean genderValid) {
    this.genderValid = genderValid;
    return this;
  }

   /**
   * Get genderValid
   * @return genderValid
  **/
  @ApiModelProperty(value = "")
  public Boolean getGenderValid() {
    return genderValid;
  }

  public void setGenderValid(Boolean genderValid) {
    this.genderValid = genderValid;
  }

  public PassportPart expiryValid(Boolean expiryValid) {
    this.expiryValid = expiryValid;
    return this;
  }

   /**
   * Get expiryValid
   * @return expiryValid
  **/
  @ApiModelProperty(value = "")
  public Boolean getExpiryValid() {
    return expiryValid;
  }

  public void setExpiryValid(Boolean expiryValid) {
    this.expiryValid = expiryValid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PassportPart passportPart = (PassportPart) o;
    return Objects.equals(this.mrZValid, passportPart.mrZValid) &&
        Objects.equals(this.doBValid, passportPart.doBValid) &&
        Objects.equals(this.genderValid, passportPart.genderValid) &&
        Objects.equals(this.expiryValid, passportPart.expiryValid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mrZValid, doBValid, genderValid, expiryValid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PassportPart {\n");
    
    sb.append("    mrZValid: ").append(toIndentedString(mrZValid)).append("\n");
    sb.append("    doBValid: ").append(toIndentedString(doBValid)).append("\n");
    sb.append("    genderValid: ").append(toIndentedString(genderValid)).append("\n");
    sb.append("    expiryValid: ").append(toIndentedString(expiryValid)).append("\n");
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

