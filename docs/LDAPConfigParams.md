

# LDAPConfigParams

Parameters to read or update LDAP Config

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**enabled** | **Boolean** | When set, these settings are enabled. True by default. |  [optional]
**autoCreateUsers** | **Boolean** | When set, the system will automatically create new Accounts for those who have logged in using LDAP. This must be true if LDAP user is not already registered in system. True by default. |  [optional]
**hostname** | **String** | The hostname of the LDAP server. |  [optional]
**port** | **Integer** | The port of the LDAP server. Default port is 389 for non-SSL and 636 for SSL. |  [optional]
**domains** | [**List&lt;Domain&gt;**](Domain.md) | DCT will try to authenticate using each Domain given in this list. |  [optional]
**enableSsl** | **Boolean** | True if LDAP should be used over SSL. |  [optional]
**truststoreFilename** | **String** | File name of a truststore which can be used to validate the TLS certificate of the LDAP server. The truststore must be available at /etc/config/certs/&lt;truststore_filename&gt; |  [optional]
**truststorePassword** | **String** | Password for reading trustStore file provided in &#39;truststore_filename&#39; property |  [optional]
**insecureSsl** | **Boolean** | Allow connections to the LDAP server over LDAPS without validating the TLS certificate. Even though the connection to the server might be performed over LDAPS, setting this property eliminates the protection against a man-in-the-middle attach for connections to this server. Instead, consider creating a truststore with a Certificate Authority to validate the server&#39;s certificate, and set the truststore_filename property.  |  [optional]
**unsafeSslHostnameCheck** | **Boolean** | Ignore validation of the name associated to the TLS certificate when connecting to the LDAP server over LDAPS. Setting this value must only be done if the TLS certificate of the server does not match the hostname, and the TLS configuration of the server cannot be fixed. Setting this property reduces the protection against a man-in-the-middle attack for connections to this server. This is ignored if insecure_ssl is set.  |  [optional]



