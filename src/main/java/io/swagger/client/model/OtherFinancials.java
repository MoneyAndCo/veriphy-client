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
import io.swagger.client.model.FinancialValueDecimal;
import java.io.IOException;

/**
 * OtherFinancials
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-01-29T17:21:25.566Z")
public class OtherFinancials {
  @SerializedName("ContingentLiabilities")
  private String contingentLiabilities = null;

  @SerializedName("WorkingCapital")
  private FinancialValueDecimal workingCapital = null;

  @SerializedName("NetWorth")
  private FinancialValueDecimal netWorth = null;

  public OtherFinancials contingentLiabilities(String contingentLiabilities) {
    this.contingentLiabilities = contingentLiabilities;
    return this;
  }

   /**
   * Get contingentLiabilities
   * @return contingentLiabilities
  **/
  @ApiModelProperty(value = "")
  public String getContingentLiabilities() {
    return contingentLiabilities;
  }

  public void setContingentLiabilities(String contingentLiabilities) {
    this.contingentLiabilities = contingentLiabilities;
  }

  public OtherFinancials workingCapital(FinancialValueDecimal workingCapital) {
    this.workingCapital = workingCapital;
    return this;
  }

   /**
   * Get workingCapital
   * @return workingCapital
  **/
  @ApiModelProperty(value = "")
  public FinancialValueDecimal getWorkingCapital() {
    return workingCapital;
  }

  public void setWorkingCapital(FinancialValueDecimal workingCapital) {
    this.workingCapital = workingCapital;
  }

  public OtherFinancials netWorth(FinancialValueDecimal netWorth) {
    this.netWorth = netWorth;
    return this;
  }

   /**
   * Get netWorth
   * @return netWorth
  **/
  @ApiModelProperty(value = "")
  public FinancialValueDecimal getNetWorth() {
    return netWorth;
  }

  public void setNetWorth(FinancialValueDecimal netWorth) {
    this.netWorth = netWorth;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OtherFinancials otherFinancials = (OtherFinancials) o;
    return Objects.equals(this.contingentLiabilities, otherFinancials.contingentLiabilities) &&
        Objects.equals(this.workingCapital, otherFinancials.workingCapital) &&
        Objects.equals(this.netWorth, otherFinancials.netWorth);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contingentLiabilities, workingCapital, netWorth);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OtherFinancials {\n");
    
    sb.append("    contingentLiabilities: ").append(toIndentedString(contingentLiabilities)).append("\n");
    sb.append("    workingCapital: ").append(toIndentedString(workingCapital)).append("\n");
    sb.append("    netWorth: ").append(toIndentedString(netWorth)).append("\n");
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

