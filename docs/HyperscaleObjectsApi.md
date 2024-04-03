# HyperscaleObjectsApi

All URIs are relative to *http://localhost/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createHyperscaleConnector**](HyperscaleObjectsApi.md#createHyperscaleConnector) | **POST** /hyperscale-connectors | Create a Hyperscale Connector.
[**createHyperscaleConnectorTags**](HyperscaleObjectsApi.md#createHyperscaleConnectorTags) | **POST** /hyperscale-connectors/{hyperscaleConnectorId}/tags | Create tags for a Hyperscale Connector.
[**createHyperscaleDatasetTags**](HyperscaleObjectsApi.md#createHyperscaleDatasetTags) | **POST** /hyperscale-datasets/{hyperscaleDatasetId}/tags | Create tags for a Hyperscale Dataset.
[**createHyperscaleMountPoint**](HyperscaleObjectsApi.md#createHyperscaleMountPoint) | **POST** /hyperscale-mount-points | Create a Hyperscale Mount Point
[**deleteHyperscaleConnector**](HyperscaleObjectsApi.md#deleteHyperscaleConnector) | **DELETE** /hyperscale-connectors/{hyperscaleConnectorId} | Delete a Hyperscale Connector.
[**deleteHyperscaleConnectorTags**](HyperscaleObjectsApi.md#deleteHyperscaleConnectorTags) | **POST** /hyperscale-connectors/{hyperscaleConnectorId}/tags/delete | Delete tags for a Hyperscale Connector.
[**deleteHyperscaleDatasetTags**](HyperscaleObjectsApi.md#deleteHyperscaleDatasetTags) | **POST** /hyperscale-datasets/{hyperscaleDatasetId}/tags/delete | Delete tags for a Hyperscale Dataset.
[**deleteHyperscaleMountPoint**](HyperscaleObjectsApi.md#deleteHyperscaleMountPoint) | **DELETE** /hyperscale-mount-points/{hyperscaleMountPointId} | Delete a Hyperscale Mount Point.
[**getHyperscaleConnectorById**](HyperscaleObjectsApi.md#getHyperscaleConnectorById) | **GET** /hyperscale-connectors/{hyperscaleConnectorId} | Get a Hyperscale Connector.
[**getHyperscaleConnectorTags**](HyperscaleObjectsApi.md#getHyperscaleConnectorTags) | **GET** /hyperscale-connectors/{hyperscaleConnectorId}/tags | Get tags for a Hyperscale Connector.
[**getHyperscaleConnectors**](HyperscaleObjectsApi.md#getHyperscaleConnectors) | **GET** /hyperscale-connectors | Returns a list of Hyperscale Connectors.
[**getHyperscaleDatasetById**](HyperscaleObjectsApi.md#getHyperscaleDatasetById) | **GET** /hyperscale-datasets/{hyperscaleDatasetId} | Get a Hyperscale Dataset.
[**getHyperscaleDatasetTableOrFileById**](HyperscaleObjectsApi.md#getHyperscaleDatasetTableOrFileById) | **GET** /hyperscale-datasets/{hyperscaleDatasetId}/tables-or-files/{hyperscaleDatasetTableOrFileId} | Get a Hyperscale Dataset table or file by ID.
[**getHyperscaleDatasetTablesOrFiles**](HyperscaleObjectsApi.md#getHyperscaleDatasetTablesOrFiles) | **GET** /hyperscale-datasets/{hyperscaleDatasetId}/tables-or-files | Get the tables or files of a hyperscale dataset
[**getHyperscaleDatasetTags**](HyperscaleObjectsApi.md#getHyperscaleDatasetTags) | **GET** /hyperscale-datasets/{hyperscaleDatasetId}/tags | Get tags for a Hyperscale Dataset.
[**getHyperscaleDatasets**](HyperscaleObjectsApi.md#getHyperscaleDatasets) | **GET** /hyperscale-datasets | Returns a list of Hyperscale Datasets.
[**getHyperscaleMountPointById**](HyperscaleObjectsApi.md#getHyperscaleMountPointById) | **GET** /hyperscale-mount-points/{hyperscaleMountPointId} | Get a Hyperscale Mount Points.
[**getHyperscaleMountPoints**](HyperscaleObjectsApi.md#getHyperscaleMountPoints) | **GET** /hyperscale-mount-points | Returns a list of Hyperscale Mount Points.
[**searchHyperscaleConnectors**](HyperscaleObjectsApi.md#searchHyperscaleConnectors) | **POST** /hyperscale-connectors/search | Search for Hyperscale Connectors.
[**searchHyperscaleDatasetTablesOrFiles**](HyperscaleObjectsApi.md#searchHyperscaleDatasetTablesOrFiles) | **POST** /hyperscale-datasets/{hyperscaleDatasetId}/tables-or-files/search | Search the tables or files of a hyperscale dataset
[**searchHyperscaleDatasets**](HyperscaleObjectsApi.md#searchHyperscaleDatasets) | **POST** /hyperscale-datasets/search | Search for Hyperscale Datasets.
[**searchHyperscaleMountPoints**](HyperscaleObjectsApi.md#searchHyperscaleMountPoints) | **POST** /hyperscale-mount-points/search | Search for Hyperscale Mount Points.
[**updateHyperscaleConnectorById**](HyperscaleObjectsApi.md#updateHyperscaleConnectorById) | **PATCH** /hyperscale-connectors/{hyperscaleConnectorId} | Update a Hyperscale Connector by ID.
[**updateHyperscaleDatasetById**](HyperscaleObjectsApi.md#updateHyperscaleDatasetById) | **PATCH** /hyperscale-datasets/{hyperscaleDatasetId} | Update a Hyperscale Dataset by ID.
[**updateHyperscaleDatasetTableOrFileById**](HyperscaleObjectsApi.md#updateHyperscaleDatasetTableOrFileById) | **PATCH** /hyperscale-datasets/{hyperscaleDatasetId}/tables-or-files/{hyperscaleDatasetTableOrFileId} | Update a Hyperscale Dataset table or file by ID.
[**updateHyperscaleMountPointById**](HyperscaleObjectsApi.md#updateHyperscaleMountPointById) | **PATCH** /hyperscale-mount-points/{hyperscaleMountPointId} | Update a Hyperscale Mount Point by ID.


<a name="createHyperscaleConnector"></a>
# **createHyperscaleConnector**
> CreateHyperscaleConnectorResponse createHyperscaleConnector(hyperscaleConnectorCreateParameters)

Create a Hyperscale Connector.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.HyperscaleObjectsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    HyperscaleObjectsApi apiInstance = new HyperscaleObjectsApi(defaultClient);
    HyperscaleConnectorCreateParameters hyperscaleConnectorCreateParameters = new HyperscaleConnectorCreateParameters(); // HyperscaleConnectorCreateParameters | 
    try {
      CreateHyperscaleConnectorResponse result = apiInstance.createHyperscaleConnector(hyperscaleConnectorCreateParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling HyperscaleObjectsApi#createHyperscaleConnector");
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
 **hyperscaleConnectorCreateParameters** | [**HyperscaleConnectorCreateParameters**](HyperscaleConnectorCreateParameters.md)|  |

### Return type

[**CreateHyperscaleConnectorResponse**](CreateHyperscaleConnectorResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="createHyperscaleConnectorTags"></a>
# **createHyperscaleConnectorTags**
> TagsResponse createHyperscaleConnectorTags(hyperscaleConnectorId, tagsRequest)

Create tags for a Hyperscale Connector.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.HyperscaleObjectsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    HyperscaleObjectsApi apiInstance = new HyperscaleObjectsApi(defaultClient);
    String hyperscaleConnectorId = "hyperscaleConnectorId_example"; // String | The ID of the Hyperscale Connector.
    TagsRequest tagsRequest = new TagsRequest(); // TagsRequest | Tag information for a Hyperscale Connector.
    try {
      TagsResponse result = apiInstance.createHyperscaleConnectorTags(hyperscaleConnectorId, tagsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling HyperscaleObjectsApi#createHyperscaleConnectorTags");
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
 **hyperscaleConnectorId** | **String**| The ID of the Hyperscale Connector. |
 **tagsRequest** | [**TagsRequest**](TagsRequest.md)| Tag information for a Hyperscale Connector. |

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

<a name="createHyperscaleDatasetTags"></a>
# **createHyperscaleDatasetTags**
> TagsResponse createHyperscaleDatasetTags(hyperscaleDatasetId, tagsRequest)

Create tags for a Hyperscale Dataset.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.HyperscaleObjectsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    HyperscaleObjectsApi apiInstance = new HyperscaleObjectsApi(defaultClient);
    String hyperscaleDatasetId = "hyperscaleDatasetId_example"; // String | The ID of the Hyperscale Dataset.
    TagsRequest tagsRequest = new TagsRequest(); // TagsRequest | Tag information for a Hyperscale Dataset.
    try {
      TagsResponse result = apiInstance.createHyperscaleDatasetTags(hyperscaleDatasetId, tagsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling HyperscaleObjectsApi#createHyperscaleDatasetTags");
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
 **hyperscaleDatasetId** | **String**| The ID of the Hyperscale Dataset. |
 **tagsRequest** | [**TagsRequest**](TagsRequest.md)| Tag information for a Hyperscale Dataset. |

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

<a name="createHyperscaleMountPoint"></a>
# **createHyperscaleMountPoint**
> CreateHyperscaleMountPointResponse createHyperscaleMountPoint(hyperscaleMountPoint)

Create a Hyperscale Mount Point

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.HyperscaleObjectsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    HyperscaleObjectsApi apiInstance = new HyperscaleObjectsApi(defaultClient);
    HyperscaleMountPoint hyperscaleMountPoint = new HyperscaleMountPoint(); // HyperscaleMountPoint | Request to create a Hyperscale Mount Point.
    try {
      CreateHyperscaleMountPointResponse result = apiInstance.createHyperscaleMountPoint(hyperscaleMountPoint);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling HyperscaleObjectsApi#createHyperscaleMountPoint");
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
 **hyperscaleMountPoint** | [**HyperscaleMountPoint**](HyperscaleMountPoint.md)| Request to create a Hyperscale Mount Point. |

### Return type

[**CreateHyperscaleMountPointResponse**](CreateHyperscaleMountPointResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="deleteHyperscaleConnector"></a>
# **deleteHyperscaleConnector**
> DeleteHyperscaleConnectorResponse deleteHyperscaleConnector(hyperscaleConnectorId)

Delete a Hyperscale Connector.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.HyperscaleObjectsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    HyperscaleObjectsApi apiInstance = new HyperscaleObjectsApi(defaultClient);
    String hyperscaleConnectorId = "hyperscaleConnectorId_example"; // String | The ID of the Hyperscale Connector.
    try {
      DeleteHyperscaleConnectorResponse result = apiInstance.deleteHyperscaleConnector(hyperscaleConnectorId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling HyperscaleObjectsApi#deleteHyperscaleConnector");
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
 **hyperscaleConnectorId** | **String**| The ID of the Hyperscale Connector. |

### Return type

[**DeleteHyperscaleConnectorResponse**](DeleteHyperscaleConnectorResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="deleteHyperscaleConnectorTags"></a>
# **deleteHyperscaleConnectorTags**
> deleteHyperscaleConnectorTags(hyperscaleConnectorId, deleteTag)

Delete tags for a Hyperscale Connector.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.HyperscaleObjectsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    HyperscaleObjectsApi apiInstance = new HyperscaleObjectsApi(defaultClient);
    String hyperscaleConnectorId = "hyperscaleConnectorId_example"; // String | The ID of the Hyperscale Connector.
    DeleteTag deleteTag = new DeleteTag(); // DeleteTag | The parameters to delete tags
    try {
      apiInstance.deleteHyperscaleConnectorTags(hyperscaleConnectorId, deleteTag);
    } catch (ApiException e) {
      System.err.println("Exception when calling HyperscaleObjectsApi#deleteHyperscaleConnectorTags");
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
 **hyperscaleConnectorId** | **String**| The ID of the Hyperscale Connector. |
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

<a name="deleteHyperscaleDatasetTags"></a>
# **deleteHyperscaleDatasetTags**
> deleteHyperscaleDatasetTags(hyperscaleDatasetId, deleteTag)

Delete tags for a Hyperscale Dataset.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.HyperscaleObjectsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    HyperscaleObjectsApi apiInstance = new HyperscaleObjectsApi(defaultClient);
    String hyperscaleDatasetId = "hyperscaleDatasetId_example"; // String | The ID of the Hyperscale Dataset.
    DeleteTag deleteTag = new DeleteTag(); // DeleteTag | The parameters to delete tags
    try {
      apiInstance.deleteHyperscaleDatasetTags(hyperscaleDatasetId, deleteTag);
    } catch (ApiException e) {
      System.err.println("Exception when calling HyperscaleObjectsApi#deleteHyperscaleDatasetTags");
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
 **hyperscaleDatasetId** | **String**| The ID of the Hyperscale Dataset. |
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

<a name="deleteHyperscaleMountPoint"></a>
# **deleteHyperscaleMountPoint**
> DeleteHyperscaleMountPointResponse deleteHyperscaleMountPoint(hyperscaleMountPointId)

Delete a Hyperscale Mount Point.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.HyperscaleObjectsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    HyperscaleObjectsApi apiInstance = new HyperscaleObjectsApi(defaultClient);
    String hyperscaleMountPointId = "hyperscaleMountPointId_example"; // String | The ID of the Hyperscale Mount Point.
    try {
      DeleteHyperscaleMountPointResponse result = apiInstance.deleteHyperscaleMountPoint(hyperscaleMountPointId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling HyperscaleObjectsApi#deleteHyperscaleMountPoint");
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
 **hyperscaleMountPointId** | **String**| The ID of the Hyperscale Mount Point. |

### Return type

[**DeleteHyperscaleMountPointResponse**](DeleteHyperscaleMountPointResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="getHyperscaleConnectorById"></a>
# **getHyperscaleConnectorById**
> HyperscaleConnector getHyperscaleConnectorById(hyperscaleConnectorId)

Get a Hyperscale Connector.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.HyperscaleObjectsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    HyperscaleObjectsApi apiInstance = new HyperscaleObjectsApi(defaultClient);
    String hyperscaleConnectorId = "hyperscaleConnectorId_example"; // String | The ID of the Hyperscale Connector.
    try {
      HyperscaleConnector result = apiInstance.getHyperscaleConnectorById(hyperscaleConnectorId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling HyperscaleObjectsApi#getHyperscaleConnectorById");
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
 **hyperscaleConnectorId** | **String**| The ID of the Hyperscale Connector. |

### Return type

[**HyperscaleConnector**](HyperscaleConnector.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="getHyperscaleConnectorTags"></a>
# **getHyperscaleConnectorTags**
> TagsResponse getHyperscaleConnectorTags(hyperscaleConnectorId)

Get tags for a Hyperscale Connector.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.HyperscaleObjectsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    HyperscaleObjectsApi apiInstance = new HyperscaleObjectsApi(defaultClient);
    String hyperscaleConnectorId = "hyperscaleConnectorId_example"; // String | The ID of the Hyperscale Connector.
    try {
      TagsResponse result = apiInstance.getHyperscaleConnectorTags(hyperscaleConnectorId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling HyperscaleObjectsApi#getHyperscaleConnectorTags");
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
 **hyperscaleConnectorId** | **String**| The ID of the Hyperscale Connector. |

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

<a name="getHyperscaleConnectors"></a>
# **getHyperscaleConnectors**
> ListHyperscaleConnectorsResponse getHyperscaleConnectors(limit, cursor, sort)

Returns a list of Hyperscale Connectors.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.HyperscaleObjectsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    HyperscaleObjectsApi apiInstance = new HyperscaleObjectsApi(defaultClient);
    Integer limit = 100; // Integer | Maximum number of objects to return per query. The value must be between 1 and 1000. Default is 100.
    String cursor = "cursor_example"; // String | Cursor to fetch the next or previous page of results. The value of this property must be extracted from the 'prev_cursor' or 'next_cursor' property of a PaginatedResponseMetadata which is contained in the response of list and search API endpoints.
    String sort = "source_username"; // String | The field to sort results by. A property name with a prepended '-' signifies descending order.
    try {
      ListHyperscaleConnectorsResponse result = apiInstance.getHyperscaleConnectors(limit, cursor, sort);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling HyperscaleObjectsApi#getHyperscaleConnectors");
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
 **sort** | **String**| The field to sort results by. A property name with a prepended &#39;-&#39; signifies descending order. | [optional] [enum: id, -id, name, -name, hyperscale_instance_id, -hyperscale_instance_id, data_type, -data_type, source_username, -source_username, source_jdbc_url, -source_jdbc_url, source_mongo_url, -source_mongo_url, target_username, -target_username, target_jdbc_url, -target_jdbc_url, target_mongo_url, -target_mongo_url]

### Return type

[**ListHyperscaleConnectorsResponse**](ListHyperscaleConnectorsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="getHyperscaleDatasetById"></a>
# **getHyperscaleDatasetById**
> HyperscaleDataset getHyperscaleDatasetById(hyperscaleDatasetId)

Get a Hyperscale Dataset.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.HyperscaleObjectsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    HyperscaleObjectsApi apiInstance = new HyperscaleObjectsApi(defaultClient);
    String hyperscaleDatasetId = "hyperscaleDatasetId_example"; // String | The ID of the Hyperscale Dataset.
    try {
      HyperscaleDataset result = apiInstance.getHyperscaleDatasetById(hyperscaleDatasetId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling HyperscaleObjectsApi#getHyperscaleDatasetById");
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
 **hyperscaleDatasetId** | **String**| The ID of the Hyperscale Dataset. |

### Return type

[**HyperscaleDataset**](HyperscaleDataset.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="getHyperscaleDatasetTableOrFileById"></a>
# **getHyperscaleDatasetTableOrFileById**
> HyperscaleDatasetTableOrFile getHyperscaleDatasetTableOrFileById(hyperscaleDatasetId, hyperscaleDatasetTableOrFileId)

Get a Hyperscale Dataset table or file by ID.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.HyperscaleObjectsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    HyperscaleObjectsApi apiInstance = new HyperscaleObjectsApi(defaultClient);
    String hyperscaleDatasetId = "hyperscaleDatasetId_example"; // String | The ID of the Hyperscale Dataset.
    String hyperscaleDatasetTableOrFileId = "hyperscaleDatasetTableOrFileId_example"; // String | The ID of the Hyperscale Dataset table or file.
    try {
      HyperscaleDatasetTableOrFile result = apiInstance.getHyperscaleDatasetTableOrFileById(hyperscaleDatasetId, hyperscaleDatasetTableOrFileId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling HyperscaleObjectsApi#getHyperscaleDatasetTableOrFileById");
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
 **hyperscaleDatasetId** | **String**| The ID of the Hyperscale Dataset. |
 **hyperscaleDatasetTableOrFileId** | **String**| The ID of the Hyperscale Dataset table or file. |

### Return type

[**HyperscaleDatasetTableOrFile**](HyperscaleDatasetTableOrFile.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="getHyperscaleDatasetTablesOrFiles"></a>
# **getHyperscaleDatasetTablesOrFiles**
> ListHyperscaleDatasetTablesOrFilesResponse getHyperscaleDatasetTablesOrFiles(hyperscaleDatasetId, limit, cursor, sort)

Get the tables or files of a hyperscale dataset

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.HyperscaleObjectsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    HyperscaleObjectsApi apiInstance = new HyperscaleObjectsApi(defaultClient);
    String hyperscaleDatasetId = "hyperscaleDatasetId_example"; // String | The ID of the Hyperscale Dataset.
    Integer limit = 100; // Integer | Maximum number of objects to return per query. The value must be between 1 and 1000. Default is 100.
    String cursor = "cursor_example"; // String | Cursor to fetch the next or previous page of results. The value of this property must be extracted from the 'prev_cursor' or 'next_cursor' property of a PaginatedResponseMetadata which is contained in the response of list and search API endpoints.
    String sort = "table_name"; // String | The field to sort results by. A property name with a prepended '-' signifies descending order.
    try {
      ListHyperscaleDatasetTablesOrFilesResponse result = apiInstance.getHyperscaleDatasetTablesOrFiles(hyperscaleDatasetId, limit, cursor, sort);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling HyperscaleObjectsApi#getHyperscaleDatasetTablesOrFiles");
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
 **hyperscaleDatasetId** | **String**| The ID of the Hyperscale Dataset. |
 **limit** | **Integer**| Maximum number of objects to return per query. The value must be between 1 and 1000. Default is 100. | [optional] [default to 100]
 **cursor** | **String**| Cursor to fetch the next or previous page of results. The value of this property must be extracted from the &#39;prev_cursor&#39; or &#39;next_cursor&#39; property of a PaginatedResponseMetadata which is contained in the response of list and search API endpoints. | [optional]
 **sort** | **String**| The field to sort results by. A property name with a prepended &#39;-&#39; signifies descending order. | [optional] [enum: id, -id, schema_name, -schema_name, table_name, -table_name, database_name, -database_name, collection_name, -collection_name, filter_key, -filter_key, column_array_rows, -column_array_rows, unload_split, -unload_split, stream_size, -stream_size]

### Return type

[**ListHyperscaleDatasetTablesOrFilesResponse**](ListHyperscaleDatasetTablesOrFilesResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="getHyperscaleDatasetTags"></a>
# **getHyperscaleDatasetTags**
> TagsResponse getHyperscaleDatasetTags(hyperscaleDatasetId)

Get tags for a Hyperscale Dataset.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.HyperscaleObjectsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    HyperscaleObjectsApi apiInstance = new HyperscaleObjectsApi(defaultClient);
    String hyperscaleDatasetId = "hyperscaleDatasetId_example"; // String | The ID of the Hyperscale Dataset.
    try {
      TagsResponse result = apiInstance.getHyperscaleDatasetTags(hyperscaleDatasetId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling HyperscaleObjectsApi#getHyperscaleDatasetTags");
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
 **hyperscaleDatasetId** | **String**| The ID of the Hyperscale Dataset. |

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

<a name="getHyperscaleDatasets"></a>
# **getHyperscaleDatasets**
> ListHyperscaleDatasetsResponse getHyperscaleDatasets(limit, cursor, sort)

Returns a list of Hyperscale Datasets.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.HyperscaleObjectsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    HyperscaleObjectsApi apiInstance = new HyperscaleObjectsApi(defaultClient);
    Integer limit = 100; // Integer | Maximum number of objects to return per query. The value must be between 1 and 1000. Default is 100.
    String cursor = "cursor_example"; // String | Cursor to fetch the next or previous page of results. The value of this property must be extracted from the 'prev_cursor' or 'next_cursor' property of a PaginatedResponseMetadata which is contained in the response of list and search API endpoints.
    String sort = "id"; // String | The field to sort results by. A property name with a prepended '-' signifies descending order.
    try {
      ListHyperscaleDatasetsResponse result = apiInstance.getHyperscaleDatasets(limit, cursor, sort);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling HyperscaleObjectsApi#getHyperscaleDatasets");
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
 **sort** | **String**| The field to sort results by. A property name with a prepended &#39;-&#39; signifies descending order. | [optional] [enum: id, -id, hyperscale_instance_id, -hyperscale_instance_id, data_type, -data_type, connector_id, -connector_id, mount_point_id, -mount_point_id]

### Return type

[**ListHyperscaleDatasetsResponse**](ListHyperscaleDatasetsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="getHyperscaleMountPointById"></a>
# **getHyperscaleMountPointById**
> HyperscaleMountPoint getHyperscaleMountPointById(hyperscaleMountPointId)

Get a Hyperscale Mount Points.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.HyperscaleObjectsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    HyperscaleObjectsApi apiInstance = new HyperscaleObjectsApi(defaultClient);
    String hyperscaleMountPointId = "hyperscaleMountPointId_example"; // String | The ID of the Hyperscale Mount Point.
    try {
      HyperscaleMountPoint result = apiInstance.getHyperscaleMountPointById(hyperscaleMountPointId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling HyperscaleObjectsApi#getHyperscaleMountPointById");
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
 **hyperscaleMountPointId** | **String**| The ID of the Hyperscale Mount Point. |

### Return type

[**HyperscaleMountPoint**](HyperscaleMountPoint.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="getHyperscaleMountPoints"></a>
# **getHyperscaleMountPoints**
> ListHyperscaleMountPointsResponse getHyperscaleMountPoints(limit, cursor, sort)

Returns a list of Hyperscale Mount Points.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.HyperscaleObjectsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    HyperscaleObjectsApi apiInstance = new HyperscaleObjectsApi(defaultClient);
    Integer limit = 100; // Integer | Maximum number of objects to return per query. The value must be between 1 and 1000. Default is 100.
    String cursor = "cursor_example"; // String | Cursor to fetch the next or previous page of results. The value of this property must be extracted from the 'prev_cursor' or 'next_cursor' property of a PaginatedResponseMetadata which is contained in the response of list and search API endpoints.
    String sort = "name"; // String | The field to sort results by. A property name with a prepended '-' signifies descending order.
    try {
      ListHyperscaleMountPointsResponse result = apiInstance.getHyperscaleMountPoints(limit, cursor, sort);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling HyperscaleObjectsApi#getHyperscaleMountPoints");
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
 **sort** | **String**| The field to sort results by. A property name with a prepended &#39;-&#39; signifies descending order. | [optional] [enum: id, -id, name, -name, hostname, -hostname, mount_type, -mount_type, options, -options, mount_path, -mount_path, hyperscale_instance_id, -hyperscale_instance_id]

### Return type

[**ListHyperscaleMountPointsResponse**](ListHyperscaleMountPointsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="searchHyperscaleConnectors"></a>
# **searchHyperscaleConnectors**
> SearchHyperscaleConnectorsResponse searchHyperscaleConnectors(limit, cursor, sort, searchBody)

Search for Hyperscale Connectors.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.HyperscaleObjectsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    HyperscaleObjectsApi apiInstance = new HyperscaleObjectsApi(defaultClient);
    Integer limit = 100; // Integer | Maximum number of objects to return per query. The value must be between 1 and 1000. Default is 100.
    String cursor = "cursor_example"; // String | Cursor to fetch the next or previous page of results. The value of this property must be extracted from the 'prev_cursor' or 'next_cursor' property of a PaginatedResponseMetadata which is contained in the response of list and search API endpoints.
    String sort = "source_username"; // String | The field to sort results by. A property name with a prepended '-' signifies descending order.
    SearchBody searchBody = new SearchBody(); // SearchBody | A request body containing a filter expression. This enables searching for items matching arbitrarily complex conditions. The list of attributes which can be used in filter expressions is available in the x-filterable vendor extension.  # Filter Expression Overview **Note: All keywords are case-insensitive**  ## Comparison Operators | Operator | Description | Example | | --- | --- | --- | | CONTAINS | Substring or membership testing for string and list attributes respectively. | field3 CONTAINS 'foobar', field4 CONTAINS TRUE  | | IN | Tests if field is a member of a list literal. List can contain a maximum of 100 values | field2 IN ['Goku', 'Vegeta'] | | GE | Tests if a field is greater than or equal to a literal value | field1 GE 1.2e-2 | | GT | Tests if a field is greater than a literal value | field1 GT 1.2e-2 | | LE | Tests if a field is less than or equal to a literal value | field1 LE 9000 | | LT | Tests if a field is less than a literal value | field1 LT 9.02 | | NE | Tests if a field is not equal to a literal value | field1 NE 42 | | EQ | Tests if a field is equal to a literal value | field1 EQ 42 |  ## Search Operator The SEARCH operator filters for items which have any filterable attribute that contains the input string as a substring, comparison is done case-insensitively. This is not restricted to attributes with string values. Specifically `SEARCH '12'` would match an item with an attribute with an integer value of `123`.  ## Logical Operators Ordered by precedence. | Operator | Description | Example | | --- | --- | --- | | NOT | Logical NOT (Right associative) | NOT field1 LE 9000 | | AND | Logical AND (Left Associative) | field1 GT 9000 AND field2 EQ 'Goku' | | OR | Logical OR (Left Associative) | field1 GT 9000 OR field2 EQ 'Goku' |  ## Grouping Parenthesis `()` can be used to override operator precedence.  For example: NOT (field1 LT 1234 AND field2 CONTAINS 'foo')  ## Literal Values | Literal      | Description | Examples | | --- | --- | --- | | Nil | Represents the absence of a value | nil, Nil, nIl, NIL | | Boolean | true/false boolean | true, false, True, False, TRUE, FALSE | | Number | Signed integer and floating point numbers. Also supports scientific notation. | 0, 1, -1, 1.2, 0.35, 1.2e-2, -1.2e+2 | | String | Single or double quoted | \"foo\", \"bar\", \"foo bar\", 'foo', 'bar', 'foo bar' | | Datetime | Formatted according to [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339) | 2018-04-27T18:39:26.397237+00:00 | | List | Comma-separated literals wrapped in square brackets | [0], [0, 1], ['foo', \"bar\"] |  ## Limitations - A maximum of 8 unique identifiers may be used inside a filter expression. 
    try {
      SearchHyperscaleConnectorsResponse result = apiInstance.searchHyperscaleConnectors(limit, cursor, sort, searchBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling HyperscaleObjectsApi#searchHyperscaleConnectors");
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
 **sort** | **String**| The field to sort results by. A property name with a prepended &#39;-&#39; signifies descending order. | [optional] [enum: id, -id, name, -name, hyperscale_instance_id, -hyperscale_instance_id, data_type, -data_type, source_username, -source_username, source_jdbc_url, -source_jdbc_url, source_mongo_url, -source_mongo_url, target_username, -target_username, target_jdbc_url, -target_jdbc_url, target_mongo_url, -target_mongo_url]
 **searchBody** | [**SearchBody**](SearchBody.md)| A request body containing a filter expression. This enables searching for items matching arbitrarily complex conditions. The list of attributes which can be used in filter expressions is available in the x-filterable vendor extension.  # Filter Expression Overview **Note: All keywords are case-insensitive**  ## Comparison Operators | Operator | Description | Example | | --- | --- | --- | | CONTAINS | Substring or membership testing for string and list attributes respectively. | field3 CONTAINS &#39;foobar&#39;, field4 CONTAINS TRUE  | | IN | Tests if field is a member of a list literal. List can contain a maximum of 100 values | field2 IN [&#39;Goku&#39;, &#39;Vegeta&#39;] | | GE | Tests if a field is greater than or equal to a literal value | field1 GE 1.2e-2 | | GT | Tests if a field is greater than a literal value | field1 GT 1.2e-2 | | LE | Tests if a field is less than or equal to a literal value | field1 LE 9000 | | LT | Tests if a field is less than a literal value | field1 LT 9.02 | | NE | Tests if a field is not equal to a literal value | field1 NE 42 | | EQ | Tests if a field is equal to a literal value | field1 EQ 42 |  ## Search Operator The SEARCH operator filters for items which have any filterable attribute that contains the input string as a substring, comparison is done case-insensitively. This is not restricted to attributes with string values. Specifically &#x60;SEARCH &#39;12&#39;&#x60; would match an item with an attribute with an integer value of &#x60;123&#x60;.  ## Logical Operators Ordered by precedence. | Operator | Description | Example | | --- | --- | --- | | NOT | Logical NOT (Right associative) | NOT field1 LE 9000 | | AND | Logical AND (Left Associative) | field1 GT 9000 AND field2 EQ &#39;Goku&#39; | | OR | Logical OR (Left Associative) | field1 GT 9000 OR field2 EQ &#39;Goku&#39; |  ## Grouping Parenthesis &#x60;()&#x60; can be used to override operator precedence.  For example: NOT (field1 LT 1234 AND field2 CONTAINS &#39;foo&#39;)  ## Literal Values | Literal      | Description | Examples | | --- | --- | --- | | Nil | Represents the absence of a value | nil, Nil, nIl, NIL | | Boolean | true/false boolean | true, false, True, False, TRUE, FALSE | | Number | Signed integer and floating point numbers. Also supports scientific notation. | 0, 1, -1, 1.2, 0.35, 1.2e-2, -1.2e+2 | | String | Single or double quoted | \&quot;foo\&quot;, \&quot;bar\&quot;, \&quot;foo bar\&quot;, &#39;foo&#39;, &#39;bar&#39;, &#39;foo bar&#39; | | Datetime | Formatted according to [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339) | 2018-04-27T18:39:26.397237+00:00 | | List | Comma-separated literals wrapped in square brackets | [0], [0, 1], [&#39;foo&#39;, \&quot;bar\&quot;] |  ## Limitations - A maximum of 8 unique identifiers may be used inside a filter expression.  | [optional]

### Return type

[**SearchHyperscaleConnectorsResponse**](SearchHyperscaleConnectorsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="searchHyperscaleDatasetTablesOrFiles"></a>
# **searchHyperscaleDatasetTablesOrFiles**
> SearchHyperscaleDatasetTablesOrFilesResponse searchHyperscaleDatasetTablesOrFiles(hyperscaleDatasetId, limit, cursor, sort, searchBody)

Search the tables or files of a hyperscale dataset

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.HyperscaleObjectsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    HyperscaleObjectsApi apiInstance = new HyperscaleObjectsApi(defaultClient);
    String hyperscaleDatasetId = "hyperscaleDatasetId_example"; // String | The ID of the Hyperscale Dataset.
    Integer limit = 100; // Integer | Maximum number of objects to return per query. The value must be between 1 and 1000. Default is 100.
    String cursor = "cursor_example"; // String | Cursor to fetch the next or previous page of results. The value of this property must be extracted from the 'prev_cursor' or 'next_cursor' property of a PaginatedResponseMetadata which is contained in the response of list and search API endpoints.
    String sort = "table_name"; // String | The field to sort results by. A property name with a prepended '-' signifies descending order.
    SearchBody searchBody = new SearchBody(); // SearchBody | A request body containing a filter expression. This enables searching for items matching arbitrarily complex conditions. The list of attributes which can be used in filter expressions is available in the x-filterable vendor extension.  # Filter Expression Overview **Note: All keywords are case-insensitive**  ## Comparison Operators | Operator | Description | Example | | --- | --- | --- | | CONTAINS | Substring or membership testing for string and list attributes respectively. | field3 CONTAINS 'foobar', field4 CONTAINS TRUE  | | IN | Tests if field is a member of a list literal. List can contain a maximum of 100 values | field2 IN ['Goku', 'Vegeta'] | | GE | Tests if a field is greater than or equal to a literal value | field1 GE 1.2e-2 | | GT | Tests if a field is greater than a literal value | field1 GT 1.2e-2 | | LE | Tests if a field is less than or equal to a literal value | field1 LE 9000 | | LT | Tests if a field is less than a literal value | field1 LT 9.02 | | NE | Tests if a field is not equal to a literal value | field1 NE 42 | | EQ | Tests if a field is equal to a literal value | field1 EQ 42 |  ## Search Operator The SEARCH operator filters for items which have any filterable attribute that contains the input string as a substring, comparison is done case-insensitively. This is not restricted to attributes with string values. Specifically `SEARCH '12'` would match an item with an attribute with an integer value of `123`.  ## Logical Operators Ordered by precedence. | Operator | Description | Example | | --- | --- | --- | | NOT | Logical NOT (Right associative) | NOT field1 LE 9000 | | AND | Logical AND (Left Associative) | field1 GT 9000 AND field2 EQ 'Goku' | | OR | Logical OR (Left Associative) | field1 GT 9000 OR field2 EQ 'Goku' |  ## Grouping Parenthesis `()` can be used to override operator precedence.  For example: NOT (field1 LT 1234 AND field2 CONTAINS 'foo')  ## Literal Values | Literal      | Description | Examples | | --- | --- | --- | | Nil | Represents the absence of a value | nil, Nil, nIl, NIL | | Boolean | true/false boolean | true, false, True, False, TRUE, FALSE | | Number | Signed integer and floating point numbers. Also supports scientific notation. | 0, 1, -1, 1.2, 0.35, 1.2e-2, -1.2e+2 | | String | Single or double quoted | \"foo\", \"bar\", \"foo bar\", 'foo', 'bar', 'foo bar' | | Datetime | Formatted according to [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339) | 2018-04-27T18:39:26.397237+00:00 | | List | Comma-separated literals wrapped in square brackets | [0], [0, 1], ['foo', \"bar\"] |  ## Limitations - A maximum of 8 unique identifiers may be used inside a filter expression. 
    try {
      SearchHyperscaleDatasetTablesOrFilesResponse result = apiInstance.searchHyperscaleDatasetTablesOrFiles(hyperscaleDatasetId, limit, cursor, sort, searchBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling HyperscaleObjectsApi#searchHyperscaleDatasetTablesOrFiles");
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
 **hyperscaleDatasetId** | **String**| The ID of the Hyperscale Dataset. |
 **limit** | **Integer**| Maximum number of objects to return per query. The value must be between 1 and 1000. Default is 100. | [optional] [default to 100]
 **cursor** | **String**| Cursor to fetch the next or previous page of results. The value of this property must be extracted from the &#39;prev_cursor&#39; or &#39;next_cursor&#39; property of a PaginatedResponseMetadata which is contained in the response of list and search API endpoints. | [optional]
 **sort** | **String**| The field to sort results by. A property name with a prepended &#39;-&#39; signifies descending order. | [optional] [enum: id, -id, schema_name, -schema_name, table_name, -table_name, database_name, -database_name, collection_name, -collection_name, filter_key, -filter_key, column_array_rows, -column_array_rows, unload_split, -unload_split, stream_size, -stream_size]
 **searchBody** | [**SearchBody**](SearchBody.md)| A request body containing a filter expression. This enables searching for items matching arbitrarily complex conditions. The list of attributes which can be used in filter expressions is available in the x-filterable vendor extension.  # Filter Expression Overview **Note: All keywords are case-insensitive**  ## Comparison Operators | Operator | Description | Example | | --- | --- | --- | | CONTAINS | Substring or membership testing for string and list attributes respectively. | field3 CONTAINS &#39;foobar&#39;, field4 CONTAINS TRUE  | | IN | Tests if field is a member of a list literal. List can contain a maximum of 100 values | field2 IN [&#39;Goku&#39;, &#39;Vegeta&#39;] | | GE | Tests if a field is greater than or equal to a literal value | field1 GE 1.2e-2 | | GT | Tests if a field is greater than a literal value | field1 GT 1.2e-2 | | LE | Tests if a field is less than or equal to a literal value | field1 LE 9000 | | LT | Tests if a field is less than a literal value | field1 LT 9.02 | | NE | Tests if a field is not equal to a literal value | field1 NE 42 | | EQ | Tests if a field is equal to a literal value | field1 EQ 42 |  ## Search Operator The SEARCH operator filters for items which have any filterable attribute that contains the input string as a substring, comparison is done case-insensitively. This is not restricted to attributes with string values. Specifically &#x60;SEARCH &#39;12&#39;&#x60; would match an item with an attribute with an integer value of &#x60;123&#x60;.  ## Logical Operators Ordered by precedence. | Operator | Description | Example | | --- | --- | --- | | NOT | Logical NOT (Right associative) | NOT field1 LE 9000 | | AND | Logical AND (Left Associative) | field1 GT 9000 AND field2 EQ &#39;Goku&#39; | | OR | Logical OR (Left Associative) | field1 GT 9000 OR field2 EQ &#39;Goku&#39; |  ## Grouping Parenthesis &#x60;()&#x60; can be used to override operator precedence.  For example: NOT (field1 LT 1234 AND field2 CONTAINS &#39;foo&#39;)  ## Literal Values | Literal      | Description | Examples | | --- | --- | --- | | Nil | Represents the absence of a value | nil, Nil, nIl, NIL | | Boolean | true/false boolean | true, false, True, False, TRUE, FALSE | | Number | Signed integer and floating point numbers. Also supports scientific notation. | 0, 1, -1, 1.2, 0.35, 1.2e-2, -1.2e+2 | | String | Single or double quoted | \&quot;foo\&quot;, \&quot;bar\&quot;, \&quot;foo bar\&quot;, &#39;foo&#39;, &#39;bar&#39;, &#39;foo bar&#39; | | Datetime | Formatted according to [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339) | 2018-04-27T18:39:26.397237+00:00 | | List | Comma-separated literals wrapped in square brackets | [0], [0, 1], [&#39;foo&#39;, \&quot;bar\&quot;] |  ## Limitations - A maximum of 8 unique identifiers may be used inside a filter expression.  | [optional]

### Return type

[**SearchHyperscaleDatasetTablesOrFilesResponse**](SearchHyperscaleDatasetTablesOrFilesResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="searchHyperscaleDatasets"></a>
# **searchHyperscaleDatasets**
> SearchHyperscaleDatasetsResponse searchHyperscaleDatasets(limit, cursor, sort, searchBody)

Search for Hyperscale Datasets.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.HyperscaleObjectsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    HyperscaleObjectsApi apiInstance = new HyperscaleObjectsApi(defaultClient);
    Integer limit = 100; // Integer | Maximum number of objects to return per query. The value must be between 1 and 1000. Default is 100.
    String cursor = "cursor_example"; // String | Cursor to fetch the next or previous page of results. The value of this property must be extracted from the 'prev_cursor' or 'next_cursor' property of a PaginatedResponseMetadata which is contained in the response of list and search API endpoints.
    String sort = "id"; // String | The field to sort results by. A property name with a prepended '-' signifies descending order.
    SearchBody searchBody = new SearchBody(); // SearchBody | A request body containing a filter expression. This enables searching for items matching arbitrarily complex conditions. The list of attributes which can be used in filter expressions is available in the x-filterable vendor extension.  # Filter Expression Overview **Note: All keywords are case-insensitive**  ## Comparison Operators | Operator | Description | Example | | --- | --- | --- | | CONTAINS | Substring or membership testing for string and list attributes respectively. | field3 CONTAINS 'foobar', field4 CONTAINS TRUE  | | IN | Tests if field is a member of a list literal. List can contain a maximum of 100 values | field2 IN ['Goku', 'Vegeta'] | | GE | Tests if a field is greater than or equal to a literal value | field1 GE 1.2e-2 | | GT | Tests if a field is greater than a literal value | field1 GT 1.2e-2 | | LE | Tests if a field is less than or equal to a literal value | field1 LE 9000 | | LT | Tests if a field is less than a literal value | field1 LT 9.02 | | NE | Tests if a field is not equal to a literal value | field1 NE 42 | | EQ | Tests if a field is equal to a literal value | field1 EQ 42 |  ## Search Operator The SEARCH operator filters for items which have any filterable attribute that contains the input string as a substring, comparison is done case-insensitively. This is not restricted to attributes with string values. Specifically `SEARCH '12'` would match an item with an attribute with an integer value of `123`.  ## Logical Operators Ordered by precedence. | Operator | Description | Example | | --- | --- | --- | | NOT | Logical NOT (Right associative) | NOT field1 LE 9000 | | AND | Logical AND (Left Associative) | field1 GT 9000 AND field2 EQ 'Goku' | | OR | Logical OR (Left Associative) | field1 GT 9000 OR field2 EQ 'Goku' |  ## Grouping Parenthesis `()` can be used to override operator precedence.  For example: NOT (field1 LT 1234 AND field2 CONTAINS 'foo')  ## Literal Values | Literal      | Description | Examples | | --- | --- | --- | | Nil | Represents the absence of a value | nil, Nil, nIl, NIL | | Boolean | true/false boolean | true, false, True, False, TRUE, FALSE | | Number | Signed integer and floating point numbers. Also supports scientific notation. | 0, 1, -1, 1.2, 0.35, 1.2e-2, -1.2e+2 | | String | Single or double quoted | \"foo\", \"bar\", \"foo bar\", 'foo', 'bar', 'foo bar' | | Datetime | Formatted according to [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339) | 2018-04-27T18:39:26.397237+00:00 | | List | Comma-separated literals wrapped in square brackets | [0], [0, 1], ['foo', \"bar\"] |  ## Limitations - A maximum of 8 unique identifiers may be used inside a filter expression. 
    try {
      SearchHyperscaleDatasetsResponse result = apiInstance.searchHyperscaleDatasets(limit, cursor, sort, searchBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling HyperscaleObjectsApi#searchHyperscaleDatasets");
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
 **sort** | **String**| The field to sort results by. A property name with a prepended &#39;-&#39; signifies descending order. | [optional] [enum: id, -id, hyperscale_instance_id, -hyperscale_instance_id, data_type, -data_type, connector_id, -connector_id, mount_point_id, -mount_point_id]
 **searchBody** | [**SearchBody**](SearchBody.md)| A request body containing a filter expression. This enables searching for items matching arbitrarily complex conditions. The list of attributes which can be used in filter expressions is available in the x-filterable vendor extension.  # Filter Expression Overview **Note: All keywords are case-insensitive**  ## Comparison Operators | Operator | Description | Example | | --- | --- | --- | | CONTAINS | Substring or membership testing for string and list attributes respectively. | field3 CONTAINS &#39;foobar&#39;, field4 CONTAINS TRUE  | | IN | Tests if field is a member of a list literal. List can contain a maximum of 100 values | field2 IN [&#39;Goku&#39;, &#39;Vegeta&#39;] | | GE | Tests if a field is greater than or equal to a literal value | field1 GE 1.2e-2 | | GT | Tests if a field is greater than a literal value | field1 GT 1.2e-2 | | LE | Tests if a field is less than or equal to a literal value | field1 LE 9000 | | LT | Tests if a field is less than a literal value | field1 LT 9.02 | | NE | Tests if a field is not equal to a literal value | field1 NE 42 | | EQ | Tests if a field is equal to a literal value | field1 EQ 42 |  ## Search Operator The SEARCH operator filters for items which have any filterable attribute that contains the input string as a substring, comparison is done case-insensitively. This is not restricted to attributes with string values. Specifically &#x60;SEARCH &#39;12&#39;&#x60; would match an item with an attribute with an integer value of &#x60;123&#x60;.  ## Logical Operators Ordered by precedence. | Operator | Description | Example | | --- | --- | --- | | NOT | Logical NOT (Right associative) | NOT field1 LE 9000 | | AND | Logical AND (Left Associative) | field1 GT 9000 AND field2 EQ &#39;Goku&#39; | | OR | Logical OR (Left Associative) | field1 GT 9000 OR field2 EQ &#39;Goku&#39; |  ## Grouping Parenthesis &#x60;()&#x60; can be used to override operator precedence.  For example: NOT (field1 LT 1234 AND field2 CONTAINS &#39;foo&#39;)  ## Literal Values | Literal      | Description | Examples | | --- | --- | --- | | Nil | Represents the absence of a value | nil, Nil, nIl, NIL | | Boolean | true/false boolean | true, false, True, False, TRUE, FALSE | | Number | Signed integer and floating point numbers. Also supports scientific notation. | 0, 1, -1, 1.2, 0.35, 1.2e-2, -1.2e+2 | | String | Single or double quoted | \&quot;foo\&quot;, \&quot;bar\&quot;, \&quot;foo bar\&quot;, &#39;foo&#39;, &#39;bar&#39;, &#39;foo bar&#39; | | Datetime | Formatted according to [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339) | 2018-04-27T18:39:26.397237+00:00 | | List | Comma-separated literals wrapped in square brackets | [0], [0, 1], [&#39;foo&#39;, \&quot;bar\&quot;] |  ## Limitations - A maximum of 8 unique identifiers may be used inside a filter expression.  | [optional]

### Return type

[**SearchHyperscaleDatasetsResponse**](SearchHyperscaleDatasetsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="searchHyperscaleMountPoints"></a>
# **searchHyperscaleMountPoints**
> SearchHyperscaleMountPointsResponse searchHyperscaleMountPoints(limit, cursor, sort, searchBody)

Search for Hyperscale Mount Points.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.HyperscaleObjectsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    HyperscaleObjectsApi apiInstance = new HyperscaleObjectsApi(defaultClient);
    Integer limit = 100; // Integer | Maximum number of objects to return per query. The value must be between 1 and 1000. Default is 100.
    String cursor = "cursor_example"; // String | Cursor to fetch the next or previous page of results. The value of this property must be extracted from the 'prev_cursor' or 'next_cursor' property of a PaginatedResponseMetadata which is contained in the response of list and search API endpoints.
    String sort = "name"; // String | The field to sort results by. A property name with a prepended '-' signifies descending order.
    SearchBody searchBody = new SearchBody(); // SearchBody | A request body containing a filter expression. This enables searching for items matching arbitrarily complex conditions. The list of attributes which can be used in filter expressions is available in the x-filterable vendor extension.  # Filter Expression Overview **Note: All keywords are case-insensitive**  ## Comparison Operators | Operator | Description | Example | | --- | --- | --- | | CONTAINS | Substring or membership testing for string and list attributes respectively. | field3 CONTAINS 'foobar', field4 CONTAINS TRUE  | | IN | Tests if field is a member of a list literal. List can contain a maximum of 100 values | field2 IN ['Goku', 'Vegeta'] | | GE | Tests if a field is greater than or equal to a literal value | field1 GE 1.2e-2 | | GT | Tests if a field is greater than a literal value | field1 GT 1.2e-2 | | LE | Tests if a field is less than or equal to a literal value | field1 LE 9000 | | LT | Tests if a field is less than a literal value | field1 LT 9.02 | | NE | Tests if a field is not equal to a literal value | field1 NE 42 | | EQ | Tests if a field is equal to a literal value | field1 EQ 42 |  ## Search Operator The SEARCH operator filters for items which have any filterable attribute that contains the input string as a substring, comparison is done case-insensitively. This is not restricted to attributes with string values. Specifically `SEARCH '12'` would match an item with an attribute with an integer value of `123`.  ## Logical Operators Ordered by precedence. | Operator | Description | Example | | --- | --- | --- | | NOT | Logical NOT (Right associative) | NOT field1 LE 9000 | | AND | Logical AND (Left Associative) | field1 GT 9000 AND field2 EQ 'Goku' | | OR | Logical OR (Left Associative) | field1 GT 9000 OR field2 EQ 'Goku' |  ## Grouping Parenthesis `()` can be used to override operator precedence.  For example: NOT (field1 LT 1234 AND field2 CONTAINS 'foo')  ## Literal Values | Literal      | Description | Examples | | --- | --- | --- | | Nil | Represents the absence of a value | nil, Nil, nIl, NIL | | Boolean | true/false boolean | true, false, True, False, TRUE, FALSE | | Number | Signed integer and floating point numbers. Also supports scientific notation. | 0, 1, -1, 1.2, 0.35, 1.2e-2, -1.2e+2 | | String | Single or double quoted | \"foo\", \"bar\", \"foo bar\", 'foo', 'bar', 'foo bar' | | Datetime | Formatted according to [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339) | 2018-04-27T18:39:26.397237+00:00 | | List | Comma-separated literals wrapped in square brackets | [0], [0, 1], ['foo', \"bar\"] |  ## Limitations - A maximum of 8 unique identifiers may be used inside a filter expression. 
    try {
      SearchHyperscaleMountPointsResponse result = apiInstance.searchHyperscaleMountPoints(limit, cursor, sort, searchBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling HyperscaleObjectsApi#searchHyperscaleMountPoints");
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
 **sort** | **String**| The field to sort results by. A property name with a prepended &#39;-&#39; signifies descending order. | [optional] [enum: id, -id, name, -name, hostname, -hostname, mount_type, -mount_type, options, -options, mount_path, -mount_path, hyperscale_instance_id, -hyperscale_instance_id]
 **searchBody** | [**SearchBody**](SearchBody.md)| A request body containing a filter expression. This enables searching for items matching arbitrarily complex conditions. The list of attributes which can be used in filter expressions is available in the x-filterable vendor extension.  # Filter Expression Overview **Note: All keywords are case-insensitive**  ## Comparison Operators | Operator | Description | Example | | --- | --- | --- | | CONTAINS | Substring or membership testing for string and list attributes respectively. | field3 CONTAINS &#39;foobar&#39;, field4 CONTAINS TRUE  | | IN | Tests if field is a member of a list literal. List can contain a maximum of 100 values | field2 IN [&#39;Goku&#39;, &#39;Vegeta&#39;] | | GE | Tests if a field is greater than or equal to a literal value | field1 GE 1.2e-2 | | GT | Tests if a field is greater than a literal value | field1 GT 1.2e-2 | | LE | Tests if a field is less than or equal to a literal value | field1 LE 9000 | | LT | Tests if a field is less than a literal value | field1 LT 9.02 | | NE | Tests if a field is not equal to a literal value | field1 NE 42 | | EQ | Tests if a field is equal to a literal value | field1 EQ 42 |  ## Search Operator The SEARCH operator filters for items which have any filterable attribute that contains the input string as a substring, comparison is done case-insensitively. This is not restricted to attributes with string values. Specifically &#x60;SEARCH &#39;12&#39;&#x60; would match an item with an attribute with an integer value of &#x60;123&#x60;.  ## Logical Operators Ordered by precedence. | Operator | Description | Example | | --- | --- | --- | | NOT | Logical NOT (Right associative) | NOT field1 LE 9000 | | AND | Logical AND (Left Associative) | field1 GT 9000 AND field2 EQ &#39;Goku&#39; | | OR | Logical OR (Left Associative) | field1 GT 9000 OR field2 EQ &#39;Goku&#39; |  ## Grouping Parenthesis &#x60;()&#x60; can be used to override operator precedence.  For example: NOT (field1 LT 1234 AND field2 CONTAINS &#39;foo&#39;)  ## Literal Values | Literal      | Description | Examples | | --- | --- | --- | | Nil | Represents the absence of a value | nil, Nil, nIl, NIL | | Boolean | true/false boolean | true, false, True, False, TRUE, FALSE | | Number | Signed integer and floating point numbers. Also supports scientific notation. | 0, 1, -1, 1.2, 0.35, 1.2e-2, -1.2e+2 | | String | Single or double quoted | \&quot;foo\&quot;, \&quot;bar\&quot;, \&quot;foo bar\&quot;, &#39;foo&#39;, &#39;bar&#39;, &#39;foo bar&#39; | | Datetime | Formatted according to [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339) | 2018-04-27T18:39:26.397237+00:00 | | List | Comma-separated literals wrapped in square brackets | [0], [0, 1], [&#39;foo&#39;, \&quot;bar\&quot;] |  ## Limitations - A maximum of 8 unique identifiers may be used inside a filter expression.  | [optional]

### Return type

[**SearchHyperscaleMountPointsResponse**](SearchHyperscaleMountPointsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="updateHyperscaleConnectorById"></a>
# **updateHyperscaleConnectorById**
> UpdateHyperscaleConnectorResponse updateHyperscaleConnectorById(hyperscaleConnectorId, hyperscaleConnectorUpdateParameters)

Update a Hyperscale Connector by ID.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.HyperscaleObjectsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    HyperscaleObjectsApi apiInstance = new HyperscaleObjectsApi(defaultClient);
    String hyperscaleConnectorId = "hyperscaleConnectorId_example"; // String | The ID of the Hyperscale Connector.
    HyperscaleConnectorUpdateParameters hyperscaleConnectorUpdateParameters = new HyperscaleConnectorUpdateParameters(); // HyperscaleConnectorUpdateParameters | The new data to update a Hyperscale Connector.
    try {
      UpdateHyperscaleConnectorResponse result = apiInstance.updateHyperscaleConnectorById(hyperscaleConnectorId, hyperscaleConnectorUpdateParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling HyperscaleObjectsApi#updateHyperscaleConnectorById");
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
 **hyperscaleConnectorId** | **String**| The ID of the Hyperscale Connector. |
 **hyperscaleConnectorUpdateParameters** | [**HyperscaleConnectorUpdateParameters**](HyperscaleConnectorUpdateParameters.md)| The new data to update a Hyperscale Connector. | [optional]

### Return type

[**UpdateHyperscaleConnectorResponse**](UpdateHyperscaleConnectorResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="updateHyperscaleDatasetById"></a>
# **updateHyperscaleDatasetById**
> UpdateHyperscaleDatasetResponse updateHyperscaleDatasetById(hyperscaleDatasetId, hyperscaleDatasetUpdateParameters)

Update a Hyperscale Dataset by ID.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.HyperscaleObjectsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    HyperscaleObjectsApi apiInstance = new HyperscaleObjectsApi(defaultClient);
    String hyperscaleDatasetId = "hyperscaleDatasetId_example"; // String | The ID of the Hyperscale Dataset.
    HyperscaleDatasetUpdateParameters hyperscaleDatasetUpdateParameters = new HyperscaleDatasetUpdateParameters(); // HyperscaleDatasetUpdateParameters | The new data to update a Hyperscale Dataset.
    try {
      UpdateHyperscaleDatasetResponse result = apiInstance.updateHyperscaleDatasetById(hyperscaleDatasetId, hyperscaleDatasetUpdateParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling HyperscaleObjectsApi#updateHyperscaleDatasetById");
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
 **hyperscaleDatasetId** | **String**| The ID of the Hyperscale Dataset. |
 **hyperscaleDatasetUpdateParameters** | [**HyperscaleDatasetUpdateParameters**](HyperscaleDatasetUpdateParameters.md)| The new data to update a Hyperscale Dataset. | [optional]

### Return type

[**UpdateHyperscaleDatasetResponse**](UpdateHyperscaleDatasetResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="updateHyperscaleDatasetTableOrFileById"></a>
# **updateHyperscaleDatasetTableOrFileById**
> UpdateHyperscaleDatasetTableOrFileResponse updateHyperscaleDatasetTableOrFileById(hyperscaleDatasetId, hyperscaleDatasetTableOrFileId, hyperscaleDatasetTableOrFileUpdateParameters)

Update a Hyperscale Dataset table or file by ID.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.HyperscaleObjectsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    HyperscaleObjectsApi apiInstance = new HyperscaleObjectsApi(defaultClient);
    String hyperscaleDatasetId = "hyperscaleDatasetId_example"; // String | The ID of the Hyperscale Dataset.
    String hyperscaleDatasetTableOrFileId = "hyperscaleDatasetTableOrFileId_example"; // String | The ID of the Hyperscale Dataset table or file.
    HyperscaleDatasetTableOrFileUpdateParameters hyperscaleDatasetTableOrFileUpdateParameters = new HyperscaleDatasetTableOrFileUpdateParameters(); // HyperscaleDatasetTableOrFileUpdateParameters | The new data to update a Hyperscale Dataset table or file.
    try {
      UpdateHyperscaleDatasetTableOrFileResponse result = apiInstance.updateHyperscaleDatasetTableOrFileById(hyperscaleDatasetId, hyperscaleDatasetTableOrFileId, hyperscaleDatasetTableOrFileUpdateParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling HyperscaleObjectsApi#updateHyperscaleDatasetTableOrFileById");
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
 **hyperscaleDatasetId** | **String**| The ID of the Hyperscale Dataset. |
 **hyperscaleDatasetTableOrFileId** | **String**| The ID of the Hyperscale Dataset table or file. |
 **hyperscaleDatasetTableOrFileUpdateParameters** | [**HyperscaleDatasetTableOrFileUpdateParameters**](HyperscaleDatasetTableOrFileUpdateParameters.md)| The new data to update a Hyperscale Dataset table or file. | [optional]

### Return type

[**UpdateHyperscaleDatasetTableOrFileResponse**](UpdateHyperscaleDatasetTableOrFileResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="updateHyperscaleMountPointById"></a>
# **updateHyperscaleMountPointById**
> UpdateHyperscaleMountPointResponse updateHyperscaleMountPointById(hyperscaleMountPointId, hyperscaleMountPointUpdateParameters)

Update a Hyperscale Mount Point by ID.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.HyperscaleObjectsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    HyperscaleObjectsApi apiInstance = new HyperscaleObjectsApi(defaultClient);
    String hyperscaleMountPointId = "hyperscaleMountPointId_example"; // String | The ID of the Hyperscale Mount Point.
    HyperscaleMountPointUpdateParameters hyperscaleMountPointUpdateParameters = new HyperscaleMountPointUpdateParameters(); // HyperscaleMountPointUpdateParameters | The new data to update a Hyperscale Mount Point.
    try {
      UpdateHyperscaleMountPointResponse result = apiInstance.updateHyperscaleMountPointById(hyperscaleMountPointId, hyperscaleMountPointUpdateParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling HyperscaleObjectsApi#updateHyperscaleMountPointById");
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
 **hyperscaleMountPointId** | **String**| The ID of the Hyperscale Mount Point. |
 **hyperscaleMountPointUpdateParameters** | [**HyperscaleMountPointUpdateParameters**](HyperscaleMountPointUpdateParameters.md)| The new data to update a Hyperscale Mount Point. | [optional]

### Return type

[**UpdateHyperscaleMountPointResponse**](UpdateHyperscaleMountPointResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

