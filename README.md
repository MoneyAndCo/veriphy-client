# swagger-java-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>io.swagger</groupId>
    <artifactId>swagger-java-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/swagger-java-client-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.CompanyApi;

import java.io.File;
import java.util.*;

public class CompanyApiExample {

    public static void main(String[] args) {
        
        CompanyApi apiInstance = new CompanyApi();
        String checkID = "checkID_example"; // String | The Veriphy Check ID of the check to be retrieved
        String userName = "userName_example"; // String | Service credentials username
        String password = "password_example"; // String | Service credentials password
        try {
            VeriphyCompanyResponseTO result = apiInstance.companyGet(checkID, userName, password);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CompanyApi#companyGet");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://test.veriphy.co.uk/api*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*CompanyApi* | [**companyGet**](docs/CompanyApi.md#companyGet) | **GET** /Company | Retrieve an existing UK or International company check.
*CompanyApi* | [**companyPost**](docs/CompanyApi.md#companyPost) | **POST** /Company | Perform a UK or International company check.
*CompanyApi* | [**companySearch**](docs/CompanyApi.md#companySearch) | **POST** /Company/Search | Search for a UK or International company.
*IDAMLApi* | [**iDAMLGet**](docs/IDAMLApi.md#iDAMLGet) | **GET** /IDAML | Retrieve an existing ID/AML check.
*IDAMLApi* | [**iDAMLPost**](docs/IDAMLApi.md#iDAMLPost) | **POST** /IDAML | Perform an ID/AML check.
*LawyerApi* | [**lawyerGet**](docs/LawyerApi.md#lawyerGet) | **GET** /Lawyer | Retrieve an existing Lawyer check.
*LawyerApi* | [**lawyerPost**](docs/LawyerApi.md#lawyerPost) | **POST** /Lawyer | Perform a Lawyer check.


## Documentation for Models

 - [AddressData](docs/AddressData.md)
 - [AddressLabel](docs/AddressLabel.md)
 - [AddressPart](docs/AddressPart.md)
 - [AddressTO](docs/AddressTO.md)
 - [Advisor](docs/Advisor.md)
 - [AgePart](docs/AgePart.md)
 - [ApplicantTO](docs/ApplicantTO.md)
 - [ApplicationTO](docs/ApplicationTO.md)
 - [AuthenticationTO](docs/AuthenticationTO.md)
 - [BalanceSheet](docs/BalanceSheet.md)
 - [BankTO](docs/BankTO.md)
 - [Banker](docs/Banker.md)
 - [BankmatchLivePart](docs/BankmatchLivePart.md)
 - [BankmatchPart](docs/BankmatchPart.md)
 - [BirthPart](docs/BirthPart.md)
 - [CardNumberPart](docs/CardNumberPart.md)
 - [CardPart](docs/CardPart.md)
 - [CcjResult](docs/CcjResult.md)
 - [CompanyActivity](docs/CompanyActivity.md)
 - [CompanyApplicationTO](docs/CompanyApplicationTO.md)
 - [CompanyAppointmentsPart](docs/CompanyAppointmentsPart.md)
 - [CompanyData](docs/CompanyData.md)
 - [CompanyDirectorPart](docs/CompanyDirectorPart.md)
 - [CompanySearchResultsTO](docs/CompanySearchResultsTO.md)
 - [CompanySearchTO](docs/CompanySearchTO.md)
 - [CompanyStatusDescription](docs/CompanyStatusDescription.md)
 - [CompanyTO](docs/CompanyTO.md)
 - [ContactTO](docs/ContactTO.md)
 - [CorporatePosition](docs/CorporatePosition.md)
 - [CreditActivePart](docs/CreditActivePart.md)
 - [CreditRating](docs/CreditRating.md)
 - [CredivaPart](docs/CredivaPart.md)
 - [DOBPart](docs/DOBPart.md)
 - [DeathscreenResult](docs/DeathscreenResult.md)
 - [Director](docs/Director.md)
 - [DocumentAuthenticationPart](docs/DocumentAuthenticationPart.md)
 - [DriversLicenceTO](docs/DriversLicenceTO.md)
 - [DrivingLicencePart](docs/DrivingLicencePart.md)
 - [EmployeeInformation](docs/EmployeeInformation.md)
 - [ErrorPart](docs/ErrorPart.md)
 - [FinancialRatios](docs/FinancialRatios.md)
 - [FinancialValueDecimal](docs/FinancialValueDecimal.md)
 - [FinancialValueString](docs/FinancialValueString.md)
 - [IDCardPart](docs/IDCardPart.md)
 - [IDCardTO](docs/IDCardTO.md)
 - [InsolvencyResult](docs/InsolvencyResult.md)
 - [InternationalPassportTO](docs/InternationalPassportTO.md)
 - [LawyerCheckApplicationTO](docs/LawyerCheckApplicationTO.md)
 - [LawyerTO](docs/LawyerTO.md)
 - [LegalForm](docs/LegalForm.md)
 - [LtdCompanyBasicInformation](docs/LtdCompanyBasicInformation.md)
 - [LtdCompanyFullReport](docs/LtdCompanyFullReport.md)
 - [LtdCompanyFullReportAdditionalInformation](docs/LtdCompanyFullReportAdditionalInformation.md)
 - [LtdCompanyIdentification](docs/LtdCompanyIdentification.md)
 - [LtdCompanySummary](docs/LtdCompanySummary.md)
 - [LtdContactInformation](docs/LtdContactInformation.md)
 - [LtdCreditScore](docs/LtdCreditScore.md)
 - [LtdDirectors](docs/LtdDirectors.md)
 - [LtdFinancialStatement](docs/LtdFinancialStatement.md)
 - [LtdGroupStructure](docs/LtdGroupStructure.md)
 - [LtdOtherInformation](docs/LtdOtherInformation.md)
 - [LtdShareCapitalStructure](docs/LtdShareCapitalStructure.md)
 - [MarriagePart](docs/MarriagePart.md)
 - [MpanPart](docs/MpanPart.md)
 - [NHSPart](docs/NHSPart.md)
 - [NIPart](docs/NIPart.md)
 - [NameTO](docs/NameTO.md)
 - [NoticeOfCorrectionPart](docs/NoticeOfCorrectionPart.md)
 - [OccupantPart](docs/OccupantPart.md)
 - [OneTimePasswordPart](docs/OneTimePasswordPart.md)
 - [OneTimePasswordResultPart](docs/OneTimePasswordResultPart.md)
 - [OnlineProfilePart](docs/OnlineProfilePart.md)
 - [OtherFinancials](docs/OtherFinancials.md)
 - [PassportPart](docs/PassportPart.md)
 - [PollNumberPart](docs/PollNumberPart.md)
 - [PreviousDirector](docs/PreviousDirector.md)
 - [PreviousLegalForm](docs/PreviousLegalForm.md)
 - [PreviousName](docs/PreviousName.md)
 - [ProfitAndLossFigures](docs/ProfitAndLossFigures.md)
 - [PropertyPart](docs/PropertyPart.md)
 - [PrsPart](docs/PrsPart.md)
 - [RangeDescribedValueString](docs/RangeDescribedValueString.md)
 - [Result](docs/Result.md)
 - [SanctionAddressPart](docs/SanctionAddressPart.md)
 - [SanctionPart](docs/SanctionPart.md)
 - [SearchActivityHistoryPart](docs/SearchActivityHistoryPart.md)
 - [SearchActivityPart](docs/SearchActivityPart.md)
 - [SearchResult](docs/SearchResult.md)
 - [ShareHolder](docs/ShareHolder.md)
 - [SmartlinkPart](docs/SmartlinkPart.md)
 - [StreetAddress](docs/StreetAddress.md)
 - [StreetAddressWithTelephone](docs/StreetAddressWithTelephone.md)
 - [SummaryPart](docs/SummaryPart.md)
 - [TravelVisaPart](docs/TravelVisaPart.md)
 - [TravelVisaTO](docs/TravelVisaTO.md)
 - [VeriphyCompanyRequestTO](docs/VeriphyCompanyRequestTO.md)
 - [VeriphyCompanyResponseTO](docs/VeriphyCompanyResponseTO.md)
 - [VeriphyCompanySearchRequestTO](docs/VeriphyCompanySearchRequestTO.md)
 - [VeriphyCompanySearchResponseTO](docs/VeriphyCompanySearchResponseTO.md)
 - [VeriphyIDAMLRequestTO](docs/VeriphyIDAMLRequestTO.md)
 - [VeriphyIDAMLResponseTO](docs/VeriphyIDAMLResponseTO.md)
 - [VeriphyLawyerCheckRequestTO](docs/VeriphyLawyerCheckRequestTO.md)
 - [VeriphyLawyerCheckResponseTO](docs/VeriphyLawyerCheckResponseTO.md)
 - [VeriphyServiceTO](docs/VeriphyServiceTO.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

support@veriphy.co.uk

# veriphy-client
