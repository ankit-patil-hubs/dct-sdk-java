

# PhoneHomeBundleApiTelemetry

Telemetry data for an HTTP API call.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** | A programmatically-generated and auto-incrementing ID number for the API call. | 
**apiEndpoint** | **String** | The template of the API endpoint path that was called. | 
**apiMethod** | [**ApiMethodEnum**](#ApiMethodEnum) | The HTTP method used to call the API endpoint. | 
**startTime** | **String** | UTC time the API call was initiated (ISO 8601 format) | 
**endTime** | **String** | UTC time the API call returned a response (ISO 8601 format) | 
**responseStatus** | **Integer** | The HTTP status code of the response. | 
**userAgent** | **String** | The value of the \&quot;User-Agent\&quot; header in the request, if present. | 
**clientName** | **String** | The DCT client name (X-Dct-Client-Name HTTP header). | 
**isAutomation** | **Boolean** | True if the API is classified as an automation API. | 
**dctVersion** | **String** | The version of this Data Control Tower instance at the time the API was called. | 
**accountId** | **Long** | A number to distinguish the user account that performed this API call. | 



## Enum: ApiMethodEnum

Name | Value
---- | -----
GET | &quot;GET&quot;
POST | &quot;POST&quot;
PUT | &quot;PUT&quot;
PATCH | &quot;PATCH&quot;
DELETE | &quot;DELETE&quot;



