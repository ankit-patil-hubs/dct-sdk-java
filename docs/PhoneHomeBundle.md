

# PhoneHomeBundle

A bundle containing product identification, configuration information and API telemetry records.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**productInfo** | [**PhoneHomeBundleProductInfo**](PhoneHomeBundleProductInfo.md) |  | 
**registeredEngines** | [**List&lt;PhoneHomeBundleRegisteredEngine&gt;**](PhoneHomeBundleRegisteredEngine.md) | A list of Delphix Engines registered with this instance of Data Control Tower. | 
**apiTelemetry** | [**List&lt;PhoneHomeBundleApiTelemetry&gt;**](PhoneHomeBundleApiTelemetry.md) | A list of API telemetry records.\&quot; | 
**dates** | **List&lt;LocalDate&gt;** | A list of dates for which telemetry data is included in this bundle. | 
**bundleGenerationTime** | **OffsetDateTime** | The UTC time at bundle generation (ISO 8601 format). | 



