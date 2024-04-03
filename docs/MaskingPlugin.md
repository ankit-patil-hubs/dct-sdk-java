

# MaskingPlugin

A masking plugin.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The masking plugin entity ID. |  [optional]
**name** | **String** | The name of this plugin. |  [optional]
**pluginType** | [**PluginTypeEnum**](#PluginTypeEnum) | The plugin type. |  [optional]
**description** | **String** | A description of this plugin. |  [optional]
**installDate** | **OffsetDateTime** | The date and time when this plugin is installed. |  [optional]
**builtIn** | **Boolean** | Whether this plugin is a built-in plugin. |  [optional]
**sdkVersion** | **String** | The masking SDK version that this plugin is built from. |  [optional]
**version** | **String** | The version of this plugin. |  [optional]
**author** | **String** | The author of this plugin. |  [optional]
**frameworks** | [**List&lt;Framework&gt;**](Framework.md) | The list of frameworks for this plugin. |  [optional]
**tags** | [**List&lt;Tag&gt;**](Tag.md) | The tags of this plugin. |  [optional]



## Enum: PluginTypeEnum

Name | Value
---- | -----
EXTENDED_ALGORITHM | &quot;EXTENDED_ALGORITHM&quot;



