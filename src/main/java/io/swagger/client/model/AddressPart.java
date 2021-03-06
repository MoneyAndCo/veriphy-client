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
import io.swagger.client.model.OccupantPart;
import io.swagger.client.model.PropertyPart;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * AddressPart
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-01-29T17:21:25.566Z")
public class AddressPart {
  @SerializedName("Forename")
  private String forename = null;

  @SerializedName("MiddleName")
  private String middleName = null;

  @SerializedName("Surname")
  private String surname = null;

  @SerializedName("MatchType")
  private String matchType = null;

  @SerializedName("DOB")
  private String DOB = null;

  @SerializedName("ForenameAppended")
  private Boolean forenameAppended = null;

  @SerializedName("MiddleNameAppended")
  private Boolean middleNameAppended = null;

  @SerializedName("DOBAppended")
  private Boolean doBAppended = null;

  @SerializedName("Telephone")
  private String telephone = null;

  @SerializedName("Telephonename")
  private String telephonename = null;

  @SerializedName("GoneAway")
  private String goneAway = null;

  @SerializedName("Source")
  private String source = null;

  @SerializedName("Recency")
  private String recency = null;

  @SerializedName("Occupants")
  private List<OccupantPart> occupants = null;

  @SerializedName("Property")
  private List<PropertyPart> property = null;

  @SerializedName("AddressValidated")
  private Boolean addressValidated = null;

  @SerializedName("Phonematch")
  private List<String> phonematch = null;

  public AddressPart forename(String forename) {
    this.forename = forename;
    return this;
  }

   /**
   * Get forename
   * @return forename
  **/
  @ApiModelProperty(value = "")
  public String getForename() {
    return forename;
  }

  public void setForename(String forename) {
    this.forename = forename;
  }

  public AddressPart middleName(String middleName) {
    this.middleName = middleName;
    return this;
  }

