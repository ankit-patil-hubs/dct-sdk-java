

# AccessGroup

An Access group is the DCT mechanism to grant roles to accounts. Each account has its own Access Group which can be used to manage permissions for that account, and an unlimited number of other Access groups can be created to manage permissions by groups of accounts.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The Access group ID. |  [optional] [readonly]
**name** | **String** | The Access group name | 
**singleAccount** | **Boolean** | Indicates that this Access group defines the permissions of a single account, and thus account and account tags cannot be modified. Instead create a new Access group to manage permissions of multiple accounts. |  [optional]
**accountIds** | **List&lt;Long&gt;** | List of accounts ids included individually (as opposed to added by tags) in the Access group. |  [optional]
**taggedAccountIds** | **List&lt;Long&gt;** | List of accounts ids included by tags in the Access group. |  [optional] [readonly]
**accountTags** | [**List&lt;Tag&gt;**](Tag.md) | List of account tags. Accounts matching any of these tags will be automatically added to the Access group. |  [optional]
**scopes** | [**List&lt;AccessGroupScope&gt;**](AccessGroupScope.md) | The Access group scopes. |  [optional]



