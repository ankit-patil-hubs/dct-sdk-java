

# ApiUsageData


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**apiEndpoint** | **String** | API called. |  [optional]
**apiMethod** | **String** | HTTP method for API called. |  [optional]
**apiCount** | **Long** | Count of API calls over the requested timeframe. | 
**kind** | [**KindEnum**](#KindEnum) | Whether the API calls are of kind automation or governance |  [optional]
**clientName** | **String** | Name of the api client that called the API endpoint |  [optional]
**userAgent** | **String** | Version of the api client that called the API endpoint |  [optional]
**dctVersion** | **String** | DCT version at the time of api call |  [optional]



## Enum: KindEnum

Name | Value
---- | -----
AUTOMATION | &quot;automation&quot;
GOVERNANCE | &quot;governance&quot;



