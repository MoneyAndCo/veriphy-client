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
import io.swagger.client.model.ApplicationTO;
import io.swagger.client.model.AuthenticationTO;
import io.swagger.client.model.VeriphyServiceTO;
import java.io.IOException;

/**
 * VeriphyIDAMLRequestTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-01-29T17:21:25.566Z")
public class VeriphyIDAMLRequestTO {
  @SerializedName("applicationTO")
  private ApplicationTO applicationTO = null;

  @SerializedName("authenticationTO")
  private AuthenticationTO authenticationTO = null;

  @SerializedName("veriphyServiceTO")
  private VeriphyServiceTO veriphyServiceTO = null;

  public VeriphyIDAMLRequestTO applicationTO(ApplicationTO applicationTO) {
    this.applicationTO = applicationTO;
    return this;
  }

   /**
   * Get applicationTO
   * @return applicationTO
  **/
  @ApiModelProperty(required = true, value = "")
  public ApplicationTO getApplicationTO() {
    return applicationTO;
  }

  public void setApplicationTO(ApplicationTO applicationTO) {
    this.applicationTO = applicationTO;
  }

  public VeriphyIDAMLRequestTO authenticationTO(AuthenticationTO authenticationTO) {
    this.authenticationTO = authenticationTO;
    return this;
  }

   /**
   * Get authenticationTO
   * @return authenticationTO
  **/
  @ApiModelProperty(required = true, value = "")
  public AuthenticationTO getAuthenticationTO() {
    return authenticationTO;
  }

  public void setAuthenticationTO(AuthenticationTO authenticationTO) {
    this.authenticationTO = authenticationTO;
  }

  public VeriphyIDAMLRequestTO veriphyServiceTO(VeriphyServiceTO veriphyServiceTO) {
    this.veriphyServiceTO = veriphyServiceTO;
    return this;
  }

   /**
   * Get veriphyServiceTO
   * @return veriphyServiceTO
  **/
  @ApiModelProperty(required = true, value = "")
  public VeriphyServiceTO getVeriphyServiceTO() {
    return veriphyServiceTO;
  }

  public void setVeriphyServiceTO(VeriphyServiceTO veriphyServiceTO) {
    this.veriphyServiceTO = veriphyServiceTO;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VeriphyIDAMLRequestTO veriphyIDAMLRequestTO = (VeriphyIDAMLRequestTO) o;
    return Objects.equals(this.applicationTO, veriphyIDAMLRequestTO.applicationTO) &&
        Objects.equals(this.authenticationTO, veriphyIDAMLRequestTO.authenticationTO) &&
        Objects.equals(this.veriphyServiceTO, veriphyIDAMLRequestTO.veriphyServiceTO);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applicationTO, authenticationTO, veriphyServiceTO);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VeriphyIDAMLRequestTO {\n");
    
    sb.append("    applicationTO: ").append(toIndentedString(applicationTO)).append("\n");
    sb.append("    authenticationTO: ").append(toIndentedString(authenticationTO)).append("\n");
    sb.append("    veriphyServiceTO: ").append(toIndentedString(veriphyServiceTO)).append("\n");
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

