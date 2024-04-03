

# AccessGroupScope

An Access group scope allows a role to be granted to accounts in the Access group.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The Access group scope ID. |  [optional] [readonly]
**name** | **String** | The Access group scope name. |  [optional]
**roleId** | **String** | The Access group role id. | 
**scopeType** | [**ScopeTypeEnum**](#ScopeTypeEnum) | Specifies the type of the scope. Scope of type SIMPLE would grant access to all DCT objects. Scope of type SCOPED would grant access to all objects based on objects and object-tags and permissions defined in linked role. Scope of type ADVANCED would grant access to DCT objects based on objects and object-tags and the individual permissions. |  [optional]
**objectTags** | [**List&lt;ScopeTag&gt;**](ScopeTag.md) | The permissions in this access group scope will be granted to all DCT objects tagged with tags matching this property. This is cumulative with objects defined in the &#39;objects&#39; property, and mutually exclusive with scope_type &#39;SIMPLE&#39;. |  [optional]
**objects** | [**List&lt;ScopedObjectItem&gt;**](ScopedObjectItem.md) | The permissions in this access group scope will be granted to all DCT objects with matching object id and object type, mutually exclusive with  scope_type &#39;SIMPLE&#39;. |  [optional]
**alwaysAllowedPermissions** | [**List&lt;AlwaysAllowedPermission&gt;**](AlwaysAllowedPermission.md) | An array of always allowed permissions which can be used to specify object type and permission. An object with same object type and permission can not be added in &#39;objects&#39; array. |  [optional]



## Enum: ScopeTypeEnum

Name | Value
---- | -----
SIMPLE | &quot;SIMPLE&quot;
SCOPED | &quot;SCOPED&quot;
ADVANCED | &quot;ADVANCED&quot;



