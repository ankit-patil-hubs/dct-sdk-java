

# MaskingEnvironment


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The MaskingEnvironment entity ID. |  [optional]
**engineId** | **String** | The ID of the Engine where this MaskingEnvironment resides. |  [optional]
**engineName** | **String** | The name of the Engine where this MaskingEnvironment resides. |  [optional]
**name** | **String** | The name of this MaskingEnvironment. |  [optional]
**purpose** | [**PurposeEnum**](#PurposeEnum) | The purpose of this MaskingEnvironment. MaskingEnvironments with a &#39;MASK&#39; purpose will have access to Masking and Profiling jobs, whereas Environments with a &#39;TOKENIZE&#39; purpose will have access to Tokenization and Re-Identification jobs. Note that any custom purposes created through the UI will be represented as &#39;MASK&#39; purposes, due to the jobs that they have access to. |  [optional]
**isWorkflowEnabled** | **Boolean** |  |  [optional]



## Enum: PurposeEnum

Name | Value
---- | -----
MASK | &quot;MASK&quot;
TOKENIZE | &quot;TOKENIZE&quot;



