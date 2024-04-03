# MaskingPluginsApi

All URIs are relative to *http://localhost/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createMaskingPluginTags**](MaskingPluginsApi.md#createMaskingPluginTags) | **POST** /masking-plugins/{maskingPluginId}/tags | Create tags for a masking plugin.
[**deleteMaskingPlugin**](MaskingPluginsApi.md#deleteMaskingPlugin) | **DELETE** /masking-plugins/{maskingPluginId} | Delete a custom masking plugin.
[**deleteMaskingPluginTags**](MaskingPluginsApi.md#deleteMaskingPluginTags) | **POST** /masking-plugins/{maskingPluginId}/tags/delete | Delete tags for a masking plugin.
[**getMaskingPluginById**](MaskingPluginsApi.md#getMaskingPluginById) | **GET** /masking-plugins/{maskingPluginId} | Get a masking plugin by ID or name.
[**getMaskingPluginTags**](MaskingPluginsApi.md#getMaskingPluginTags) | **GET** /masking-plugins/{maskingPluginId}/tags | Get tags for a masking plugin.
[**getMaskingPlugins**](MaskingPluginsApi.md#getMaskingPlugins) | **GET** /masking-plugins | Retrieve the list of masking plugins.
[**installMaskingPlugin**](MaskingPluginsApi.md#installMaskingPlugin) | **POST** /masking-plugins | Install a custom masking plugin.
[**searchMaskingPlugins**](MaskingPluginsApi.md#searchMaskingPlugins) | **POST** /masking-plugins/search | Search for masking plugins.


<a name="createMaskingPluginTags"></a>
# **createMaskingPluginTags**
> TagsResponse createMaskingPluginTags(maskingPluginId, tagsRequest)

Create tags for a masking plugin.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.MaskingPluginsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    MaskingPluginsApi apiInstance = new MaskingPluginsApi(defaultClient);
    String maskingPluginId = "maskingPluginId_example"; // String | The ID of the masking plugin.
    TagsRequest tagsRequest = new TagsRequest(); // TagsRequest | Tags information for masking plugin.
    try {
      TagsResponse result = apiInstance.createMaskingPluginTags(maskingPluginId, tagsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MaskingPluginsApi#createMaskingPluginTags");
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
 **maskingPluginId** | **String**| The ID of the masking plugin. |
 **tagsRequest** | [**TagsRequest**](TagsRequest.md)| Tags information for masking plugin. |

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
**201** | Masking plugin tags created |  -  |

<a name="deleteMaskingPlugin"></a>
# **deleteMaskingPlugin**
> DeleteMaskingPluginResponse deleteMaskingPlugin(maskingPluginId)

Delete a custom masking plugin.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.MaskingPluginsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    MaskingPluginsApi apiInstance = new MaskingPluginsApi(defaultClient);
    String maskingPluginId = "maskingPluginId_example"; // String | The ID of the masking plugin.
    try {
      DeleteMaskingPluginResponse result = apiInstance.deleteMaskingPlugin(maskingPluginId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MaskingPluginsApi#deleteMaskingPlugin");
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
 **maskingPluginId** | **String**| The ID of the masking plugin. |

### Return type

[**DeleteMaskingPluginResponse**](DeleteMaskingPluginResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Masking plugin delete initiated. |  -  |

<a name="deleteMaskingPluginTags"></a>
# **deleteMaskingPluginTags**
> deleteMaskingPluginTags(maskingPluginId, deleteTag)

Delete tags for a masking plugin.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.MaskingPluginsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    MaskingPluginsApi apiInstance = new MaskingPluginsApi(defaultClient);
    String maskingPluginId = "maskingPluginId_example"; // String | The ID of the masking plugin.
    DeleteTag deleteTag = new DeleteTag(); // DeleteTag | The parameters to delete tags
    try {
      apiInstance.deleteMaskingPluginTags(maskingPluginId, deleteTag);
    } catch (ApiException e) {
      System.err.println("Exception when calling MaskingPluginsApi#deleteMaskingPluginTags");
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
 **maskingPluginId** | **String**| The ID of the masking plugin. |
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

<a name="getMaskingPluginById"></a>
# **getMaskingPluginById**
> MaskingPlugin getMaskingPluginById(maskingPluginId)

Get a masking plugin by ID or name.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.MaskingPluginsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    MaskingPluginsApi apiInstance = new MaskingPluginsApi(defaultClient);
    String maskingPluginId = "maskingPluginId_example"; // String | The ID of the masking plugin.
    try {
      MaskingPlugin result = apiInstance.getMaskingPluginById(maskingPluginId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MaskingPluginsApi#getMaskingPluginById");
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
 **maskingPluginId** | **String**| The ID of the masking plugin. |

### Return type

[**MaskingPlugin**](MaskingPlugin.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="getMaskingPluginTags"></a>
# **getMaskingPluginTags**
> TagsResponse getMaskingPluginTags(maskingPluginId)

Get tags for a masking plugin.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.MaskingPluginsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    MaskingPluginsApi apiInstance = new MaskingPluginsApi(defaultClient);
    String maskingPluginId = "maskingPluginId_example"; // String | The ID of the masking plugin.
    try {
      TagsResponse result = apiInstance.getMaskingPluginTags(maskingPluginId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MaskingPluginsApi#getMaskingPluginTags");
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
 **maskingPluginId** | **String**| The ID of the masking plugin. |

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

<a name="getMaskingPlugins"></a>
# **getMaskingPlugins**
> ListMaskingPluginsResponse getMaskingPlugins(limit, cursor, sort)

Retrieve the list of masking plugins.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.MaskingPluginsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    MaskingPluginsApi apiInstance = new MaskingPluginsApi(defaultClient);
    Integer limit = 100; // Integer | Maximum number of objects to return per query. The value must be between 1 and 1000. Default is 100.
    String cursor = "cursor_example"; // String | Cursor to fetch the next or previous page of results. The value of this property must be extracted from the 'prev_cursor' or 'next_cursor' property of a PaginatedResponseMetadata which is contained in the response of list and search API endpoints.
    String sort = "name"; // String | The field to sort results by. A property name with a prepended '-' signifies a descending order.
    try {
      ListMaskingPluginsResponse result = apiInstance.getMaskingPlugins(limit, cursor, sort);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MaskingPluginsApi#getMaskingPlugins");
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
 **sort** | **String**| The field to sort results by. A property name with a prepended &#39;-&#39; signifies a descending order. | [optional] [enum: id, -id, name, -name, plugin_type, -plugin_type, description, -description, install_date, -install_date, built_in, -built_in, sdk_version, -sdk_version, version, -version, author, -author]

### Return type

[**ListMaskingPluginsResponse**](ListMaskingPluginsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="installMaskingPlugin"></a>
# **installMaskingPlugin**
> InstallMaskingPluginResponse installMaskingPlugin(installMaskingPluginParameters)

Install a custom masking plugin.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.MaskingPluginsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    MaskingPluginsApi apiInstance = new MaskingPluginsApi(defaultClient);
    InstallMaskingPluginParameters installMaskingPluginParameters = new InstallMaskingPluginParameters(); // InstallMaskingPluginParameters | 
    try {
      InstallMaskingPluginResponse result = apiInstance.installMaskingPlugin(installMaskingPluginParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MaskingPluginsApi#installMaskingPlugin");
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
 **installMaskingPluginParameters** | [**InstallMaskingPluginParameters**](InstallMaskingPluginParameters.md)|  |

### Return type

[**InstallMaskingPluginResponse**](InstallMaskingPluginResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Plugin installation initiated |  -  |

<a name="searchMaskingPlugins"></a>
# **searchMaskingPlugins**
> SearchMaskingPluginsResponse searchMaskingPlugins(limit, cursor, sort, searchBody)

Search for masking plugins.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.MaskingPluginsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    MaskingPluginsApi apiInstance = new MaskingPluginsApi(defaultClient);
    Integer limit = 100; // Integer | Maximum number of objects to return per query. The value must be between 1 and 1000. Default is 100.
    String cursor = "cursor_example"; // String | Cursor to fetch the next or previous page of results. The value of this property must be extracted from the 'prev_cursor' or 'next_cursor' property of a PaginatedResponseMetadata which is contained in the response of list and search API endpoints.
    String sort = "name"; // String | The field to sort results by. A property name with a prepended '-' signifies a descending order.
    SearchBody searchBody = new SearchBody(); // SearchBody | A request body containing a filter expression. This enables searching for items matching arbitrarily complex conditions. The list of attributes which can be used in filter expressions is available in the x-filterable vendor extension.  # Filter Expression Overview **Note: All keywords are case-insensitive**  ## Comparison Operators | Operator | Description | Example | | --- | --- | --- | | CONTAINS | Substring or membership testing for string and list attributes respectively. | field3 CONTAINS 'foobar', field4 CONTAINS TRUE  | | IN | Tests if field is a member of a list literal. List can contain a maximum of 100 values | field2 IN ['Goku', 'Vegeta'] | | GE | Tests if a field is greater than or equal to a literal value | field1 GE 1.2e-2 | | GT | Tests if a field is greater than a literal value | field1 GT 1.2e-2 | | LE | Tests if a field is less than or equal to a literal value | field1 LE 9000 | | LT | Tests if a field is less than a literal value | field1 LT 9.02 | | NE | Tests if a field is not equal to a literal value | field1 NE 42 | | EQ | Tests if a field is equal to a literal value | field1 EQ 42 |  ## Search Operator The SEARCH operator filters for items which have any filterable attribute that contains the input string as a substring, comparison is done case-insensitively. This is not restricted to attributes with string values. Specifically `SEARCH '12'` would match an item with an attribute with an integer value of `123`.  ## Logical Operators Ordered by precedence. | Operator | Description | Example | | --- | --- | --- | | NOT | Logical NOT (Right associative) | NOT field1 LE 9000 | | AND | Logical AND (Left Associative) | field1 GT 9000 AND field2 EQ 'Goku' | | OR | Logical OR (Left Associative) | field1 GT 9000 OR field2 EQ 'Goku' |  ## Grouping Parenthesis `()` can be used to override operator precedence.  For example: NOT (field1 LT 1234 AND field2 CONTAINS 'foo')  ## Literal Values | Literal      | Description | Examples | | --- | --- | --- | | Nil | Represents the absence of a value | nil, Nil, nIl, NIL | | Boolean | true/false boolean | true, false, True, False, TRUE, FALSE | | Number | Signed integer and floating point numbers. Also supports scientific notation. | 0, 1, -1, 1.2, 0.35, 1.2e-2, -1.2e+2 | | String | Single or double quoted | \"foo\", \"bar\", \"foo bar\", 'foo', 'bar', 'foo bar' | | Datetime | Formatted according to [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339) | 2018-04-27T18:39:26.397237+00:00 | | List | Comma-separated literals wrapped in square brackets | [0], [0, 1], ['foo', \"bar\"] |  ## Limitations - A maximum of 8 unique identifiers may be used inside a filter expression. 
    try {
      SearchMaskingPluginsResponse result = apiInstance.searchMaskingPlugins(limit, cursor, sort, searchBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MaskingPluginsApi#searchMaskingPlugins");
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
 **sort** | **String**| The field to sort results by. A property name with a prepended &#39;-&#39; signifies a descending order. | [optional] [enum: id, -id, name, -name, plugin_type, -plugin_type, description, -description, install_date, -install_date, built_in, -built_in, sdk_version, -sdk_version, version, -version, author, -author]
 **searchBody** | [**SearchBody**](SearchBody.md)| A request body containing a filter expression. This enables searching for items matching arbitrarily complex conditions. The list of attributes which can be used in filter expressions is available in the x-filterable vendor extension.  # Filter Expression Overview **Note: All keywords are case-insensitive**  ## Comparison Operators | Operator | Description | Example | | --- | --- | --- | | CONTAINS | Substring or membership testing for string and list attributes respectively. | field3 CONTAINS &#39;foobar&#39;, field4 CONTAINS TRUE  | | IN | Tests if field is a member of a list literal. List can contain a maximum of 100 values | field2 IN [&#39;Goku&#39;, &#39;Vegeta&#39;] | | GE | Tests if a field is greater than or equal to a literal value | field1 GE 1.2e-2 | | GT | Tests if a field is greater than a literal value | field1 GT 1.2e-2 | | LE | Tests if a field is less than or equal to a literal value | field1 LE 9000 | | LT | Tests if a field is less than a literal value | field1 LT 9.02 | | NE | Tests if a field is not equal to a literal value | field1 NE 42 | | EQ | Tests if a field is equal to a literal value | field1 EQ 42 |  ## Search Operator The SEARCH operator filters for items which have any filterable attribute that contains the input string as a substring, comparison is done case-insensitively. This is not restricted to attributes with string values. Specifically &#x60;SEARCH &#39;12&#39;&#x60; would match an item with an attribute with an integer value of &#x60;123&#x60;.  ## Logical Operators Ordered by precedence. | Operator | Description | Example | | --- | --- | --- | | NOT | Logical NOT (Right associative) | NOT field1 LE 9000 | | AND | Logical AND (Left Associative) | field1 GT 9000 AND field2 EQ &#39;Goku&#39; | | OR | Logical OR (Left Associative) | field1 GT 9000 OR field2 EQ &#39;Goku&#39; |  ## Grouping Parenthesis &#x60;()&#x60; can be used to override operator precedence.  For example: NOT (field1 LT 1234 AND field2 CONTAINS &#39;foo&#39;)  ## Literal Values | Literal      | Description | Examples | | --- | --- | --- | | Nil | Represents the absence of a value | nil, Nil, nIl, NIL | | Boolean | true/false boolean | true, false, True, False, TRUE, FALSE | | Number | Signed integer and floating point numbers. Also supports scientific notation. | 0, 1, -1, 1.2, 0.35, 1.2e-2, -1.2e+2 | | String | Single or double quoted | \&quot;foo\&quot;, \&quot;bar\&quot;, \&quot;foo bar\&quot;, &#39;foo&#39;, &#39;bar&#39;, &#39;foo bar&#39; | | Datetime | Formatted according to [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339) | 2018-04-27T18:39:26.397237+00:00 | | List | Comma-separated literals wrapped in square brackets | [0], [0, 1], [&#39;foo&#39;, \&quot;bar\&quot;] |  ## Limitations - A maximum of 8 unique identifiers may be used inside a filter expression.  | [optional]

### Return type

[**SearchMaskingPluginsResponse**](SearchMaskingPluginsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

