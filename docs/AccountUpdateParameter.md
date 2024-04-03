

# AccountUpdateParameter


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



