

# MaskingJob

A masking job.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The Masking Job entity ID. |  [optional] [readonly]
**name** | **String** | The name of this Masking Job. |  [optional]
**ruleset** | [**MaskingRuleset**](MaskingRuleset.md) |  |  [optional]
**connectorType** | **String** | The type of data being masked by this Job. If the Masking Job is masking a database this is the type of the database (Standard Job only). |  [optional]
**isOnTheFlyMasking** | **Boolean** | Whether this is an on-the-fly masking job (Standard Job only). |  [optional]
**creationDate** | **OffsetDateTime** | The date this MaskingJob was created (Standard Job only). |  [optional]
**lastCompletedExecutionDate** | **OffsetDateTime** | The date this MaskingJob was last executed to completion. |  [optional]
**lastExecutionStatus** | [**LastExecutionStatusEnum**](#LastExecutionStatusEnum) | The status of this MaskingJob&#39;s last execution. |  [optional]
**lastExecutionId** | **String** | The ID of this MaskingJob&#39;s last execution. |  [optional]
**connectorUsername** | **String** | The username of the Connector used by the MaskingJob (Standard Job only). For hyperscale jobs, see the connector of the dataset. |  [optional]
**connectorPassword** | **String** | The password of the Connector used by the MaskingJob (Standard Job only). For hyperscale jobs, see the connector of the dataset. |  [optional]
**onTheFlySourceConnectorUsername** | **String** | The username of the source Connector used by the on-the-fly MaskingJob (Standard Job only). |  [optional]
**onTheFlySourceConnectorPassword** | **String** | The password of the source Connector used by the on-the-fly MaskingJob (Standard Job only). |  [optional]
**jobType** | [**JobTypeEnum**](#JobTypeEnum) | The type of this Job. |  [optional]
**hyperscaleInstanceId** | **String** | The ID of the Hyperscale instance of this Job (Hyperscale Job only). |  [optional]
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
**sourceMaskingJobId** | **String** | The ID of the MaskingJob that was used as the source to create this job (Hyperscale Job only). |  [optional]
**engineIds** | **List&lt;String&gt;** | List of engines that this job can run on (Hyperscale Job only). |  [optional]
**tags** | [**List&lt;Tag&gt;**](Tag.md) |  |  [optional]



## Enum: LastExecutionStatusEnum

Name | Value
---- | -----
PENDING | &quot;PENDING&quot;
CANCELLED | &quot;CANCELLED&quot;
FAILED | &quot;FAILED&quot;
QUEUED | &quot;QUEUED&quot;
RUNNING | &quot;RUNNING&quot;
SUCCEEDED | &quot;SUCCEEDED&quot;



## Enum: JobTypeEnum

Name | Value
---- | -----
STANDARD | &quot;STANDARD&quot;
HYPERSCALE | &quot;HYPERSCALE&quot;



## Enum: RetainExecutionDataEnum

Name | Value
---- | -----
NO | &quot;NO&quot;
ON_ERROR | &quot;ON_ERROR&quot;
ALWAYS | &quot;ALWAYS&quot;



