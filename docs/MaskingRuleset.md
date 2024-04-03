

# MaskingRuleset

A masking ruleset.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**TypeEnum**](#TypeEnum) | The Ruleset type. |  [optional]
**name** | **String** | The name of this Ruleset. |  [optional]
**refreshDropsTables** | **Boolean** | Whether refresh drops tables. Only applicable to database ruleset type. |  [optional]
**algorithms** | **List&lt;String&gt;** | The list of algorithms for this Ruleset. |  [optional]



## Enum: TypeEnum

Name | Value
---- | -----
FILE | &quot;FILE&quot;
DATABASE | &quot;DATABASE&quot;
MAINFRAME_DATASET | &quot;MAINFRAME_DATASET&quot;



