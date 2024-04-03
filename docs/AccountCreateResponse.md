

# AccountCreateResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**token** | **String** | The opaque token to use to authenticate for other API calls. The token must be included in all HTTP API calls in a request header named \&quot;Authorization\&quot;, and prefixed with \&quot;apk \&quot; to denote that it is a proprietary API key format. For instance, if the token is \&quot;abc123\&quot;, request must contain the following HTTP request header: \&quot;Authorization: apk abc123\&quot;.  |  [optional]
**id** | **Long** | Numeric ID of the created Account. |  [optional]
**firstName** | **String** | First name of the created Account. |  [optional]
**lastName** | **String** | Last name of the created Account. |  [optional]
**email** | **String** | Email of the created Account. |  [optional]
**username** | **String** | Username of the created Account. |  [optional]
**ldapPrincipal** | **String** | The LDAP principal of the created Account. |  [optional]
**tags** | [**List&lt;Tag&gt;**](Tag.md) | The tags to be created for this Account. |  [optional]



