

# ProxyConfiguration

Web proxy configuration that is used to communicate with Delphix Corp. for support, troubleshooting, upgrades, updates, and patches.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**host** | **String** | The host name or IP address of the proxy server. | 
**port** | **Integer** | The port number of the proxy server. | 
**username** | **String** | The username to use when authenticating with the proxy server. |  [optional]
**password** | **String** | The password to use when authenticating with the proxy server. |  [optional]
**enabled** | **Boolean** | When set, these settings are enabled. True by default. | 
**truststoreFilename** | **String** | File name of a truststore which can be used to validate the TLS certificate of the proxy server. The truststore must be available at /etc/config/certs/&lt;truststore_filename&gt; |  [optional]
**truststorePassword** | **String** | Password for reading trustStore file provided in &#39;truststore_filename&#39; property |  [optional]



