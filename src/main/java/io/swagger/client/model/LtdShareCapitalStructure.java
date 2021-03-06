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
import io.swagger.client.model.ShareHolder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * LtdShareCapitalStructure
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-01-29T17:21:25.566Z")
public class LtdShareCapitalStructure {
  @SerializedName("NominalShareCapital")
  private FinancialValueDecimal nominalShareCapital = null;

  @SerializedName("IssuedShareCapital")
  private FinancialValueDecimal issuedShareCapital = null;

  @SerializedName("ShareHolders")
  private List<ShareHolder> shareHolders = null;

  public LtdShareCapitalStructure nominalShareCapital(FinancialValueDecimal nominalShareCapital) {
    this.nominalShareCapital = nominalShareCapital;
    return this;
  }

   /**
   * Get nominalShareCapital
   * @return nominalShareCapital
  **/
  @ApiModelProperty(value = "")
  public FinancialValueDecimal getNominalShareCapital() {
    return nominalShareCapital;
  }

  public void setNominalShareCapital(FinancialValueDecimal nominalShareCapital) {
    this.nominalShareCapital = nominalShareCapital;
  }

  public LtdShareCapitalStructure issuedShareCapital(FinancialValueDecimal issuedShareCapital) {
    this.issuedShareCapital = issuedShareCapital;
    return this;
  }

   /**
   * Get issuedShareCapital
   * @return issuedShareCapital
  **/
  @ApiModelProperty(value = "")
  public FinancialValueDecimal getIssuedShareCapital() {
    return issuedShareCapital;
  }

  public void setIssuedShareCapital(FinancialValueDecimal issuedShareCapital) {
    this.issuedShareCapital = issuedShareCapital;
  }

  public LtdShareCapitalStructure shareHolders(List<ShareHolder> shareHolders) {
    this.shareHolders = shareHolders;
    return this;
  }

  public LtdShareCapitalStructure addShareHoldersItem(ShareHolder shareHoldersItem) {
    if (this.shareHolders == null) {
      this.shareHolders = new ArrayList<ShareHolder>();
    }
    this.shareHolders.add(shareHoldersItem);
    return this;
  }

   /**
   * Get shareHolders
   * @return shareHolders
  **/
  @ApiModelProperty(value = "")
  public List<ShareHolder> getShareHolders() {
    return shareHolders;
  }

  public void setShareHolders(List<ShareHolder> shareHolders) {
    this.shareHolders = shareHolders;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LtdShareCapitalStructure ltdShareCapitalStructure = (LtdShareCapitalStructure) o;
    return Objects.equals(this.nominalShareCapital, ltdShareCapitalStructure.nominalShareCapital) &&
        Objects.equals(this.issuedShareCapital, ltdShareCapitalStructure.issuedShareCapital) &&
        Objects.equals(this.shareHolders, ltdShareCapitalStructure.shareHolders);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nominalShareCapital, issuedShareCapital, shareHolders);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LtdShareCapitalStructure {\n");
    
    sb.append("    nominalShareCapital: ").append(toIndentedString(nominalShareCapital)).append("\n");
    sb.append("    issuedShareCapital: ").append(toIndentedString(issuedShareCapital)).append("\n");
    sb.append("    shareHolders: ").append(toIndentedString(shareHolders)).append("\n");
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

