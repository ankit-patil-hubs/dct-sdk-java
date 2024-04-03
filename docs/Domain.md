

# Domain


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**msadDomainName** | **String** | This is used to get full DN for authentication and search. Provide this value only if server is microsoft AD. |  [optional]
**usernamePattern** | **String** | The username_patterns can be used to avoid providing full-dn during login. This will also be used for search of groups,email, first name and last name. |  [optional]
**searchBase** | **String** | Search base used to search for ldap user groups. Leave this field empty if a full username_pattern is provided and server is non microsoft AD. |  [optional]
**groupAttr** | **String** | Group mapped attribute on ldap side used for user group search. |  [optional]
**emailAttr** | **String** | Email mapped attribute on ldap side used for mapping on DCT side account. |  [optional]
**firstNameAttr** | **String** | First name attribute mapped on ldap side used for mapping on DCT side account. |  [optional]
**lastNameAttr** | **String** | Last name attribute mapped on ldap side used for mapping on DCT side account. |  [optional]
**objectClassAttr** | **String** | The name of the objectClass on ldap side under which the user is mapped.This is used to search for the user details. |  [optional]
**searchAttr** | **String** | Search attribute mapped on ldap side using which search on ldap side will be made. |  [optional]



