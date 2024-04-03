

# Connector

Connectors are the way users define the data sources to which the Masking Engine should connect.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The Connector entity ID. |  [optional]
**name** | **String** | The Connector name. |  [optional]
**engineId** | **String** | A reference to the Engine that this Connector belongs to. |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | The type of Connector. One of Database, File, or Mainframe. |  [optional]
**hostname** | **String** | The network hostname or IP address of the database server. |  [optional]
**port** | **Integer** | The TCP port of the server. |  [optional]
**username** | **String** | The username this Connector will use to connect to the database. |  [optional]
**tags** | [**List&lt;Tag&gt;**](Tag.md) |  |  [optional]



## Enum: TypeEnum

Name | Value
---- | -----
DATABASE | &quot;DATABASE&quot;
FILE | &quot;FILE&quot;
MAINFRAME_DATASET | &quot;MAINFRAME_DATASET&quot;



