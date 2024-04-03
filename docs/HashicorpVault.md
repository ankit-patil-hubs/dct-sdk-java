

# HashicorpVault

Configuration required to connect and authenticate with an Hashicorp Vault which stores engines username and passwords.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** |  |  [optional] [readonly]
**envVariables** | **Map&lt;String, String&gt;** | Environment variables to set when invoking the Vault CLI tool. The environment variables will be used both to login to the vault (if this step is required) and to retrieve engine username and passwords.  |  [optional]
**loginCommandArgs** | **List&lt;String&gt;** | Arguments to the \&quot;vault\&quot; CLI tool to be used to fetch a client token (or \&quot;login\&quot;). If supporting files, such as TLS certificates, must be used to authenticate, they can be mounted to the /etc/config directory. This property must not be set when using the TOKEN authentication method as login is not required.  |  [optional]
**tags** | [**List&lt;Tag&gt;**](Tag.md) |  |  [optional]



