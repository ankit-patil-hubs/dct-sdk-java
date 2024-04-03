

# HyperscaleInstanceUpdateParams

Parameters to update a Hyperscale instances.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Name in DCT of the Hyperscale instance. |  [optional]
**hostname** | **String** | Hostname of the Hyperscale instance. |  [optional]
**apiKey** | **String** | API key to connect to the Hyperscale instance. |  [optional]
**dataType** | **HyperscaleDataTypeEnum** |  |  [optional]
**insecureSsl** | **Boolean** | Allow connections to the hyperscale instance over HTTPs without validating the TLS certificate. Even though the connection to the hyperscale instance might be performed over HTTPs, setting this property eliminates the protection against a man-in-the-middle attach for connections to this engine. Instead, consider creating a truststore with a Certificate Authority to validate the hyperscale instance&#39;s certificate, and set the truststore_filename property.  |  [optional]
**unsafeSslHostnameCheck** | **Boolean** | Ignore validation of the name associated to the TLS certificate when connecting to the hyperscale instance over HTTPs. Setting this value must only be done if the TLS certificate of the hyperscale instance does not match the hostname, and the TLS configuration of the hyperscale instance cannot be fixed. Setting this property reduces the protection against a man-in-the-middle attack for connections to this engine. This is ignored if insecure_ssl is set.  |  [optional]
**truststoreFilename** | **String** | File name of a truststore which can be used to validate the TLS certificate of the hyperscale instance. The truststore must be available at /etc/config/certs/&lt;truststore_filename&gt;. Set this property to an empty string to clear the value.  |  [optional]
**truststorePassword** | **String** | Password to read the truststore. Set this property to an empty string to clear the value.  |  [optional]



