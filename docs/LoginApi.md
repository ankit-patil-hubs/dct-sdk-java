# LoginApi

All URIs are relative to *http://localhost/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**accountLogin**](LoginApi.md#accountLogin) | **POST** /login | Login to Account with Username and Password 
[**accountLogout**](LoginApi.md#accountLogout) | **POST** /logout | Invalidates username/password and SSO login session.
[**tokenInfo**](LoginApi.md#tokenInfo) | **POST** /token-info | Get Token Information 


<a name="accountLogin"></a>
# **accountLogin**
> LoginToken accountLogin(accountLoginParameter)

Login to Account with Username and Password 

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.LoginApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    LoginApi apiInstance = new LoginApi(defaultClient);
    AccountLoginParameter accountLoginParameter = new AccountLoginParameter(); // AccountLoginParameter | 
    try {
      LoginToken result = apiInstance.accountLogin(accountLoginParameter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LoginApi#accountLogin");
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
 **accountLoginParameter** | [**AccountLoginParameter**](AccountLoginParameter.md)|  |

### Return type

[**LoginToken**](LoginToken.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Account Login Successful |  -  |
**401** | Unauthorized |  -  |

<a name="accountLogout"></a>
# **accountLogout**
> accountLogout(authorization)

Invalidates username/password and SSO login session.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.LoginApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    LoginApi apiInstance = new LoginApi(defaultClient);
    String authorization = "authorization_example"; // String | Access token
    try {
      apiInstance.accountLogout(authorization);
    } catch (ApiException e) {
      System.err.println("Exception when calling LoginApi#accountLogout");
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
 **authorization** | **String**| Access token |

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Logged out |  -  |

<a name="tokenInfo"></a>
# **tokenInfo**
> TokenInfoResponse tokenInfo(tokenInfoRequest)

Get Token Information 

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.LoginApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    LoginApi apiInstance = new LoginApi(defaultClient);
    TokenInfoRequest tokenInfoRequest = new TokenInfoRequest(); // TokenInfoRequest | 
    try {
      TokenInfoResponse result = apiInstance.tokenInfo(tokenInfoRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LoginApi#tokenInfo");
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
 **tokenInfoRequest** | [**TokenInfoRequest**](TokenInfoRequest.md)|  | [optional]

### Return type

[**TokenInfoResponse**](TokenInfoResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**401** | Unauthorized |  -  |

