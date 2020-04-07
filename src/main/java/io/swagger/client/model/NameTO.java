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
 * NameTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-01-29T17:21:25.566Z")
public class NameTO {
  @SerializedName("title")
  private String title = null;

  @SerializedName("forename")
  private String forename = null;

  @SerializedName("otherNames")
  private String otherNames = null;

  @SerializedName("surname")
  private String surname = null;

  public NameTO title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @ApiModelProperty(required = true, value = "")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public NameTO forename(String forename) {
    this.forename = forename;
    return this;
  }

   /**
   * Get forename
   * @return forename
  **/
  @ApiModelProperty(required = true, value = "")
  public String getForename() {
    return forename;
  }

  public void setForename(String forename) {
    this.forename = forename;
  }

  public NameTO otherNames(String otherNames) {
    this.otherNames = otherNames;
    return this;
  }

   /**
   * Get otherNames
   * @return otherNames
  **/
  @ApiModelProperty(required = true, value = "")
  public String getOtherNames() {
    return otherNames;
  }

  public void setOtherNames(String otherNames) {
    this.otherNames = otherNames;
  }

  public NameTO surname(String surname) {
    this.surname = surname;
    return this;
  }

   /**
   * Get surname
   * @return surname
  **/
  @ApiModelProperty(required = true, value = "")
  public String getSurname() {
    return surname;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NameTO nameTO = (NameTO) o;
    return Objects.equals(this.title, nameTO.title) &&
        Objects.equals(this.forename, nameTO.forename) &&
        Objects.equals(this.otherNames, nameTO.otherNames) &&
        Objects.equals(this.surname, nameTO.surname);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, forename, otherNames, surname);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NameTO {\n");
    
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    forename: ").append(toIndentedString(forename)).append("\n");
    sb.append("    otherNames: ").append(toIndentedString(otherNames)).append("\n");
    sb.append("    surname: ").append(toIndentedString(surname)).append("\n");
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
