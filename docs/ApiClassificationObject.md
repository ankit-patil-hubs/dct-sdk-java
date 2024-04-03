

# ApiClassificationObject

An API classification object which classifies APIs as automation or governance.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**apiMethod** | [**ApiMethodEnum**](#ApiMethodEnum) | HTTP method of the API. |  [optional]
**path** | **String** | context path of the API. |  [optional]
**isAutomation** | **Boolean** | Either this API is automation or not. |  [optional]
**startDate** | **OffsetDateTime** | The start date and time from when this api&#39;s is_automation definition has changed. |  [optional]
**endDate** | **OffsetDateTime** | The end date and time from when this api&#39;s is_automation definition has changed. |  [optional]



## Enum: ApiMethodEnum

Name | Value
---- | -----
GET | &quot;GET&quot;
POST | &quot;POST&quot;
PUT | &quot;PUT&quot;
PATCH | &quot;PATCH&quot;
DELETE | &quot;DELETE&quot;



