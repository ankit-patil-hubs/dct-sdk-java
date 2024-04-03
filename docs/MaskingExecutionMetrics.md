

# MaskingExecutionMetrics

Metrics for a masking job.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The MaskingJob entity ID. |  [optional]
**maskingJobName** | **String** | The name of the MaskingJob. |  [optional]
**maskingJobType** | [**MaskingJobTypeEnum**](#MaskingJobTypeEnum) | The type of the Masking job. |  [optional]
**connectorType** | **String** | The type of data being masked by this Job. If the Masking Job is masking a database this is the type of the database, otherwise \&quot;FILE\&quot; or \&quot;MAINFRAME_DATASET\&quot;. |  [optional]
**rulesetName** | **String** | Name of the ruleset for the Masking job. |  [optional]
**rowsMasked** | **Long** | The number of rows masked. This is not applicable for JSON file type. |  [optional]
**rowsTotal** | **Long** | The total number of rows. This is not applicable for JSON file type. |  [optional]
**bytesMasked** | **Long** | The number of bytes masked. This is only applicable for JSON file type. |  [optional]
**bytesTotal** | **Long** | The total number of bytes. This is only applicable for JSON file type. |  [optional]
**duration** | **Long** | The time taken by the execution in ms. Only available for successful executions. |  [optional]
**tablesFilesCount** | **Long** | The number of tables or files in the ruleset associated to the Masking job. |  [optional]
**maskedTablesFilesCount** | **Long** | The number of tables or files in the ruleset associated to the Masking job for which at least one column or field is masked. |  [optional]
**columnsFieldsCount** | **Long** | The number of columns or fields across all tables or files in the ruleset associated to the Masking job. |  [optional]
**maskedColumnsFieldsCount** | **Long** | The number of columns or fields across all tables or files in the ruleset associated to the Masking job which are masked. |  [optional]



## Enum: MaskingJobTypeEnum

Name | Value
---- | -----
STANDARD | &quot;STANDARD&quot;
HYPERSCALE | &quot;HYPERSCALE&quot;



