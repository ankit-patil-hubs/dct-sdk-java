

# BundleUploadEvent

Bundle Upload Event

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The ID of the bundle generation event. |  [optional]
**generationStartTime** | **OffsetDateTime** | The time when the bundle generation started. |  [optional]
**generationEndTime** | **OffsetDateTime** | The time when the bundle generation ended. |  [optional]
**allGapsFilled** | **Boolean** | True if the bundle was fully built, False if it was trimmed short due to constraints |  [optional]
**dataDates** | **List&lt;LocalDate&gt;** | The list of dates for which the data is included in the bundle. |  [optional]



