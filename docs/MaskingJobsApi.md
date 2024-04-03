# MaskingJobsApi

All URIs are relative to *http://localhost/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addEngineToMaskingJob**](MaskingJobsApi.md#addEngineToMaskingJob) | **POST** /masking-jobs/{maskingJobId}/add-engine | Add an engine to a Masking Job (Hyperscale Job only).
[**copyMaskingJob**](MaskingJobsApi.md#copyMaskingJob) | **POST** /masking-jobs/{maskingJobId}/copy | Copies the masking job to another engine.
[**createMaskingJob**](MaskingJobsApi.md#createMaskingJob) | **POST** /masking-jobs | Create a Masking Job.
[**createMaskingJobTag**](MaskingJobsApi.md#createMaskingJobTag) | **POST** /masking-jobs/{maskingJobId}/tags | Create tags for a Masking Job.
[**deleteMaskingJob**](MaskingJobsApi.md#deleteMaskingJob) | **DELETE** /masking-jobs/{maskingJobId} | Delete a masking job.
[**deleteMaskingJobTag**](MaskingJobsApi.md#deleteMaskingJobTag) | **POST** /masking-jobs/{maskingJobId}/tags/delete | Delete tags for a Masking Job.
[**executeMaskingJob**](MaskingJobsApi.md#executeMaskingJob) | **POST** /masking-jobs/{maskingJobId}/execute | Execute a MaskingJob.
[**getMaskingJobById**](MaskingJobsApi.md#getMaskingJobById) | **GET** /masking-jobs/{maskingJobId} | Retrieve a MaskingJob by ID.
[**getMaskingJobConnectors**](MaskingJobsApi.md#getMaskingJobConnectors) | **GET** /masking-jobs/{maskingJobId}/connectors | Get connectors for a Masking Job by ID.
[**getMaskingJobSourceEngines**](MaskingJobsApi.md#getMaskingJobSourceEngines) | **GET** /masking-jobs/source-engines | Retrieve the list of masking jobs along with their source engine.
[**getMaskingJobTag**](MaskingJobsApi.md#getMaskingJobTag) | **GET** /masking-jobs/{maskingJobId}/tags | Get tags for a Masking Job.
[**getMaskingJobs**](MaskingJobsApi.md#getMaskingJobs) | **GET** /masking-jobs | Retrieve the list of masking jobs.
[**migrateMaskingJob**](MaskingJobsApi.md#migrateMaskingJob) | **POST** /masking-jobs/{maskingJobId}/migrate | Migrates the masking job from its current source engine to another engine.
[**reImportMaskingJob**](MaskingJobsApi.md#reImportMaskingJob) | **POST** /masking-jobs/{maskingJobId}/re-import | Re-import the dataset from the source MaskingJob (Hyperscale Job only).
[**removeEngineFromMaskingJob**](MaskingJobsApi.md#removeEngineFromMaskingJob) | **POST** /masking-jobs/{maskingJobId}/remove-engine | Remove an engine from a Masking Job (Hyperscale Job only).
[**searchMaskingJobSourceEngines**](MaskingJobsApi.md#searchMaskingJobSourceEngines) | **POST** /masking-jobs/source-engines/search | Search the list of masking jobs along with their source engine.
[**searchMaskingJobs**](MaskingJobsApi.md#searchMaskingJobs) | **POST** /masking-jobs/search | Search masking jobs.
[**updateMaskingJobById**](MaskingJobsApi.md#updateMaskingJobById) | **PATCH** /masking-jobs/{maskingJobId} | Update values of a MaskingJob.


<a name="addEngineToMaskingJob"></a>
# **addEngineToMaskingJob**
> AddEngineToJobResponse addEngineToMaskingJob(maskingJobId, engineIdBody)

Add an engine to a Masking Job (Hyperscale Job only).

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.MaskingJobsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    MaskingJobsApi apiInstance = new MaskingJobsApi(defaultClient);
    String maskingJobId = "maskingJobId_example"; // String | The ID of the Masking Job.
    EngineIdBody engineIdBody = new EngineIdBody(); // EngineIdBody | Body containing the ID of the registered engine.
    try {
      AddEngineToJobResponse result = apiInstance.addEngineToMaskingJob(maskingJobId, engineIdBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MaskingJobsApi#addEngineToMaskingJob");
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
 **maskingJobId** | **String**| The ID of the Masking Job. |
 **engineIdBody** | [**EngineIdBody**](EngineIdBody.md)| Body containing the ID of the registered engine. |

### Return type

[**AddEngineToJobResponse**](AddEngineToJobResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="copyMaskingJob"></a>
# **copyMaskingJob**
> CopyMaskingJobResponse copyMaskingJob(maskingJobId, copyMaskingJobParameters)

Copies the masking job to another engine.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.MaskingJobsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    MaskingJobsApi apiInstance = new MaskingJobsApi(defaultClient);
    String maskingJobId = "maskingJobId_example"; // String | The ID of the Masking Job.
    CopyMaskingJobParameters copyMaskingJobParameters = new CopyMaskingJobParameters(); // CopyMaskingJobParameters | 
    try {
      CopyMaskingJobResponse result = apiInstance.copyMaskingJob(maskingJobId, copyMaskingJobParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MaskingJobsApi#copyMaskingJob");
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
 **maskingJobId** | **String**| The ID of the Masking Job. |
 **copyMaskingJobParameters** | [**CopyMaskingJobParameters**](CopyMaskingJobParameters.md)|  | [optional]

### Return type

[**CopyMaskingJobResponse**](CopyMaskingJobResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Copy masking job initiated. |  -  |

<a name="createMaskingJob"></a>
# **createMaskingJob**
> CreateMaskingJobResponse createMaskingJob(createMaskingJobRequest)

Create a Masking Job.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.MaskingJobsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    MaskingJobsApi apiInstance = new MaskingJobsApi(defaultClient);
    CreateMaskingJobRequest createMaskingJobRequest = new CreateMaskingJobRequest(); // CreateMaskingJobRequest | Input params to create a masking job.
    try {
      CreateMaskingJobResponse result = apiInstance.createMaskingJob(createMaskingJobRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MaskingJobsApi#createMaskingJob");
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
 **createMaskingJobRequest** | [**CreateMaskingJobRequest**](CreateMaskingJobRequest.md)| Input params to create a masking job. |

### Return type

[**CreateMaskingJobResponse**](CreateMaskingJobResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="createMaskingJobTag"></a>
# **createMaskingJobTag**
> TagsResponse createMaskingJobTag(maskingJobId, tagsRequest)

Create tags for a Masking Job.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.MaskingJobsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    MaskingJobsApi apiInstance = new MaskingJobsApi(defaultClient);
    String maskingJobId = "maskingJobId_example"; // String | The ID of the Masking Job.
    TagsRequest tagsRequest = new TagsRequest(); // TagsRequest | Tags information for Masking Job.
    try {
      TagsResponse result = apiInstance.createMaskingJobTag(maskingJobId, tagsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MaskingJobsApi#createMaskingJobTag");
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
 **maskingJobId** | **String**| The ID of the Masking Job. |
 **tagsRequest** | [**TagsRequest**](TagsRequest.md)| Tags information for Masking Job. |

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

<a name="deleteMaskingJob"></a>
# **deleteMaskingJob**
> DeleteMaskingJobResponse deleteMaskingJob(maskingJobId, force)

Delete a masking job.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.MaskingJobsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    MaskingJobsApi apiInstance = new MaskingJobsApi(defaultClient);
    String maskingJobId = "maskingJobId_example"; // String | The ID of the Masking Job.
    Boolean force = false; // Boolean | If true, ignores any failures to remove a masking job on an engine.
    try {
      DeleteMaskingJobResponse result = apiInstance.deleteMaskingJob(maskingJobId, force);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MaskingJobsApi#deleteMaskingJob");
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
 **maskingJobId** | **String**| The ID of the Masking Job. |
 **force** | **Boolean**| If true, ignores any failures to remove a masking job on an engine. | [optional] [default to false]

### Return type

[**DeleteMaskingJobResponse**](DeleteMaskingJobResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Masking job delete initiated. |  -  |

<a name="deleteMaskingJobTag"></a>
# **deleteMaskingJobTag**
> deleteMaskingJobTag(maskingJobId, deleteTag)

Delete tags for a Masking Job.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.MaskingJobsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    MaskingJobsApi apiInstance = new MaskingJobsApi(defaultClient);
    String maskingJobId = "maskingJobId_example"; // String | The ID of the Masking Job.
    DeleteTag deleteTag = new DeleteTag(); // DeleteTag | The parameters to delete tags
    try {
      apiInstance.deleteMaskingJobTag(maskingJobId, deleteTag);
    } catch (ApiException e) {
      System.err.println("Exception when calling MaskingJobsApi#deleteMaskingJobTag");
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
 **maskingJobId** | **String**| The ID of the Masking Job. |
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

<a name="executeMaskingJob"></a>
# **executeMaskingJob**
> ExecuteMaskingJobResponse executeMaskingJob(maskingJobId, executeMaskingJobParameters)

Execute a MaskingJob.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.MaskingJobsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    MaskingJobsApi apiInstance = new MaskingJobsApi(defaultClient);
    String maskingJobId = "maskingJobId_example"; // String | The ID of the Masking Job.
    ExecuteMaskingJobParameters executeMaskingJobParameters = new ExecuteMaskingJobParameters(); // ExecuteMaskingJobParameters | 
    try {
      ExecuteMaskingJobResponse result = apiInstance.executeMaskingJob(maskingJobId, executeMaskingJobParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MaskingJobsApi#executeMaskingJob");
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
 **maskingJobId** | **String**| The ID of the Masking Job. |
 **executeMaskingJobParameters** | [**ExecuteMaskingJobParameters**](ExecuteMaskingJobParameters.md)|  | [optional]

### Return type

[**ExecuteMaskingJobResponse**](ExecuteMaskingJobResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Masking job execute initiated. |  -  |

<a name="getMaskingJobById"></a>
# **getMaskingJobById**
> MaskingJob getMaskingJobById(maskingJobId)

Retrieve a MaskingJob by ID.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.MaskingJobsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    MaskingJobsApi apiInstance = new MaskingJobsApi(defaultClient);
    String maskingJobId = "maskingJobId_example"; // String | The ID of the Masking Job.
    try {
      MaskingJob result = apiInstance.getMaskingJobById(maskingJobId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MaskingJobsApi#getMaskingJobById");
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
 **maskingJobId** | **String**| The ID of the Masking Job. |

### Return type

[**MaskingJob**](MaskingJob.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="getMaskingJobConnectors"></a>
# **getMaskingJobConnectors**
> MaskingJobConnectorsResponse getMaskingJobConnectors(maskingJobId)

Get connectors for a Masking Job by ID.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.MaskingJobsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    MaskingJobsApi apiInstance = new MaskingJobsApi(defaultClient);
    String maskingJobId = "maskingJobId_example"; // String | The ID of the Masking Job.
    try {
      MaskingJobConnectorsResponse result = apiInstance.getMaskingJobConnectors(maskingJobId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MaskingJobsApi#getMaskingJobConnectors");
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
 **maskingJobId** | **String**| The ID of the Masking Job. |

### Return type

[**MaskingJobConnectorsResponse**](MaskingJobConnectorsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="getMaskingJobSourceEngines"></a>
# **getMaskingJobSourceEngines**
> ListMaskingJobSourceEnginesResponse getMaskingJobSourceEngines(limit, cursor, sort)

Retrieve the list of masking jobs along with their source engine.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.MaskingJobsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    MaskingJobsApi apiInstance = new MaskingJobsApi(defaultClient);
    Integer limit = 100; // Integer | Maximum number of objects to return per query. The value must be between 1 and 1000. Default is 100.
    String cursor = "cursor_example"; // String | Cursor to fetch the next or previous page of results. The value of this property must be extracted from the 'prev_cursor' or 'next_cursor' property of a PaginatedResponseMetadata which is contained in the response of list and search API endpoints.
    String sort = "name"; // String | The field to sort results by. A property name with a prepended '-' signifies a descending order.
    try {
      ListMaskingJobSourceEnginesResponse result = apiInstance.getMaskingJobSourceEngines(limit, cursor, sort);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MaskingJobsApi#getMaskingJobSourceEngines");
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
 **sort** | **String**| The field to sort results by. A property name with a prepended &#39;-&#39; signifies a descending order. | [optional] [enum: masking_job_id, -masking_job_id, source_engine_id, -source_engine_id]

### Return type

[**ListMaskingJobSourceEnginesResponse**](ListMaskingJobSourceEnginesResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="getMaskingJobTag"></a>
# **getMaskingJobTag**
> TagsResponse getMaskingJobTag(maskingJobId)

Get tags for a Masking Job.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.MaskingJobsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    MaskingJobsApi apiInstance = new MaskingJobsApi(defaultClient);
    String maskingJobId = "maskingJobId_example"; // String | The ID of the Masking Job.
    try {
      TagsResponse result = apiInstance.getMaskingJobTag(maskingJobId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MaskingJobsApi#getMaskingJobTag");
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
 **maskingJobId** | **String**| The ID of the Masking Job. |

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

<a name="getMaskingJobs"></a>
# **getMaskingJobs**
> ListMaskingJobsResponse getMaskingJobs(limit, cursor, sort)

Retrieve the list of masking jobs.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.MaskingJobsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    MaskingJobsApi apiInstance = new MaskingJobsApi(defaultClient);
    Integer limit = 100; // Integer | Maximum number of objects to return per query. The value must be between 1 and 1000. Default is 100.
    String cursor = "cursor_example"; // String | Cursor to fetch the next or previous page of results. The value of this property must be extracted from the 'prev_cursor' or 'next_cursor' property of a PaginatedResponseMetadata which is contained in the response of list and search API endpoints.
    String sort = "name"; // String | The field to sort results by. A property name with a prepended '-' signifies a descending order.
    try {
      ListMaskingJobsResponse result = apiInstance.getMaskingJobs(limit, cursor, sort);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MaskingJobsApi#getMaskingJobs");
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
 **sort** | **String**| The field to sort results by. A property name with a prepended &#39;-&#39; signifies a descending order. | [optional] [enum: id, -id, name, -name, is_on_the_fly_masking, -is_on_the_fly_masking, creation_date, -creation_date, last_completed_execution_date, -last_completed_execution_date, last_execution_status, -last_execution_status, last_execution_id, -last_execution_id, ruleset.name, -ruleset.name, connector_type, -connector_type, description, -description, dataset_id, -dataset_id, retain_execution_data, -retain_execution_data, parallelism_degree, -parallelism_degree, max_concurrent_target_connections, -max_concurrent_target_connections, max_concurrent_source_connections, -max_concurrent_source_connections, num_input_streams, -num_input_streams, stream_row_limit, -stream_row_limit, feedback_size, -feedback_size, min_memory, -min_memory, max_memory, -max_memory]

### Return type

[**ListMaskingJobsResponse**](ListMaskingJobsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="migrateMaskingJob"></a>
# **migrateMaskingJob**
> MigrateMaskingJobResponse migrateMaskingJob(maskingJobId, migrateMaskingJobParameters)

Migrates the masking job from its current source engine to another engine.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.MaskingJobsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    MaskingJobsApi apiInstance = new MaskingJobsApi(defaultClient);
    String maskingJobId = "maskingJobId_example"; // String | The ID of the Masking Job.
    MigrateMaskingJobParameters migrateMaskingJobParameters = new MigrateMaskingJobParameters(); // MigrateMaskingJobParameters | 
    try {
      MigrateMaskingJobResponse result = apiInstance.migrateMaskingJob(maskingJobId, migrateMaskingJobParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MaskingJobsApi#migrateMaskingJob");
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
 **maskingJobId** | **String**| The ID of the Masking Job. |
 **migrateMaskingJobParameters** | [**MigrateMaskingJobParameters**](MigrateMaskingJobParameters.md)|  | [optional]

### Return type

[**MigrateMaskingJobResponse**](MigrateMaskingJobResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Migrate masking job initiated. |  -  |

<a name="reImportMaskingJob"></a>
# **reImportMaskingJob**
> ReImportMaskingJobResponse reImportMaskingJob(maskingJobId)

Re-import the dataset from the source MaskingJob (Hyperscale Job only).

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.MaskingJobsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    MaskingJobsApi apiInstance = new MaskingJobsApi(defaultClient);
    String maskingJobId = "maskingJobId_example"; // String | The ID of the Masking Job.
    try {
      ReImportMaskingJobResponse result = apiInstance.reImportMaskingJob(maskingJobId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MaskingJobsApi#reImportMaskingJob");
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
 **maskingJobId** | **String**| The ID of the Masking Job. |

### Return type

[**ReImportMaskingJobResponse**](ReImportMaskingJobResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Masking job re-import initiated. |  -  |

<a name="removeEngineFromMaskingJob"></a>
# **removeEngineFromMaskingJob**
> RemoveEngineFromJobResponse removeEngineFromMaskingJob(maskingJobId, engineIdBody)

Remove an engine from a Masking Job (Hyperscale Job only).

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.MaskingJobsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    MaskingJobsApi apiInstance = new MaskingJobsApi(defaultClient);
    String maskingJobId = "maskingJobId_example"; // String | The ID of the Masking Job.
    EngineIdBody engineIdBody = new EngineIdBody(); // EngineIdBody | Body containing the ID of the registered engine.
    try {
      RemoveEngineFromJobResponse result = apiInstance.removeEngineFromMaskingJob(maskingJobId, engineIdBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MaskingJobsApi#removeEngineFromMaskingJob");
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
 **maskingJobId** | **String**| The ID of the Masking Job. |
 **engineIdBody** | [**EngineIdBody**](EngineIdBody.md)| Body containing the ID of the registered engine. |

### Return type

[**RemoveEngineFromJobResponse**](RemoveEngineFromJobResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="searchMaskingJobSourceEngines"></a>
# **searchMaskingJobSourceEngines**
> SearchMaskingJobSourceEnginesResponse searchMaskingJobSourceEngines(limit, cursor, sort, searchBody)

Search the list of masking jobs along with their source engine.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.MaskingJobsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    MaskingJobsApi apiInstance = new MaskingJobsApi(defaultClient);
    Integer limit = 100; // Integer | Maximum number of objects to return per query. The value must be between 1 and 1000. Default is 100.
    String cursor = "cursor_example"; // String | Cursor to fetch the next or previous page of results. The value of this property must be extracted from the 'prev_cursor' or 'next_cursor' property of a PaginatedResponseMetadata which is contained in the response of list and search API endpoints.
    String sort = "name"; // String | The field to sort results by. A property name with a prepended '-' signifies a descending order.
    SearchBody searchBody = new SearchBody(); // SearchBody | A request body containing a filter expression. This enables searching for items matching arbitrarily complex conditions. The list of attributes which can be used in filter expressions is available in the x-filterable vendor extension.  # Filter Expression Overview **Note: All keywords are case-insensitive**  ## Comparison Operators | Operator | Description | Example | | --- | --- | --- | | CONTAINS | Substring or membership testing for string and list attributes respectively. | field3 CONTAINS 'foobar', field4 CONTAINS TRUE  | | IN | Tests if field is a member of a list literal. List can contain a maximum of 100 values | field2 IN ['Goku', 'Vegeta'] | | GE | Tests if a field is greater than or equal to a literal value | field1 GE 1.2e-2 | | GT | Tests if a field is greater than a literal value | field1 GT 1.2e-2 | | LE | Tests if a field is less than or equal to a literal value | field1 LE 9000 | | LT | Tests if a field is less than a literal value | field1 LT 9.02 | | NE | Tests if a field is not equal to a literal value | field1 NE 42 | | EQ | Tests if a field is equal to a literal value | field1 EQ 42 |  ## Search Operator The SEARCH operator filters for items which have any filterable attribute that contains the input string as a substring, comparison is done case-insensitively. This is not restricted to attributes with string values. Specifically `SEARCH '12'` would match an item with an attribute with an integer value of `123`.  ## Logical Operators Ordered by precedence. | Operator | Description | Example | | --- | --- | --- | | NOT | Logical NOT (Right associative) | NOT field1 LE 9000 | | AND | Logical AND (Left Associative) | field1 GT 9000 AND field2 EQ 'Goku' | | OR | Logical OR (Left Associative) | field1 GT 9000 OR field2 EQ 'Goku' |  ## Grouping Parenthesis `()` can be used to override operator precedence.  For example: NOT (field1 LT 1234 AND field2 CONTAINS 'foo')  ## Literal Values | Literal      | Description | Examples | | --- | --- | --- | | Nil | Represents the absence of a value | nil, Nil, nIl, NIL | | Boolean | true/false boolean | true, false, True, False, TRUE, FALSE | | Number | Signed integer and floating point numbers. Also supports scientific notation. | 0, 1, -1, 1.2, 0.35, 1.2e-2, -1.2e+2 | | String | Single or double quoted | \"foo\", \"bar\", \"foo bar\", 'foo', 'bar', 'foo bar' | | Datetime | Formatted according to [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339) | 2018-04-27T18:39:26.397237+00:00 | | List | Comma-separated literals wrapped in square brackets | [0], [0, 1], ['foo', \"bar\"] |  ## Limitations - A maximum of 8 unique identifiers may be used inside a filter expression. 
    try {
      SearchMaskingJobSourceEnginesResponse result = apiInstance.searchMaskingJobSourceEngines(limit, cursor, sort, searchBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MaskingJobsApi#searchMaskingJobSourceEngines");
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
 **sort** | **String**| The field to sort results by. A property name with a prepended &#39;-&#39; signifies a descending order. | [optional] [enum: masking_job_id, -masking_job_id, source_engine_id, -source_engine_id]
 **searchBody** | [**SearchBody**](SearchBody.md)| A request body containing a filter expression. This enables searching for items matching arbitrarily complex conditions. The list of attributes which can be used in filter expressions is available in the x-filterable vendor extension.  # Filter Expression Overview **Note: All keywords are case-insensitive**  ## Comparison Operators | Operator | Description | Example | | --- | --- | --- | | CONTAINS | Substring or membership testing for string and list attributes respectively. | field3 CONTAINS &#39;foobar&#39;, field4 CONTAINS TRUE  | | IN | Tests if field is a member of a list literal. List can contain a maximum of 100 values | field2 IN [&#39;Goku&#39;, &#39;Vegeta&#39;] | | GE | Tests if a field is greater than or equal to a literal value | field1 GE 1.2e-2 | | GT | Tests if a field is greater than a literal value | field1 GT 1.2e-2 | | LE | Tests if a field is less than or equal to a literal value | field1 LE 9000 | | LT | Tests if a field is less than a literal value | field1 LT 9.02 | | NE | Tests if a field is not equal to a literal value | field1 NE 42 | | EQ | Tests if a field is equal to a literal value | field1 EQ 42 |  ## Search Operator The SEARCH operator filters for items which have any filterable attribute that contains the input string as a substring, comparison is done case-insensitively. This is not restricted to attributes with string values. Specifically &#x60;SEARCH &#39;12&#39;&#x60; would match an item with an attribute with an integer value of &#x60;123&#x60;.  ## Logical Operators Ordered by precedence. | Operator | Description | Example | | --- | --- | --- | | NOT | Logical NOT (Right associative) | NOT field1 LE 9000 | | AND | Logical AND (Left Associative) | field1 GT 9000 AND field2 EQ &#39;Goku&#39; | | OR | Logical OR (Left Associative) | field1 GT 9000 OR field2 EQ &#39;Goku&#39; |  ## Grouping Parenthesis &#x60;()&#x60; can be used to override operator precedence.  For example: NOT (field1 LT 1234 AND field2 CONTAINS &#39;foo&#39;)  ## Literal Values | Literal      | Description | Examples | | --- | --- | --- | | Nil | Represents the absence of a value | nil, Nil, nIl, NIL | | Boolean | true/false boolean | true, false, True, False, TRUE, FALSE | | Number | Signed integer and floating point numbers. Also supports scientific notation. | 0, 1, -1, 1.2, 0.35, 1.2e-2, -1.2e+2 | | String | Single or double quoted | \&quot;foo\&quot;, \&quot;bar\&quot;, \&quot;foo bar\&quot;, &#39;foo&#39;, &#39;bar&#39;, &#39;foo bar&#39; | | Datetime | Formatted according to [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339) | 2018-04-27T18:39:26.397237+00:00 | | List | Comma-separated literals wrapped in square brackets | [0], [0, 1], [&#39;foo&#39;, \&quot;bar\&quot;] |  ## Limitations - A maximum of 8 unique identifiers may be used inside a filter expression.  | [optional]

### Return type

[**SearchMaskingJobSourceEnginesResponse**](SearchMaskingJobSourceEnginesResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="searchMaskingJobs"></a>
# **searchMaskingJobs**
> SearchMaskingJobsResponse searchMaskingJobs(limit, cursor, sort, searchBody)

Search masking jobs.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.MaskingJobsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    MaskingJobsApi apiInstance = new MaskingJobsApi(defaultClient);
    Integer limit = 100; // Integer | Maximum number of objects to return per query. The value must be between 1 and 1000. Default is 100.
    String cursor = "cursor_example"; // String | Cursor to fetch the next or previous page of results. The value of this property must be extracted from the 'prev_cursor' or 'next_cursor' property of a PaginatedResponseMetadata which is contained in the response of list and search API endpoints.
    String sort = "name"; // String | The field to sort results by. A property name with a prepended '-' signifies a descending order.
    SearchBody searchBody = new SearchBody(); // SearchBody | A request body containing a filter expression. This enables searching for items matching arbitrarily complex conditions. The list of attributes which can be used in filter expressions is available in the x-filterable vendor extension.  # Filter Expression Overview **Note: All keywords are case-insensitive**  ## Comparison Operators | Operator | Description | Example | | --- | --- | --- | | CONTAINS | Substring or membership testing for string and list attributes respectively. | field3 CONTAINS 'foobar', field4 CONTAINS TRUE  | | IN | Tests if field is a member of a list literal. List can contain a maximum of 100 values | field2 IN ['Goku', 'Vegeta'] | | GE | Tests if a field is greater than or equal to a literal value | field1 GE 1.2e-2 | | GT | Tests if a field is greater than a literal value | field1 GT 1.2e-2 | | LE | Tests if a field is less than or equal to a literal value | field1 LE 9000 | | LT | Tests if a field is less than a literal value | field1 LT 9.02 | | NE | Tests if a field is not equal to a literal value | field1 NE 42 | | EQ | Tests if a field is equal to a literal value | field1 EQ 42 |  ## Search Operator The SEARCH operator filters for items which have any filterable attribute that contains the input string as a substring, comparison is done case-insensitively. This is not restricted to attributes with string values. Specifically `SEARCH '12'` would match an item with an attribute with an integer value of `123`.  ## Logical Operators Ordered by precedence. | Operator | Description | Example | | --- | --- | --- | | NOT | Logical NOT (Right associative) | NOT field1 LE 9000 | | AND | Logical AND (Left Associative) | field1 GT 9000 AND field2 EQ 'Goku' | | OR | Logical OR (Left Associative) | field1 GT 9000 OR field2 EQ 'Goku' |  ## Grouping Parenthesis `()` can be used to override operator precedence.  For example: NOT (field1 LT 1234 AND field2 CONTAINS 'foo')  ## Literal Values | Literal      | Description | Examples | | --- | --- | --- | | Nil | Represents the absence of a value | nil, Nil, nIl, NIL | | Boolean | true/false boolean | true, false, True, False, TRUE, FALSE | | Number | Signed integer and floating point numbers. Also supports scientific notation. | 0, 1, -1, 1.2, 0.35, 1.2e-2, -1.2e+2 | | String | Single or double quoted | \"foo\", \"bar\", \"foo bar\", 'foo', 'bar', 'foo bar' | | Datetime | Formatted according to [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339) | 2018-04-27T18:39:26.397237+00:00 | | List | Comma-separated literals wrapped in square brackets | [0], [0, 1], ['foo', \"bar\"] |  ## Limitations - A maximum of 8 unique identifiers may be used inside a filter expression. 
    try {
      SearchMaskingJobsResponse result = apiInstance.searchMaskingJobs(limit, cursor, sort, searchBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MaskingJobsApi#searchMaskingJobs");
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
 **sort** | **String**| The field to sort results by. A property name with a prepended &#39;-&#39; signifies a descending order. | [optional] [enum: id, -id, name, -name, is_on_the_fly_masking, -is_on_the_fly_masking, creation_date, -creation_date, last_completed_execution_date, -last_completed_execution_date, last_execution_status, -last_execution_status, last_execution_id, -last_execution_id, ruleset.name, -ruleset.name, connector_type, -connector_type, description, -description, dataset_id, -dataset_id, retain_execution_data, -retain_execution_data, parallelism_degree, -parallelism_degree, max_concurrent_target_connections, -max_concurrent_target_connections, max_concurrent_source_connections, -max_concurrent_source_connections, num_input_streams, -num_input_streams, stream_row_limit, -stream_row_limit, feedback_size, -feedback_size, min_memory, -min_memory, max_memory, -max_memory]
 **searchBody** | [**SearchBody**](SearchBody.md)| A request body containing a filter expression. This enables searching for items matching arbitrarily complex conditions. The list of attributes which can be used in filter expressions is available in the x-filterable vendor extension.  # Filter Expression Overview **Note: All keywords are case-insensitive**  ## Comparison Operators | Operator | Description | Example | | --- | --- | --- | | CONTAINS | Substring or membership testing for string and list attributes respectively. | field3 CONTAINS &#39;foobar&#39;, field4 CONTAINS TRUE  | | IN | Tests if field is a member of a list literal. List can contain a maximum of 100 values | field2 IN [&#39;Goku&#39;, &#39;Vegeta&#39;] | | GE | Tests if a field is greater than or equal to a literal value | field1 GE 1.2e-2 | | GT | Tests if a field is greater than a literal value | field1 GT 1.2e-2 | | LE | Tests if a field is less than or equal to a literal value | field1 LE 9000 | | LT | Tests if a field is less than a literal value | field1 LT 9.02 | | NE | Tests if a field is not equal to a literal value | field1 NE 42 | | EQ | Tests if a field is equal to a literal value | field1 EQ 42 |  ## Search Operator The SEARCH operator filters for items which have any filterable attribute that contains the input string as a substring, comparison is done case-insensitively. This is not restricted to attributes with string values. Specifically &#x60;SEARCH &#39;12&#39;&#x60; would match an item with an attribute with an integer value of &#x60;123&#x60;.  ## Logical Operators Ordered by precedence. | Operator | Description | Example | | --- | --- | --- | | NOT | Logical NOT (Right associative) | NOT field1 LE 9000 | | AND | Logical AND (Left Associative) | field1 GT 9000 AND field2 EQ &#39;Goku&#39; | | OR | Logical OR (Left Associative) | field1 GT 9000 OR field2 EQ &#39;Goku&#39; |  ## Grouping Parenthesis &#x60;()&#x60; can be used to override operator precedence.  For example: NOT (field1 LT 1234 AND field2 CONTAINS &#39;foo&#39;)  ## Literal Values | Literal      | Description | Examples | | --- | --- | --- | | Nil | Represents the absence of a value | nil, Nil, nIl, NIL | | Boolean | true/false boolean | true, false, True, False, TRUE, FALSE | | Number | Signed integer and floating point numbers. Also supports scientific notation. | 0, 1, -1, 1.2, 0.35, 1.2e-2, -1.2e+2 | | String | Single or double quoted | \&quot;foo\&quot;, \&quot;bar\&quot;, \&quot;foo bar\&quot;, &#39;foo&#39;, &#39;bar&#39;, &#39;foo bar&#39; | | Datetime | Formatted according to [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339) | 2018-04-27T18:39:26.397237+00:00 | | List | Comma-separated literals wrapped in square brackets | [0], [0, 1], [&#39;foo&#39;, \&quot;bar\&quot;] |  ## Limitations - A maximum of 8 unique identifiers may be used inside a filter expression.  | [optional]

### Return type

[**SearchMaskingJobsResponse**](SearchMaskingJobsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="updateMaskingJobById"></a>
# **updateMaskingJobById**
> MaskingJob updateMaskingJobById(maskingJobId, updateMaskingJobParameters)

Update values of a MaskingJob.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.MaskingJobsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    MaskingJobsApi apiInstance = new MaskingJobsApi(defaultClient);
    String maskingJobId = "maskingJobId_example"; // String | The ID of the Masking Job.
    UpdateMaskingJobParameters updateMaskingJobParameters = new UpdateMaskingJobParameters(); // UpdateMaskingJobParameters | The new data to update a Masking Job.
    try {
      MaskingJob result = apiInstance.updateMaskingJobById(maskingJobId, updateMaskingJobParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MaskingJobsApi#updateMaskingJobById");
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
 **maskingJobId** | **String**| The ID of the Masking Job. |
 **updateMaskingJobParameters** | [**UpdateMaskingJobParameters**](UpdateMaskingJobParameters.md)| The new data to update a Masking Job. | [optional]

### Return type

[**MaskingJob**](MaskingJob.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

