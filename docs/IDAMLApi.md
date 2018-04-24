# IDAMLApi

All URIs are relative to *https://test.veriphy.co.uk/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**iDAMLGet**](IDAMLApi.md#iDAMLGet) | **GET** /IDAML | Retrieve an existing ID/AML check.
[**iDAMLPost**](IDAMLApi.md#iDAMLPost) | **POST** /IDAML | Perform an ID/AML check.


<a name="iDAMLGet"></a>
# **iDAMLGet**
> VeriphyIDAMLResponseTO iDAMLGet(checkID, userName, password)

Retrieve an existing ID/AML check.

Retrieves a check that has already been placed

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.IDAMLApi;


IDAMLApi apiInstance = new IDAMLApi();
String checkID = "checkID_example"; // String | Veriphy Check ID of the check to be retrieved
String userName = "userName_example"; // String | Service credentials username
String password = "password_example"; // String | Service credentials password
try {
    VeriphyIDAMLResponseTO result = apiInstance.iDAMLGet(checkID, userName, password);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IDAMLApi#iDAMLGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **checkID** | **String**| Veriphy Check ID of the check to be retrieved |
 **userName** | **String**| Service credentials username |
 **password** | **String**| Service credentials password |

### Return type

[**VeriphyIDAMLResponseTO**](VeriphyIDAMLResponseTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="iDAMLPost"></a>
# **iDAMLPost**
> VeriphyIDAMLResponseTO iDAMLPost(check)

Perform an ID/AML check.

#VeriphyIDAMLRequestTO  VeriphyIDAMLRequestTO is a DTO that contains all the information required by the service to perform an identity check. It consists of 3 objects:  * VeriphyServiceTO  * AuthenticationTO  * ApplicationTO    ##VeriphyServiceTO  You must specify the service code in the &#x60;VeriphyServiceTO&#x60; object. Valid service codes are:  * **IDAMLNOCRED** - Anti-money Laundering Check  * **CREDACTIVE** - Credit Screen  * **IDAML** - AML and Credit Screen  * **INTID** - International ID Check  * **HR** - HR Screen  * **DIRSEARCH** - Director search  * **ROUTE2** - Identity Check  * **360** - Veriphy 360  * **VISA** - Travel Visa Check    A formatted PDF can also be returned by the API - simply set the &#x60;VeriphyServiceTO&#x60; *returnPDF* property to _true_ to receive the PDF as a Base64 encoded string.    ##AuthenticationTO  Specify your username and password to access the service. Credentials can be obtained from [Veriphy Support](mailto:support@veriphy.co.uk)    ##ApplicationTO  The ApplicationTO object contains the details about the individual to be checked. Each request requires all the transfer objects to be supplied even if they will not be used in the check. Please supply empty string values for unused transfer objects. Refer to the Parameters section below for the request model and an example request value.  * **All** &#x60;ApplicantTO&#x60; objects must contain a &#x60;NameTO&#x60;, &#x60;Gender&#x60; and &#x60;DOB&#x60;  * IDAML/IDAMLNOCRED/ROUTE2 must contain an &#x60;AddressTO&#x60; with optional &#x60;ContactTO&#x60;, &#x60;NationalInsuranceNumber&#x60;, &#x60;InternationalPassportTO&#x60; and &#x60;DrivingLicenceTO&#x60; supported.  * CREDACTIVE must contain an &#x60;AddressTO&#x60; object. No other objects are required/supported.  * INTID supports optional &#x60;ContactTO&#x60;, &#x60;NationalInsuranceNumber&#x60;, &#x60;InternationalPassportTO&#x60;, &#x60;DrivingLicenceTO&#x60; and &#x60;IDCardTO&#x60; objects. &#x60;AddressTO&#x60; is not required/supported on this check.  * HR must contain an &#x60;AddressTO&#x60; with optional &#x60;ContactTO&#x60;, &#x60;NationalInsuranceNumber&#x60;, &#x60;InternationalPassportTO&#x60;, &#x60;DrivingLicenceTO&#x60; and &#x60;BankTO&#x60; supported.  * DIRSEARCH must contain an &#x60;AddressTO&#x60; object.  * 360  must contain an &#x60;AddressTO&#x60; with optional &#x60;ContactTO&#x60;, &#x60;NationalInsuranceNumber&#x60;, &#x60;InternationalPassportTO&#x60;, &#x60;DrivingLicenceTO&#x60;, &#x60;IDCardTO&#x60;, &#x60;TravelVisaTO&#x60; and &#x60;BankTO&#x60; supported.  * VISA supports optional &#x60;ContactTO&#x60;, &#x60;NationalInsuranceNumber&#x60;, &#x60;InternationalPassportTO&#x60;, &#x60;DrivingLicenceTO&#x60;, &#x60;IDCardTO&#x60; and &#x60;TravelVisaTO&#x60; objects. &#x60;AddressTO&#x60; is not required/supported on this check.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.IDAMLApi;


IDAMLApi apiInstance = new IDAMLApi();
VeriphyIDAMLRequestTO check = new VeriphyIDAMLRequestTO(); // VeriphyIDAMLRequestTO | The check to be performed
try {
    VeriphyIDAMLResponseTO result = apiInstance.iDAMLPost(check);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IDAMLApi#iDAMLPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **check** | [**VeriphyIDAMLRequestTO**](VeriphyIDAMLRequestTO.md)| The check to be performed |

### Return type

[**VeriphyIDAMLResponseTO**](VeriphyIDAMLResponseTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml
 - **Accept**: application/json, text/json, application/xml, text/xml

