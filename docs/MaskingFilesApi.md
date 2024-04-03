# MaskingFilesApi

All URIs are relative to *http://localhost/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**uploadMaskingFile**](MaskingFilesApi.md#uploadMaskingFile) | **POST** /masking-file-uploads | Upload a file for masking.


<a name="uploadMaskingFile"></a>
# **uploadMaskingFile**
> MaskingFileUploadResponse uploadMaskingFile(maskingFileUploadParameters)

Upload a file for masking.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.MaskingFilesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    MaskingFilesApi apiInstance = new MaskingFilesApi(defaultClient);
    MaskingFileUploadParameters maskingFileUploadParameters = new MaskingFileUploadParameters(); // MaskingFileUploadParameters | The parameters to upload a file for masking.
    try {
      MaskingFileUploadResponse result = apiInstance.uploadMaskingFile(maskingFileUploadParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MaskingFilesApi#uploadMaskingFile");
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
 **maskingFileUploadParameters** | [**MaskingFileUploadParameters**](MaskingFileUploadParameters.md)| The parameters to upload a file for masking. | [optional]

### Return type

[**MaskingFileUploadResponse**](MaskingFileUploadResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | File has been uploaded. |  -  |

