

# CreateMaskingJobRequest

Parameters to create a MaskingJob.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | The name to give the Masking Job. |  [optional]
**description** | **String** | The description of the Job (Hyperscale Job only). |  [optional]
**jobType** | [**JobTypeEnum**](#JobTypeEnum) | The type of Job. |  [optional]
**hyperscaleInstanceId** | **String** | The ID of the HyperscaleInstance to create this Job on (Hyperscale Job only). |  [optional]
**sourceMaskingJobId** | **String** | The ID of the Masking Job to use as the source (Hyperscale Job only). |  [optional]
**hyperscaleSourceConnectorUsername** | **String** | The username to set for the Source Connector that will be imported (Hyperscale Job only). |  [optional]
**hyperscaleSourceConnectorPassword** | **String** | The password to set for the Source Connector that will be imported (Hyperscale Job only). |  [optional]
**hyperscaleTargetConnectorUsername** | **String** | The username to set for the Target Connector that will be imported (Hyperscale Job only). |  [optional]
**hyperscaleTargetConnectorPassword** | **String** | The password to set for the Target Connector that will be imported (Hyperscale Job only). |  [optional]
**mountPointId** | **String** | The ID of the MountPoint to use for the resulting dataset (Hyperscale Job only). |  [optional]
**unloadSplit** | **Long** | The number of unloaded files to be generated from the source database (Hyperscale Job only). |  [optional]
**streamSize** | **Long** | The stream size to be used by the sqlldr oracle utility which specifies the size (in bytes) of the data stream sent from the client to the server (Hyperscale Job only). |  [optional]
**retainExecutionData** | [**RetainExecutionDataEnum**](#RetainExecutionDataEnum) | Defines whether execution data will be stored after execution is complete (Hyperscale Job only). |  [optional]
**maxMemory** | **Integer** | Maximum memory, in MB, to be allocated for each Masking job (Hyperscale Job only). |  [optional]
**minMemory** | **Integer** | Minimum memory, in MB, to be allocated for each Masking job (Hyperscale Job only). |  [optional]
**feedbackSize** | **Integer** | The granularity with which the masking engine provides updates on the progress of the masking job. For instance, a feedbackSize of 50000 results in log updates whenever 50000 rows are processed during the masking phase (Hyperscale Job only). |  [optional]
**streamRowLimit** | **Integer** | The stream row limit constrains the total number of rows that may enter the job for each masking stream. Setting this value to 0 allows unlimited rows into each stream, while leaving it blank will select a default limit based on job type (Hyperscale Job only). |  [optional]
**numInputStreams** | **Integer** | Number of input streams to be configured for Masking Job (Hyperscale Job only). |  [optional]
**maxConcurrentSourceConnections** | **Integer** | Maximum number of parallel connection that the Hyperscale instance can have with the source datasource (Hyperscale Job only). |  [optional]
**maxConcurrentTargetConnections** | **Integer** | Maximum number of parallel connection that the Hyperscale instance can have with the target datasource (Hyperscale Job only). |  [optional]
**parallelismDegree** | **Integer** | The degree of parallelism (DOP) per Oracle job to recreate the index in the post-load process (Hyperscale Job only). |  [optional]
**tags** | [**List&lt;Tag&gt;**](Tag.md) |  |  [optional]
**makeCurrentAccountOwner** | **Boolean** | Whether the account creating this Masking job must be configured as owner of it (Hyperscale Job only). |  [optional]



## Enum: JobTypeEnum

Name | Value
---- | -----
HYPERSCALE | &quot;HYPERSCALE&quot;



## Enum: RetainExecutionDataEnum

Name | Value
---- | -----
NO | &quot;NO&quot;
ON_ERROR | &quot;ON_ERROR&quot;
ALWAYS | &quot;ALWAYS&quot;



