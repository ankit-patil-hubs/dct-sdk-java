

# HyperscaleInstance

A registered Hyperscale instance's connection and authentication settings.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The Hyperscale instance entity ID. |  [optional] [readonly]
**name** | **String** | The name of this hyperscale instance. | 
**hostname** | **String** | The hostname of this hyperscale instance. | 
**dataType** | **HyperscaleDataTypeEnum** |  |  [optional]
**creationDate** | **OffsetDateTime** | The date this hyperscale instance was registered. |  [optional]
**tags** | [**List&lt;Tag&gt;**](Tag.md) | The tags to be created for this hyperscale instance. |  [optional]
**apiKey** | **String** | API key to connect to the hyperscale instance. | 
**insecureSsl** | **Boolean** | Allow connections to the hyperscale instance over HTTPs without validating the TLS certificate. Even though the connection to the hyperscale instance might be performed over HTTPs, setting this property eliminates the protection against a man-in-the-middle attach for connections to this engine. Instead, consider creating a truststore with a Certificate Authority to validate the hyperscale instance&#39;s certificate, and set the truststore_filename property.  |  [optional]
**unsafeSslHostnameCheck** | **Boolean** | Ignore validation of the name associated to the TLS certificate when connecting to the hyperscale instance over HTTPs. Setting this value must only be done if the TLS certificate of the hyperscale instance does not match the hostname, and the TLS configuration of the hyperscale instance cannot be fixed. Setting this property reduces the protection against a man-in-the-middle attack for connections to this hyperscale instance. This is ignored if insecure_ssl is set.  |  [optional]
**truststoreFilename** | **String** | File name of a truststore which can be used to validate the TLS certificate of the hyperscale instance. The truststore must be available at /etc/config/certs/&lt;truststore_filename&gt;  |  [optional]
**truststorePassword** | **String** | Password to read the truststore.  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | The status of this hyperscale instance. |  [optional] [readonly]
**connectionStatus** | [**ConnectionStatusEnum**](#ConnectionStatusEnum) | The status of the connection to the hyperscale instance. |  [optional] [readonly]
**connectionStatusDetails** | **String** | If set, details about the status of the connection to the hyperscale instance. |  [optional] [readonly]



## Enum: StatusEnum

Name | Value
---- | -----
CREATED | &quot;CREATED&quot;
DELETING | &quot;DELETING&quot;



## Enum: ConnectionStatusEnum

Name | Value
---- | -----
ONLINE | &quot;ONLINE&quot;
CONNECTION_ERROR | &quot;CONNECTION_ERROR&quot;
BAD_CREDENTIALS | &quot;BAD_CREDENTIALS&quot;



