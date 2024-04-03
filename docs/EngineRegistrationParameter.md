

# EngineRegistrationParameter

Parameters to register and authenticate an engine.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** |  | 
**hostname** | **String** |  | 
**username** | **String** | The virtualization domain admin username. |  [optional]
**password** | **String** | The virtualization domain admin password. |  [optional]
**maskingUsername** | **String** | The masking admin username. |  [optional]
**maskingPassword** | **String** | The masking admin password. |  [optional]
**hashicorpVaultUsernameCommandArgs** | **List&lt;String&gt;** | Arguments to pass to the Vault CLI tool to retrieve the virtualzation username for the engine. |  [optional]
**hashicorpVaultMaskingUsernameCommandArgs** | **List&lt;String&gt;** | Arguments to pass to the Vault CLI tool to retrieve the masking username for the engine. |  [optional]
**hashicorpVaultPasswordCommandArgs** | **List&lt;String&gt;** | Arguments to pass to the Vault CLI tool to retrieve the virtualization password for the engine. |  [optional]
**hashicorpVaultMaskingPasswordCommandArgs** | **List&lt;String&gt;** | Arguments to pass to the Vault CLI tool to retrieve the masking password for the engine. |  [optional]
**hashicorpVaultId** | **Long** | Reference to the Hashicorp vault to use to retrieve virtualization engine credentials. |  [optional]
**maskingHashicorpVaultId** | **Long** | Reference to the Hashicorp vault to use to retrieve masking engine credentials. |  [optional]
**insecureSsl** | **Boolean** | Allow connections to the engine over HTTPs without validating the TLS certificate. Even though the connection to the engine might be performed over HTTPs, setting this property eliminates the protection against a man-in-the-middle attach for connections to this engine. Instead, consider creating a truststore with a Certificate Authority to validate the engine&#39;s certificate, and set the truststore_filename property.  |  [optional]
**unsafeSslHostnameCheck** | **Boolean** | Ignore validation of the name associated to the TLS certificate when connecting to the engine over HTTPs. Setting this value must only be done if the TLS certificate of the engine does not match the hostname, and the TLS configuration of the engine cannot be fixed. Setting this property reduces the protection against a man-in-the-middle attack for connections to this engine. This is ignored if insecure_ssl is set.  |  [optional]
**truststoreFilename** | **String** | File name of a truststore which can be used to validate the TLS certificate of the engine. The truststore must be available at /etc/config/certs/&lt;truststore_filename&gt;  |  [optional]
**truststorePassword** | **String** | Password to read the truststore.  |  [optional]
**tags** | [**List&lt;Tag&gt;**](Tag.md) | The tags to be created for this engine. |  [optional]



