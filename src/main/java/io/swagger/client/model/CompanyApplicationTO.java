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
import io.swagger.client.model.CompanyTO;
import java.io.IOException;

/**
 * CompanyApplicationTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-01-29T17:21:25.566Z")
public class CompanyApplicationTO {
  @SerializedName("reference")
  private String reference = null;

  @SerializedName("companyTO")
  private CompanyTO companyTO = null;

  public CompanyApplicationTO reference(String reference) {
    this.reference = reference;
    return this;
  }

   /**
   * Get reference
   * @return reference
  **/
  @ApiModelProperty(required = true, value = "")
  public String getReference() {
    return reference;
  }

  public void setReference(String reference) {
    this.reference = reference;
  }

  public CompanyApplicationTO companyTO(CompanyTO companyTO) {
    this.companyTO = companyTO;
    return this;
  }

   /**
   * Get companyTO
   * @return companyTO
  **/
  @ApiModelProperty(required = true, value = "")
  public CompanyTO getCompanyTO() {
    return companyTO;
  }

  public void setCompanyTO(CompanyTO companyTO) {
    this.companyTO = companyTO;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompanyApplicationTO companyApplicationTO = (CompanyApplicationTO) o;
    return Objects.equals(this.reference, companyApplicationTO.reference) &&
        Objects.equals(this.companyTO, companyApplicationTO.companyTO);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reference, companyTO);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompanyApplicationTO {\n");
    
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    companyTO: ").append(toIndentedString(companyTO)).append("\n");
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

