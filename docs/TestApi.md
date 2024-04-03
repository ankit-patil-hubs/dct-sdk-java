# TestApi

All URIs are relative to *http://localhost/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**enableScaleTesting**](TestApi.md#enableScaleTesting) | **POST** /enable-scale-testing | This is used for performance testing to enable engine and object duplication.


<a name="enableScaleTesting"></a>
# **enableScaleTesting**
> enableScaleTesting(enableScaleTestingRequest)

This is used for performance testing to enable engine and object duplication.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.TestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    TestApi apiInstance = new TestApi(defaultClient);
    EnableScaleTestingRequest enableScaleTestingRequest = new EnableScaleTestingRequest(); // EnableScaleTestingRequest | 
    try {
      apiInstance.enableScaleTesting(enableScaleTestingRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling TestApi#enableScaleTesting");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **enableScaleTestingRequest** | [**EnableScaleTestingRequest**](EnableScaleTestingRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

