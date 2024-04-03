

# HyperscaleTaskEvent


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Name of the task (Unload, Masking, Load, Post-Load) |  [optional]
**progress** | **BigDecimal** | progress of the task (between 0 and 1) |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]
**processedObjects** | **Long** | The number of objects (tables) already processed by this task. |  [optional]
**processedRows** | **Long** | The number of rows already processed by this task. |  [optional]
**processedConstraints** | **Long** | The number of constraints processed by this task (Post-load task only) |  [optional]
**totalConstraints** | **Long** | The total number of constraints to be processed by this task (Post-load task only) |  [optional]
**processedIndexes** | **Long** | The number of indexes processed by this task (Post-load task only) |  [optional]
**totalIndexes** | **Long** | The total number of indexes to be processed by this task (Post-load task only) |  [optional]
**processedTriggers** | **Long** | The number of triggered processed by this task (Post-load task only) |  [optional]
**totalTriggers** | **Long** | The total number of triggers to be processed by this task (Post-load task only) |  [optional]
**startTime** | **OffsetDateTime** | The date and time that this task was started. |  [optional]
**endTime** | **OffsetDateTime** | The date and time that this task completed. |  [optional]
**errors** | [**List&lt;HyperscaleTaskError&gt;**](HyperscaleTaskError.md) |  |  [optional]



## Enum: StatusEnum

Name | Value
---- | -----
CANCELLED | &quot;CANCELLED&quot;
CANCEL_INITIATED | &quot;CANCEL_INITIATED&quot;
FAILED | &quot;FAILED&quot;
RUNNING | &quot;RUNNING&quot;
SUCCEEDED | &quot;SUCCEEDED&quot;



