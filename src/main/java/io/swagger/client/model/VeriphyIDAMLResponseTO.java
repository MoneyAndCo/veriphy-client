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
import io.swagger.client.model.ApplicantTO;
import io.swagger.client.model.Result;
import java.io.IOException;

/**
 * VeriphyIDAMLResponseTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-01-29T17:21:25.566Z")
public class VeriphyIDAMLResponseTO {
  @SerializedName("applicant")
  private ApplicantTO applicant = null;

  @SerializedName("responseEncodedPdf")
  private String responseEncodedPdf = null;

  @SerializedName("reference")
  private String reference = null;

  @SerializedName("responseResult")
  private Result responseResult = null;

  @SerializedName("veriphyCheckId")
  private String veriphyCheckId = null;

  public VeriphyIDAMLResponseTO applicant(ApplicantTO applicant) {
    this.applicant = applicant;
    return this;
  }

   /**
   * Get applicant
   * @return applicant
  **/
  @ApiModelProperty(value = "")
  public ApplicantTO getApplicant() {
    return applicant;
  }

  public void setApplicant(ApplicantTO applicant) {
    this.applicant = applicant;
  }

  public VeriphyIDAMLResponseTO responseEncodedPdf(String responseEncodedPdf) {
    this.responseEncodedPdf = responseEncodedPdf;
    return this;
  }

   /**
   * Get responseEncodedPdf
   * @return responseEncodedPdf
  **/
  @ApiModelProperty(value = "")
  public String getResponseEncodedPdf() {
    return responseEncodedPdf;
  }

  public void setResponseEncodedPdf(String responseEncodedPdf) {
    this.responseEncodedPdf = responseEncodedPdf;
  }

  public VeriphyIDAMLResponseTO reference(String reference) {
    this.reference = reference;
    return this;
  }

   /**
   * Get reference
   * @return reference
  **/
  @ApiModelProperty(value = "")
  public String getReference() {
    return reference;
  }

  public void setReference(String reference) {
    this.reference = reference;
  }

  public VeriphyIDAMLResponseTO responseResult(Result responseResult) {
    this.responseResult = responseResult;
    return this;
  }

   /**
   * Get responseResult
   * @return responseResult
  **/
  @ApiModelProperty(value = "")
  public Result getResponseResult() {
    return responseResult;
  }

  public void setResponseResult(Result responseResult) {
    this.responseResult = responseResult;
  }

  public VeriphyIDAMLResponseTO veriphyCheckId(String veriphyCheckId) {
    this.veriphyCheckId = veriphyCheckId;
    return this;
  }

   /**
   * Get veriphyCheckId
   * @return veriphyCheckId
  **/
  @ApiModelProperty(value = "")
  public String getVeriphyCheckId() {
    return veriphyCheckId;
  }

  public void setVeriphyCheckId(String veriphyCheckId) {
    this.veriphyCheckId = veriphyCheckId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VeriphyIDAMLResponseTO veriphyIDAMLResponseTO = (VeriphyIDAMLResponseTO) o;
    return Objects.equals(this.applicant, veriphyIDAMLResponseTO.applicant) &&
        Objects.equals(this.responseEncodedPdf, veriphyIDAMLResponseTO.responseEncodedPdf) &&
        Objects.equals(this.reference, veriphyIDAMLResponseTO.reference) &&
        Objects.equals(this.responseResult, veriphyIDAMLResponseTO.responseResult) &&
        Objects.equals(this.veriphyCheckId, veriphyIDAMLResponseTO.veriphyCheckId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applicant, responseEncodedPdf, reference, responseResult, veriphyCheckId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VeriphyIDAMLResponseTO {\n");
    
    sb.append("    applicant: ").append(toIndentedString(applicant)).append("\n");
    sb.append("    responseEncodedPdf: ").append(toIndentedString(responseEncodedPdf)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    responseResult: ").append(toIndentedString(responseResult)).append("\n");
    sb.append("    veriphyCheckId: ").append(toIndentedString(veriphyCheckId)).append("\n");
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