   /**
   * Get middleName
   * @return middleName
  **/
  @ApiModelProperty(value = "")
  public String getMiddleName() {
    return middleName;
  }

  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }

  public AddressPart surname(String surname) {
    this.surname = surname;
    return this;
  }

   /**
   * Get surname
   * @return surname
  **/
  @ApiModelProperty(value = "")
  public String getSurname() {
    return surname;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  public AddressPart matchType(String matchType) {
    this.matchType = matchType;
    return this;
  }

   /**
   * Get matchType
   * @return matchType
  **/
  @ApiModelProperty(value = "")
  public String getMatchType() {
    return matchType;
  }

  public void setMatchType(String matchType) {
    this.matchType = matchType;
  }

  public AddressPart DOB(String DOB) {
    this.DOB = DOB;
    return this;
  }

   /**
   * Get DOB
   * @return DOB
  **/
  @ApiModelProperty(value = "")
  public String getDOB() {
    return DOB;
  }

  public void setDOB(String DOB) {
    this.DOB = DOB;
  }

  public AddressPart forenameAppended(Boolean forenameAppended) {
    this.forenameAppended = forenameAppended;
    return this;
  }

   /**
   * Get forenameAppended
   * @return forenameAppended
  **/
  @ApiModelProperty(value = "")
  public Boolean getForenameAppended() {
    return forenameAppended;
  }

  public void setForenameAppended(Boolean forenameAppended) {
    this.forenameAppended = forenameAppended;
  }

  public AddressPart middleNameAppended(Boolean middleNameAppended) {
    this.middleNameAppended = middleNameAppended;
    return this;
  }

   /**
   * Get middleNameAppended
   * @return middleNameAppended
  **/
  @ApiModelProperty(value = "")
  public Boolean getMiddleNameAppended() {
    return middleNameAppended;
  }

  public void setMiddleNameAppended(Boolean middleNameAppended) {
    this.middleNameAppended = middleNameAppended;
  }

  public AddressPart doBAppended(Boolean doBAppended) {
    this.doBAppended = doBAppended;
    return this;
  }

   /**
   * Get doBAppended
   * @return doBAppended
  **/
  @ApiModelProperty(value = "")
  public Boolean getDoBAppended() {
    return doBAppended;
  }

  public void setDoBAppended(Boolean doBAppended) {
    this.doBAppended = doBAppended;
  }

  public AddressPart telephone(String telephone) {
    this.telephone = telephone;
    return this;
  }

   /**
   * Get telephone
   * @return telephone
  **/
  @ApiModelProperty(value = "")
  public String getTelephone() {
    return telephone;
  }

  public void setTelephone(String telephone) {
    this.telephone = telephone;
  }

  public AddressPart telephonename(String telephonename) {
    this.telephonename = telephonename;
    return this;
  }

   /**
   * Get telephonename
   * @return telephonename
  **/
  @ApiModelProperty(value = "")
  public String getTelephonename() {
    return telephonename;
  }

  public void setTelephonename(String telephonename) {
    this.telephonename = telephonename;
  }

  public AddressPart goneAway(String goneAway) {
    this.goneAway = goneAway;
    return this;
  }

   /**
   * Get goneAway
   * @return goneAway
  **/
  @ApiModelProperty(value = "")
  public String getGoneAway() {
    return goneAway;
  }

  public void setGoneAway(String goneAway) {
    this.goneAway = goneAway;
  }

  public AddressPart source(String source) {
    this.source = source;
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  @ApiModelProperty(value = "")
  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public AddressPart recency(String recency) {
    this.recency = recency;
    return this;
  }

   /**
   * Get recency
   * @return recency
  **/
  @ApiModelProperty(value = "")
  public String getRecency() {
    return recency;
  }

  public void setRecency(String recency) {
    this.recency = recency;
  }

  public AddressPart occupants(List<OccupantPart> occupants) {
    this.occupants = occupants;
    return this;
  }

  public AddressPart addOccupantsItem(OccupantPart occupantsItem) {
    if (this.occupants == null) {
      this.occupants = new ArrayList<OccupantPart>();
    }
    this.occupants.add(occupantsItem);
    return this;
  }

   /**
   * Get occupants
   * @return occupants
  **/
  @ApiModelProperty(value = "")
  public List<OccupantPart> getOccupants() {
    return occupants;
  }

  public void setOccupants(List<OccupantPart> occupants) {
    this.occupants = occupants;
  }

  public AddressPart property(List<PropertyPart> property) {
    this.property = property;
    return this;
  }

  public AddressPart addPropertyItem(PropertyPart propertyItem) {
    if (this.property == null) {
      this.property = new ArrayList<PropertyPart>();
    }
    this.property.add(propertyItem);
    return this;
  }

   /**
   * Get property
   * @return property
  **/
  @ApiModelProperty(value = "")
  public List<PropertyPart> getProperty() {
    return property;
  }

  public void setProperty(List<PropertyPart> property) {
    this.property = property;
  }

  public AddressPart addressValidated(Boolean addressValidated) {
    this.addressValidated = addressValidated;
    return this;
  }

   /**
   * Get addressValidated
   * @return addressValidated
  **/
  @ApiModelProperty(value = "")
  public Boolean getAddressValidated() {
    return addressValidated;
  }

  public void setAddressValidated(Boolean addressValidated) {
    this.addressValidated = addressValidated;
  }

  public AddressPart phonematch(List<String> phonematch) {
    this.phonematch = phonematch;
    return this;
  }

  public AddressPart addPhonematchItem(String phonematchItem) {
    if (this.phonematch == null) {
      this.phonematch = new ArrayList<String>();
    }
    this.phonematch.add(phonematchItem);
    return this;
  }

   /**
   * Get phonematch
   * @return phonematch
  **/
  @ApiModelProperty(value = "")
  public List<String> getPhonematch() {
    return phonematch;
  }

  public void setPhonematch(List<String> phonematch) {
    this.phonematch = phonematch;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddressPart addressPart = (AddressPart) o;
    return Objects.equals(this.forename, addressPart.forename) &&
        Objects.equals(this.middleName, addressPart.middleName) &&
        Objects.equals(this.surname, addressPart.surname) &&
        Objects.equals(this.matchType, addressPart.matchType) &&
        Objects.equals(this.DOB, addressPart.DOB) &&
        Objects.equals(this.forenameAppended, addressPart.forenameAppended) &&
        Objects.equals(this.middleNameAppended, addressPart.middleNameAppended) &&
        Objects.equals(this.doBAppended, addressPart.doBAppended) &&
        Objects.equals(this.telephone, addressPart.telephone) &&
        Objects.equals(this.telephonename, addressPart.telephonename) &&
        Objects.equals(this.goneAway, addressPart.goneAway) &&
        Objects.equals(this.source, addressPart.source) &&
        Objects.equals(this.recency, addressPart.recency) &&
        Objects.equals(this.occupants, addressPart.occupants) &&
        Objects.equals(this.property, addressPart.property) &&
        Objects.equals(this.addressValidated, addressPart.addressValidated) &&
        Objects.equals(this.phonematch, addressPart.phonematch);
  }

  @Override
  public int hashCode() {
    return Objects.hash(forename, middleName, surname, matchType, DOB, forenameAppended, middleNameAppended, doBAppended, telephone, telephonename, goneAway, source, recency, occupants, property, addressValidated, phonematch);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddressPart {\n");
    
    sb.append("    forename: ").append(toIndentedString(forename)).append("\n");
    sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
    sb.append("    surname: ").append(toIndentedString(surname)).append("\n");
    sb.append("    matchType: ").append(toIndentedString(matchType)).append("\n");
    sb.append("    DOB: ").append(toIndentedString(DOB)).append("\n");
    sb.append("    forenameAppended: ").append(toIndentedString(forenameAppended)).append("\n");
    sb.append("    middleNameAppended: ").append(toIndentedString(middleNameAppended)).append("\n");
    sb.append("    doBAppended: ").append(toIndentedString(doBAppended)).append("\n");
    sb.append("    telephone: ").append(toIndentedString(telephone)).append("\n");
    sb.append("    telephonename: ").append(toIndentedString(telephonename)).append("\n");
    sb.append("    goneAway: ").append(toIndentedString(goneAway)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    recency: ").append(toIndentedString(recency)).append("\n");
    sb.append("    occupants: ").append(toIndentedString(occupants)).append("\n");
    sb.append("    property: ").append(toIndentedString(property)).append("\n");
    sb.append("    addressValidated: ").append(toIndentedString(addressValidated)).append("\n");
    sb.append("    phonematch: ").append(toIndentedString(phonematch)).append("\n");
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

