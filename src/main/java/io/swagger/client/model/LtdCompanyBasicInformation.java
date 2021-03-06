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
import io.swagger.client.model.CompanyActivity;
import io.swagger.client.model.CompanyStatusDescription;
import io.swagger.client.model.LegalForm;
import java.io.IOException;
import org.joda.time.DateTime;

/**
 * LtdCompanyBasicInformation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-01-29T17:21:25.566Z")
public class LtdCompanyBasicInformation {
  @SerializedName("BusinessName")
  private String businessName = null;

  @SerializedName("RegisteredCompanyName")
  private String registeredCompanyName = null;

  @SerializedName("CompanyRegistrationNumber")
  private String companyRegistrationNumber = null;

  /**
   * Gets or Sets country
   */
  @JsonAdapter(CountryEnum.Adapter.class)
  public enum CountryEnum {
    AF("AF"),
    
    AX("AX"),
    
    AL("AL"),
    
    DZ("DZ"),
    
    AS("AS"),
    
    AD("AD"),
    
    AO("AO"),
    
    AI("AI"),
    
    AQ("AQ"),
    
    AG("AG"),
    
    AR("AR"),
    
    AM("AM"),
    
    AW("AW"),
    
    AU("AU"),
    
    AT("AT"),
    
    AZ("AZ"),
    
    BS("BS"),
    
    BH("BH"),
    
    BD("BD"),
    
    BB("BB"),
    
    BY("BY"),
    
    BE("BE"),
    
    BZ("BZ"),
    
    BJ("BJ"),
    
    BM("BM"),
    
    BT("BT"),
    
    BO("BO"),
    
    BA("BA"),
    
    BW("BW"),
    
    BV("BV"),
    
    BR("BR"),
    
    IO("IO"),
    
    BN("BN"),
    
    BG("BG"),
    
    BF("BF"),
    
    BI("BI"),
    
    KH("KH"),
    
    CM("CM"),
    
    CA("CA"),
    
    CV("CV"),
    
    KY("KY"),
    
    CF("CF"),
    
    TD("TD"),
    
    CL("CL"),
    
    CN("CN"),
    
    CX("CX"),
    
    CC("CC"),
    
    CO("CO"),
    
    KM("KM"),
    
    CG("CG"),
    
    CD("CD"),
    
    CK("CK"),
    
    CR("CR"),
    
    CI("CI"),
    
    HR("HR"),
    
    CU("CU"),
    
    CY("CY"),
    
    CZ("CZ"),
    
    DK("DK"),
    
    DJ("DJ"),
    
    DM("DM"),
    
    DO("DO"),
    
    EC("EC"),
    
    EG("EG"),
    
    SV("SV"),
    
    GQ("GQ"),
    
    ER("ER"),
    
    EE("EE"),
    
    ET("ET"),
    
    FK("FK"),
    
    FO("FO"),
    
    FJ("FJ"),
    
    FI("FI"),
    
    FR("FR"),
    
    GF("GF"),
    
    PF("PF"),
    
    TF("TF"),
    
    GA("GA"),
    
    GM("GM"),
    
    GE("GE"),
    
    DE("DE"),
    
    GH("GH"),
    
    GI("GI"),
    
    GR("GR"),
    
    GL("GL"),
    
    GD("GD"),
    
    GP("GP"),
    
    GU("GU"),
    
    GT("GT"),
    
    GG("GG"),
    
    GN("GN"),
    
    GW("GW"),
    
    GY("GY"),
    
    HT("HT"),
    
    HM("HM"),
    
    HN("HN"),
    
    HK("HK"),
    
    HU("HU"),
    
    IS("IS"),
    
    IN("IN"),
    
    ID("ID"),
    
    IR("IR"),
    
    IQ("IQ"),
    
    IE("IE"),
    
    IM("IM"),
    
    IL("IL"),
    
    IT("IT"),
    
    JM("JM"),
    
    JP("JP"),
    
    JE("JE"),
    
    JO("JO"),
    
    KZ("KZ"),
    
    KE("KE"),
    
    KI("KI"),
    
    KP("KP"),
    
    KR("KR"),
    
    KW("KW"),
    
    KG("KG"),
    
    LA("LA"),
    
    LV("LV"),
    
    LB("LB"),
    
    LS("LS"),
    
    LR("LR"),
    
    LY("LY"),
    
    LI("LI"),
    
    LT("LT"),
    
    LU("LU"),
    
    MO("MO"),
    
    MK("MK"),
    
    MG("MG"),
    
    MW("MW"),
    
    MY("MY"),
    
    MV("MV"),
    
    ML("ML"),
    
    MT("MT"),
    
    MH("MH"),
    
    MQ("MQ"),
    
    MR("MR"),
    
    MU("MU"),
    
    YT("YT"),
    
    MX("MX"),
    
    FM("FM"),
    
    MD("MD"),
    
    MC("MC"),
    
    MN("MN"),
    
    ME("ME"),
    
    MS("MS"),
    
    MA("MA"),
    
    MZ("MZ"),
    
    MM("MM"),
    
    NA("NA"),
    
    NR("NR"),
    
    NP("NP"),
    
    NL("NL"),
    
    AN("AN"),
    
    NC("NC"),
    
    NZ("NZ"),
    
    NI("NI"),
    
    NE("NE"),
    
    NG("NG"),
    
    NU("NU"),
    
    NF("NF"),
    
    MP("MP"),
    
    NO("NO"),
    
    OM("OM"),
    
    PK("PK"),
    
    PW("PW"),
    
    PS("PS"),
    
    PA("PA"),
    
    PG("PG"),
    
    PY("PY"),
    
    PE("PE"),
    
    PH("PH"),
    
    PN("PN"),
    
    PL("PL"),
    
    PT("PT"),
    
    PR("PR"),
    
    QA("QA"),
    
    RE("RE"),
    
    RO("RO"),
    
    RU("RU"),
    
    RW("RW"),
    
    BL("BL"),
    
    SH("SH"),
    
    KN("KN"),
    
    LC("LC"),
    
    MF("MF"),
    
    PM("PM"),
    
    VC("VC"),
    
    WS("WS"),
    
    SM("SM"),
    
    ST("ST"),
    
    SA("SA"),
    
    SN("SN"),
    
    RS("RS"),
    
    SC("SC"),
    
    SL("SL"),
    
    SG("SG"),
    
    SK("SK"),
    
    SI("SI"),
    
    SB("SB"),
    
    SO("SO"),
    
    ZA("ZA"),
    
    GS("GS"),
    
    ES("ES"),
    
    LK("LK"),
    
    SD("SD"),
    
    SR("SR"),
    
    SJ("SJ"),
    
    SZ("SZ"),
    
    SE("SE"),
    
    CH("CH"),
    
    SY("SY"),
    
    TW("TW"),
    
    TJ("TJ"),
    
    TZ("TZ"),
    
    TH("TH"),
    
    TL("TL"),
    
    TG("TG"),
    
    TK("TK"),
    
    TO("TO"),
    
    TT("TT"),
    
    TN("TN"),
    
    TR("TR"),
    
    TM("TM"),
    
    TC("TC"),
    
    TV("TV"),
    
    UG("UG"),
    
    UA("UA"),
    
    AE("AE"),
    
    GB("GB"),
    
    US("US"),
    
    UM("UM"),
    
    UY("UY"),
    
    UZ("UZ"),
    
    VU("VU"),
    
    VA("VA"),
    
    VE("VE"),
    
    VN("VN"),
    
    VG("VG"),
    
    VI("VI"),
    
    WF("WF"),
    
    EH("EH"),
    
    YE("YE"),
    
    ZM("ZM"),
    
    ZW("ZW"),
    
    PLC("PLC");

    private String value;

    CountryEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CountryEnum fromValue(String text) {
      for (CountryEnum b : CountryEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<CountryEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CountryEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CountryEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return CountryEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("Country")
  private CountryEnum country = null;

  @SerializedName("VatRegistrationNumber")
  private String vatRegistrationNumber = null;

  @SerializedName("VatRegistrationDate")
  private DateTime vatRegistrationDate = null;

  @SerializedName("VatRegistrationDateSpecified")
  private Boolean vatRegistrationDateSpecified = null;

  @SerializedName("DateofCompanyRegistration")
  private DateTime dateofCompanyRegistration = null;

  @SerializedName("DateofCompanyRegistrationSpecified")
  private Boolean dateofCompanyRegistrationSpecified = null;

  @SerializedName("DateofStartingOperations")
  private DateTime dateofStartingOperations = null;

  @SerializedName("DateofStartingOperationsSpecified")
  private Boolean dateofStartingOperationsSpecified = null;

  @SerializedName("CommercialCourt")
  private String commercialCourt = null;

  @SerializedName("LegalForm")
  private LegalForm legalForm = null;

  @SerializedName("TypeofOwnership")
  private String typeofOwnership = null;

  @SerializedName("CompanyStatus")
  private CompanyStatusDescription companyStatus = null;

  @SerializedName("PrincipalActivity")
  private CompanyActivity principalActivity = null;

  @SerializedName("ContactAddress")
  private AddressData contactAddress = null;

  @SerializedName("ContactTelephoneNumber")
  private String contactTelephoneNumber = null;

  public LtdCompanyBasicInformation businessName(String businessName) {
    this.businessName = businessName;
    return this;
  }

   /**
   * Get businessName
   * @return businessName
  **/
  @ApiModelProperty(value = "")
  public String getBusinessName() {
    return businessName;
  }

  public void setBusinessName(String businessName) {
    this.businessName = businessName;
  }

  public LtdCompanyBasicInformation registeredCompanyName(String registeredCompanyName) {
    this.registeredCompanyName = registeredCompanyName;
    return this;
  }

   /**
   * Get registeredCompanyName
   * @return registeredCompanyName
  **/
  @ApiModelProperty(value = "")
  public String getRegisteredCompanyName() {
    return registeredCompanyName;
  }

  public void setRegisteredCompanyName(String registeredCompanyName) {
    this.registeredCompanyName = registeredCompanyName;
  }

  public LtdCompanyBasicInformation companyRegistrationNumber(String companyRegistrationNumber) {
    this.companyRegistrationNumber = companyRegistrationNumber;
    return this;
  }

   /**
   * Get companyRegistrationNumber
   * @return companyRegistrationNumber
  **/
  @ApiModelProperty(value = "")
  public String getCompanyRegistrationNumber() {
    return companyRegistrationNumber;
  }

  public void setCompanyRegistrationNumber(String companyRegistrationNumber) {
    this.companyRegistrationNumber = companyRegistrationNumber;
  }

  public LtdCompanyBasicInformation country(CountryEnum country) {
    this.country = country;
    return this;
  }

   /**
   * Get country
   * @return country
  **/
  @ApiModelProperty(value = "")
  public CountryEnum getCountry() {
    return country;
  }

  public void setCountry(CountryEnum country) {
    this.country = country;
  }

  public LtdCompanyBasicInformation vatRegistrationNumber(String vatRegistrationNumber) {
    this.vatRegistrationNumber = vatRegistrationNumber;
    return this;
  }

   /**
   * Get vatRegistrationNumber
   * @return vatRegistrationNumber
  **/
  @ApiModelProperty(value = "")
  public String getVatRegistrationNumber() {
    return vatRegistrationNumber;
  }

  public void setVatRegistrationNumber(String vatRegistrationNumber) {
    this.vatRegistrationNumber = vatRegistrationNumber;
  }

  public LtdCompanyBasicInformation vatRegistrationDate(DateTime vatRegistrationDate) {
    this.vatRegistrationDate = vatRegistrationDate;
    return this;
  }

   /**
   * Get vatRegistrationDate
   * @return vatRegistrationDate
  **/
  @ApiModelProperty(value = "")
  public DateTime getVatRegistrationDate() {
    return vatRegistrationDate;
  }

  public void setVatRegistrationDate(DateTime vatRegistrationDate) {
    this.vatRegistrationDate = vatRegistrationDate;
  }

  public LtdCompanyBasicInformation vatRegistrationDateSpecified(Boolean vatRegistrationDateSpecified) {
    this.vatRegistrationDateSpecified = vatRegistrationDateSpecified;
    return this;
  }

   /**
   * Get vatRegistrationDateSpecified
   * @return vatRegistrationDateSpecified
  **/
  @ApiModelProperty(value = "")
  public Boolean getVatRegistrationDateSpecified() {
    return vatRegistrationDateSpecified;
  }

  public void setVatRegistrationDateSpecified(Boolean vatRegistrationDateSpecified) {
    this.vatRegistrationDateSpecified = vatRegistrationDateSpecified;
  }

  public LtdCompanyBasicInformation dateofCompanyRegistration(DateTime dateofCompanyRegistration) {
    this.dateofCompanyRegistration = dateofCompanyRegistration;
    return this;
  }

   /**
   * Get dateofCompanyRegistration
   * @return dateofCompanyRegistration
  **/
  @ApiModelProperty(value = "")
  public DateTime getDateofCompanyRegistration() {
    return dateofCompanyRegistration;
  }

  public void setDateofCompanyRegistration(DateTime dateofCompanyRegistration) {
    this.dateofCompanyRegistration = dateofCompanyRegistration;
  }

  public LtdCompanyBasicInformation dateofCompanyRegistrationSpecified(Boolean dateofCompanyRegistrationSpecified) {
    this.dateofCompanyRegistrationSpecified = dateofCompanyRegistrationSpecified;
    return this;
  }

   /**
   * Get dateofCompanyRegistrationSpecified
   * @return dateofCompanyRegistrationSpecified
  **/
  @ApiModelProperty(value = "")
  public Boolean getDateofCompanyRegistrationSpecified() {
    return dateofCompanyRegistrationSpecified;
  }

  public void setDateofCompanyRegistrationSpecified(Boolean dateofCompanyRegistrationSpecified) {
    this.dateofCompanyRegistrationSpecified = dateofCompanyRegistrationSpecified;
  }

  public LtdCompanyBasicInformation dateofStartingOperations(DateTime dateofStartingOperations) {
    this.dateofStartingOperations = dateofStartingOperations;
    return this;
  }

   /**
   * Get dateofStartingOperations
   * @return dateofStartingOperations
  **/
  @ApiModelProperty(value = "")
  public DateTime getDateofStartingOperations() {
    return dateofStartingOperations;
  }

  public void setDateofStartingOperations(DateTime dateofStartingOperations) {
    this.dateofStartingOperations = dateofStartingOperations;
  }

  public LtdCompanyBasicInformation dateofStartingOperationsSpecified(Boolean dateofStartingOperationsSpecified) {
    this.dateofStartingOperationsSpecified = dateofStartingOperationsSpecified;
    return this;
  }

   /**
   * Get dateofStartingOperationsSpecified
   * @return dateofStartingOperationsSpecified
  **/
  @ApiModelProperty(value = "")
  public Boolean getDateofStartingOperationsSpecified() {
    return dateofStartingOperationsSpecified;
  }

  public void setDateofStartingOperationsSpecified(Boolean dateofStartingOperationsSpecified) {
    this.dateofStartingOperationsSpecified = dateofStartingOperationsSpecified;
  }

  public LtdCompanyBasicInformation commercialCourt(String commercialCourt) {
    this.commercialCourt = commercialCourt;
    return this;
  }

   /**
   * Get commercialCourt
   * @return commercialCourt
  **/
  @ApiModelProperty(value = "")
  public String getCommercialCourt() {
    return commercialCourt;
  }

  public void setCommercialCourt(String commercialCourt) {
    this.commercialCourt = commercialCourt;
  }

  public LtdCompanyBasicInformation legalForm(LegalForm legalForm) {
    this.legalForm = legalForm;
    return this;
  }

   /**
   * Get legalForm
   * @return legalForm
  **/
  @ApiModelProperty(value = "")
  public LegalForm getLegalForm() {
    return legalForm;
  }

  public void setLegalForm(LegalForm legalForm) {
    this.legalForm = legalForm;
  }

  public LtdCompanyBasicInformation typeofOwnership(String typeofOwnership) {
    this.typeofOwnership = typeofOwnership;
    return this;
  }

   /**
   * Get typeofOwnership
   * @return typeofOwnership
  **/
  @ApiModelProperty(value = "")
  public String getTypeofOwnership() {
    return typeofOwnership;
  }

  public void setTypeofOwnership(String typeofOwnership) {
    this.typeofOwnership = typeofOwnership;
  }

  public LtdCompanyBasicInformation companyStatus(CompanyStatusDescription companyStatus) {
    this.companyStatus = companyStatus;
    return this;
  }

   /**
   * Get companyStatus
   * @return companyStatus
  **/
  @ApiModelProperty(value = "")
  public CompanyStatusDescription getCompanyStatus() {
    return companyStatus;
  }

  public void setCompanyStatus(CompanyStatusDescription companyStatus) {
    this.companyStatus = companyStatus;
  }

  public LtdCompanyBasicInformation principalActivity(CompanyActivity principalActivity) {
    this.principalActivity = principalActivity;
    return this;
  }

   /**
   * Get principalActivity
   * @return principalActivity
  **/
  @ApiModelProperty(value = "")
  public CompanyActivity getPrincipalActivity() {
    return principalActivity;
  }

  public void setPrincipalActivity(CompanyActivity principalActivity) {
    this.principalActivity = principalActivity;
  }

  public LtdCompanyBasicInformation contactAddress(AddressData contactAddress) {
    this.contactAddress = contactAddress;
    return this;
  }

   /**
   * Get contactAddress
   * @return contactAddress
  **/
  @ApiModelProperty(value = "")
  public AddressData getContactAddress() {
    return contactAddress;
  }

  public void setContactAddress(AddressData contactAddress) {
    this.contactAddress = contactAddress;
  }

  public LtdCompanyBasicInformation contactTelephoneNumber(String contactTelephoneNumber) {
    this.contactTelephoneNumber = contactTelephoneNumber;
    return this;
  }

   /**
   * Get contactTelephoneNumber
   * @return contactTelephoneNumber
  **/
  @ApiModelProperty(value = "")
  public String getContactTelephoneNumber() {
    return contactTelephoneNumber;
  }

  public void setContactTelephoneNumber(String contactTelephoneNumber) {
    this.contactTelephoneNumber = contactTelephoneNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LtdCompanyBasicInformation ltdCompanyBasicInformation = (LtdCompanyBasicInformation) o;
    return Objects.equals(this.businessName, ltdCompanyBasicInformation.businessName) &&
        Objects.equals(this.registeredCompanyName, ltdCompanyBasicInformation.registeredCompanyName) &&
        Objects.equals(this.companyRegistrationNumber, ltdCompanyBasicInformation.companyRegistrationNumber) &&
        Objects.equals(this.country, ltdCompanyBasicInformation.country) &&
        Objects.equals(this.vatRegistrationNumber, ltdCompanyBasicInformation.vatRegistrationNumber) &&
        Objects.equals(this.vatRegistrationDate, ltdCompanyBasicInformation.vatRegistrationDate) &&
        Objects.equals(this.vatRegistrationDateSpecified, ltdCompanyBasicInformation.vatRegistrationDateSpecified) &&
        Objects.equals(this.dateofCompanyRegistration, ltdCompanyBasicInformation.dateofCompanyRegistration) &&
        Objects.equals(this.dateofCompanyRegistrationSpecified, ltdCompanyBasicInformation.dateofCompanyRegistrationSpecified) &&
        Objects.equals(this.dateofStartingOperations, ltdCompanyBasicInformation.dateofStartingOperations) &&
        Objects.equals(this.dateofStartingOperationsSpecified, ltdCompanyBasicInformation.dateofStartingOperationsSpecified) &&
        Objects.equals(this.commercialCourt, ltdCompanyBasicInformation.commercialCourt) &&
        Objects.equals(this.legalForm, ltdCompanyBasicInformation.legalForm) &&
        Objects.equals(this.typeofOwnership, ltdCompanyBasicInformation.typeofOwnership) &&
        Objects.equals(this.companyStatus, ltdCompanyBasicInformation.companyStatus) &&
        Objects.equals(this.principalActivity, ltdCompanyBasicInformation.principalActivity) &&
        Objects.equals(this.contactAddress, ltdCompanyBasicInformation.contactAddress) &&
        Objects.equals(this.contactTelephoneNumber, ltdCompanyBasicInformation.contactTelephoneNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(businessName, registeredCompanyName, companyRegistrationNumber, country, vatRegistrationNumber, vatRegistrationDate, vatRegistrationDateSpecified, dateofCompanyRegistration, dateofCompanyRegistrationSpecified, dateofStartingOperations, dateofStartingOperationsSpecified, commercialCourt, legalForm, typeofOwnership, companyStatus, principalActivity, contactAddress, contactTelephoneNumber);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LtdCompanyBasicInformation {\n");
    
    sb.append("    businessName: ").append(toIndentedString(businessName)).append("\n");
    sb.append("    registeredCompanyName: ").append(toIndentedString(registeredCompanyName)).append("\n");
    sb.append("    companyRegistrationNumber: ").append(toIndentedString(companyRegistrationNumber)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    vatRegistrationNumber: ").append(toIndentedString(vatRegistrationNumber)).append("\n");
    sb.append("    vatRegistrationDate: ").append(toIndentedString(vatRegistrationDate)).append("\n");
    sb.append("    vatRegistrationDateSpecified: ").append(toIndentedString(vatRegistrationDateSpecified)).append("\n");
    sb.append("    dateofCompanyRegistration: ").append(toIndentedString(dateofCompanyRegistration)).append("\n");
    sb.append("    dateofCompanyRegistrationSpecified: ").append(toIndentedString(dateofCompanyRegistrationSpecified)).append("\n");
    sb.append("    dateofStartingOperations: ").append(toIndentedString(dateofStartingOperations)).append("\n");
    sb.append("    dateofStartingOperationsSpecified: ").append(toIndentedString(dateofStartingOperationsSpecified)).append("\n");
    sb.append("    commercialCourt: ").append(toIndentedString(commercialCourt)).append("\n");
    sb.append("    legalForm: ").append(toIndentedString(legalForm)).append("\n");
    sb.append("    typeofOwnership: ").append(toIndentedString(typeofOwnership)).append("\n");
    sb.append("    companyStatus: ").append(toIndentedString(companyStatus)).append("\n");
    sb.append("    principalActivity: ").append(toIndentedString(principalActivity)).append("\n");
    sb.append("    contactAddress: ").append(toIndentedString(contactAddress)).append("\n");
    sb.append("    contactTelephoneNumber: ").append(toIndentedString(contactTelephoneNumber)).append("\n");
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

