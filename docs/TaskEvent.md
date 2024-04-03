

# TaskEvent

A step or event performed by a masking execution.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**event** | **String** | The steps or events a task will perform. |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | The state of result of the task event. |  [optional]



## Enum: StatusEnum

Name | Value
---- | -----
CANCELLED | &quot;CANCELLED&quot;
FAILED | &quot;FAILED&quot;
QUEUED | &quot;QUEUED&quot;
RUNNING | &quot;RUNNING&quot;
SUCCEEDED | &quot;SUCCEEDED&quot;
SKIPPED | &quot;SKIPPED&quot;
NON_CONFORMANT | &quot;NON_CONFORMANT&quot;



