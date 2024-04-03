# HyperscaleInstanceApi

All URIs are relative to *http://localhost/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addEngineToHyperscaleInstance**](HyperscaleInstanceApi.md#addEngineToHyperscaleInstance) | **POST** /hyperscale-instances/{hyperscaleInstanceId}/add-engine | Add an engine to a Hyperscale Instance.
[**createHyperscaleInstanceTags**](HyperscaleInstanceApi.md#createHyperscaleInstanceTags) | **POST** /hyperscale-instances/{hyperscaleInstanceId}/tags | Create tags for a Hyperscale Instance.
[**deleteHyperscaleInstanceTags**](HyperscaleInstanceApi.md#deleteHyperscaleInstanceTags) | **POST** /hyperscale-instances/{hyperscaleInstanceId}/tags/delete | Delete tags for a Hyperscale Instance.
[**getHyperscaleInstanceById**](HyperscaleInstanceApi.md#getHyperscaleInstanceById) | **GET** /hyperscale-instances/{hyperscaleInstanceId} | Returns a Hyperscale Instance by ID.
[**getHyperscaleInstanceTags**](HyperscaleInstanceApi.md#getHyperscaleInstanceTags) | **GET** /hyperscale-instances/{hyperscaleInstanceId}/tags | Get tags for a Hyperscale Instance.
[**getHyperscaleInstances**](HyperscaleInstanceApi.md#getHyperscaleInstances) | **GET** /hyperscale-instances | Returns a list of Hyperscale instances.
[**registerHyperscaleInstance**](HyperscaleInstanceApi.md#registerHyperscaleInstance) | **POST** /hyperscale-instances | Register a Hyperscale instance
[**removeEngineFromHyperscaleInstance**](HyperscaleInstanceApi.md#removeEngineFromHyperscaleInstance) | **POST** /hyperscale-instances/{hyperscaleInstanceId}/remove-engine | Remove an engine from a Hyperscale Instance.
[**searchHyperscaleInstances**](HyperscaleInstanceApi.md#searchHyperscaleInstances) | **POST** /hyperscale-instances/search | Search for Hyperscale instances.
[**syncEnginesHyperscaleInstance**](HyperscaleInstanceApi.md#syncEnginesHyperscaleInstance) | **POST** /hyperscale-instances/{hyperscaleInstanceId}/sync-engines | Sync the global object from a source engine to engines on a Hyperscale Instance.
[**unregisterHyperscaleInstance**](HyperscaleInstanceApi.md#unregisterHyperscaleInstance) | **DELETE** /hyperscale-instances/{hyperscaleInstanceId} | Unregister a Hyperscale Instance.
[**updateHyperscaleInstance**](HyperscaleInstanceApi.md#updateHyperscaleInstance) | **PATCH** /hyperscale-instances/{hyperscaleInstanceId} | Update an Hyperscale Instance


<a name="addEngineToHyperscaleInstance"></a>
# **addEngineToHyperscaleInstance**
> AddEngineToHyperscaleResponse addEngineToHyperscaleInstance(hyperscaleInstanceId, engineIdBody)

Add an engine to a Hyperscale Instance.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.HyperscaleInstanceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    HyperscaleInstanceApi apiInstance = new HyperscaleInstanceApi(defaultClient);
    String hyperscaleInstanceId = "hyperscaleInstanceId_example"; // String | The ID of hyperscale instance.
    EngineIdBody engineIdBody = new EngineIdBody(); // EngineIdBody | Body containing the ID of the registered engine.
    try {
      AddEngineToHyperscaleResponse result = apiInstance.addEngineToHyperscaleInstance(hyperscaleInstanceId, engineIdBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling HyperscaleInstanceApi#addEngineToHyperscaleInstance");
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
 **hyperscaleInstanceId** | **String**| The ID of hyperscale instance. |
 **engineIdBody** | [**EngineIdBody**](EngineIdBody.md)| Body containing the ID of the registered engine. |

### Return type

[**AddEngineToHyperscaleResponse**](AddEngineToHyperscaleResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="createHyperscaleInstanceTags"></a>
# **createHyperscaleInstanceTags**
> TagsResponse createHyperscaleInstanceTags(hyperscaleInstanceId, tagsRequest)

Create tags for a Hyperscale Instance.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.HyperscaleInstanceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    HyperscaleInstanceApi apiInstance = new HyperscaleInstanceApi(defaultClient);
    String hyperscaleInstanceId = "hyperscaleInstanceId_example"; // String | The ID of hyperscale instance.
    TagsRequest tagsRequest = new TagsRequest(); // TagsRequest | Tags information for Hyperscale Instance.
    try {
      TagsResponse result = apiInstance.createHyperscaleInstanceTags(hyperscaleInstanceId, tagsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling HyperscaleInstanceApi#createHyperscaleInstanceTags");
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
 **hyperscaleInstanceId** | **String**| The ID of hyperscale instance. |
 **tagsRequest** | [**TagsRequest**](TagsRequest.md)| Tags information for Hyperscale Instance. |

### Return type

[**TagsResponse**](TagsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Created |  -  |

<a name="deleteHyperscaleInstanceTags"></a>
# **deleteHyperscaleInstanceTags**
> deleteHyperscaleInstanceTags(hyperscaleInstanceId, deleteTag)

Delete tags for a Hyperscale Instance.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.HyperscaleInstanceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    HyperscaleInstanceApi apiInstance = new HyperscaleInstanceApi(defaultClient);
    String hyperscaleInstanceId = "hyperscaleInstanceId_example"; // String | The ID of hyperscale instance.
    DeleteTag deleteTag = new DeleteTag(); // DeleteTag | The parameters to delete tags
    try {
      apiInstance.deleteHyperscaleInstanceTags(hyperscaleInstanceId, deleteTag);
    } catch (ApiException e) {
      System.err.println("Exception when calling HyperscaleInstanceApi#deleteHyperscaleInstanceTags");
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
 **hyperscaleInstanceId** | **String**| The ID of hyperscale instance. |
 **deleteTag** | [**DeleteTag**](DeleteTag.md)| The parameters to delete tags | [optional]

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
**204** | No Content |  -  |

<a name="getHyperscaleInstanceById"></a>
# **getHyperscaleInstanceById**
> HyperscaleInstance getHyperscaleInstanceById(hyperscaleInstanceId)

Returns a Hyperscale Instance by ID.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.HyperscaleInstanceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    HyperscaleInstanceApi apiInstance = new HyperscaleInstanceApi(defaultClient);
    String hyperscaleInstanceId = "hyperscaleInstanceId_example"; // String | The ID of hyperscale instance.
    try {
      HyperscaleInstance result = apiInstance.getHyperscaleInstanceById(hyperscaleInstanceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling HyperscaleInstanceApi#getHyperscaleInstanceById");
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
 **hyperscaleInstanceId** | **String**| The ID of hyperscale instance. |

### Return type

[**HyperscaleInstance**](HyperscaleInstance.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="getHyperscaleInstanceTags"></a>
# **getHyperscaleInstanceTags**
> TagsResponse getHyperscaleInstanceTags(hyperscaleInstanceId)

Get tags for a Hyperscale Instance.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.HyperscaleInstanceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    HyperscaleInstanceApi apiInstance = new HyperscaleInstanceApi(defaultClient);
    String hyperscaleInstanceId = "hyperscaleInstanceId_example"; // String | The ID of hyperscale instance.
    try {
      TagsResponse result = apiInstance.getHyperscaleInstanceTags(hyperscaleInstanceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling HyperscaleInstanceApi#getHyperscaleInstanceTags");
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
 **hyperscaleInstanceId** | **String**| The ID of hyperscale instance. |

### Return type

[**TagsResponse**](TagsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Ok |  -  |

<a name="getHyperscaleInstances"></a>
# **getHyperscaleInstances**
> ListHyperscaleInstancesResponse getHyperscaleInstances(limit, cursor, sort)

Returns a list of Hyperscale instances.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.HyperscaleInstanceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    HyperscaleInstanceApi apiInstance = new HyperscaleInstanceApi(defaultClient);
    Integer limit = 100; // Integer | Maximum number of objects to return per query. The value must be between 1 and 1000. Default is 100.
    String cursor = "cursor_example"; // String | Cursor to fetch the next or previous page of results. The value of this property must be extracted from the 'prev_cursor' or 'next_cursor' property of a PaginatedResponseMetadata which is contained in the response of list and search API endpoints.
    String sort = "name"; // String | The field to sort results by. A property name with a prepended '-' signifies descending order.
    try {
      ListHyperscaleInstancesResponse result = apiInstance.getHyperscaleInstances(limit, cursor, sort);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling HyperscaleInstanceApi#getHyperscaleInstances");
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
 **limit** | **Integer**| Maximum number of objects to return per query. The value must be between 1 and 1000. Default is 100. | [optional] [default to 100]
 **cursor** | **String**| Cursor to fetch the next or previous page of results. The value of this property must be extracted from the &#39;prev_cursor&#39; or &#39;next_cursor&#39; property of a PaginatedResponseMetadata which is contained in the response of list and search API endpoints. | [optional]
 **sort** | **String**| The field to sort results by. A property name with a prepended &#39;-&#39; signifies descending order. | [optional] [enum: id, -id, name, -name, hostname, -hostname, creation_date, -creation_date, status, -status, data_type, -data_type, connection_status, -connection_status, connection_status_details, -connection_status_details]

### Return type

[**ListHyperscaleInstancesResponse**](ListHyperscaleInstancesResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="registerHyperscaleInstance"></a>
# **registerHyperscaleInstance**
> HyperscaleInstance registerHyperscaleInstance(hyperscaleInstanceRegistrationParameter)

Register a Hyperscale instance

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.HyperscaleInstanceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    HyperscaleInstanceApi apiInstance = new HyperscaleInstanceApi(defaultClient);
    HyperscaleInstanceRegistrationParameter hyperscaleInstanceRegistrationParameter = new HyperscaleInstanceRegistrationParameter(); // HyperscaleInstanceRegistrationParameter | The parameters to register a Hyperscale instance.
    try {
      HyperscaleInstance result = apiInstance.registerHyperscaleInstance(hyperscaleInstanceRegistrationParameter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling HyperscaleInstanceApi#registerHyperscaleInstance");
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
 **hyperscaleInstanceRegistrationParameter** | [**HyperscaleInstanceRegistrationParameter**](HyperscaleInstanceRegistrationParameter.md)| The parameters to register a Hyperscale instance. |

### Return type

[**HyperscaleInstance**](HyperscaleInstance.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Created |  -  |

<a name="removeEngineFromHyperscaleInstance"></a>
# **removeEngineFromHyperscaleInstance**
> RemoveEngineFromHyperscaleResponse removeEngineFromHyperscaleInstance(hyperscaleInstanceId, engineIdBody)

Remove an engine from a Hyperscale Instance.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.HyperscaleInstanceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    HyperscaleInstanceApi apiInstance = new HyperscaleInstanceApi(defaultClient);
    String hyperscaleInstanceId = "hyperscaleInstanceId_example"; // String | The ID of hyperscale instance.
    EngineIdBody engineIdBody = new EngineIdBody(); // EngineIdBody | Body containing the ID of the registered engine.
    try {
      RemoveEngineFromHyperscaleResponse result = apiInstance.removeEngineFromHyperscaleInstance(hyperscaleInstanceId, engineIdBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling HyperscaleInstanceApi#removeEngineFromHyperscaleInstance");
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
 **hyperscaleInstanceId** | **String**| The ID of hyperscale instance. |
 **engineIdBody** | [**EngineIdBody**](EngineIdBody.md)| Body containing the ID of the registered engine. |

### Return type

[**RemoveEngineFromHyperscaleResponse**](RemoveEngineFromHyperscaleResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="searchHyperscaleInstances"></a>
# **searchHyperscaleInstances**
> SearchHyperscaleInstancesResponse searchHyperscaleInstances(limit, cursor, sort, searchBody)

Search for Hyperscale instances.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.HyperscaleInstanceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    HyperscaleInstanceApi apiInstance = new HyperscaleInstanceApi(defaultClient);
    Integer limit = 100; // Integer | Maximum number of objects to return per query. The value must be between 1 and 1000. Default is 100.
    String cursor = "cursor_example"; // String | Cursor to fetch the next or previous page of results. The value of this property must be extracted from the 'prev_cursor' or 'next_cursor' property of a PaginatedResponseMetadata which is contained in the response of list and search API endpoints.
    String sort = "name"; // String | The field to sort results by. A property name with a prepended '-' signifies descending order.
    SearchBody searchBody = new SearchBody(); // SearchBody | A request body containing a filter expression. This enables searching for items matching arbitrarily complex conditions. The list of attributes which can be used in filter expressions is available in the x-filterable vendor extension.  # Filter Expression Overview **Note: All keywords are case-insensitive**  ## Comparison Operators | Operator | Description | Example | | --- | --- | --- | | CONTAINS | Substring or membership testing for string and list attributes respectively. | field3 CONTAINS 'foobar', field4 CONTAINS TRUE  | | IN | Tests if field is a member of a list literal. List can contain a maximum of 100 values | field2 IN ['Goku', 'Vegeta'] | | GE | Tests if a field is greater than or equal to a literal value | field1 GE 1.2e-2 | | GT | Tests if a field is greater than a literal value | field1 GT 1.2e-2 | | LE | Tests if a field is less than or equal to a literal value | field1 LE 9000 | | LT | Tests if a field is less than a literal value | field1 LT 9.02 | | NE | Tests if a field is not equal to a literal value | field1 NE 42 | | EQ | Tests if a field is equal to a literal value | field1 EQ 42 |  ## Search Operator The SEARCH operator filters for items which have any filterable attribute that contains the input string as a substring, comparison is done case-insensitively. This is not restricted to attributes with string values. Specifically `SEARCH '12'` would match an item with an attribute with an integer value of `123`.  ## Logical Operators Ordered by precedence. | Operator | Description | Example | | --- | --- | --- | | NOT | Logical NOT (Right associative) | NOT field1 LE 9000 | | AND | Logical AND (Left Associative) | field1 GT 9000 AND field2 EQ 'Goku' | | OR | Logical OR (Left Associative) | field1 GT 9000 OR field2 EQ 'Goku' |  ## Grouping Parenthesis `()` can be used to override operator precedence.  For example: NOT (field1 LT 1234 AND field2 CONTAINS 'foo')  ## Literal Values | Literal      | Description | Examples | | --- | --- | --- | | Nil | Represents the absence of a value | nil, Nil, nIl, NIL | | Boolean | true/false boolean | true, false, True, False, TRUE, FALSE | | Number | Signed integer and floating point numbers. Also supports scientific notation. | 0, 1, -1, 1.2, 0.35, 1.2e-2, -1.2e+2 | | String | Single or double quoted | \"foo\", \"bar\", \"foo bar\", 'foo', 'bar', 'foo bar' | | Datetime | Formatted according to [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339) | 2018-04-27T18:39:26.397237+00:00 | | List | Comma-separated literals wrapped in square brackets | [0], [0, 1], ['foo', \"bar\"] |  ## Limitations - A maximum of 8 unique identifiers may be used inside a filter expression. 
    try {
      SearchHyperscaleInstancesResponse result = apiInstance.searchHyperscaleInstances(limit, cursor, sort, searchBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling HyperscaleInstanceApi#searchHyperscaleInstances");
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
 **limit** | **Integer**| Maximum number of objects to return per query. The value must be between 1 and 1000. Default is 100. | [optional] [default to 100]
 **cursor** | **String**| Cursor to fetch the next or previous page of results. The value of this property must be extracted from the &#39;prev_cursor&#39; or &#39;next_cursor&#39; property of a PaginatedResponseMetadata which is contained in the response of list and search API endpoints. | [optional]
 **sort** | **String**| The field to sort results by. A property name with a prepended &#39;-&#39; signifies descending order. | [optional] [enum: id, -id, name, -name, hostname, -hostname, creation_date, -creation_date, status, -status, data_type, -data_type, connection_status, -connection_status, connection_status_details, -connection_status_details]
 **searchBody** | [**SearchBody**](SearchBody.md)| A request body containing a filter expression. This enables searching for items matching arbitrarily complex conditions. The list of attributes which can be used in filter expressions is available in the x-filterable vendor extension.  # Filter Expression Overview **Note: All keywords are case-insensitive**  ## Comparison Operators | Operator | Description | Example | | --- | --- | --- | | CONTAINS | Substring or membership testing for string and list attributes respectively. | field3 CONTAINS &#39;foobar&#39;, field4 CONTAINS TRUE  | | IN | Tests if field is a member of a list literal. List can contain a maximum of 100 values | field2 IN [&#39;Goku&#39;, &#39;Vegeta&#39;] | | GE | Tests if a field is greater than or equal to a literal value | field1 GE 1.2e-2 | | GT | Tests if a field is greater than a literal value | field1 GT 1.2e-2 | | LE | Tests if a field is less than or equal to a literal value | field1 LE 9000 | | LT | Tests if a field is less than a literal value | field1 LT 9.02 | | NE | Tests if a field is not equal to a literal value | field1 NE 42 | | EQ | Tests if a field is equal to a literal value | field1 EQ 42 |  ## Search Operator The SEARCH operator filters for items which have any filterable attribute that contains the input string as a substring, comparison is done case-insensitively. This is not restricted to attributes with string values. Specifically &#x60;SEARCH &#39;12&#39;&#x60; would match an item with an attribute with an integer value of &#x60;123&#x60;.  ## Logical Operators Ordered by precedence. | Operator | Description | Example | | --- | --- | --- | | NOT | Logical NOT (Right associative) | NOT field1 LE 9000 | | AND | Logical AND (Left Associative) | field1 GT 9000 AND field2 EQ &#39;Goku&#39; | | OR | Logical OR (Left Associative) | field1 GT 9000 OR field2 EQ &#39;Goku&#39; |  ## Grouping Parenthesis &#x60;()&#x60; can be used to override operator precedence.  For example: NOT (field1 LT 1234 AND field2 CONTAINS &#39;foo&#39;)  ## Literal Values | Literal      | Description | Examples | | --- | --- | --- | | Nil | Represents the absence of a value | nil, Nil, nIl, NIL | | Boolean | true/false boolean | true, false, True, False, TRUE, FALSE | | Number | Signed integer and floating point numbers. Also supports scientific notation. | 0, 1, -1, 1.2, 0.35, 1.2e-2, -1.2e+2 | | String | Single or double quoted | \&quot;foo\&quot;, \&quot;bar\&quot;, \&quot;foo bar\&quot;, &#39;foo&#39;, &#39;bar&#39;, &#39;foo bar&#39; | | Datetime | Formatted according to [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339) | 2018-04-27T18:39:26.397237+00:00 | | List | Comma-separated literals wrapped in square brackets | [0], [0, 1], [&#39;foo&#39;, \&quot;bar\&quot;] |  ## Limitations - A maximum of 8 unique identifiers may be used inside a filter expression.  | [optional]

### Return type

[**SearchHyperscaleInstancesResponse**](SearchHyperscaleInstancesResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="syncEnginesHyperscaleInstance"></a>
# **syncEnginesHyperscaleInstance**
> SyncEnginesHyperscaleResponse syncEnginesHyperscaleInstance(hyperscaleInstanceId, syncEnginesHyperscaleParameters)

Sync the global object from a source engine to engines on a Hyperscale Instance.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.HyperscaleInstanceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    HyperscaleInstanceApi apiInstance = new HyperscaleInstanceApi(defaultClient);
    String hyperscaleInstanceId = "hyperscaleInstanceId_example"; // String | The ID of hyperscale instance.
    SyncEnginesHyperscaleParameters syncEnginesHyperscaleParameters = new SyncEnginesHyperscaleParameters(); // SyncEnginesHyperscaleParameters | 
    try {
      SyncEnginesHyperscaleResponse result = apiInstance.syncEnginesHyperscaleInstance(hyperscaleInstanceId, syncEnginesHyperscaleParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling HyperscaleInstanceApi#syncEnginesHyperscaleInstance");
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
 **hyperscaleInstanceId** | **String**| The ID of hyperscale instance. |
 **syncEnginesHyperscaleParameters** | [**SyncEnginesHyperscaleParameters**](SyncEnginesHyperscaleParameters.md)|  | [optional]

### Return type

[**SyncEnginesHyperscaleResponse**](SyncEnginesHyperscaleResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="unregisterHyperscaleInstance"></a>
# **unregisterHyperscaleInstance**
> UnregisterHyperscaleInstanceResponse unregisterHyperscaleInstance(hyperscaleInstanceId)

Unregister a Hyperscale Instance.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.HyperscaleInstanceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    HyperscaleInstanceApi apiInstance = new HyperscaleInstanceApi(defaultClient);
    String hyperscaleInstanceId = "hyperscaleInstanceId_example"; // String | The ID of hyperscale instance.
    try {
      UnregisterHyperscaleInstanceResponse result = apiInstance.unregisterHyperscaleInstance(hyperscaleInstanceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling HyperscaleInstanceApi#unregisterHyperscaleInstance");
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
 **hyperscaleInstanceId** | **String**| The ID of hyperscale instance. |

### Return type

[**UnregisterHyperscaleInstanceResponse**](UnregisterHyperscaleInstanceResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="updateHyperscaleInstance"></a>
# **updateHyperscaleInstance**
> HyperscaleInstance updateHyperscaleInstance(hyperscaleInstanceId, hyperscaleInstanceUpdateParams)

Update an Hyperscale Instance

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.HyperscaleInstanceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    HyperscaleInstanceApi apiInstance = new HyperscaleInstanceApi(defaultClient);
    String hyperscaleInstanceId = "hyperscaleInstanceId_example"; // String | The ID of hyperscale instance.
    HyperscaleInstanceUpdateParams hyperscaleInstanceUpdateParams = new HyperscaleInstanceUpdateParams(); // HyperscaleInstanceUpdateParams | Update parameters for a hyperscale instance.
    try {
      HyperscaleInstance result = apiInstance.updateHyperscaleInstance(hyperscaleInstanceId, hyperscaleInstanceUpdateParams);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling HyperscaleInstanceApi#updateHyperscaleInstance");
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
 **hyperscaleInstanceId** | **String**| The ID of hyperscale instance. |
 **hyperscaleInstanceUpdateParams** | [**HyperscaleInstanceUpdateParams**](HyperscaleInstanceUpdateParams.md)| Update parameters for a hyperscale instance. |

### Return type

[**HyperscaleInstance**](HyperscaleInstance.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

