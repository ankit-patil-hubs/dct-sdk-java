

# SAMLConfigParams

Parameters to read or update SAML Config

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**enabled** | **Boolean** | When set, SAML settings are enabled. False by default. |  [optional]
**autoCreateUsers** | **Boolean** | When set, the system will automatically create new Accounts for those who have logged in using SAML. This must be true if SAML user is not already registered in system. True by default. |  [optional]
**metadata** | **String** | IdP metadata for this service provider. This is a required property for successful SAML authentication. |  [optional]
**entityId** | **String** | Unique identifier of this instance as a SAML/SSO service provider. |  [optional]
**responseSkew** | **Integer** | Maximum time difference allowed between a SAML response and the DCT&#39;s current time, in seconds. If not set, it defaults to 120 seconds. |  [optional]
**groupAttr** | **String** | Group mapped attribute on SAML to create account tags in DCT. |  [optional]
**firstNameAttr** | **String** | First name attribute mapped on SAML used for mapping on DCT account. |  [optional]
**lastNameAttr** | **String** | Last name attribute mapped on SAML used for mapping on DCT account. |  [optional]



