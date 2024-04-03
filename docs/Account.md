

# Account


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** | Numeric ID of the Account. |  [optional] [readonly]
**apiClientId** | **String** | The unique ID which is used to identify the identity of an API request. The web server (nginx) configuration must be configured so as to include the external ID as the value of the X_CLIENT_ID HTTP request header when requests are proxied. For OAuth2/JWT based authentication, this typically corresponds to a value extracted from the JWT, uniquely identifying the Account. |  [optional]
**firstName** | **String** | An optional first name for the Account. |  [optional]
**lastName** | **String** | An optional last name for the Account. |  [optional]
**email** | **String** | An optional email for the Account. |  [optional]
**username** | **String** | The username for username/password authentication. This can also be used to provide an optional logical name for the Account. |  [optional]
**ldapPrincipal** | **String** | This value will be used for linking this account to an LDAP user when authenticated with the same LDAP principal. When accounts authenticate with LDAP, an LDAP principal value is calculated based on the username, msad_domain_name, search_base and username_pattern. |  [optional]
**lastAccessTime** | **OffsetDateTime** | last time this account made a (successful or failed) API call. Note that updates to this property are asynchronous and make take some time to be reflected. |  [optional]
**creationTime** | **OffsetDateTime** | Creation time of this Account. This value is null for accounts created prior to version 9.0.0 of the product. |  [optional]
**effectiveScopes** | [**List&lt;EffectiveScope&gt;**](EffectiveScope.md) | Access group scopes associated with this account. |  [optional]
**tags** | [**List&lt;Tag&gt;**](Tag.md) | The tags to be created for this Account. |  [optional]
**enabled** | **Boolean** | Whether this account can be used to make API calls. |  [optional]



