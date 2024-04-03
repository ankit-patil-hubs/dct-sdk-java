

# ExecutionEvent

Events, such as warnings or errors, associated with job executions.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The ExecutionEvent entity ID. |  [optional]
**executionId** | **String** | The ID of the execution. |  [optional]
**eventType** | [**EventTypeEnum**](#EventTypeEnum) | The type of execution event. |  [optional]
**severity** | [**SeverityEnum**](#SeverityEnum) | The severity of the execution event. |  [optional]
**cause** | [**CauseEnum**](#CauseEnum) | The cause of the execution event. |  [optional]
**count** | **Long** | The number of times the execution event occurred. |  [optional]
**timestamp** | **OffsetDateTime** | The date and time that this execution event first occurred. |  [optional]
**maskedObjectName** | **String** | The name of the column, field, or other object being masked when this event occurred, if applicable. |  [optional]
**algorithmName** | **String** | The name of the masking algorithm running when this event occurred, if applicable. |  [optional]
**exceptionType** | **String** | The Java class of the exception that triggered this event, if applicable. |  [optional]
**exceptionDetail** | **String** | The details associated with the Java exception that triggered this event, if applicable. |  [optional]



## Enum: EventTypeEnum

Name | Value
---- | -----
JOB_ABORTED | &quot;JOB_ABORTED&quot;
UNMASKED_DATA | &quot;UNMASKED_DATA&quot;
MASKING_FALLBACK | &quot;MASKING_FALLBACK&quot;



## Enum: SeverityEnum

Name | Value
---- | -----
INFO | &quot;INFO&quot;
WARNING | &quot;WARNING&quot;
CRITICAL | &quot;CRITICAL&quot;



## Enum: CauseEnum

Name | Value
---- | -----
UNHANDLED_EXCEPTION | &quot;UNHANDLED_EXCEPTION&quot;
IGNORED_EXCEPTION | &quot;IGNORED_EXCEPTION&quot;
PATTERN_MATCH_FAILURE | &quot;PATTERN_MATCH_FAILURE&quot;
PREMASK_TYPE_CONVERSION_FAILURE | &quot;PREMASK_TYPE_CONVERSION_FAILURE&quot;
POSTMASK_TYPE_CONVERSION_FAILURE | &quot;POSTMASK_TYPE_CONVERSION_FAILURE&quot;
EXTENDED_ALGORITHM_FAILURE | &quot;EXTENDED_ALGORITHM_FAILURE&quot;
DRIVER_SUPPORT_TASK_FAILURE | &quot;DRIVER_SUPPORT_TASK_FAILURE&quot;
DATA_NOT_FOUND_FAILURE | &quot;DATA_NOT_FOUND_FAILURE&quot;



