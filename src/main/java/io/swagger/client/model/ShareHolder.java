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
import io.swagger.client.model.AddressData;
import java.io.IOException;

/**
 * ShareHolder
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-01-29T17:21:25.566Z")
public class ShareHolder {
  @SerializedName("SharePercent")
  private Double sharePercent = null;

  @SerializedName("SharePercentSpecified")
  private Boolean sharePercentSpecified = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("Address")
  private AddressData address = null;

  public ShareHolder sharePercent(Double sharePercent) {
    this.sharePercent = sharePercent;
    return this;
  }

   /**
   * Get sharePercent
   * @return sharePercent
  **/
  @ApiModelProperty(value = "")
  public Double getSharePercent() {
    return sharePercent;
  }

  public void setSharePercent(Double sharePercent) {
    this.sharePercent = sharePercent;
  }

  public ShareHolder sharePercentSpecified(Boolean sharePercentSpecified) {
    this.sharePercentSpecified = sharePercentSpecified;
    return this;
  }

   /**
   * Get sharePercentSpecified
   * @return sharePercentSpecified
  **/
  @ApiModelProperty(value = "")
  public Boolean getSharePercentSpecified() {
    return sharePercentSpecified;
  }

  public void setSharePercentSpecified(Boolean sharePercentSpecified) {
    this.sharePercentSpecified = sharePercentSpecified;
  }

  public ShareHolder name(String name) {
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

  public ShareHolder address(AddressData address) {
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @ApiModelProperty(value = "")
  public AddressData getAddress() {
    return address;
  }

  public void setAddress(AddressData address) {
    this.address = address;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShareHolder shareHolder = (ShareHolder) o;
    return Objects.equals(this.sharePercent, shareHolder.sharePercent) &&
        Objects.equals(this.sharePercentSpecified, shareHolder.sharePercentSpecified) &&
        Objects.equals(this.name, shareHolder.name) &&
        Objects.equals(this.address, shareHolder.address);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sharePercent, sharePercentSpecified, name, address);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShareHolder {\n");
    
    sb.append("    sharePercent: ").append(toIndentedString(sharePercent)).append("\n");
    sb.append("    sharePercentSpecified: ").append(toIndentedString(sharePercentSpecified)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
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

