

# SMTPConfigParams

Parameters to read or update SMTP Config

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**enabled** | **Boolean** | True if outbound email is enabled. |  [optional]
**server** | **String** | IP address or hostname of SMTP relay server. |  [optional]
**port** | **Integer** | Port number to use. A value of -1 indicates the default (25 or 587 for TLS). |  [optional]
**authenticationEnabled** | **Boolean** | True if username/password authentication should be used. |  [optional]
**tlsEnabled** | **Boolean** | True if TLS (transport layer security) should be used. |  [optional]
**username** | **String** | If authentication is enabled, username to use when authenticating to the server. |  [optional]
**password** | **String** | If authentication is enabled, password to use when authenticating to the server. |  [optional]
**fromAddress** | **String** | From address to use when sending mail. If unspecified, &#39;noreply@delphix.com&#39; is used. |  [optional]
**sendTimeout** | **Integer** | Maximum timeout to wait, in seconds, when sending mail. |  [optional]



