

# UpdateMaskingJobParameters

Parameters to update a MaskingJob.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | The name of the MaskingJob. |  [optional]
**connectorUsername** | **String** | The username of the Connector used by the MaskingJob. (Standard Job only). |  [optional]
**connectorPassword** | **String** | The password of the Connector used by the MaskingJob. (Standard Job only). |  [optional]
**onTheFlySourceConnectorUsername** | **String** | The username of the source Connector used by the on-the-fly MaskingJob. (Standard Job only). |  [optional]
**onTheFlySourceConnectorPassword** | **String** | The password of the source Connector used by the on-the-fly MaskingJob. (Standard Job only). |  [optional]
**description** | **String** | Description of the Job (Hyperscale Job only). |  [optional]
**datasetId** | **String** | Dataset of the Hyperscale Job (Hyperscale Job only). |  [optional]
**retainExecutionData** | [**RetainExecutionDataEnum**](#RetainExecutionDataEnum) | Defines whether execution data will be stored after execution is complete (Hyperscale Job only). |  [optional]
**maxMemory** | **Integer** | Maximum memory to be allocated for each Masking job (Hyperscale Job only). |  [optional]
**minMemory** | **Integer** | Minimum memory to be allocated for each Masking job (Hyperscale Job only). |  [optional]
**feedbackSize** | **Integer** | Feedback Size for each Masking job (Hyperscale Job only). |  [optional]
**streamRowLimit** | **Integer** | Stream Row Limit for each Masking job (Hyperscale Job only). |  [optional]
**numInputStreams** | **Integer** | Number of input streams to be configured for Masking Job (Hyperscale Job only). |  [optional]
**maxConcurrentSourceConnections** | **Integer** | Maximum number of parallel connection that the Hyperscale instance can have with the source datasource (Hyperscale Job only). |  [optional]
**maxConcurrentTargetConnections** | **Integer** | Maximum number of parallel connection that the Hyperscale instance can have with the target datasource (Hyperscale Job only). |  [optional]
**parallelismDegree** | **Integer** | The degree of parallelism (DOP) per Oracle job to recreate the index in the post-load process (Hyperscale Job only). |  [optional]



## Enum: RetainExecutionDataEnum

Name | Value
---- | -----
NO | &quot;NO&quot;
ON_ERROR | &quot;ON_ERROR&quot;
ALWAYS | &quot;ALWAYS&quot;



