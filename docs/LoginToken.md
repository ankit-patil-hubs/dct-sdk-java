

# LoginToken


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accessToken** | **String** | Opaque token that validates the successful account login and is used to authenticate subsequent api calls. This token needs to be sent as part of &#39;Authorization&#39; header for all api calls prefixed with value contained in &#39;token_type&#39; property. For example, if the &#39;access_token&#39; value is \&quot;abc123\&quot; and &#39;token_type&#39; is \&quot;Bearer\&quot; then HTTP requests should contain following header : \&quot;Authorization: Bearer abc123\&quot;  | 
**tokenType** | **String** | Type of the token returned in &#39;access_token&#39; property. | 
**expiresIn** | **Long** | Seconds duration after which the token will expire. | 



