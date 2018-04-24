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
import io.swagger.client.model.FinancialValueDecimal;
import java.io.IOException;

/**
 * ProfitAndLossFigures
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-01-29T17:21:25.566Z")
public class ProfitAndLossFigures {
  @SerializedName("Revenue")
  private FinancialValueDecimal revenue = null;

  @SerializedName("OperatingCosts")
  private FinancialValueDecimal operatingCosts = null;

  @SerializedName("OperatingProfit")
  private FinancialValueDecimal operatingProfit = null;

  @SerializedName("WagesAndSalaries")
  private FinancialValueDecimal wagesAndSalaries = null;

  @SerializedName("PensionCosts")
  private FinancialValueDecimal pensionCosts = null;

  @SerializedName("Depreciation")
  private FinancialValueDecimal depreciation = null;

  @SerializedName("Amortisation")
  private FinancialValueDecimal amortisation = null;

  @SerializedName("FinancialIncome")
  private FinancialValueDecimal financialIncome = null;

  @SerializedName("FinancialExpenses")
  private FinancialValueDecimal financialExpenses = null;

  @SerializedName("ExtraordinaryIncome")
  private FinancialValueDecimal extraordinaryIncome = null;

  @SerializedName("ExtraordinaryCosts")
  private FinancialValueDecimal extraordinaryCosts = null;

  @SerializedName("ProfitBeforeTax")
  private FinancialValueDecimal profitBeforeTax = null;

  @SerializedName("Tax")
  private FinancialValueDecimal tax = null;

  @SerializedName("ProfitAfterTax")
  private FinancialValueDecimal profitAfterTax = null;

  @SerializedName("Dividends")
  private FinancialValueDecimal dividends = null;

  @SerializedName("MinorityInterests")
  private FinancialValueDecimal minorityInterests = null;

  @SerializedName("OtherAppropriations")
  private FinancialValueDecimal otherAppropriations = null;

  @SerializedName("RetainedProfit")
  private FinancialValueDecimal retainedProfit = null;

  public ProfitAndLossFigures revenue(FinancialValueDecimal revenue) {
    this.revenue = revenue;
    return this;
  }

   /**
   * Get revenue
   * @return revenue
  **/
  @ApiModelProperty(value = "")
  public FinancialValueDecimal getRevenue() {
    return revenue;
  }

  public void setRevenue(FinancialValueDecimal revenue) {
    this.revenue = revenue;
  }

  public ProfitAndLossFigures operatingCosts(FinancialValueDecimal operatingCosts) {
    this.operatingCosts = operatingCosts;
    return this;
  }

   /**
   * Get operatingCosts
   * @return operatingCosts
  **/
  @ApiModelProperty(value = "")
  public FinancialValueDecimal getOperatingCosts() {
    return operatingCosts;
  }

  public void setOperatingCosts(FinancialValueDecimal operatingCosts) {
    this.operatingCosts = operatingCosts;
  }

  public ProfitAndLossFigures operatingProfit(FinancialValueDecimal operatingProfit) {
    this.operatingProfit = operatingProfit;
    return this;
  }

   /**
   * Get operatingProfit
   * @return operatingProfit
  **/
  @ApiModelProperty(value = "")
  public FinancialValueDecimal getOperatingProfit() {
    return operatingProfit;
  }

  public void setOperatingProfit(FinancialValueDecimal operatingProfit) {
    this.operatingProfit = operatingProfit;
  }

  public ProfitAndLossFigures wagesAndSalaries(FinancialValueDecimal wagesAndSalaries) {
    this.wagesAndSalaries = wagesAndSalaries;
    return this;
  }

   /**
   * Get wagesAndSalaries
   * @return wagesAndSalaries
  **/
  @ApiModelProperty(value = "")
  public FinancialValueDecimal getWagesAndSalaries() {
    return wagesAndSalaries;
  }

  public void setWagesAndSalaries(FinancialValueDecimal wagesAndSalaries) {
    this.wagesAndSalaries = wagesAndSalaries;
  }

  public ProfitAndLossFigures pensionCosts(FinancialValueDecimal pensionCosts) {
    this.pensionCosts = pensionCosts;
    return this;
  }

   /**
   * Get pensionCosts
   * @return pensionCosts
  **/
  @ApiModelProperty(value = "")
  public FinancialValueDecimal getPensionCosts() {
    return pensionCosts;
  }

  public void setPensionCosts(FinancialValueDecimal pensionCosts) {
    this.pensionCosts = pensionCosts;
  }

  public ProfitAndLossFigures depreciation(FinancialValueDecimal depreciation) {
    this.depreciation = depreciation;
    return this;
  }

   /**
   * Get depreciation
   * @return depreciation
  **/
  @ApiModelProperty(value = "")
  public FinancialValueDecimal getDepreciation() {
    return depreciation;
  }

  public void setDepreciation(FinancialValueDecimal depreciation) {
    this.depreciation = depreciation;
  }

  public ProfitAndLossFigures amortisation(FinancialValueDecimal amortisation) {
    this.amortisation = amortisation;
    return this;
  }

   /**
   * Get amortisation
   * @return amortisation
  **/
  @ApiModelProperty(value = "")
  public FinancialValueDecimal getAmortisation() {
    return amortisation;
  }

  public void setAmortisation(FinancialValueDecimal amortisation) {
    this.amortisation = amortisation;
  }

  public ProfitAndLossFigures financialIncome(FinancialValueDecimal financialIncome) {
    this.financialIncome = financialIncome;
    return this;
  }

   /**
   * Get financialIncome
   * @return financialIncome
  **/
  @ApiModelProperty(value = "")
  public FinancialValueDecimal getFinancialIncome() {
    return financialIncome;
  }

  public void setFinancialIncome(FinancialValueDecimal financialIncome) {
    this.financialIncome = financialIncome;
  }

  public ProfitAndLossFigures financialExpenses(FinancialValueDecimal financialExpenses) {
    this.financialExpenses = financialExpenses;
    return this;
  }

   /**
   * Get financialExpenses
   * @return financialExpenses
  **/
  @ApiModelProperty(value = "")
  public FinancialValueDecimal getFinancialExpenses() {
    return financialExpenses;
  }

  public void setFinancialExpenses(FinancialValueDecimal financialExpenses) {
    this.financialExpenses = financialExpenses;
  }

  public ProfitAndLossFigures extraordinaryIncome(FinancialValueDecimal extraordinaryIncome) {
    this.extraordinaryIncome = extraordinaryIncome;
    return this;
  }

   /**
   * Get extraordinaryIncome
   * @return extraordinaryIncome
  **/
  @ApiModelProperty(value = "")
  public FinancialValueDecimal getExtraordinaryIncome() {
    return extraordinaryIncome;
  }

  public void setExtraordinaryIncome(FinancialValueDecimal extraordinaryIncome) {
    this.extraordinaryIncome = extraordinaryIncome;
  }

  public ProfitAndLossFigures extraordinaryCosts(FinancialValueDecimal extraordinaryCosts) {
    this.extraordinaryCosts = extraordinaryCosts;
    return this;
  }

   /**
   * Get extraordinaryCosts
   * @return extraordinaryCosts
  **/
  @ApiModelProperty(value = "")
  public FinancialValueDecimal getExtraordinaryCosts() {
    return extraordinaryCosts;
  }

  public void setExtraordinaryCosts(FinancialValueDecimal extraordinaryCosts) {
    this.extraordinaryCosts = extraordinaryCosts;
  }

  public ProfitAndLossFigures profitBeforeTax(FinancialValueDecimal profitBeforeTax) {
    this.profitBeforeTax = profitBeforeTax;
    return this;
  }

   /**
   * Get profitBeforeTax
   * @return profitBeforeTax
  **/
  @ApiModelProperty(value = "")
  public FinancialValueDecimal getProfitBeforeTax() {
    return profitBeforeTax;
  }

  public void setProfitBeforeTax(FinancialValueDecimal profitBeforeTax) {
    this.profitBeforeTax = profitBeforeTax;
  }

  public ProfitAndLossFigures tax(FinancialValueDecimal tax) {
    this.tax = tax;
    return this;
  }

   /**
   * Get tax
   * @return tax
  **/
  @ApiModelProperty(value = "")
  public FinancialValueDecimal getTax() {
    return tax;
  }

  public void setTax(FinancialValueDecimal tax) {
    this.tax = tax;
  }

  public ProfitAndLossFigures profitAfterTax(FinancialValueDecimal profitAfterTax) {
    this.profitAfterTax = profitAfterTax;
    return this;
  }

   /**
   * Get profitAfterTax
   * @return profitAfterTax
  **/
  @ApiModelProperty(value = "")
  public FinancialValueDecimal getProfitAfterTax() {
    return profitAfterTax;
  }

  public void setProfitAfterTax(FinancialValueDecimal profitAfterTax) {
    this.profitAfterTax = profitAfterTax;
  }

  public ProfitAndLossFigures dividends(FinancialValueDecimal dividends) {
    this.dividends = dividends;
    return this;
  }

   /**
   * Get dividends
   * @return dividends
  **/
  @ApiModelProperty(value = "")
  public FinancialValueDecimal getDividends() {
    return dividends;
  }

  public void setDividends(FinancialValueDecimal dividends) {
    this.dividends = dividends;
  }

  public ProfitAndLossFigures minorityInterests(FinancialValueDecimal minorityInterests) {
    this.minorityInterests = minorityInterests;
    return this;
  }

   /**
   * Get minorityInterests
   * @return minorityInterests
  **/
  @ApiModelProperty(value = "")
  public FinancialValueDecimal getMinorityInterests() {
    return minorityInterests;
  }

  public void setMinorityInterests(FinancialValueDecimal minorityInterests) {
    this.minorityInterests = minorityInterests;
  }

  public ProfitAndLossFigures otherAppropriations(FinancialValueDecimal otherAppropriations) {
    this.otherAppropriations = otherAppropriations;
    return this;
  }

   /**
   * Get otherAppropriations
   * @return otherAppropriations
  **/
  @ApiModelProperty(value = "")
  public FinancialValueDecimal getOtherAppropriations() {
    return otherAppropriations;
  }

  public void setOtherAppropriations(FinancialValueDecimal otherAppropriations) {
    this.otherAppropriations = otherAppropriations;
  }

  public ProfitAndLossFigures retainedProfit(FinancialValueDecimal retainedProfit) {
    this.retainedProfit = retainedProfit;
    return this;
  }

   /**
   * Get retainedProfit
   * @return retainedProfit
  **/
  @ApiModelProperty(value = "")
  public FinancialValueDecimal getRetainedProfit() {
    return retainedProfit;
  }

  public void setRetainedProfit(FinancialValueDecimal retainedProfit) {
    this.retainedProfit = retainedProfit;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProfitAndLossFigures profitAndLossFigures = (ProfitAndLossFigures) o;
    return Objects.equals(this.revenue, profitAndLossFigures.revenue) &&
        Objects.equals(this.operatingCosts, profitAndLossFigures.operatingCosts) &&
        Objects.equals(this.operatingProfit, profitAndLossFigures.operatingProfit) &&
        Objects.equals(this.wagesAndSalaries, profitAndLossFigures.wagesAndSalaries) &&
        Objects.equals(this.pensionCosts, profitAndLossFigures.pensionCosts) &&
        Objects.equals(this.depreciation, profitAndLossFigures.depreciation) &&
        Objects.equals(this.amortisation, profitAndLossFigures.amortisation) &&
        Objects.equals(this.financialIncome, profitAndLossFigures.financialIncome) &&
        Objects.equals(this.financialExpenses, profitAndLossFigures.financialExpenses) &&
        Objects.equals(this.extraordinaryIncome, profitAndLossFigures.extraordinaryIncome) &&
        Objects.equals(this.extraordinaryCosts, profitAndLossFigures.extraordinaryCosts) &&
        Objects.equals(this.profitBeforeTax, profitAndLossFigures.profitBeforeTax) &&
        Objects.equals(this.tax, profitAndLossFigures.tax) &&
        Objects.equals(this.profitAfterTax, profitAndLossFigures.profitAfterTax) &&
        Objects.equals(this.dividends, profitAndLossFigures.dividends) &&
        Objects.equals(this.minorityInterests, profitAndLossFigures.minorityInterests) &&
        Objects.equals(this.otherAppropriations, profitAndLossFigures.otherAppropriations) &&
        Objects.equals(this.retainedProfit, profitAndLossFigures.retainedProfit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(revenue, operatingCosts, operatingProfit, wagesAndSalaries, pensionCosts, depreciation, amortisation, financialIncome, financialExpenses, extraordinaryIncome, extraordinaryCosts, profitBeforeTax, tax, profitAfterTax, dividends, minorityInterests, otherAppropriations, retainedProfit);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProfitAndLossFigures {\n");
    
    sb.append("    revenue: ").append(toIndentedString(revenue)).append("\n");
    sb.append("    operatingCosts: ").append(toIndentedString(operatingCosts)).append("\n");
    sb.append("    operatingProfit: ").append(toIndentedString(operatingProfit)).append("\n");
    sb.append("    wagesAndSalaries: ").append(toIndentedString(wagesAndSalaries)).append("\n");
    sb.append("    pensionCosts: ").append(toIndentedString(pensionCosts)).append("\n");
    sb.append("    depreciation: ").append(toIndentedString(depreciation)).append("\n");
    sb.append("    amortisation: ").append(toIndentedString(amortisation)).append("\n");
    sb.append("    financialIncome: ").append(toIndentedString(financialIncome)).append("\n");
    sb.append("    financialExpenses: ").append(toIndentedString(financialExpenses)).append("\n");
    sb.append("    extraordinaryIncome: ").append(toIndentedString(extraordinaryIncome)).append("\n");
    sb.append("    extraordinaryCosts: ").append(toIndentedString(extraordinaryCosts)).append("\n");
    sb.append("    profitBeforeTax: ").append(toIndentedString(profitBeforeTax)).append("\n");
    sb.append("    tax: ").append(toIndentedString(tax)).append("\n");
    sb.append("    profitAfterTax: ").append(toIndentedString(profitAfterTax)).append("\n");
    sb.append("    dividends: ").append(toIndentedString(dividends)).append("\n");
    sb.append("    minorityInterests: ").append(toIndentedString(minorityInterests)).append("\n");
    sb.append("    otherAppropriations: ").append(toIndentedString(otherAppropriations)).append("\n");
    sb.append("    retainedProfit: ").append(toIndentedString(retainedProfit)).append("\n");
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

