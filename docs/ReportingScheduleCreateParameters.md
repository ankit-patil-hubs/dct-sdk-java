

# ReportingScheduleCreateParameters


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**reportType** | [**ReportTypeEnum**](#ReportTypeEnum) |  | 
**cronExpression** | **String** | Standard cron expressions are supported e.g. 0 15 10 L * ?  - Schedule at 10:15 AM on the last day of every month, 0 0 2 ? * Mon-Fri - Schedule at 2:00 AM every Monday, Tuesday, Wednesday, Thursday and Friday. For more details kindly refer- \&quot;http://www.quartz-scheduler.org/documentation/\&quot; | 
**timeZone** | **String** | Timezones are specified according to the Olson tzinfo database - \&quot;https://en.wikipedia.org/wiki/List_of_tz_database_time_zones\&quot;. |  [optional]
**message** | **String** |  |  [optional]
**fileFormat** | [**FileFormatEnum**](#FileFormatEnum) |  | 
**enabled** | **Boolean** |  | 
**recipients** | **Set&lt;String&gt;** |  | 
**sortColumn** | [**SortColumnEnum**](#SortColumnEnum) |  |  [optional]
**rowCount** | **Integer** |  |  [optional]
**makeCurrentAccountOwner** | **Boolean** | Whether the account creating this reporting schedule must be configured as owner of the reporting schedule. |  [optional]



## Enum: ReportTypeEnum

Name | Value
---- | -----
VIRTUALIZATION_STORAGE_SUMMARY | &quot;VIRTUALIZATION_STORAGE_SUMMARY&quot;
ENGINE_PERFORMANCE_ANALYTIC | &quot;ENGINE_PERFORMANCE_ANALYTIC&quot;
VDB_INVENTORY_DATA | &quot;VDB_INVENTORY_DATA&quot;
DSOURCE_USAGE_DATA | &quot;DSOURCE_USAGE_DATA&quot;
DSOURCE_CONSUMPTION_DATA | &quot;DSOURCE_CONSUMPTION_DATA&quot;
MASKING_EXECUTION_METRICS | &quot;MASKING_EXECUTION_METRICS&quot;
AUDIT_LOGS_SUMMARY | &quot;AUDIT_LOGS_SUMMARY&quot;
STORAGE_SAVINGS_SUMMARY | &quot;STORAGE_SAVINGS_SUMMARY&quot;



## Enum: FileFormatEnum

Name | Value
---- | -----
CSV | &quot;CSV&quot;



## Enum: SortColumnEnum

Name | Value
---- | -----
ENGINE_ID | &quot;engine_id&quot;
ENGINE_NAME | &quot;engine_name&quot;
ENGINE_HOSTNAME | &quot;engine_hostname&quot;
TOTAL_CAPACITY | &quot;total_capacity&quot;
FREE_STORAGE | &quot;free_storage&quot;
USED_STORAGE | &quot;used_storage&quot;
USED_PERCENTAGE | &quot;used_percentage&quot;
DSOURCE_COUNT | &quot;dsource_count&quot;
VDB_COUNT | &quot;vdb_count&quot;
TOTAL_OBJECT_COUNT | &quot;total_object_count&quot;
NAME | &quot;name&quot;
UNVIRTUALIZED_SPACE | &quot;unvirtualized_space&quot;
ACTUAL_SPACE | &quot;actual_space&quot;
DEPENDANT_VDBS | &quot;dependant_vdbs&quot;
TYPE | &quot;type&quot;
VERSION | &quot;version&quot;
PARENT_ID | &quot;parent_id&quot;
PARENT_NAME | &quot;parent_name&quot;
CREATION_DATE | &quot;creation_date&quot;
PARENT_TIMEFLOW_LOCATION | &quot;parent_timeflow_location&quot;
PARENT_TIMEFLOW_TIMESTAMP | &quot;parent_timeflow_timestamp&quot;
PARENT_TIMEFLOW_TIMEZONE | &quot;parent_timeflow_timezone&quot;
ENABLED | &quot;enabled&quot;
STATUS | &quot;status&quot;
_ENGINE_ID | &quot;-engine_id&quot;
_ENGINE_NAME | &quot;-engine_name&quot;
_ENGINE_HOSTNAME | &quot;-engine_hostname&quot;
_TOTAL_CAPACITY | &quot;-total_capacity&quot;
_FREE_STORAGE | &quot;-free_storage&quot;
_USED_STORAGE | &quot;-used_storage&quot;
_USED_PERCENTAGE | &quot;-used_percentage&quot;
_DSOURCE_COUNT | &quot;-dsource_count&quot;
_VDB_COUNT | &quot;-vdb_count&quot;
_TOTAL_OBJECT_COUNT | &quot;-total_object_count&quot;
_UNVIRTUALIZED_SPACE | &quot;-unvirtualized_space&quot;
_ACTUAL_SPACE | &quot;-actual_space&quot;
_DEPENDANT_VDBS | &quot;-dependant_vdbs&quot;
_NAME | &quot;-name&quot;
_TYPE | &quot;-type&quot;
_VERSION | &quot;-version&quot;
_PARENT_ID | &quot;-parent_id&quot;
_PARENT_NAME | &quot;-parent_name&quot;
_CREATION_DATE | &quot;-creation_date&quot;
_PARENT_TIMEFLOW_LOCATION | &quot;-parent_timeflow_location&quot;
_PARENT_TIMEFLOW_TIMESTAMP | &quot;-parent_timeflow_timestamp&quot;
_PARENT_TIMEFLOW_TIMEZONE | &quot;-parent_timeflow_timezone&quot;
_ENABLED | &quot;-enabled&quot;
_STATUS | &quot;-status&quot;



