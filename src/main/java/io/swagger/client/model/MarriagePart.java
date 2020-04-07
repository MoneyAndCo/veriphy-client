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
 * MarriagePart
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-01-29T17:21:25.566Z")
public class MarriagePart {
  @SerializedName("MarriageIndexMatch")
  private Integer marriageIndexMatch = null;

  @SerializedName("MarriageCertificateMatch")
  private Integer marriageCertificateMatch = null;

  public MarriagePart marriageIndexMatch(Integer marriageIndexMatch) {
    this.marriageIndexMatch = marriageIndexMatch;
    return this;
  }

   /**
   * Get marriageIndexMatch
   * @return marriageIndexMatch
  **/
  @ApiModelProperty(value = "")
  public Integer getMarriageIndexMatch() {
    return marriageIndexMatch;
  }

  public void setMarriageIndexMatch(Integer marriageIndexMatch) {
    this.marriageIndexMatch = marriageIndexMatch;
  }

  public MarriagePart marriageCertificateMatch(Integer marriageCertificateMatch) {
    this.marriageCertificateMatch = marriageCertificateMatch;
    return this;
  }

   /**
   * Get marriageCertificateMatch
   * @return marriageCertificateMatch
  **/
  @ApiModelProperty(value = "")
  public Integer getMarriageCertificateMatch() {
    return marriageCertificateMatch;
  }

  public void setMarriageCertificateMatch(Integer marriageCertificateMatch) {
    this.marriageCertificateMatch = marriageCertificateMatch;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MarriagePart marriagePart = (MarriagePart) o;
    return Objects.equals(this.marriageIndexMatch, marriagePart.marriageIndexMatch) &&
        Objects.equals(this.marriageCertificateMatch, marriagePart.marriageCertificateMatch);
  }

  @Override
  public int hashCode() {
    return Objects.hash(marriageIndexMatch, marriageCertificateMatch);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MarriagePart {\n");
    
    sb.append("    marriageIndexMatch: ").append(toIndentedString(marriageIndexMatch)).append("\n");
    sb.append("    marriageCertificateMatch: ").append(toIndentedString(marriageCertificateMatch)).append("\n");
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
