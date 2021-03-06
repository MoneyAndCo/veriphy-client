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
 * SearchResult
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-01-29T17:21:25.566Z")
public class SearchResult {
  @SerializedName("ExceptionCode")
  private Integer exceptionCode = null;

  @SerializedName("ExceptionReason")
  private String exceptionReason = null;

  @SerializedName("SearchRef")
  private Integer searchRef = null;

  @SerializedName("Account")
  private String account = null;

  @SerializedName("SortCode")
  private String sortCode = null;

  @SerializedName("BespokeReference")
  private String bespokeReference = null;

  @SerializedName("Result")
  private String result = null;

  public SearchResult exceptionCode(Integer exceptionCode) {
    this.exceptionCode = exceptionCode;
    return this;
  }

   /**
   * Get exceptionCode
   * @return exceptionCode
  **/
  @ApiModelProperty(value = "")
  public Integer getExceptionCode() {
    return exceptionCode;
  }

  public void setExceptionCode(Integer exceptionCode) {
    this.exceptionCode = exceptionCode;
  }

  public SearchResult exceptionReason(String exceptionReason) {
    this.exceptionReason = exceptionReason;
    return this;
  }

   /**
   * Get exceptionReason
   * @return exceptionReason
  **/
  @ApiModelProperty(value = "")
  public String getExceptionReason() {
    return exceptionReason;
  }

  public void setExceptionReason(String exceptionReason) {
    this.exceptionReason = exceptionReason;
  }

  public SearchResult searchRef(Integer searchRef) {
    this.searchRef = searchRef;
    return this;
  }

   /**
   * Get searchRef
   * @return searchRef
  **/
  @ApiModelProperty(value = "")
  public Integer getSearchRef() {
    return searchRef;
  }

  public void setSearchRef(Integer searchRef) {
    this.searchRef = searchRef;
  }

  public SearchResult account(String account) {
    this.account = account;
    return this;
  }

   /**
   * Get account
   * @return account
  **/
  @ApiModelProperty(value = "")
  public String getAccount() {
    return account;
  }

  public void setAccount(String account) {
    this.account = account;
  }

  public SearchResult sortCode(String sortCode) {
    this.sortCode = sortCode;
    return this;
  }

   /**
   * Get sortCode
   * @return sortCode
  **/
  @ApiModelProperty(value = "")
  public String getSortCode() {
    return sortCode;
  }

  public void setSortCode(String sortCode) {
    this.sortCode = sortCode;
  }

  public SearchResult bespokeReference(String bespokeReference) {
    this.bespokeReference = bespokeReference;
    return this;
  }

   /**
   * Get bespokeReference
   * @return bespokeReference
  **/
  @ApiModelProperty(value = "")
  public String getBespokeReference() {
    return bespokeReference;
  }

  public void setBespokeReference(String bespokeReference) {
    this.bespokeReference = bespokeReference;
  }

  public SearchResult result(String result) {
    this.result = result;
    return this;
  }

   /**
   * Get result
   * @return result
  **/
  @ApiModelProperty(value = "")
  public String getResult() {
    return result;
  }

  public void setResult(String result) {
    this.result = result;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchResult searchResult = (SearchResult) o;
    return Objects.equals(this.exceptionCode, searchResult.exceptionCode) &&
        Objects.equals(this.exceptionReason, searchResult.exceptionReason) &&
        Objects.equals(this.searchRef, searchResult.searchRef) &&
        Objects.equals(this.account, searchResult.account) &&
        Objects.equals(this.sortCode, searchResult.sortCode) &&
        Objects.equals(this.bespokeReference, searchResult.bespokeReference) &&
        Objects.equals(this.result, searchResult.result);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exceptionCode, exceptionReason, searchRef, account, sortCode, bespokeReference, result);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchResult {\n");
    
    sb.append("    exceptionCode: ").append(toIndentedString(exceptionCode)).append("\n");
    sb.append("    exceptionReason: ").append(toIndentedString(exceptionReason)).append("\n");
    sb.append("    searchRef: ").append(toIndentedString(searchRef)).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    sortCode: ").append(toIndentedString(sortCode)).append("\n");
    sb.append("    bespokeReference: ").append(toIndentedString(bespokeReference)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
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

