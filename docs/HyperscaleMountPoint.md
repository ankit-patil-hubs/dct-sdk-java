

# HyperscaleMountPoint

A Mount Point for the Hyperscale instance to write to a staging area and engines to read from.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The ID of the Hyperscale Mount Point. |  [optional] [readonly]
**hyperscaleInstanceId** | **String** | The ID of the Hyperscale instance of this Mount Point. | 
**name** | **String** | Name of the mount, unique for a hyperscale instance. This name will be used as a directory name by the Hyperscale instance. | 
**hostname** | **String** | The host name of the server. | 
**mountPath** | **String** | The path to the directory on the filesystem to mount. | 
**mountType** | [**MountTypeEnum**](#MountTypeEnum) | The type of filesystem. Enum having values- CIFS, NFS3, NFS4. | 
**options** | **String** | The options for mount. The endpoint will return all default options and user specified options. |  [optional]



## Enum: MountTypeEnum

Name | Value
---- | -----
CIFS | &quot;CIFS&quot;
NFS3 | &quot;NFS3&quot;
NFS4 | &quot;NFS4&quot;



