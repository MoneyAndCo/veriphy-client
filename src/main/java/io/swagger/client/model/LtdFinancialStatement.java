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
import io.swagger.client.model.BalanceSheet;
import io.swagger.client.model.FinancialRatios;
import io.swagger.client.model.OtherFinancials;
import io.swagger.client.model.ProfitAndLossFigures;
import java.io.IOException;
import org.joda.time.DateTime;

/**
 * LtdFinancialStatement
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-01-29T17:21:25.566Z")
public class LtdFinancialStatement {
  @SerializedName("ProfitAndLoss")
  private ProfitAndLossFigures profitAndLoss = null;

  @SerializedName("BalanceSheet")
  private BalanceSheet balanceSheet = null;

  @SerializedName("OtherFinancials")
  private OtherFinancials otherFinancials = null;

  @SerializedName("Ratios")
  private FinancialRatios ratios = null;

  @SerializedName("YearEndDate")
  private DateTime yearEndDate = null;

  @SerializedName("NumberOfWeeks")
  private Integer numberOfWeeks = null;

  @SerializedName("NumberOfWeeksSpecified")
  private Boolean numberOfWeeksSpecified = null;

  /**
   * Gets or Sets currency
   */
  @JsonAdapter(CurrencyEnum.Adapter.class)
  public enum CurrencyEnum {
    AFA("AFA"),
    
    ALL("ALL"),
    
    DZD("DZD"),
    
    ADF("ADF"),
    
    ADP("ADP"),
    
    AOA("AOA"),
    
    ARA("ARA"),
    
    ARS("ARS"),
    
    AMD("AMD"),
    
    AWG("AWG"),
    
    AUD("AUD"),
    
    AZM("AZM"),
    
    BSD("BSD"),
    
    BHD("BHD"),
    
    BDT("BDT"),
    
    BBD("BBD"),
    
    BYR("BYR"),
    
    BZD("BZD"),
    
    BMD("BMD"),
    
    BTN("BTN"),
    
    BOB("BOB"),
    
    BAM("BAM"),
    
    BWP("BWP"),
    
    BRC("BRC"),
    
    BRL("BRL"),
    
    GBP("GBP"),
    
    BND("BND"),
    
    BGN("BGN"),
    
    BIF("BIF"),
    
    XOF("XOF"),
    
    XAF("XAF"),
    
    KHR("KHR"),
    
    CAD("CAD"),
    
    CVE("CVE"),
    
    KYD("KYD"),
    
    CLP("CLP"),
    
    CNY("CNY"),
    
    COP("COP"),
    
    KMF("KMF"),
    
    CDF("CDF"),
    
    CRC("CRC"),
    
    HRK("HRK"),
    
    CUP("CUP"),
    
    CZK("CZK"),
    
    DKK("DKK"),
    
    DJF("DJF"),
    
    DOP("DOP"),
    
    NLG("NLG"),
    
    EUR("EUR"),
    
    ECS("ECS"),
    
    EGP("EGP"),
    
    SVC("SVC"),
    
    EEK("EEK"),
    
    ETB("ETB"),
    
    FKP("FKP"),
    
    FJD("FJD"),
    
    FRF("FRF"),
    
    GMD("GMD"),
    
    GEL("GEL"),
    
    GHC("GHC"),
    
    GIP("GIP"),
    
    XAU("XAU"),
    
    GTQ("GTQ"),
    
    GNF("GNF"),
    
    GWP("GWP"),
    
    GYD("GYD"),
    
    HTG("HTG"),
    
    HNL("HNL"),
    
    HKD("HKD"),
    
    HUF("HUF"),
    
    ISK("ISK"),
    
    INR("INR"),
    
    IDR("IDR"),
    
    IRR("IRR"),
    
    IQD("IQD"),
    
    ILS("ILS"),
    
    JMD("JMD"),
    
    JPY("JPY"),
    
    JOD("JOD"),
    
    KZT("KZT"),
    
    KES("KES"),
    
    KRW("KRW"),
    
    KWD("KWD"),
    
    KGS("KGS"),
    
    LAK("LAK"),
    
    LVL("LVL"),
    
    LBP("LBP"),
    
    LSL("LSL"),
    
    LRD("LRD"),
    
    LYD("LYD"),
    
    LTL("LTL"),
    
    MOP("MOP"),
    
    MKD("MKD"),
    
    MGF("MGF"),
    
    MWK("MWK"),
    
    MYR("MYR"),
    
    MVR("MVR"),
    
    MTL("MTL"),
    
    MRO("MRO"),
    
    MUR("MUR"),
    
    MXN("MXN"),
    
    MDL("MDL"),
    
    MNT("MNT"),
    
    MAD("MAD"),
    
    MZM("MZM"),
    
    MMK("MMK"),
    
    ANG("ANG"),
    
    NAD("NAD"),
    
    NPR("NPR"),
    
    NZD("NZD"),
    
    NIO("NIO"),
    
    NGN("NGN"),
    
    KPW("KPW"),
    
    NOK("NOK"),
    
    OMR("OMR"),
    
    PKR("PKR"),
    
    XPD("XPD"),
    
    PAB("PAB"),
    
    PGK("PGK"),
    
    PYG("PYG"),
    
    PEN("PEN"),
    
    PHP("PHP"),
    
    XPT("XPT"),
    
    PLN("PLN"),
    
    QAR("QAR"),
    
    RON("RON"),
    
    RUB("RUB"),
    
    RWF("RWF"),
    
    WST("WST"),
    
    STD("STD"),
    
    SAR("SAR"),
    
    RSD("RSD"),
    
    SCR("SCR"),
    
    SLL("SLL"),
    
    XAG("XAG"),
    
    SGD("SGD"),
    
    SKK("SKK"),
    
    SIT("SIT"),
    
    SBD("SBD"),
    
    SOS("SOS"),
    
    ZAR("ZAR"),
    
    LKR("LKR"),
    
    SHP("SHP"),
    
    SDD("SDD"),
    
    SDG("SDG"),
    
    SDP("SDP"),
    
    SRD("SRD"),
    
    SRG("SRG"),
    
    SZL("SZL"),
    
    SEK("SEK"),
    
    CHF("CHF"),
    
    SYP("SYP"),
    
    TWD("TWD"),
    
    TJS("TJS"),
    
    TZS("TZS"),
    
    THB("THB"),
    
    TOP("TOP"),
    
    TTD("TTD"),
    
    TND("TND"),
    
    TRY("TRY"),
    
    TMM("TMM"),
    
    USD("USD"),
    
    UGX("UGX"),
    
    UAG("UAG"),
    
    UAK("UAK"),
    
    AED("AED"),
    
    UYU("UYU"),
    
    UZS("UZS"),
    
    VUV("VUV"),
    
    VEF("VEF"),
    
    VND("VND"),
    
    YUN("YUN"),
    
    ZMK("ZMK"),
    
    ZWD("ZWD");

    private String value;

    CurrencyEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CurrencyEnum fromValue(String text) {
      for (CurrencyEnum b : CurrencyEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<CurrencyEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CurrencyEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CurrencyEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return CurrencyEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("Currency")
  private CurrencyEnum currency = null;

  @SerializedName("ConsolidatedAccounts")
  private Boolean consolidatedAccounts = null;

  @SerializedName("ConsolidatedAccountsSpecified")
  private Boolean consolidatedAccountsSpecified = null;

  public LtdFinancialStatement profitAndLoss(ProfitAndLossFigures profitAndLoss) {
    this.profitAndLoss = profitAndLoss;
    return this;
  }

   /**
   * Get profitAndLoss
   * @return profitAndLoss
  **/
  @ApiModelProperty(value = "")
  public ProfitAndLossFigures getProfitAndLoss() {
    return profitAndLoss;
  }

  public void setProfitAndLoss(ProfitAndLossFigures profitAndLoss) {
    this.profitAndLoss = profitAndLoss;
  }

  public LtdFinancialStatement balanceSheet(BalanceSheet balanceSheet) {
    this.balanceSheet = balanceSheet;
    return this;
  }

   /**
   * Get balanceSheet
   * @return balanceSheet
  **/
  @ApiModelProperty(value = "")
  public BalanceSheet getBalanceSheet() {
    return balanceSheet;
  }

  public void setBalanceSheet(BalanceSheet balanceSheet) {
    this.balanceSheet = balanceSheet;
  }

  public LtdFinancialStatement otherFinancials(OtherFinancials otherFinancials) {
    this.otherFinancials = otherFinancials;
    return this;
  }

   /**
   * Get otherFinancials
   * @return otherFinancials
  **/
  @ApiModelProperty(value = "")
  public OtherFinancials getOtherFinancials() {
    return otherFinancials;
  }

  public void setOtherFinancials(OtherFinancials otherFinancials) {
    this.otherFinancials = otherFinancials;
  }

  public LtdFinancialStatement ratios(FinancialRatios ratios) {
    this.ratios = ratios;
    return this;
  }

   /**
   * Get ratios
   * @return ratios
  **/
  @ApiModelProperty(value = "")
  public FinancialRatios getRatios() {
    return ratios;
  }

  public void setRatios(FinancialRatios ratios) {
    this.ratios = ratios;
  }

  public LtdFinancialStatement yearEndDate(DateTime yearEndDate) {
    this.yearEndDate = yearEndDate;
    return this;
  }

   /**
   * Get yearEndDate
   * @return yearEndDate
  **/
  @ApiModelProperty(value = "")
  public DateTime getYearEndDate() {
    return yearEndDate;
  }

  public void setYearEndDate(DateTime yearEndDate) {
    this.yearEndDate = yearEndDate;
  }

  public LtdFinancialStatement numberOfWeeks(Integer numberOfWeeks) {
    this.numberOfWeeks = numberOfWeeks;
    return this;
  }

   /**
   * Get numberOfWeeks
   * @return numberOfWeeks
  **/
  @ApiModelProperty(value = "")
  public Integer getNumberOfWeeks() {
    return numberOfWeeks;
  }

  public void setNumberOfWeeks(Integer numberOfWeeks) {
    this.numberOfWeeks = numberOfWeeks;
  }

  public LtdFinancialStatement numberOfWeeksSpecified(Boolean numberOfWeeksSpecified) {
    this.numberOfWeeksSpecified = numberOfWeeksSpecified;
    return this;
  }

   /**
   * Get numberOfWeeksSpecified
   * @return numberOfWeeksSpecified
  **/
  @ApiModelProperty(value = "")
  public Boolean getNumberOfWeeksSpecified() {
    return numberOfWeeksSpecified;
  }

  public void setNumberOfWeeksSpecified(Boolean numberOfWeeksSpecified) {
    this.numberOfWeeksSpecified = numberOfWeeksSpecified;
  }

  public LtdFinancialStatement currency(CurrencyEnum currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @ApiModelProperty(value = "")
  public CurrencyEnum getCurrency() {
    return currency;
  }

  public void setCurrency(CurrencyEnum currency) {
    this.currency = currency;
  }

  public LtdFinancialStatement consolidatedAccounts(Boolean consolidatedAccounts) {
    this.consolidatedAccounts = consolidatedAccounts;
    return this;
  }

   /**
   * Get consolidatedAccounts
   * @return consolidatedAccounts
  **/
  @ApiModelProperty(value = "")
  public Boolean getConsolidatedAccounts() {
    return consolidatedAccounts;
  }

  public void setConsolidatedAccounts(Boolean consolidatedAccounts) {
    this.consolidatedAccounts = consolidatedAccounts;
  }

  public LtdFinancialStatement consolidatedAccountsSpecified(Boolean consolidatedAccountsSpecified) {
    this.consolidatedAccountsSpecified = consolidatedAccountsSpecified;
    return this;
  }

   /**
   * Get consolidatedAccountsSpecified
   * @return consolidatedAccountsSpecified
  **/
  @ApiModelProperty(value = "")
  public Boolean getConsolidatedAccountsSpecified() {
    return consolidatedAccountsSpecified;
  }

  public void setConsolidatedAccountsSpecified(Boolean consolidatedAccountsSpecified) {
    this.consolidatedAccountsSpecified = consolidatedAccountsSpecified;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LtdFinancialStatement ltdFinancialStatement = (LtdFinancialStatement) o;
    return Objects.equals(this.profitAndLoss, ltdFinancialStatement.profitAndLoss) &&
        Objects.equals(this.balanceSheet, ltdFinancialStatement.balanceSheet) &&
        Objects.equals(this.otherFinancials, ltdFinancialStatement.otherFinancials) &&
        Objects.equals(this.ratios, ltdFinancialStatement.ratios) &&
        Objects.equals(this.yearEndDate, ltdFinancialStatement.yearEndDate) &&
        Objects.equals(this.numberOfWeeks, ltdFinancialStatement.numberOfWeeks) &&
        Objects.equals(this.numberOfWeeksSpecified, ltdFinancialStatement.numberOfWeeksSpecified) &&
        Objects.equals(this.currency, ltdFinancialStatement.currency) &&
        Objects.equals(this.consolidatedAccounts, ltdFinancialStatement.consolidatedAccounts) &&
        Objects.equals(this.consolidatedAccountsSpecified, ltdFinancialStatement.consolidatedAccountsSpecified);
  }

  @Override
  public int hashCode() {
    return Objects.hash(profitAndLoss, balanceSheet, otherFinancials, ratios, yearEndDate, numberOfWeeks, numberOfWeeksSpecified, currency, consolidatedAccounts, consolidatedAccountsSpecified);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LtdFinancialStatement {\n");
    
    sb.append("    profitAndLoss: ").append(toIndentedString(profitAndLoss)).append("\n");
    sb.append("    balanceSheet: ").append(toIndentedString(balanceSheet)).append("\n");
    sb.append("    otherFinancials: ").append(toIndentedString(otherFinancials)).append("\n");
    sb.append("    ratios: ").append(toIndentedString(ratios)).append("\n");
    sb.append("    yearEndDate: ").append(toIndentedString(yearEndDate)).append("\n");
    sb.append("    numberOfWeeks: ").append(toIndentedString(numberOfWeeks)).append("\n");
    sb.append("    numberOfWeeksSpecified: ").append(toIndentedString(numberOfWeeksSpecified)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    consolidatedAccounts: ").append(toIndentedString(consolidatedAccounts)).append("\n");
    sb.append("    consolidatedAccountsSpecified: ").append(toIndentedString(consolidatedAccountsSpecified)).append("\n");
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

