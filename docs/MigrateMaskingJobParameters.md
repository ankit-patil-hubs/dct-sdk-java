

# MigrateMaskingJobParameters

Parameters to migrate a masking job.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**targetEngineId** | **String** | The ID of the engine to migrate the job to. | 
**sourceEnvironmentId** | **String** | The ID or name of the source environment on the target engine. This only applies to On-The-Fly jobs. |  [optional]
**targetEnvironmentId** | **String** | The ID or name of the target environment on the target engine to migrate the job into. |  [optional]
**forceOverwrite** | **Boolean** | Whether to overwrite objects that already exist on the target engine. |  [optional]



