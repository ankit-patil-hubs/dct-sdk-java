

# HyperscaleMountPointUpdateParameters

The updatable properties of a Hyperscale Mount Point.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Name of the mount, unique for a hyperscale instance. |  [optional]
**hostname** | **String** | The host name of the server. |  [optional]
**mountPath** | **String** | The path to the directory on the filesystem to mount. |  [optional]
**mountType** | [**MountTypeEnum**](#MountTypeEnum) | The type of filesystem. |  [optional]
**options** | **String** | The mount options. |  [optional]



## Enum: MountTypeEnum

Name | Value
---- | -----
CIFS | &quot;CIFS&quot;
NFS3 | &quot;NFS3&quot;
NFS4 | &quot;NFS4&quot;



