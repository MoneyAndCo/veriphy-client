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
 * InternationalPassportTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-01-29T17:21:25.566Z")
public class InternationalPassportTO {
  @SerializedName("passportNumber1")
  private String passportNumber1 = null;

  @SerializedName("passportNumber2")
  private String passportNumber2 = null;

  @SerializedName("passportNumber3")
  private String passportNumber3 = null;

  @SerializedName("passportNumber4")
  private String passportNumber4 = null;

  @SerializedName("passportNumber5")
  private String passportNumber5 = null;

  @SerializedName("passportNumber6")
  private String passportNumber6 = null;

  @SerializedName("passportNumber7")
  private String passportNumber7 = null;

  @SerializedName("passportNumber8")
  private String passportNumber8 = null;

  @SerializedName("passportNumber9")
  private String passportNumber9 = null;

  public InternationalPassportTO passportNumber1(String passportNumber1) {
    this.passportNumber1 = passportNumber1;
    return this;
  }

   /**
   * Get passportNumber1
   * @return passportNumber1
  **/
  @ApiModelProperty(required = true, value = "")
  public String getPassportNumber1() {
    return passportNumber1;
  }

  public void setPassportNumber1(String passportNumber1) {
    this.passportNumber1 = passportNumber1;
  }

  public InternationalPassportTO passportNumber2(String passportNumber2) {
    this.passportNumber2 = passportNumber2;
    return this;
  }

   /**
   * Get passportNumber2
   * @return passportNumber2
  **/
  @ApiModelProperty(required = true, value = "")
  public String getPassportNumber2() {
    return passportNumber2;
  }

  public void setPassportNumber2(String passportNumber2) {
    this.passportNumber2 = passportNumber2;
  }

  public InternationalPassportTO passportNumber3(String passportNumber3) {
    this.passportNumber3 = passportNumber3;
    return this;
  }

   /**
   * Get passportNumber3
   * @return passportNumber3
  **/
  @ApiModelProperty(required = true, value = "")
  public String getPassportNumber3() {
    return passportNumber3;
  }

  public void setPassportNumber3(String passportNumber3) {
    this.passportNumber3 = passportNumber3;
  }

  public InternationalPassportTO passportNumber4(String passportNumber4) {
    this.passportNumber4 = passportNumber4;
    return this;
  }

   /**
   * Get passportNumber4
   * @return passportNumber4
  **/
  @ApiModelProperty(required = true, value = "")
  public String getPassportNumber4() {
    return passportNumber4;
  }

  public void setPassportNumber4(String passportNumber4) {
    this.passportNumber4 = passportNumber4;
  }

  public InternationalPassportTO passportNumber5(String passportNumber5) {
    this.passportNumber5 = passportNumber5;
    return this;
  }

   /**
   * Get passportNumber5
   * @return passportNumber5
  **/
  @ApiModelProperty(required = true, value = "")
  public String getPassportNumber5() {
    return passportNumber5;
  }

  public void setPassportNumber5(String passportNumber5) {
    this.passportNumber5 = passportNumber5;
  }

  public InternationalPassportTO passportNumber6(String passportNumber6) {
    this.passportNumber6 = passportNumber6;
    return this;
  }

   /**
   * Get passportNumber6
   * @return passportNumber6
  **/
  @ApiModelProperty(required = true, value = "")
  public String getPassportNumber6() {
    return passportNumber6;
  }

  public void setPassportNumber6(String passportNumber6) {
    this.passportNumber6 = passportNumber6;
  }

  public InternationalPassportTO passportNumber7(String passportNumber7) {
    this.passportNumber7 = passportNumber7;
    return this;
  }

   /**
   * Get passportNumber7
   * @return passportNumber7
  **/
  @ApiModelProperty(required = true, value = "")
  public String getPassportNumber7() {
    return passportNumber7;
  }

  public void setPassportNumber7(String passportNumber7) {
    this.passportNumber7 = passportNumber7;
  }

  public InternationalPassportTO passportNumber8(String passportNumber8) {
    this.passportNumber8 = passportNumber8;
    return this;
  }

   /**
   * Get passportNumber8
   * @return passportNumber8
  **/
  @ApiModelProperty(required = true, value = "")
  public String getPassportNumber8() {
    return passportNumber8;
  }

  public void setPassportNumber8(String passportNumber8) {
    this.passportNumber8 = passportNumber8;
  }

  public InternationalPassportTO passportNumber9(String passportNumber9) {
    this.passportNumber9 = passportNumber9;
    return this;
  }

   /**
   * Get passportNumber9
   * @return passportNumber9
  **/
  @ApiModelProperty(required = true, value = "")
  public String getPassportNumber9() {
    return passportNumber9;
  }

  public void setPassportNumber9(String passportNumber9) {
    this.passportNumber9 = passportNumber9;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InternationalPassportTO internationalPassportTO = (InternationalPassportTO) o;
    return Objects.equals(this.passportNumber1, internationalPassportTO.passportNumber1) &&
        Objects.equals(this.passportNumber2, internationalPassportTO.passportNumber2) &&
        Objects.equals(this.passportNumber3, internationalPassportTO.passportNumber3) &&
        Objects.equals(this.passportNumber4, internationalPassportTO.passportNumber4) &&
        Objects.equals(this.passportNumber5, internationalPassportTO.passportNumber5) &&
        Objects.equals(this.passportNumber6, internationalPassportTO.passportNumber6) &&
        Objects.equals(this.passportNumber7, internationalPassportTO.passportNumber7) &&
        Objects.equals(this.passportNumber8, internationalPassportTO.passportNumber8) &&
        Objects.equals(this.passportNumber9, internationalPassportTO.passportNumber9);
  }

  @Override
  public int hashCode() {
    return Objects.hash(passportNumber1, passportNumber2, passportNumber3, passportNumber4, passportNumber5, passportNumber6, passportNumber7, passportNumber8, passportNumber9);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InternationalPassportTO {\n");
    
    sb.append("    passportNumber1: ").append(toIndentedString(passportNumber1)).append("\n");
    sb.append("    passportNumber2: ").append(toIndentedString(passportNumber2)).append("\n");
    sb.append("    passportNumber3: ").append(toIndentedString(passportNumber3)).append("\n");
    sb.append("    passportNumber4: ").append(toIndentedString(passportNumber4)).append("\n");
    sb.append("    passportNumber5: ").append(toIndentedString(passportNumber5)).append("\n");
    sb.append("    passportNumber6: ").append(toIndentedString(passportNumber6)).append("\n");
    sb.append("    passportNumber7: ").append(toIndentedString(passportNumber7)).append("\n");
    sb.append("    passportNumber8: ").append(toIndentedString(passportNumber8)).append("\n");
    sb.append("    passportNumber9: ").append(toIndentedString(passportNumber9)).append("\n");
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

