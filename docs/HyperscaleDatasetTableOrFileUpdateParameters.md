

# HyperscaleDatasetTableOrFileUpdateParameters

The updatable properties of a table or file which is part of a hyperscale dataset.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**filterKey** | **String** | The unique database column field to filter the source data. Set this property to an empty string to clear the value. |  [optional]
**columnArrayRows** | **Long** | The number of column array rows to be used by the sqlldr oracle utility which determines the number of rows loaded before the stream buffer is built. |  [optional]
**unloadSplit** | **Long** | The number of unloaded files to be generated from the source database. |  [optional]
**streamSize** | **Long** | Long The stream size to be used by the sqlldr oracle utility which specifies the size (in bytes) of the data stream sent from the client to the server. |  [optional]
**endOfRecord** | **String** | The end of line character. Support values are \\n, \\r  and \\r\\n (Delimited files only). |  [optional]
**delimiter** | **String** | The single character length delimiter used in source files (Delimited files only). |  [optional]
**enclosure** | **String** | The single character length quote character used in the source files (Delimited files only). |  [optional]
**enclosureEscapeCharacter** | **String** | The escape character used to escape quote characters (Delimited files only). |  [optional]
**escapeEnclosureEscapeCharacter** | **Boolean** | Whether to escape the enclosure escape character (Delimited files only). |  [optional]
**hasHeaders** | **Boolean** | Whether source files have header column names or not (Delimited files only). If set to true, format files with the same column names are created and the same can be used for the masking inventory. If set to false, the column names of pattern f0, f1, f2, and so on are used to create the format files for delimited file masking. |  [optional]
**uniqueSourceFilesIdentifier** | **String** | This is the source key that maps the load-service and masking-service data sets with the unload-service data set (Delimited files only). Please ensure that this value is different for each HyperscaleDatasetTableOrFile. |  [optional]
**sourceFiles** | **List&lt;String&gt;** | List of all source files that need to be masked (Delimited files only). All files should have the same delimiter character and other helper characters. All files should have the same number of columns and same column names if it has a header line. |  [optional]
**performJoin** | **Boolean** | Whether the split files must be joined (Delimited files only). |  [optional]



