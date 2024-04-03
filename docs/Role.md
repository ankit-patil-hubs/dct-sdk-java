

# Role

A role is a named collection of permissions on DCT objects.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | The Role name. | 
**description** | **String** | Role description. |  [optional]
**permissionObjects** | [**Set&lt;PermissionObject&gt;**](PermissionObject.md) | The list of permissions granted by this role. | 
**tags** | [**List&lt;Tag&gt;**](Tag.md) |  |  [optional]
**id** | **String** | The Role ID. |  [optional]
**systemRole** | **Boolean** | System role are pre defined roles. System roles cannot be modified. |  [optional]



