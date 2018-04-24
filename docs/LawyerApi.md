# LawyerApi

All URIs are relative to *https://test.veriphy.co.uk/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**lawyerGet**](LawyerApi.md#lawyerGet) | **GET** /Lawyer | Retrieve an existing Lawyer check.
[**lawyerPost**](LawyerApi.md#lawyerPost) | **POST** /Lawyer | Perform a Lawyer check.


<a name="lawyerGet"></a>
# **lawyerGet**
> VeriphyLawyerCheckResponseTO lawyerGet(checkID, userName, password)

Retrieve an existing Lawyer check.

Retrieves a check that has already been placed

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.LawyerApi;


LawyerApi apiInstance = new LawyerApi();
String checkID = "checkID_example"; // String | The Veriphy Check ID of the check to be retrieved
String userName = "userName_example"; // String | Service credentials username
String password = "password_example"; // String | Service credentials password
try {
    VeriphyLawyerCheckResponseTO result = apiInstance.lawyerGet(checkID, userName, password);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LawyerApi#lawyerGet");
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

[**VeriphyLawyerCheckResponseTO**](VeriphyLawyerCheckResponseTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="lawyerPost"></a>
# **lawyerPost**
> VeriphyLawyerCheckResponseTO lawyerPost(check)

Perform a Lawyer check.

#VeriphyLawyerCheckRequestTO  VeriphyLawyerCheckRequestTO is a DTO that contains all the information required by the service to perform an identity check. It consists of 3 objects:  * VeriphyServiceTO  * AuthenticationTO  * LawyerTO    ##VeriphyServiceTO  You must specify the service code in the &#x60;VeriphyServiceTO&#x60; object. Valid service codes are:  * **LAWYERCHECK** - Lawyer Check    A formatted PDF can also be returned by the API - simply set the &#x60;VeriphyServiceTO&#x60; *returnPDF* property to _true_.    ##AuthenticationTO  Specify your username and password to access the service. Credentials can be obtained from [Veriphy Support](mailto:support@veriphy.co.uk)    ##LawyerTO  The LawyerTO object contains the details about the company to be checked.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.LawyerApi;


LawyerApi apiInstance = new LawyerApi();
VeriphyLawyerCheckRequestTO check = new VeriphyLawyerCheckRequestTO(); // VeriphyLawyerCheckRequestTO | The check to be performed
try {
    VeriphyLawyerCheckResponseTO result = apiInstance.lawyerPost(check);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LawyerApi#lawyerPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **check** | [**VeriphyLawyerCheckRequestTO**](VeriphyLawyerCheckRequestTO.md)| The check to be performed |

### Return type

[**VeriphyLawyerCheckResponseTO**](VeriphyLawyerCheckResponseTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml
 - **Accept**: application/json, text/json, application/xml, text/xml

