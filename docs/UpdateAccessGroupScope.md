

# UpdateAccessGroupScope

An Access group scope parameters that are allowed to update.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | The Access group scope name. |  [optional]
**scopeType** | [**ScopeTypeEnum**](#ScopeTypeEnum) | Specifies the type of the scope. Scope of type SIMPLE would grant access to all DCT objects. Scope of type SCOPED would grant access to all objects based on objects and object-tags and permissions defined in linked role. Scope of type ADVANCED would grant access to DCT objects based on objects and object-tags and the individual permissions. |  [optional]



## Enum: ScopeTypeEnum

Name | Value
---- | -----
SIMPLE | &quot;SIMPLE&quot;
SCOPED | &quot;SCOPED&quot;
ADVANCED | &quot;ADVANCED&quot;



