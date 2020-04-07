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
 * CompanyActivity
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-01-29T17:21:25.566Z")
public class CompanyActivity {
  @SerializedName("ActivityCode")
  private String activityCode = null;

  @SerializedName("ActivityDescription")
  private String activityDescription = null;

  public CompanyActivity activityCode(String activityCode) {
    this.activityCode = activityCode;
    return this;
  }

   /**
   * Get activityCode
   * @return activityCode
  **/
  @ApiModelProperty(value = "")
  public String getActivityCode() {
    return activityCode;
  }

  public void setActivityCode(String activityCode) {
    this.activityCode = activityCode;
  }

  public CompanyActivity activityDescription(String activityDescription) {
    this.activityDescription = activityDescription;
    return this;
  }

   /**
   * Get activityDescription
   * @return activityDescription
  **/
  @ApiModelProperty(value = "")
  public String getActivityDescription() {
    return activityDescription;
  }

  public void setActivityDescription(String activityDescription) {
    this.activityDescription = activityDescription;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompanyActivity companyActivity = (CompanyActivity) o;
    return Objects.equals(this.activityCode, companyActivity.activityCode) &&
        Objects.equals(this.activityDescription, companyActivity.activityDescription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activityCode, activityDescription);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompanyActivity {\n");
    
    sb.append("    activityCode: ").append(toIndentedString(activityCode)).append("\n");
    sb.append("    activityDescription: ").append(toIndentedString(activityDescription)).append("\n");
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
