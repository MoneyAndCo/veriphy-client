# CompanyApi

All URIs are relative to *https://test.veriphy.co.uk/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**companyGet**](CompanyApi.md#companyGet) | **GET** /Company | Retrieve an existing UK or International company check.
[**companyPost**](CompanyApi.md#companyPost) | **POST** /Company | Perform a UK or International company check.
[**companySearch**](CompanyApi.md#companySearch) | **POST** /Company/Search | Search for a UK or International company.


<a name="companyGet"></a>
# **companyGet**
> VeriphyCompanyResponseTO companyGet(checkID, userName, password)

Retrieve an existing UK or International company check.

Retrieves a check that has already been placed

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CompanyApi;


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
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **checkID** | **String**| The Veriphy Check ID of the check to be retrieved |
 **userName** | **String**| Service credentials username |
 **password** | **String**| Service credentials password |

### Return type

[**VeriphyCompanyResponseTO**](VeriphyCompanyResponseTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="companyPost"></a>
# **companyPost**
> VeriphyCompanyResponseTO companyPost(check)

Perform a UK or International company check.

 #VeriphyCompanyRequestTO   VeriphyIDAMLRequestTO is a DTO that contains all the information required by the service to perform an identity check. It consists of 3 objects:   * VeriphyServiceTO   * AuthenticationTO   * CompanyApplicationTO      ##VeriphyServiceTO   You must specify the service code in the &#x60;VeriphyServiceTO&#x60; object. Valid service codes are:   * **COMPUK** - UK Company Check   * **COMPINT** - International Company Check              A formatted PDF can also be returned by the API - simply set the &#x60;VeriphyServiceTO&#x60; *returnPDF* property to _true_ to receive the PDF as a Base64 encoded string.      ##AuthenticationTO   Specify your username and password to access the service. Credentials can be obtained from [Veriphy Support](mailto:support@veriphy.co.uk)      ##CompanyApplicationTO   The CompanyApplicationTO object contains the details about the company to be checked. Please populate the *companyNumber* property with the &#x60;SearchId&#x60; returned from the Company Search operation.      For German company checks a search reason code must be supplied. Please populate the &#x60;CompanyTO&#x60; *searchReason* field with the appropriate number from the list below.     * 1 - Credit Decisioning    * 2 - Credit Assessment - Future business connection(with credit risk)  * 3 - Credit Assessment - Existing business connection(with credit risk)  * 4 - Realisation check receivables collection                         * 5 - Purchase Contract - Intention of signature of purchase contract(with credit risk)  * 6 - Goods Credit Insurance(with credit risk)  * 7 - Contract - Intention of signature of leasing or rent contract(with credit risk)  * 8 - Insurance Contract - Intention of signature of a insurance contract(with credit risk)

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CompanyApi;


CompanyApi apiInstance = new CompanyApi();
VeriphyCompanyRequestTO check = new VeriphyCompanyRequestTO(); // VeriphyCompanyRequestTO | The check to be performed
try {
    VeriphyCompanyResponseTO result = apiInstance.companyPost(check);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CompanyApi#companyPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **check** | [**VeriphyCompanyRequestTO**](VeriphyCompanyRequestTO.md)| The check to be performed |

### Return type

[**VeriphyCompanyResponseTO**](VeriphyCompanyResponseTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="companySearch"></a>
# **companySearch**
> VeriphyCompanySearchResponseTO companySearch(check)

Search for a UK or International company.

Locates companies in the UK or internationally that match the search term provided. The results of this search can be used to retrieve UK or International Company Checks.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CompanyApi;


CompanyApi apiInstance = new CompanyApi();
VeriphyCompanySearchRequestTO check = new VeriphyCompanySearchRequestTO(); // VeriphyCompanySearchRequestTO | A VeriphyCompanySearchRequestTO object
try {
    VeriphyCompanySearchResponseTO result = apiInstance.companySearch(check);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CompanyApi#companySearch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **check** | [**VeriphyCompanySearchRequestTO**](VeriphyCompanySearchRequestTO.md)| A VeriphyCompanySearchRequestTO object |

### Return type

[**VeriphyCompanySearchResponseTO**](VeriphyCompanySearchResponseTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml
 - **Accept**: application/json, text/json, application/xml, text/xml

