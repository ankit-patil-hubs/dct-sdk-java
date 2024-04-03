# ManagementApi

All URIs are relative to *http://localhost/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createEngineTags**](ManagementApi.md#createEngineTags) | **POST** /management/engines/{engineId}/tags | Create tags for an Engine.
[**createHashicorpVault**](ManagementApi.md#createHashicorpVault) | **POST** /management/vaults/hashicorp | Configure a new Hashicorp Vault
[**createHashicorpVaultTags**](ManagementApi.md#createHashicorpVaultTags) | **POST** /management/vaults/hashicorp/{vaultId}/tags | Create tags for a Hashicorp vault.
[**deleteEngineTags**](ManagementApi.md#deleteEngineTags) | **POST** /management/engines/{engineId}/tags/delete | Delete tags for an Engine.
[**deleteHashicorpVault**](ManagementApi.md#deleteHashicorpVault) | **DELETE** /management/vaults/hashicorp/{vaultId} | Delete a Hashicorp vault by id
[**deleteHashicorpVaultTag**](ManagementApi.md#deleteHashicorpVaultTag) | **POST** /management/vaults/hashicorp/{vaultId}/tags/delete | Delete tags for a Hashicorp vault.
[**getApiClassification**](ManagementApi.md#getApiClassification) | **GET** /management/api-classification | Get api classification.
[**getEngineAutoTaggingConfig**](ManagementApi.md#getEngineAutoTaggingConfig) | **GET** /management/engines/{engineId}/auto-tagging | Returns the engine&#39;s auto tagging configuration.
[**getEngineTags**](ManagementApi.md#getEngineTags) | **GET** /management/engines/{engineId}/tags | Get tags for a Engine.
[**getHashicorpVault**](ManagementApi.md#getHashicorpVault) | **GET** /management/vaults/hashicorp/{vaultId} | Get a Hashicorp vault by id
[**getHashicorpVaultTags**](ManagementApi.md#getHashicorpVaultTags) | **GET** /management/vaults/hashicorp/{vaultId}/tags | Get tags for a Hashicorp vault.
[**getHashicorpVaults**](ManagementApi.md#getHashicorpVaults) | **GET** /management/vaults/hashicorp | Returns a list of configured Hashicorp vaults.
[**getLdapConfig**](ManagementApi.md#getLdapConfig) | **GET** /management/ldap-config | Returns the LDAP configuration
[**getMetadataDatabase**](ManagementApi.md#getMetadataDatabase) | **GET** /management/metadata-database | Returns configuration information about the metadata database which stores the product data.
[**getPhonehomeEvents**](ManagementApi.md#getPhonehomeEvents) | **GET** /management/phonehome/events | Returns previous bundle upload events
[**getProductRegistrationDelphixConnectivityCheck**](ManagementApi.md#getProductRegistrationDelphixConnectivityCheck) | **GET** /management/product-registration-delphix-connectivity-check | Returns True if Delphix services are reachable for product registration.
[**getProductRegistrationKey**](ManagementApi.md#getProductRegistrationKey) | **GET** /management/product-registration-offline | Generates and returns a public key that can be used to register the product.
[**getProductRegistrationStatus**](ManagementApi.md#getProductRegistrationStatus) | **GET** /management/product-registration-status | Returns the product registration status.
[**getProxyConfiguration**](ManagementApi.md#getProxyConfiguration) | **GET** /management/proxy | Returns the current web proxy configuration to use to connect to Delphix services.
[**getRegisteredEngine**](ManagementApi.md#getRegisteredEngine) | **GET** /management/engines/{engineId} | Returns a registered engine by ID.
[**getRegisteredEngines**](ManagementApi.md#getRegisteredEngines) | **GET** /management/engines | Returns a list of registered engines.
[**getSamlConfig**](ManagementApi.md#getSamlConfig) | **GET** /management/saml-config | Returns the SAML configuration
[**getSmtpConfig**](ManagementApi.md#getSmtpConfig) | **GET** /management/smtp | Returns the SMTP configuration
[**listProperties**](ManagementApi.md#listProperties) | **GET** /management/properties | Get global properties.
[**registerEngine**](ManagementApi.md#registerEngine) | **POST** /management/engines | Register an engine.
[**registerProductOffline**](ManagementApi.md#registerProductOffline) | **POST** /management/product-registration-offline | Registers the product using a manually generated payload.
[**registerProductOnline**](ManagementApi.md#registerProductOnline) | **POST** /management/product-registration-online | Registers the product using the provided credentials.
[**searchEngines**](ManagementApi.md#searchEngines) | **POST** /management/engines/search | Search for engines.
[**searchHashicorpVaults**](ManagementApi.md#searchHashicorpVaults) | **POST** /management/vaults/hashicorp/search | Search for configured Hashicorp vaults.
[**unregisterEngine**](ManagementApi.md#unregisterEngine) | **DELETE** /management/engines/{engineId} | Unregister an engine.
[**updateApiClassification**](ManagementApi.md#updateApiClassification) | **PUT** /management/api-classification | Update the api classification to new version.
[**updateEngineAutoTaggingConfig**](ManagementApi.md#updateEngineAutoTaggingConfig) | **PATCH** /management/engines/{engineId}/auto-tagging | Update the engine&#39;s auto tagging configuration.
[**updateLdapConfig**](ManagementApi.md#updateLdapConfig) | **PUT** /management/ldap-config | Update LDAP Config.
[**updateProperties**](ManagementApi.md#updateProperties) | **PATCH** /management/properties | Update value of predefined properties.
[**updateProxyConfiguration**](ManagementApi.md#updateProxyConfiguration) | **PUT** /management/proxy | Update the web proxy configuration to use to connect to Delphix services.
[**updateRegisteredEngine**](ManagementApi.md#updateRegisteredEngine) | **PUT** /management/engines/{engineId} | Update a registered engine.
[**updateRegisteredEnginePartial**](ManagementApi.md#updateRegisteredEnginePartial) | **PATCH** /management/engines/{engineId} | Update a registered engine.
[**updateSamlConfig**](ManagementApi.md#updateSamlConfig) | **PUT** /management/saml-config | Update SAML Config.
[**updateSmtpConfig**](ManagementApi.md#updateSmtpConfig) | **PUT** /management/smtp | Update SMTP Config.
[**validateLdapConfig**](ManagementApi.md#validateLdapConfig) | **POST** /management/ldap-config/validate | Validate LDAP Config. Without username/password, DCT performs an anonymous bind against the LDAP server. If credentials are provided DCT validates that authentication and mapping of optional properties are actually working with provided credentials. LDAP search is only validated if search attributes are set.
[**validateSmtpConfig**](ManagementApi.md#validateSmtpConfig) | **POST** /management/smtp/validate | Validate SMTP Config.


<a name="createEngineTags"></a>
# **createEngineTags**
> TagsResponse createEngineTags(engineId, tagsRequest)

Create tags for an Engine.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    String engineId = "engineId_example"; // String | The ID of the registered engine.
    TagsRequest tagsRequest = new TagsRequest(); // TagsRequest | Tags information for Engine.
    try {
      TagsResponse result = apiInstance.createEngineTags(engineId, tagsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#createEngineTags");
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
 **engineId** | **String**| The ID of the registered engine. |
 **tagsRequest** | [**TagsRequest**](TagsRequest.md)| Tags information for Engine. |

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

<a name="createHashicorpVault"></a>
# **createHashicorpVault**
> HashicorpVault createHashicorpVault(hashicorpVault)

Configure a new Hashicorp Vault

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    HashicorpVault hashicorpVault = new HashicorpVault(); // HashicorpVault | 
    try {
      HashicorpVault result = apiInstance.createHashicorpVault(hashicorpVault);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#createHashicorpVault");
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
 **hashicorpVault** | [**HashicorpVault**](HashicorpVault.md)|  |

### Return type

[**HashicorpVault**](HashicorpVault.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Created |  -  |

<a name="createHashicorpVaultTags"></a>
# **createHashicorpVaultTags**
> TagsResponse createHashicorpVaultTags(vaultId, tagsRequest)

Create tags for a Hashicorp vault.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Long vaultId = 56L; // Long | Numeric ID of the Hashicorp vault
    TagsRequest tagsRequest = new TagsRequest(); // TagsRequest | Tags information for Hashicorp vault.
    try {
      TagsResponse result = apiInstance.createHashicorpVaultTags(vaultId, tagsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#createHashicorpVaultTags");
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
 **vaultId** | **Long**| Numeric ID of the Hashicorp vault |
 **tagsRequest** | [**TagsRequest**](TagsRequest.md)| Tags information for Hashicorp vault. |

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

<a name="deleteEngineTags"></a>
# **deleteEngineTags**
> deleteEngineTags(engineId, deleteTag)

Delete tags for an Engine.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    String engineId = "engineId_example"; // String | The ID of the registered engine.
    DeleteTag deleteTag = new DeleteTag(); // DeleteTag | The parameters to delete tags
    try {
      apiInstance.deleteEngineTags(engineId, deleteTag);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#deleteEngineTags");
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
 **engineId** | **String**| The ID of the registered engine. |
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

<a name="deleteHashicorpVault"></a>
# **deleteHashicorpVault**
> deleteHashicorpVault(vaultId)

Delete a Hashicorp vault by id

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Long vaultId = 56L; // Long | Numeric ID of the Hashicorp vault
    try {
      apiInstance.deleteHashicorpVault(vaultId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#deleteHashicorpVault");
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
 **vaultId** | **Long**| Numeric ID of the Hashicorp vault |

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
**204** | No Content |  -  |

<a name="deleteHashicorpVaultTag"></a>
# **deleteHashicorpVaultTag**
> deleteHashicorpVaultTag(vaultId, deleteTag)

Delete tags for a Hashicorp vault.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Long vaultId = 56L; // Long | Numeric ID of the Hashicorp vault
    DeleteTag deleteTag = new DeleteTag(); // DeleteTag | The parameters to delete tags
    try {
      apiInstance.deleteHashicorpVaultTag(vaultId, deleteTag);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#deleteHashicorpVaultTag");
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
 **vaultId** | **Long**| Numeric ID of the Hashicorp vault |
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

<a name="getApiClassification"></a>
# **getApiClassification**
> APIClassificationConfig getApiClassification()

Get api classification.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    try {
      APIClassificationConfig result = apiInstance.getApiClassification();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#getApiClassification");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**APIClassificationConfig**](APIClassificationConfig.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="getEngineAutoTaggingConfig"></a>
# **getEngineAutoTaggingConfig**
> AutoTaggingConfig getEngineAutoTaggingConfig(engineId)

Returns the engine&#39;s auto tagging configuration.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    String engineId = "engineId_example"; // String | The ID of the registered engine.
    try {
      AutoTaggingConfig result = apiInstance.getEngineAutoTaggingConfig(engineId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#getEngineAutoTaggingConfig");
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
 **engineId** | **String**| The ID of the registered engine. |

### Return type

[**AutoTaggingConfig**](AutoTaggingConfig.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="getEngineTags"></a>
# **getEngineTags**
> TagsResponse getEngineTags(engineId)

Get tags for a Engine.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    String engineId = "engineId_example"; // String | The ID of the registered engine.
    try {
      TagsResponse result = apiInstance.getEngineTags(engineId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#getEngineTags");
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
 **engineId** | **String**| The ID of the registered engine. |

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

<a name="getHashicorpVault"></a>
# **getHashicorpVault**
> HashicorpVault getHashicorpVault(vaultId)

Get a Hashicorp vault by id

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Long vaultId = 56L; // Long | Numeric ID of the Hashicorp vault
    try {
      HashicorpVault result = apiInstance.getHashicorpVault(vaultId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#getHashicorpVault");
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
 **vaultId** | **Long**| Numeric ID of the Hashicorp vault |

### Return type

[**HashicorpVault**](HashicorpVault.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="getHashicorpVaultTags"></a>
# **getHashicorpVaultTags**
> TagsResponse getHashicorpVaultTags(vaultId)

Get tags for a Hashicorp vault.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Long vaultId = 56L; // Long | Numeric ID of the Hashicorp vault
    try {
      TagsResponse result = apiInstance.getHashicorpVaultTags(vaultId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#getHashicorpVaultTags");
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
 **vaultId** | **Long**| Numeric ID of the Hashicorp vault |

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

<a name="getHashicorpVaults"></a>
# **getHashicorpVaults**
> ListHashicorpVaultsResponse getHashicorpVaults(limit, cursor, sort)

Returns a list of configured Hashicorp vaults.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Integer limit = 100; // Integer | Maximum number of objects to return per query. The value must be between 1 and 1000. Default is 100.
    String cursor = "cursor_example"; // String | Cursor to fetch the next or previous page of results. The value of this property must be extracted from the 'prev_cursor' or 'next_cursor' property of a PaginatedResponseMetadata which is contained in the response of list and search API endpoints.
    String sort = "name"; // String | The field to sort results by. A property name with a prepended '-' signifies descending order.
    try {
      ListHashicorpVaultsResponse result = apiInstance.getHashicorpVaults(limit, cursor, sort);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#getHashicorpVaults");
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
 **sort** | **String**| The field to sort results by. A property name with a prepended &#39;-&#39; signifies descending order. | [optional] [enum: id, -id]

### Return type

[**ListHashicorpVaultsResponse**](ListHashicorpVaultsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="getLdapConfig"></a>
# **getLdapConfig**
> LDAPConfigParams getLdapConfig()

Returns the LDAP configuration

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    try {
      LDAPConfigParams result = apiInstance.getLdapConfig();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#getLdapConfig");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**LDAPConfigParams**](LDAPConfigParams.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="getMetadataDatabase"></a>
# **getMetadataDatabase**
> MetadataDbInfo getMetadataDatabase()

Returns configuration information about the metadata database which stores the product data.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    try {
      MetadataDbInfo result = apiInstance.getMetadataDatabase();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#getMetadataDatabase");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**MetadataDbInfo**](MetadataDbInfo.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="getPhonehomeEvents"></a>
# **getPhonehomeEvents**
> List&lt;BundleUploadEvent&gt; getPhonehomeEvents(limit)

Returns previous bundle upload events

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Integer limit = 56; // Integer | The maximum number of items to return.
    try {
      List<BundleUploadEvent> result = apiInstance.getPhonehomeEvents(limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#getPhonehomeEvents");
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
 **limit** | **Integer**| The maximum number of items to return. | [optional]

### Return type

[**List&lt;BundleUploadEvent&gt;**](BundleUploadEvent.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="getProductRegistrationDelphixConnectivityCheck"></a>
# **getProductRegistrationDelphixConnectivityCheck**
> Boolean getProductRegistrationDelphixConnectivityCheck()

Returns True if Delphix services are reachable for product registration.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    try {
      Boolean result = apiInstance.getProductRegistrationDelphixConnectivityCheck();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#getProductRegistrationDelphixConnectivityCheck");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**Boolean**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="getProductRegistrationKey"></a>
# **getProductRegistrationKey**
> String getProductRegistrationKey()

Generates and returns a public key that can be used to register the product.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    try {
      String result = apiInstance.getProductRegistrationKey();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#getProductRegistrationKey");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**String**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="getProductRegistrationStatus"></a>
# **getProductRegistrationStatus**
> Boolean getProductRegistrationStatus()

Returns the product registration status.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    try {
      Boolean result = apiInstance.getProductRegistrationStatus();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#getProductRegistrationStatus");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**Boolean**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="getProxyConfiguration"></a>
# **getProxyConfiguration**
> ProxyConfiguration getProxyConfiguration()

Returns the current web proxy configuration to use to connect to Delphix services.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    try {
      ProxyConfiguration result = apiInstance.getProxyConfiguration();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#getProxyConfiguration");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ProxyConfiguration**](ProxyConfiguration.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="getRegisteredEngine"></a>
# **getRegisteredEngine**
> RegisteredEngine getRegisteredEngine(engineId)

Returns a registered engine by ID.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    String engineId = "engineId_example"; // String | The ID of the registered engine.
    try {
      RegisteredEngine result = apiInstance.getRegisteredEngine(engineId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#getRegisteredEngine");
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
 **engineId** | **String**| The ID of the registered engine. |

### Return type

[**RegisteredEngine**](RegisteredEngine.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="getRegisteredEngines"></a>
# **getRegisteredEngines**
> ListRegisteredEnginesResponse getRegisteredEngines(limit, cursor, sort)

Returns a list of registered engines.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Integer limit = 100; // Integer | Maximum number of objects to return per query. The value must be between 1 and 1000. Default is 100.
    String cursor = "cursor_example"; // String | Cursor to fetch the next or previous page of results. The value of this property must be extracted from the 'prev_cursor' or 'next_cursor' property of a PaginatedResponseMetadata which is contained in the response of list and search API endpoints.
    String sort = "name"; // String | The field to sort results by. A property name with a prepended '-' signifies descending order.
    try {
      ListRegisteredEnginesResponse result = apiInstance.getRegisteredEngines(limit, cursor, sort);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#getRegisteredEngines");
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
 **sort** | **String**| The field to sort results by. A property name with a prepended &#39;-&#39; signifies descending order. | [optional] [enum: id, -id, uuid, -uuid, type, -type, version, -version, name, -name, hostname, -hostname, cpu_core_count, -cpu_core_count, memory_size, -memory_size, data_storage_capacity, -data_storage_capacity, data_storage_used, -data_storage_used, username, -username, hashicorp_vault_id, -hashicorp_vault_id, connection_status, -connection_status, connection_status_details, -connection_status_details, engine_connection_status, -engine_connection_status, engine_connection_status_details, -engine_connection_status_details, masking_memory_used, -masking_memory_used, masking_allocated_memory, -masking_allocated_memory, masking_jobs_running, -masking_jobs_running, masking_max_concurrent_jobs, -masking_max_concurrent_jobs, masking_available_cores, -masking_available_cores]

### Return type

[**ListRegisteredEnginesResponse**](ListRegisteredEnginesResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="getSamlConfig"></a>
# **getSamlConfig**
> SAMLConfigParams getSamlConfig()

Returns the SAML configuration

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    try {
      SAMLConfigParams result = apiInstance.getSamlConfig();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#getSamlConfig");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**SAMLConfigParams**](SAMLConfigParams.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="getSmtpConfig"></a>
# **getSmtpConfig**
> SMTPConfigParams getSmtpConfig()

Returns the SMTP configuration

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    try {
      SMTPConfigParams result = apiInstance.getSmtpConfig();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#getSmtpConfig");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**SMTPConfigParams**](SMTPConfigParams.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="listProperties"></a>
# **listProperties**
> GlobalProperties listProperties()

Get global properties.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    try {
      GlobalProperties result = apiInstance.listProperties();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#listProperties");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GlobalProperties**](GlobalProperties.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="registerEngine"></a>
# **registerEngine**
> RegisteredEngine registerEngine(engineRegistrationParameter)

Register an engine.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    EngineRegistrationParameter engineRegistrationParameter = new EngineRegistrationParameter(); // EngineRegistrationParameter | The parameters to register an engine.
    try {
      RegisteredEngine result = apiInstance.registerEngine(engineRegistrationParameter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#registerEngine");
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
 **engineRegistrationParameter** | [**EngineRegistrationParameter**](EngineRegistrationParameter.md)| The parameters to register an engine. |

### Return type

[**RegisteredEngine**](RegisteredEngine.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Created |  -  |

<a name="registerProductOffline"></a>
# **registerProductOffline**
> registerProductOffline(productRegistrationOfflinePayload)

Registers the product using a manually generated payload.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    ProductRegistrationOfflinePayload productRegistrationOfflinePayload = new ProductRegistrationOfflinePayload(); // ProductRegistrationOfflinePayload | 
    try {
      apiInstance.registerProductOffline(productRegistrationOfflinePayload);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#registerProductOffline");
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
 **productRegistrationOfflinePayload** | [**ProductRegistrationOfflinePayload**](ProductRegistrationOfflinePayload.md)|  |

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

<a name="registerProductOnline"></a>
# **registerProductOnline**
> registerProductOnline(productRegistrationOnlinePayload)

Registers the product using the provided credentials.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    ProductRegistrationOnlinePayload productRegistrationOnlinePayload = new ProductRegistrationOnlinePayload(); // ProductRegistrationOnlinePayload | 
    try {
      apiInstance.registerProductOnline(productRegistrationOnlinePayload);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#registerProductOnline");
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
 **productRegistrationOnlinePayload** | [**ProductRegistrationOnlinePayload**](ProductRegistrationOnlinePayload.md)|  |

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

<a name="searchEngines"></a>
# **searchEngines**
> SearchEnginesResponse searchEngines(limit, cursor, sort, searchBody)

Search for engines.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Integer limit = 100; // Integer | Maximum number of objects to return per query. The value must be between 1 and 1000. Default is 100.
    String cursor = "cursor_example"; // String | Cursor to fetch the next or previous page of results. The value of this property must be extracted from the 'prev_cursor' or 'next_cursor' property of a PaginatedResponseMetadata which is contained in the response of list and search API endpoints.
    String sort = "name"; // String | The field to sort results by. A property name with a prepended '-' signifies descending order.
    SearchBody searchBody = new SearchBody(); // SearchBody | A request body containing a filter expression. This enables searching for items matching arbitrarily complex conditions. The list of attributes which can be used in filter expressions is available in the x-filterable vendor extension.  # Filter Expression Overview **Note: All keywords are case-insensitive**  ## Comparison Operators | Operator | Description | Example | | --- | --- | --- | | CONTAINS | Substring or membership testing for string and list attributes respectively. | field3 CONTAINS 'foobar', field4 CONTAINS TRUE  | | IN | Tests if field is a member of a list literal. List can contain a maximum of 100 values | field2 IN ['Goku', 'Vegeta'] | | GE | Tests if a field is greater than or equal to a literal value | field1 GE 1.2e-2 | | GT | Tests if a field is greater than a literal value | field1 GT 1.2e-2 | | LE | Tests if a field is less than or equal to a literal value | field1 LE 9000 | | LT | Tests if a field is less than a literal value | field1 LT 9.02 | | NE | Tests if a field is not equal to a literal value | field1 NE 42 | | EQ | Tests if a field is equal to a literal value | field1 EQ 42 |  ## Search Operator The SEARCH operator filters for items which have any filterable attribute that contains the input string as a substring, comparison is done case-insensitively. This is not restricted to attributes with string values. Specifically `SEARCH '12'` would match an item with an attribute with an integer value of `123`.  ## Logical Operators Ordered by precedence. | Operator | Description | Example | | --- | --- | --- | | NOT | Logical NOT (Right associative) | NOT field1 LE 9000 | | AND | Logical AND (Left Associative) | field1 GT 9000 AND field2 EQ 'Goku' | | OR | Logical OR (Left Associative) | field1 GT 9000 OR field2 EQ 'Goku' |  ## Grouping Parenthesis `()` can be used to override operator precedence.  For example: NOT (field1 LT 1234 AND field2 CONTAINS 'foo')  ## Literal Values | Literal      | Description | Examples | | --- | --- | --- | | Nil | Represents the absence of a value | nil, Nil, nIl, NIL | | Boolean | true/false boolean | true, false, True, False, TRUE, FALSE | | Number | Signed integer and floating point numbers. Also supports scientific notation. | 0, 1, -1, 1.2, 0.35, 1.2e-2, -1.2e+2 | | String | Single or double quoted | \"foo\", \"bar\", \"foo bar\", 'foo', 'bar', 'foo bar' | | Datetime | Formatted according to [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339) | 2018-04-27T18:39:26.397237+00:00 | | List | Comma-separated literals wrapped in square brackets | [0], [0, 1], ['foo', \"bar\"] |  ## Limitations - A maximum of 8 unique identifiers may be used inside a filter expression. 
    try {
      SearchEnginesResponse result = apiInstance.searchEngines(limit, cursor, sort, searchBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#searchEngines");
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
 **sort** | **String**| The field to sort results by. A property name with a prepended &#39;-&#39; signifies descending order. | [optional] [enum: id, -id, uuid, -uuid, type, -type, version, -version, name, -name, hostname, -hostname, cpu_core_count, -cpu_core_count, memory_size, -memory_size, data_storage_capacity, -data_storage_capacity, data_storage_used, -data_storage_used, username, -username, hashicorp_vault_id, -hashicorp_vault_id, connection_status, -connection_status, connection_status_details, -connection_status_details, engine_connection_status, -engine_connection_status, engine_connection_status_details, -engine_connection_status_details, masking_memory_used, -masking_memory_used, masking_allocated_memory, -masking_allocated_memory, masking_jobs_running, -masking_jobs_running, masking_max_concurrent_jobs, -masking_max_concurrent_jobs, masking_available_cores, -masking_available_cores]
 **searchBody** | [**SearchBody**](SearchBody.md)| A request body containing a filter expression. This enables searching for items matching arbitrarily complex conditions. The list of attributes which can be used in filter expressions is available in the x-filterable vendor extension.  # Filter Expression Overview **Note: All keywords are case-insensitive**  ## Comparison Operators | Operator | Description | Example | | --- | --- | --- | | CONTAINS | Substring or membership testing for string and list attributes respectively. | field3 CONTAINS &#39;foobar&#39;, field4 CONTAINS TRUE  | | IN | Tests if field is a member of a list literal. List can contain a maximum of 100 values | field2 IN [&#39;Goku&#39;, &#39;Vegeta&#39;] | | GE | Tests if a field is greater than or equal to a literal value | field1 GE 1.2e-2 | | GT | Tests if a field is greater than a literal value | field1 GT 1.2e-2 | | LE | Tests if a field is less than or equal to a literal value | field1 LE 9000 | | LT | Tests if a field is less than a literal value | field1 LT 9.02 | | NE | Tests if a field is not equal to a literal value | field1 NE 42 | | EQ | Tests if a field is equal to a literal value | field1 EQ 42 |  ## Search Operator The SEARCH operator filters for items which have any filterable attribute that contains the input string as a substring, comparison is done case-insensitively. This is not restricted to attributes with string values. Specifically &#x60;SEARCH &#39;12&#39;&#x60; would match an item with an attribute with an integer value of &#x60;123&#x60;.  ## Logical Operators Ordered by precedence. | Operator | Description | Example | | --- | --- | --- | | NOT | Logical NOT (Right associative) | NOT field1 LE 9000 | | AND | Logical AND (Left Associative) | field1 GT 9000 AND field2 EQ &#39;Goku&#39; | | OR | Logical OR (Left Associative) | field1 GT 9000 OR field2 EQ &#39;Goku&#39; |  ## Grouping Parenthesis &#x60;()&#x60; can be used to override operator precedence.  For example: NOT (field1 LT 1234 AND field2 CONTAINS &#39;foo&#39;)  ## Literal Values | Literal      | Description | Examples | | --- | --- | --- | | Nil | Represents the absence of a value | nil, Nil, nIl, NIL | | Boolean | true/false boolean | true, false, True, False, TRUE, FALSE | | Number | Signed integer and floating point numbers. Also supports scientific notation. | 0, 1, -1, 1.2, 0.35, 1.2e-2, -1.2e+2 | | String | Single or double quoted | \&quot;foo\&quot;, \&quot;bar\&quot;, \&quot;foo bar\&quot;, &#39;foo&#39;, &#39;bar&#39;, &#39;foo bar&#39; | | Datetime | Formatted according to [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339) | 2018-04-27T18:39:26.397237+00:00 | | List | Comma-separated literals wrapped in square brackets | [0], [0, 1], [&#39;foo&#39;, \&quot;bar\&quot;] |  ## Limitations - A maximum of 8 unique identifiers may be used inside a filter expression.  | [optional]

### Return type

[**SearchEnginesResponse**](SearchEnginesResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="searchHashicorpVaults"></a>
# **searchHashicorpVaults**
> SearchHashicorpVaultsResponse searchHashicorpVaults(limit, cursor, sort, searchBody)

Search for configured Hashicorp vaults.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Integer limit = 100; // Integer | Maximum number of objects to return per query. The value must be between 1 and 1000. Default is 100.
    String cursor = "cursor_example"; // String | Cursor to fetch the next or previous page of results. The value of this property must be extracted from the 'prev_cursor' or 'next_cursor' property of a PaginatedResponseMetadata which is contained in the response of list and search API endpoints.
    String sort = "name"; // String | The field to sort results by. A property name with a prepended '-' signifies descending order.
    SearchBody searchBody = new SearchBody(); // SearchBody | A request body containing a filter expression. This enables searching for items matching arbitrarily complex conditions. The list of attributes which can be used in filter expressions is available in the x-filterable vendor extension.  # Filter Expression Overview **Note: All keywords are case-insensitive**  ## Comparison Operators | Operator | Description | Example | | --- | --- | --- | | CONTAINS | Substring or membership testing for string and list attributes respectively. | field3 CONTAINS 'foobar', field4 CONTAINS TRUE  | | IN | Tests if field is a member of a list literal. List can contain a maximum of 100 values | field2 IN ['Goku', 'Vegeta'] | | GE | Tests if a field is greater than or equal to a literal value | field1 GE 1.2e-2 | | GT | Tests if a field is greater than a literal value | field1 GT 1.2e-2 | | LE | Tests if a field is less than or equal to a literal value | field1 LE 9000 | | LT | Tests if a field is less than a literal value | field1 LT 9.02 | | NE | Tests if a field is not equal to a literal value | field1 NE 42 | | EQ | Tests if a field is equal to a literal value | field1 EQ 42 |  ## Search Operator The SEARCH operator filters for items which have any filterable attribute that contains the input string as a substring, comparison is done case-insensitively. This is not restricted to attributes with string values. Specifically `SEARCH '12'` would match an item with an attribute with an integer value of `123`.  ## Logical Operators Ordered by precedence. | Operator | Description | Example | | --- | --- | --- | | NOT | Logical NOT (Right associative) | NOT field1 LE 9000 | | AND | Logical AND (Left Associative) | field1 GT 9000 AND field2 EQ 'Goku' | | OR | Logical OR (Left Associative) | field1 GT 9000 OR field2 EQ 'Goku' |  ## Grouping Parenthesis `()` can be used to override operator precedence.  For example: NOT (field1 LT 1234 AND field2 CONTAINS 'foo')  ## Literal Values | Literal      | Description | Examples | | --- | --- | --- | | Nil | Represents the absence of a value | nil, Nil, nIl, NIL | | Boolean | true/false boolean | true, false, True, False, TRUE, FALSE | | Number | Signed integer and floating point numbers. Also supports scientific notation. | 0, 1, -1, 1.2, 0.35, 1.2e-2, -1.2e+2 | | String | Single or double quoted | \"foo\", \"bar\", \"foo bar\", 'foo', 'bar', 'foo bar' | | Datetime | Formatted according to [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339) | 2018-04-27T18:39:26.397237+00:00 | | List | Comma-separated literals wrapped in square brackets | [0], [0, 1], ['foo', \"bar\"] |  ## Limitations - A maximum of 8 unique identifiers may be used inside a filter expression. 
    try {
      SearchHashicorpVaultsResponse result = apiInstance.searchHashicorpVaults(limit, cursor, sort, searchBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#searchHashicorpVaults");
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
 **sort** | **String**| The field to sort results by. A property name with a prepended &#39;-&#39; signifies descending order. | [optional] [enum: id, -id]
 **searchBody** | [**SearchBody**](SearchBody.md)| A request body containing a filter expression. This enables searching for items matching arbitrarily complex conditions. The list of attributes which can be used in filter expressions is available in the x-filterable vendor extension.  # Filter Expression Overview **Note: All keywords are case-insensitive**  ## Comparison Operators | Operator | Description | Example | | --- | --- | --- | | CONTAINS | Substring or membership testing for string and list attributes respectively. | field3 CONTAINS &#39;foobar&#39;, field4 CONTAINS TRUE  | | IN | Tests if field is a member of a list literal. List can contain a maximum of 100 values | field2 IN [&#39;Goku&#39;, &#39;Vegeta&#39;] | | GE | Tests if a field is greater than or equal to a literal value | field1 GE 1.2e-2 | | GT | Tests if a field is greater than a literal value | field1 GT 1.2e-2 | | LE | Tests if a field is less than or equal to a literal value | field1 LE 9000 | | LT | Tests if a field is less than a literal value | field1 LT 9.02 | | NE | Tests if a field is not equal to a literal value | field1 NE 42 | | EQ | Tests if a field is equal to a literal value | field1 EQ 42 |  ## Search Operator The SEARCH operator filters for items which have any filterable attribute that contains the input string as a substring, comparison is done case-insensitively. This is not restricted to attributes with string values. Specifically &#x60;SEARCH &#39;12&#39;&#x60; would match an item with an attribute with an integer value of &#x60;123&#x60;.  ## Logical Operators Ordered by precedence. | Operator | Description | Example | | --- | --- | --- | | NOT | Logical NOT (Right associative) | NOT field1 LE 9000 | | AND | Logical AND (Left Associative) | field1 GT 9000 AND field2 EQ &#39;Goku&#39; | | OR | Logical OR (Left Associative) | field1 GT 9000 OR field2 EQ &#39;Goku&#39; |  ## Grouping Parenthesis &#x60;()&#x60; can be used to override operator precedence.  For example: NOT (field1 LT 1234 AND field2 CONTAINS &#39;foo&#39;)  ## Literal Values | Literal      | Description | Examples | | --- | --- | --- | | Nil | Represents the absence of a value | nil, Nil, nIl, NIL | | Boolean | true/false boolean | true, false, True, False, TRUE, FALSE | | Number | Signed integer and floating point numbers. Also supports scientific notation. | 0, 1, -1, 1.2, 0.35, 1.2e-2, -1.2e+2 | | String | Single or double quoted | \&quot;foo\&quot;, \&quot;bar\&quot;, \&quot;foo bar\&quot;, &#39;foo&#39;, &#39;bar&#39;, &#39;foo bar&#39; | | Datetime | Formatted according to [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339) | 2018-04-27T18:39:26.397237+00:00 | | List | Comma-separated literals wrapped in square brackets | [0], [0, 1], [&#39;foo&#39;, \&quot;bar\&quot;] |  ## Limitations - A maximum of 8 unique identifiers may be used inside a filter expression.  | [optional]

### Return type

[**SearchHashicorpVaultsResponse**](SearchHashicorpVaultsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="unregisterEngine"></a>
# **unregisterEngine**
> DeleteEngineResponse unregisterEngine(engineId)

Unregister an engine.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    String engineId = "engineId_example"; // String | The ID of the registered engine.
    try {
      DeleteEngineResponse result = apiInstance.unregisterEngine(engineId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#unregisterEngine");
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
 **engineId** | **String**| The ID of the registered engine. |

### Return type

[**DeleteEngineResponse**](DeleteEngineResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="updateApiClassification"></a>
# **updateApiClassification**
> APIClassificationConfig updateApiClassification(apIClassificationConfig)

Update the api classification to new version.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    APIClassificationConfig apIClassificationConfig = new APIClassificationConfig(); // APIClassificationConfig | Request to update api classification config.
    try {
      APIClassificationConfig result = apiInstance.updateApiClassification(apIClassificationConfig);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#updateApiClassification");
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
 **apIClassificationConfig** | [**APIClassificationConfig**](APIClassificationConfig.md)| Request to update api classification config. |

### Return type

[**APIClassificationConfig**](APIClassificationConfig.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="updateEngineAutoTaggingConfig"></a>
# **updateEngineAutoTaggingConfig**
> UpdateEngineAutoTaggingConfigResponse updateEngineAutoTaggingConfig(engineId, autoTaggingConfig)

Update the engine&#39;s auto tagging configuration.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    String engineId = "engineId_example"; // String | The ID of the registered engine.
    AutoTaggingConfig autoTaggingConfig = new AutoTaggingConfig(); // AutoTaggingConfig | The auto tagging configuration.
    try {
      UpdateEngineAutoTaggingConfigResponse result = apiInstance.updateEngineAutoTaggingConfig(engineId, autoTaggingConfig);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#updateEngineAutoTaggingConfig");
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
 **engineId** | **String**| The ID of the registered engine. |
 **autoTaggingConfig** | [**AutoTaggingConfig**](AutoTaggingConfig.md)| The auto tagging configuration. |

### Return type

[**UpdateEngineAutoTaggingConfigResponse**](UpdateEngineAutoTaggingConfigResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="updateLdapConfig"></a>
# **updateLdapConfig**
> LDAPConfigParams updateLdapConfig(ldAPConfigParams)

Update LDAP Config.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    LDAPConfigParams ldAPConfigParams = new LDAPConfigParams(); // LDAPConfigParams | The parameters to update the LDAP config.
    try {
      LDAPConfigParams result = apiInstance.updateLdapConfig(ldAPConfigParams);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#updateLdapConfig");
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
 **ldAPConfigParams** | [**LDAPConfigParams**](LDAPConfigParams.md)| The parameters to update the LDAP config. |

### Return type

[**LDAPConfigParams**](LDAPConfigParams.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="updateProperties"></a>
# **updateProperties**
> GlobalProperties updateProperties(globalProperties)

Update value of predefined properties.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    GlobalProperties globalProperties = new GlobalProperties(); // GlobalProperties | The parameters to update property value.
    try {
      GlobalProperties result = apiInstance.updateProperties(globalProperties);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#updateProperties");
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
 **globalProperties** | [**GlobalProperties**](GlobalProperties.md)| The parameters to update property value. |

### Return type

[**GlobalProperties**](GlobalProperties.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="updateProxyConfiguration"></a>
# **updateProxyConfiguration**
> ProxyConfiguration updateProxyConfiguration(proxyConfiguration)

Update the web proxy configuration to use to connect to Delphix services.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    ProxyConfiguration proxyConfiguration = new ProxyConfiguration(); // ProxyConfiguration | 
    try {
      ProxyConfiguration result = apiInstance.updateProxyConfiguration(proxyConfiguration);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#updateProxyConfiguration");
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
 **proxyConfiguration** | [**ProxyConfiguration**](ProxyConfiguration.md)|  |

### Return type

[**ProxyConfiguration**](ProxyConfiguration.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Update the web proxy configuration to use to connect to Delphix services |  -  |

<a name="updateRegisteredEngine"></a>
# **updateRegisteredEngine**
> RegisteredEngine updateRegisteredEngine(engineId, registeredEngine)

Update a registered engine.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    String engineId = "engineId_example"; // String | The ID of the registered engine.
    RegisteredEngine registeredEngine = new RegisteredEngine(); // RegisteredEngine | The updated registration engine information.
    try {
      RegisteredEngine result = apiInstance.updateRegisteredEngine(engineId, registeredEngine);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#updateRegisteredEngine");
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
 **engineId** | **String**| The ID of the registered engine. |
 **registeredEngine** | [**RegisteredEngine**](RegisteredEngine.md)| The updated registration engine information. |

### Return type

[**RegisteredEngine**](RegisteredEngine.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="updateRegisteredEnginePartial"></a>
# **updateRegisteredEnginePartial**
> RegisteredEngine updateRegisteredEnginePartial(engineId, registeredEngine)

Update a registered engine.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    String engineId = "engineId_example"; // String | The ID of the registered engine.
    RegisteredEngine registeredEngine = new RegisteredEngine(); // RegisteredEngine | The updated registration engine information.
    try {
      RegisteredEngine result = apiInstance.updateRegisteredEnginePartial(engineId, registeredEngine);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#updateRegisteredEnginePartial");
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
 **engineId** | **String**| The ID of the registered engine. |
 **registeredEngine** | [**RegisteredEngine**](RegisteredEngine.md)| The updated registration engine information. |

### Return type

[**RegisteredEngine**](RegisteredEngine.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="updateSamlConfig"></a>
# **updateSamlConfig**
> SAMLConfigParams updateSamlConfig(saMLConfigParams)

Update SAML Config.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    SAMLConfigParams saMLConfigParams = new SAMLConfigParams(); // SAMLConfigParams | The parameters to update the SAML config.
    try {
      SAMLConfigParams result = apiInstance.updateSamlConfig(saMLConfigParams);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#updateSamlConfig");
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
 **saMLConfigParams** | [**SAMLConfigParams**](SAMLConfigParams.md)| The parameters to update the SAML config. |

### Return type

[**SAMLConfigParams**](SAMLConfigParams.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="updateSmtpConfig"></a>
# **updateSmtpConfig**
> SMTPConfigParams updateSmtpConfig(smTPConfigParams)

Update SMTP Config.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    SMTPConfigParams smTPConfigParams = new SMTPConfigParams(); // SMTPConfigParams | The parameters to update the SMTP config.
    try {
      SMTPConfigParams result = apiInstance.updateSmtpConfig(smTPConfigParams);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#updateSmtpConfig");
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
 **smTPConfigParams** | [**SMTPConfigParams**](SMTPConfigParams.md)| The parameters to update the SMTP config. |

### Return type

[**SMTPConfigParams**](SMTPConfigParams.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="validateLdapConfig"></a>
# **validateLdapConfig**
> LdapValidateResponse validateLdapConfig(ldapConfigValidateParameter)

Validate LDAP Config. Without username/password, DCT performs an anonymous bind against the LDAP server. If credentials are provided DCT validates that authentication and mapping of optional properties are actually working with provided credentials. LDAP search is only validated if search attributes are set.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    LdapConfigValidateParameter ldapConfigValidateParameter = new LdapConfigValidateParameter(); // LdapConfigValidateParameter | 
    try {
      LdapValidateResponse result = apiInstance.validateLdapConfig(ldapConfigValidateParameter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#validateLdapConfig");
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
 **ldapConfigValidateParameter** | [**LdapConfigValidateParameter**](LdapConfigValidateParameter.md)|  | [optional]

### Return type

[**LdapValidateResponse**](LdapValidateResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="validateSmtpConfig"></a>
# **validateSmtpConfig**
> validateSmtpConfig(smTPConfigValidate)

Validate SMTP Config.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    SMTPConfigValidate smTPConfigValidate = new SMTPConfigValidate(); // SMTPConfigValidate | The parameters to validate the SMTP config.
    try {
      apiInstance.validateSmtpConfig(smTPConfigValidate);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#validateSmtpConfig");
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
 **smTPConfigValidate** | [**SMTPConfigValidate**](SMTPConfigValidate.md)| The parameters to validate the SMTP config. |

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

