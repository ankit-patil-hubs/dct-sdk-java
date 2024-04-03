

# MetadataDbInfo

Information about the product's metadata database.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**external** | **Boolean** | True if an external database, i.e a database running outside of the application cluster, is in use. |  [optional]
**version** | **String** | The full database version in String format |  [optional]
**databaseProductName** | **String** | The database product name as reported by the database itself. |  [optional]
**majorVersion** | **Integer** | The database major version. |  [optional]
**minorVersion** | **Integer** | The database minor version |  [optional]
**minSupportedMajorVersion** | **Integer** | The minimum supported major version of PostgreSQL. |  [optional]
**minSupportedMinorVersion** | **Integer** | The minimum supported minor version of PostgreSQL. |  [optional]
**maxSupportedMajorVersion** | **Integer** | The maximum supported major version of PostgreSQL. |  [optional]
**maxSupportedMinorVersion** | **Integer** | The maximum supported minor version of PostgreSQL. |  [optional]
**compatible** | **Boolean** | Whether the database is recognized as valid for this product. In order to be compatible, the database product name must be a recognized PostgreSQL and the database version must be greater than or equal to the minimum minor version and smaller than or equal to the maximum support version. |  [optional]



