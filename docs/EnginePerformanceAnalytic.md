

# EnginePerformanceAnalytic

Analytics Information of the engine.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**engineName** | **String** | The engine name. |  [optional]
**engineId** | **String** | The engine id. |  [optional]
**engineType** | [**EngineTypeEnum**](#EngineTypeEnum) | The engine type. |  [optional]
**aggregationPeriod** | **Integer** | The time period by which engine performance analytics data is being aggregated, in hours. |  [optional]
**cpuCoresCount** | **Integer** | The total number of CPU cores on this engine. |  [optional]
**cpuUtilization** | **Double** | The total cpu utilization of this engine, in percentage. |  [optional]
**totalMemory** | **Long** | The total amount of memory on this engine, in bytes. |  [optional]
**averageDiskLatencyRead** | **Long** | The average I/O latency of disk for read operation, in nanoseconds. |  [optional]
**averageDiskLatencyWrite** | **Long** | The average I/O latency of disk for write operation, in nanoseconds. |  [optional]
**averageDiskLatencyTotal** | **Long** | The average I/O latency of disk for both (read and write) operations, in nanoseconds. |  [optional]
**averageDiskThroughputRead** | **Long** | The average I/O throughput of disk for read operation, in bytes/s. |  [optional]
**averageDiskThroughputWrite** | **Long** | The average I/O throughput of disk for write operation, in bytes/s. |  [optional]
**averageDiskThroughputTotal** | **Long** | The average I/O throughput of disk for both (read and write) operations, in bytes/s. |  [optional]
**averageDiskIopsRead** | **Long** | The average number of read I/O operations of disk per seconds. |  [optional]
**averageDiskIopsWrite** | **Long** | The average number of write I/O operations of disk per seconds. |  [optional]
**averageDiskIopsTotal** | **Long** | The average number of read and write I/O operations of disk per seconds. |  [optional]
**averageNfsLatencyRead** | **Long** | The average I/O latency of nfs for read operation, in nanoseconds. |  [optional]
**averageNfsLatencyWrite** | **Long** | The average I/O latency of nfs for write operation, in nanoseconds. |  [optional]
**averageNfsLatencyTotal** | **Long** | The average I/O latency of nfs for both (read and write) operation, in nanoseconds. |  [optional]
**averageNfsThroughputRead** | **Long** | The average I/O throughput of disk for read operations, in bytes/s. |  [optional]
**averageNfsThroughputWrite** | **Long** | The average I/O throughput of nfs for write operations, in bytes/s. |  [optional]
**averageNfsThroughputTotal** | **Long** | The average I/O throughput of nfs for both (read and write) operations, in bytes/s. |  [optional]
**averageNfsIopsRead** | **Long** | The average number of read I/O operations of nfs per seconds. |  [optional]
**averageNfsIopsWrite** | **Long** | The average number of write I/O operations of nfs per seconds. |  [optional]
**averageNfsIopsTotal** | **Long** | The average number of read and write I/O operations of nfs per seconds. |  [optional]
**averageIscsiLatencyRead** | **Long** | The average I/O latency of iSCSI for read operation, in nanoseconds. |  [optional]
**averageIscsiLatencyWrite** | **Long** | The average I/O latency of iSCSI for write operation, in nanoseconds. |  [optional]
**averageIscsiLatencyTotal** | **Long** | The average I/O latency of iSCSI for both (read and write) operation, in nanoseconds. |  [optional]
**averageIscsiThroughputRead** | **Long** | The average I/O throughput of iSCSI read operations, in bytes/s. |  [optional]
**averageIscsiThroughputWrite** | **Long** | The average I/O throughput of iSCSI for write operations, in bytes/s. |  [optional]
**averageIscsiThroughputTotal** | **Long** | The average I/O throughput of iSCSI for both (read and write) operations, in bytes/s. |  [optional]
**averageIscsiIopsRead** | **Long** | The average number of read I/O operations of iSCSI per seconds. |  [optional]
**averageIscsiIopsWrite** | **Long** | The average number of write I/O operations of iSCSI per seconds. |  [optional]
**averageIscsiIopsTotal** | **Long** | The average number of read and write I/O operations of iSCSI per seconds. |  [optional]
**averageNetworkThroughputTransmit** | **Long** | The average bytes transmitted on the network interface, in bytes/s. |  [optional]
**averageNetworkThroughputReceive** | **Long** | The average bytes received on the network interface, in bytes/s. |  [optional]



## Enum: EngineTypeEnum

Name | Value
---- | -----
VIRTUALIZATION | &quot;VIRTUALIZATION&quot;
MASKING | &quot;MASKING&quot;
UNSET | &quot;UNSET&quot;



