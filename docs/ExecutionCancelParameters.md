

# ExecutionCancelParameters

Parameters to cancel an execution.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**expectedStatus** | [**ExpectedStatusEnum**](#ExpectedStatusEnum) | The expected status of the execution to cancel to prevent cancelling a queued job that has transitioned to a running state since the request was issued (Standard Job only). |  [optional]



## Enum: ExpectedStatusEnum

Name | Value
---- | -----
QUEUED | &quot;QUEUED&quot;
RUNNING | &quot;RUNNING&quot;



