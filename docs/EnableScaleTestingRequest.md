

# EnableScaleTestingRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**enginesCount** | **Integer** | no. of times same engine needs to be registered | 
**virtEnginesList** | **List&lt;String&gt;** | list of virt engine hostnames to be registered engines_count times |  [optional]
**maskingEnginesList** | **List&lt;String&gt;** | list of masking engine hostnames to be registered engines_count times |  [optional]
**virtObjectsCount** | **Integer** | no. of times to duplicate sources, containers, and timeflows |  [optional]
**snapshotsCount** | **Integer** | no. of times to duplicate snapshots |  [optional]
**maskingObjectsCount** | **Integer** | no. of times to duplicate jobs, rulesets, and connectors |  [optional]



