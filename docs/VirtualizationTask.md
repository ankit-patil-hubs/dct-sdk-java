

# VirtualizationTask


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** |  |  [optional]
**parentJobId** | **String** |  |  [optional]
**startTime** | **OffsetDateTime** |  |  [optional]
**endTime** | **OffsetDateTime** |  |  [optional]
**title** | **String** |  |  [optional]
**percentComplete** | **Integer** |  |  [optional]
**events** | [**List&lt;VirtualizationTaskEvent&gt;**](VirtualizationTaskEvent.md) |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]



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



