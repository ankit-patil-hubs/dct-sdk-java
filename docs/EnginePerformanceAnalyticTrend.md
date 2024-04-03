

# EnginePerformanceAnalyticTrend


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**trendType** | [**TrendTypeEnum**](#TrendTypeEnum) |  |  [optional]
**engineId** | **String** | The engine id. |  [optional]
**aggregationPeriod** | **Integer** | The time period by which engine performance analytics data is being aggregated, in hours. |  [optional]
**datapoint** | [**List&lt;EnginePerformanceAnalyticTrendDatapoint&gt;**](EnginePerformanceAnalyticTrendDatapoint.md) |  |  [optional]



## Enum: TrendTypeEnum

Name | Value
---- | -----
CPU_UTILIZATION | &quot;CPU_UTILIZATION&quot;
NETWORK_THROUGHPUT_TRANSMIT | &quot;NETWORK_THROUGHPUT_TRANSMIT&quot;
NETWORK_THROUGHPUT_RECEIVE | &quot;NETWORK_THROUGHPUT_RECEIVE&quot;
DISK_LATENCY_WRITE | &quot;DISK_LATENCY_WRITE&quot;
DISK_LATENCY_READ | &quot;DISK_LATENCY_READ&quot;
DISK_LATENCY_TOTAL | &quot;DISK_LATENCY_TOTAL&quot;
DISK_THROUGHPUT_WRITE | &quot;DISK_THROUGHPUT_WRITE&quot;
DISK_THROUGHPUT_READ | &quot;DISK_THROUGHPUT_READ&quot;
DISK_THROUGHPUT_TOTAL | &quot;DISK_THROUGHPUT_TOTAL&quot;
DISK_IOPS_READ | &quot;DISK_IOPS_READ&quot;
DISK_IOPS_WRITE | &quot;DISK_IOPS_WRITE&quot;
DISK_IOPS_TOTAL | &quot;DISK_IOPS_TOTAL&quot;
NFS_LATENCY_WRITE | &quot;NFS_LATENCY_WRITE&quot;
NFS_LATENCY_READ | &quot;NFS_LATENCY_READ&quot;
NFS_LATENCY_TOTAL | &quot;NFS_LATENCY_TOTAL&quot;
NFS_THROUGHPUT_WRITE | &quot;NFS_THROUGHPUT_WRITE&quot;
NFS_THROUGHPUT_READ | &quot;NFS_THROUGHPUT_READ&quot;
NFS_THROUGHPUT_TOTAL | &quot;NFS_THROUGHPUT_TOTAL&quot;
NFS_IOPS_WRITE | &quot;NFS_IOPS_WRITE&quot;
NFS_IOPS_READ | &quot;NFS_IOPS_READ&quot;
NFS_IOPS_TOTAL | &quot;NFS_IOPS_TOTAL&quot;
ISCSI_LATENCY_WRITE | &quot;iSCSI_LATENCY_WRITE&quot;
ISCSI_LATENCY_READ | &quot;iSCSI_LATENCY_READ&quot;
ISCSI_LATENCY_TOTAL | &quot;iSCSI_LATENCY_TOTAL&quot;
ISCSI_THROUGHPUT_WRITE | &quot;iSCSI_THROUGHPUT_WRITE&quot;
ISCSI_THROUGHPUT_READ | &quot;iSCSI_THROUGHPUT_READ&quot;
ISCSI_THROUGHPUT_TOTAL | &quot;iSCSI_THROUGHPUT_TOTAL&quot;
ISCSI_IOPS_WRITE | &quot;iSCSI_IOPS_WRITE&quot;
ISCSI_IOPS_READ | &quot;iSCSI_IOPS_READ&quot;
ISCSI_IOPS_TOTAL | &quot;iSCSI_IOPS_TOTAL&quot;



