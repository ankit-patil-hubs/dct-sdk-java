

# ExecutionLog

A log containing warnings or errors associated with a job execution.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The ExecutionLog entity ID. |  [optional]
**executionId** | **String** | The ID of the execution. |  [optional]
**maskingJobId** | **String** | The ID of the masking job that is being executed. |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | The status of the execution regarding its completion. |  [optional]
**log** | **String** | The log file contents. |  [optional]



## Enum: StatusEnum

Name | Value
---- | -----
CANCELLED | &quot;CANCELLED&quot;
FAILED | &quot;FAILED&quot;
QUEUED | &quot;QUEUED&quot;
RUNNING | &quot;RUNNING&quot;
SUCCEEDED | &quot;SUCCEEDED&quot;



