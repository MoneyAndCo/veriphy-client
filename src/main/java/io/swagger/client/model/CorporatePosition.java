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
import org.joda.time.DateTime;

/**
 * CorporatePosition
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-01-29T17:21:25.566Z")
public class CorporatePosition {
  @SerializedName("AppointmentDate")
  private DateTime appointmentDate = null;

  @SerializedName("AppointmentDateSpecified")
  private Boolean appointmentDateSpecified = null;

  @SerializedName("CommonCode")
  private String commonCode = null;

  @SerializedName("ProviderCode")
  private String providerCode = null;

  @SerializedName("Value")
  private String value = null;

  public CorporatePosition appointmentDate(DateTime appointmentDate) {
    this.appointmentDate = appointmentDate;
    return this;
  }

   /**
   * Get appointmentDate
   * @return appointmentDate
  **/
  @ApiModelProperty(value = "")
  public DateTime getAppointmentDate() {
    return appointmentDate;
  }

  public void setAppointmentDate(DateTime appointmentDate) {
    this.appointmentDate = appointmentDate;
  }

  public CorporatePosition appointmentDateSpecified(Boolean appointmentDateSpecified) {
    this.appointmentDateSpecified = appointmentDateSpecified;
    return this;
  }

   /**
   * Get appointmentDateSpecified
   * @return appointmentDateSpecified
  **/
  @ApiModelProperty(value = "")
  public Boolean getAppointmentDateSpecified() {
    return appointmentDateSpecified;
  }

  public void setAppointmentDateSpecified(Boolean appointmentDateSpecified) {
    this.appointmentDateSpecified = appointmentDateSpecified;
  }

  public CorporatePosition commonCode(String commonCode) {
    this.commonCode = commonCode;
    return this;
  }

   /**
   * Get commonCode
   * @return commonCode
  **/
  @ApiModelProperty(value = "")
  public String getCommonCode() {
    return commonCode;
  }

  public void setCommonCode(String commonCode) {
    this.commonCode = commonCode;
  }

  public CorporatePosition providerCode(String providerCode) {
    this.providerCode = providerCode;
    return this;
  }

   /**
   * Get providerCode
   * @return providerCode
  **/
  @ApiModelProperty(value = "")
  public String getProviderCode() {
    return providerCode;
  }

  public void setProviderCode(String providerCode) {
    this.providerCode = providerCode;
  }

  public CorporatePosition value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @ApiModelProperty(value = "")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CorporatePosition corporatePosition = (CorporatePosition) o;
    return Objects.equals(this.appointmentDate, corporatePosition.appointmentDate) &&
        Objects.equals(this.appointmentDateSpecified, corporatePosition.appointmentDateSpecified) &&
        Objects.equals(this.commonCode, corporatePosition.commonCode) &&
        Objects.equals(this.providerCode, corporatePosition.providerCode) &&
        Objects.equals(this.value, corporatePosition.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appointmentDate, appointmentDateSpecified, commonCode, providerCode, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CorporatePosition {\n");
    
    sb.append("    appointmentDate: ").append(toIndentedString(appointmentDate)).append("\n");
    sb.append("    appointmentDateSpecified: ").append(toIndentedString(appointmentDateSpecified)).append("\n");
    sb.append("    commonCode: ").append(toIndentedString(commonCode)).append("\n");
    sb.append("    providerCode: ").append(toIndentedString(providerCode)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
