

# Execution

The execution of a masking or profile job.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The Execution entity ID. |  [optional]
**engineId** | **String** | The ID of the engine where this execution ran. |  [optional]
**hyperscaleInstanceId** | **String** |  |  [optional]
**engineName** | **String** | The name of the engine where this execution ran. |  [optional]
**maskingJobId** | **String** | The ID of the masking job that is being executed. |  [optional]
**maskingJobName** | **String** | The name of the masking job that is being executed. |  [optional]
**sourceConnectorId** | **String** | The ID of the source connector. This field is only used for multi-tenant jobs that are also on-the-fly. |  [optional]
**targetConnectorId** | **String** | The ID of the target connector. This field is only used for multi-tenant jobs. |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | The status of the execution regarding its completion. |  [optional]
**rowsMasked** | **Long** | The number of rows masked or profiled so far by this execution. This is not applicable for JSON file type. |  [optional]
**rowsTotal** | **Long** | The total number of rows that this execution should mask. This value is set to -1 while the total row count is being calculated. This is not applicable for JSON file type. |  [optional]
**bytesProcessed** | **Long** | The number of bytes masked so far by this execution. This is only applicable for JSON file type. |  [optional]
**bytesTotal** | **Long** | The total number of bytes that this execution should mask. This value is set to -1 while the total byte count is being calculated. This is only applicable for JSON file type. |  [optional]
**startTime** | **OffsetDateTime** | The date and time that this execution was started. |  [optional]
**submitTime** | **OffsetDateTime** | The date and time that this execution was submitted. |  [optional]
**endTime** | **OffsetDateTime** | The date and time that this execution completed. |  [optional]
**taskEvents** | [**List&lt;TaskEvent&gt;**](TaskEvent.md) | The progression of steps or events performed by this execution. Only available for executions on masking engines that are version 6.0.14.0 and higher. |  [optional]
**hyperscaleTaskEvents** | [**List&lt;HyperscaleTaskEvent&gt;**](HyperscaleTaskEvent.md) |  |  [optional]
**progress** | **BigDecimal** | Progress of the task (value between 0 and 1, Hyperscale executions only) |  [optional]



## Enum: StatusEnum

Name | Value
---- | -----
PENDING | &quot;PENDING&quot;
QUEUED | &quot;QUEUED&quot;
RUNNING | &quot;RUNNING&quot;
CANCELLED | &quot;CANCELLED&quot;
FAILED | &quot;FAILED&quot;
SUCCEEDED | &quot;SUCCEEDED&quot;



