

# Job

An asynchronous task.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The Job entity ID. |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | The status of the job. |  [optional]
**isWaitingForTelemetry** | **Boolean** | Indicates that the operations performed by this Job have completed successfully, but the object changes are not yet reflected. This is only set when when the JOB is in STARTED status, with the guarantee that the job will not transition to the FAILED status. Note that this flag will likely be replaced with a new status in future API versions and be deprecated. |  [optional]
**type** | **String** | The type of job being done. |  [optional]
**localizedType** | **String** | The i18n translated type of job being done. |  [optional]
**errorDetails** | **String** | Details about the failure for FAILED jobs. |  [optional]
**warningMessage** | **String** | Warnings for the job. |  [optional]
**targetId** | **String** | A reference to the job&#39;s target. |  [optional]
**targetName** | **String** | A reference to the job&#39;s target name. |  [optional]
**startTime** | **OffsetDateTime** | The time the job started executing. |  [optional]
**updateTime** | **OffsetDateTime** | The time the job was last updated. |  [optional]
**traceId** | **String** | traceId of the request which created this Job |  [optional]
**engineIds** | **List&lt;String&gt;** | IDs of the engines this Job is executing on. |  [optional]
**tags** | [**List&lt;Tag&gt;**](Tag.md) |  |  [optional]
**engines** | [**List&lt;Engine&gt;**](Engine.md) |  |  [optional]
**accountId** | **Integer** | The ID of the account who initiated this job. |  [optional]
**accountName** | **String** | The account name which initiated this job. It can be either firstname and lastname combination or firstname or lastname or username or email address or Account-&lt;id&gt;. |  [optional]
**percentComplete** | **Integer** | Completion percentage of the Job. |  [optional]
**virtualizationTasks** | [**List&lt;VirtualizationTask&gt;**](VirtualizationTask.md) |  |  [optional]



## Enum: StatusEnum

Name | Value
---- | -----
PENDING | &quot;PENDING&quot;
STARTED | &quot;STARTED&quot;
TIMEDOUT | &quot;TIMEDOUT&quot;
RUNNING | &quot;RUNNING&quot;
CANCELED | &quot;CANCELED&quot;
FAILED | &quot;FAILED&quot;
SUSPENDED | &quot;SUSPENDED&quot;
WAITING | &quot;WAITING&quot;
COMPLETED | &quot;COMPLETED&quot;
ABANDONED | &quot;ABANDONED&quot;



