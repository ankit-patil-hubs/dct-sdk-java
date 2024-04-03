

# HyperscaleConnector

A Hyperscale connector to read/write data from/to a datasource.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The ID of the Hyperscale Connector. |  [optional] [readonly]
**hyperscaleInstanceId** | **String** | The ID of the Hyperscale instance of this Connector. |  [optional]
**dataType** | **HyperscaleDataTypeEnum** |  |  [optional]
**name** | **String** |  |  [optional]
**sourceUsername** | **String** | The username this Connector will use to connect to the source database. |  [optional]
**sourcePassword** | **String** | The password this Connector will use to connect to the source database. |  [optional]
**sourceJdbcUrl** | **String** | The JDBC URL used to connect to the source database. |  [optional]
**sourceMongoUrl** | **String** | The MongoDB URL used to connect to the source database. |  [optional]
**sourceFilesystemPath** | **String** | The path on the filesystem where source files must be read (Delimited files Only). |  [optional]
**sourceConnectionProperties** | **Map&lt;String, String&gt;** |  |  [optional]
**targetUsername** | **String** | The username this Connector will use to connect to the target database. |  [optional]
**targetPassword** | **String** | The username this Connector will use to connect to the target database. |  [optional]
**targetJdbcUrl** | **String** | The JDBC URL used to connect to the target database. |  [optional]
**targetMongoUrl** | **String** | The MongoDB URL used to connect to the target database. |  [optional]
**targetFilesystemPath** | **String** | The path on the filesystem where target files must be written (Delimited files Only). |  [optional]
**targetConnectionProperties** | **Map&lt;String, String&gt;** |  |  [optional]
**tags** | [**List&lt;Tag&gt;**](Tag.md) |  |  [optional]



