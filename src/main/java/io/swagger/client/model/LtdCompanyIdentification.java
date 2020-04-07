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
import io.swagger.client.model.CompanyActivity;
import io.swagger.client.model.LtdCompanyBasicInformation;
import io.swagger.client.model.PreviousLegalForm;
import io.swagger.client.model.PreviousName;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * LtdCompanyIdentification
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-01-29T17:21:25.566Z")
public class LtdCompanyIdentification {
  @SerializedName("BasicInformation")
  private LtdCompanyBasicInformation basicInformation = null;

  @SerializedName("Activities")
  private List<CompanyActivity> activities = null;

  @SerializedName("PreviousNames")
  private List<PreviousName> previousNames = null;

  @SerializedName("PreviousLegalForms")
  private List<PreviousLegalForm> previousLegalForms = null;

  public LtdCompanyIdentification basicInformation(LtdCompanyBasicInformation basicInformation) {
    this.basicInformation = basicInformation;
    return this;
  }

   /**
   * Get basicInformation
   * @return basicInformation
  **/
  @ApiModelProperty(value = "")
  public LtdCompanyBasicInformation getBasicInformation() {
    return basicInformation;
  }

  public void setBasicInformation(LtdCompanyBasicInformation basicInformation) {
    this.basicInformation = basicInformation;
  }

  public LtdCompanyIdentification activities(List<CompanyActivity> activities) {
    this.activities = activities;
    return this;
  }

  public LtdCompanyIdentification addActivitiesItem(CompanyActivity activitiesItem) {
    if (this.activities == null) {
      this.activities = new ArrayList<CompanyActivity>();
    }
    this.activities.add(activitiesItem);
    return this;
  }

   /**
   * Get activities
   * @return activities
  **/
  @ApiModelProperty(value = "")
  public List<CompanyActivity> getActivities() {
    return activities;
  }

  public void setActivities(List<CompanyActivity> activities) {
    this.activities = activities;
  }

  public LtdCompanyIdentification previousNames(List<PreviousName> previousNames) {
    this.previousNames = previousNames;
    return this;
  }

  public LtdCompanyIdentification addPreviousNamesItem(PreviousName previousNamesItem) {
    if (this.previousNames == null) {
      this.previousNames = new ArrayList<PreviousName>();
    }
    this.previousNames.add(previousNamesItem);
    return this;
  }

   /**
   * Get previousNames
   * @return previousNames
  **/
  @ApiModelProperty(value = "")
  public List<PreviousName> getPreviousNames() {
    return previousNames;
  }

  public void setPreviousNames(List<PreviousName> previousNames) {
    this.previousNames = previousNames;
  }

  public LtdCompanyIdentification previousLegalForms(List<PreviousLegalForm> previousLegalForms) {
    this.previousLegalForms = previousLegalForms;
    return this;
  }

  public LtdCompanyIdentification addPreviousLegalFormsItem(PreviousLegalForm previousLegalFormsItem) {
    if (this.previousLegalForms == null) {
      this.previousLegalForms = new ArrayList<PreviousLegalForm>();
    }
    this.previousLegalForms.add(previousLegalFormsItem);
    return this;
  }

   /**
   * Get previousLegalForms
   * @return previousLegalForms
  **/
  @ApiModelProperty(value = "")
  public List<PreviousLegalForm> getPreviousLegalForms() {
    return previousLegalForms;
  }

  public void setPreviousLegalForms(List<PreviousLegalForm> previousLegalForms) {
    this.previousLegalForms = previousLegalForms;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LtdCompanyIdentification ltdCompanyIdentification = (LtdCompanyIdentification) o;
    return Objects.equals(this.basicInformation, ltdCompanyIdentification.basicInformation) &&
        Objects.equals(this.activities, ltdCompanyIdentification.activities) &&
        Objects.equals(this.previousNames, ltdCompanyIdentification.previousNames) &&
        Objects.equals(this.previousLegalForms, ltdCompanyIdentification.previousLegalForms);
  }

  @Override
  public int hashCode() {
    return Objects.hash(basicInformation, activities, previousNames, previousLegalForms);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LtdCompanyIdentification {\n");
    
    sb.append("    basicInformation: ").append(toIndentedString(basicInformation)).append("\n");
    sb.append("    activities: ").append(toIndentedString(activities)).append("\n");
    sb.append("    previousNames: ").append(toIndentedString(previousNames)).append("\n");
    sb.append("    previousLegalForms: ").append(toIndentedString(previousLegalForms)).append("\n");
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
