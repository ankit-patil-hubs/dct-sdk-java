/*
 * Delphix DCT API
 * Delphix DCT API
 *
 * The version of the OpenAPI document: 3.9.0
 * Contact: support@delphix.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.delphix.dct.models;

import java.util.Objects;
import java.util.Arrays;
import com.delphix.dct.models.HyperscaleTaskEvent;
import com.delphix.dct.models.TaskEvent;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;

/**
 * The execution of a masking or profile job.
 */
@ApiModel(description = "The execution of a masking or profile job.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-03T12:50:51.668272+05:30[Asia/Kolkata]")
public class Execution {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_ENGINE_ID = "engine_id";
  @SerializedName(SERIALIZED_NAME_ENGINE_ID)
  private String engineId;

  public static final String SERIALIZED_NAME_HYPERSCALE_INSTANCE_ID = "hyperscale_instance_id";
  @SerializedName(SERIALIZED_NAME_HYPERSCALE_INSTANCE_ID)
  private String hyperscaleInstanceId;

  public static final String SERIALIZED_NAME_ENGINE_NAME = "engine_name";
  @SerializedName(SERIALIZED_NAME_ENGINE_NAME)
  private String engineName;

  public static final String SERIALIZED_NAME_MASKING_JOB_ID = "masking_job_id";
  @SerializedName(SERIALIZED_NAME_MASKING_JOB_ID)
  private String maskingJobId;

  public static final String SERIALIZED_NAME_MASKING_JOB_NAME = "masking_job_name";
  @SerializedName(SERIALIZED_NAME_MASKING_JOB_NAME)
  private String maskingJobName;

  public static final String SERIALIZED_NAME_SOURCE_CONNECTOR_ID = "source_connector_id";
  @SerializedName(SERIALIZED_NAME_SOURCE_CONNECTOR_ID)
  private String sourceConnectorId;

  public static final String SERIALIZED_NAME_TARGET_CONNECTOR_ID = "target_connector_id";
  @SerializedName(SERIALIZED_NAME_TARGET_CONNECTOR_ID)
  private String targetConnectorId;

  /**
   * The status of the execution regarding its completion.
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    PENDING("PENDING"),
    
    QUEUED("QUEUED"),
    
    RUNNING("RUNNING"),
    
    CANCELLED("CANCELLED"),
    
    FAILED("FAILED"),
    
    SUCCEEDED("SUCCEEDED");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status;

  public static final String SERIALIZED_NAME_ROWS_MASKED = "rows_masked";
  @SerializedName(SERIALIZED_NAME_ROWS_MASKED)
  private Long rowsMasked;

  public static final String SERIALIZED_NAME_ROWS_TOTAL = "rows_total";
  @SerializedName(SERIALIZED_NAME_ROWS_TOTAL)
  private Long rowsTotal;

  public static final String SERIALIZED_NAME_BYTES_PROCESSED = "bytes_processed";
  @SerializedName(SERIALIZED_NAME_BYTES_PROCESSED)
  private Long bytesProcessed;

  public static final String SERIALIZED_NAME_BYTES_TOTAL = "bytes_total";
  @SerializedName(SERIALIZED_NAME_BYTES_TOTAL)
  private Long bytesTotal;

  public static final String SERIALIZED_NAME_START_TIME = "start_time";
  @SerializedName(SERIALIZED_NAME_START_TIME)
  private OffsetDateTime startTime;

  public static final String SERIALIZED_NAME_SUBMIT_TIME = "submit_time";
  @SerializedName(SERIALIZED_NAME_SUBMIT_TIME)
  private OffsetDateTime submitTime;

  public static final String SERIALIZED_NAME_END_TIME = "end_time";
  @SerializedName(SERIALIZED_NAME_END_TIME)
  private OffsetDateTime endTime;

  public static final String SERIALIZED_NAME_TASK_EVENTS = "task_events";
  @SerializedName(SERIALIZED_NAME_TASK_EVENTS)
  private List<TaskEvent> taskEvents = null;

  public static final String SERIALIZED_NAME_HYPERSCALE_TASK_EVENTS = "hyperscale_task_events";
  @SerializedName(SERIALIZED_NAME_HYPERSCALE_TASK_EVENTS)
  private List<HyperscaleTaskEvent> hyperscaleTaskEvents = null;

  public static final String SERIALIZED_NAME_PROGRESS = "progress";
  @SerializedName(SERIALIZED_NAME_PROGRESS)
  private BigDecimal progress;


  public Execution id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The Execution entity ID.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "414ed52c-fa89-455d-9fb9-9c2fa5115f80", value = "The Execution entity ID.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public Execution engineId(String engineId) {
    
    this.engineId = engineId;
    return this;
  }

   /**
   * The ID of the engine where this execution ran.
   * @return engineId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "The ID of the engine where this execution ran.")

  public String getEngineId() {
    return engineId;
  }


  public void setEngineId(String engineId) {
    this.engineId = engineId;
  }


  public Execution hyperscaleInstanceId(String hyperscaleInstanceId) {
    
    this.hyperscaleInstanceId = hyperscaleInstanceId;
    return this;
  }

   /**
   * Get hyperscaleInstanceId
   * @return hyperscaleInstanceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getHyperscaleInstanceId() {
    return hyperscaleInstanceId;
  }


  public void setHyperscaleInstanceId(String hyperscaleInstanceId) {
    this.hyperscaleInstanceId = hyperscaleInstanceId;
  }


  public Execution engineName(String engineName) {
    
    this.engineName = engineName;
    return this;
  }

   /**
   * The name of the engine where this execution ran.
   * @return engineName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "prod01", value = "The name of the engine where this execution ran.")

  public String getEngineName() {
    return engineName;
  }


  public void setEngineName(String engineName) {
    this.engineName = engineName;
  }


  public Execution maskingJobId(String maskingJobId) {
    
    this.maskingJobId = maskingJobId;
    return this;
  }

   /**
   * The ID of the masking job that is being executed.
   * @return maskingJobId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2", value = "The ID of the masking job that is being executed.")

  public String getMaskingJobId() {
    return maskingJobId;
  }


  public void setMaskingJobId(String maskingJobId) {
    this.maskingJobId = maskingJobId;
  }


  public Execution maskingJobName(String maskingJobName) {
    
    this.maskingJobName = maskingJobName;
    return this;
  }

   /**
   * The name of the masking job that is being executed.
   * @return maskingJobName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "finance-masking-job", value = "The name of the masking job that is being executed.")

  public String getMaskingJobName() {
    return maskingJobName;
  }


  public void setMaskingJobName(String maskingJobName) {
    this.maskingJobName = maskingJobName;
  }


  public Execution sourceConnectorId(String sourceConnectorId) {
    
    this.sourceConnectorId = sourceConnectorId;
    return this;
  }

   /**
   * The ID of the source connector. This field is only used for multi-tenant jobs that are also on-the-fly.
   * @return sourceConnectorId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1-DATABASE-2", value = "The ID of the source connector. This field is only used for multi-tenant jobs that are also on-the-fly.")

  public String getSourceConnectorId() {
    return sourceConnectorId;
  }


  public void setSourceConnectorId(String sourceConnectorId) {
    this.sourceConnectorId = sourceConnectorId;
  }


  public Execution targetConnectorId(String targetConnectorId) {
    
    this.targetConnectorId = targetConnectorId;
    return this;
  }

   /**
   * The ID of the target connector. This field is only used for multi-tenant jobs.
   * @return targetConnectorId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1-DATABASE-3", value = "The ID of the target connector. This field is only used for multi-tenant jobs.")

  public String getTargetConnectorId() {
    return targetConnectorId;
  }


  public void setTargetConnectorId(String targetConnectorId) {
    this.targetConnectorId = targetConnectorId;
  }


  public Execution status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * The status of the execution regarding its completion.
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "RUNNING", value = "The status of the execution regarding its completion.")

  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public Execution rowsMasked(Long rowsMasked) {
    
    this.rowsMasked = rowsMasked;
    return this;
  }

   /**
   * The number of rows masked or profiled so far by this execution. This is not applicable for JSON file type.
   * @return rowsMasked
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1000", value = "The number of rows masked or profiled so far by this execution. This is not applicable for JSON file type.")

  public Long getRowsMasked() {
    return rowsMasked;
  }


  public void setRowsMasked(Long rowsMasked) {
    this.rowsMasked = rowsMasked;
  }


  public Execution rowsTotal(Long rowsTotal) {
    
    this.rowsTotal = rowsTotal;
    return this;
  }

   /**
   * The total number of rows that this execution should mask. This value is set to -1 while the total row count is being calculated. This is not applicable for JSON file type.
   * @return rowsTotal
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "5000", value = "The total number of rows that this execution should mask. This value is set to -1 while the total row count is being calculated. This is not applicable for JSON file type.")

  public Long getRowsTotal() {
    return rowsTotal;
  }


  public void setRowsTotal(Long rowsTotal) {
    this.rowsTotal = rowsTotal;
  }


  public Execution bytesProcessed(Long bytesProcessed) {
    
    this.bytesProcessed = bytesProcessed;
    return this;
  }

   /**
   * The number of bytes masked so far by this execution. This is only applicable for JSON file type.
   * @return bytesProcessed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "500", value = "The number of bytes masked so far by this execution. This is only applicable for JSON file type.")

  public Long getBytesProcessed() {
    return bytesProcessed;
  }


  public void setBytesProcessed(Long bytesProcessed) {
    this.bytesProcessed = bytesProcessed;
  }


  public Execution bytesTotal(Long bytesTotal) {
    
    this.bytesTotal = bytesTotal;
    return this;
  }

   /**
   * The total number of bytes that this execution should mask. This value is set to -1 while the total byte count is being calculated. This is only applicable for JSON file type.
   * @return bytesTotal
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "5000000", value = "The total number of bytes that this execution should mask. This value is set to -1 while the total byte count is being calculated. This is only applicable for JSON file type.")

  public Long getBytesTotal() {
    return bytesTotal;
  }


  public void setBytesTotal(Long bytesTotal) {
    this.bytesTotal = bytesTotal;
  }


  public Execution startTime(OffsetDateTime startTime) {
    
    this.startTime = startTime;
    return this;
  }

   /**
   * The date and time that this execution was started.
   * @return startTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-05-01T09:51:34.148Z", value = "The date and time that this execution was started.")

  public OffsetDateTime getStartTime() {
    return startTime;
  }


  public void setStartTime(OffsetDateTime startTime) {
    this.startTime = startTime;
  }


  public Execution submitTime(OffsetDateTime submitTime) {
    
    this.submitTime = submitTime;
    return this;
  }

   /**
   * The date and time that this execution was submitted.
   * @return submitTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-05-01T08:51:34.148Z", value = "The date and time that this execution was submitted.")

  public OffsetDateTime getSubmitTime() {
    return submitTime;
  }


  public void setSubmitTime(OffsetDateTime submitTime) {
    this.submitTime = submitTime;
  }


  public Execution endTime(OffsetDateTime endTime) {
    
    this.endTime = endTime;
    return this;
  }

   /**
   * The date and time that this execution completed.
   * @return endTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-05-01T11:51:34.148Z", value = "The date and time that this execution completed.")

  public OffsetDateTime getEndTime() {
    return endTime;
  }


  public void setEndTime(OffsetDateTime endTime) {
    this.endTime = endTime;
  }


  public Execution taskEvents(List<TaskEvent> taskEvents) {
    
    this.taskEvents = taskEvents;
    return this;
  }

  public Execution addTaskEventsItem(TaskEvent taskEventsItem) {
    if (this.taskEvents == null) {
      this.taskEvents = new ArrayList<TaskEvent>();
    }
    this.taskEvents.add(taskEventsItem);
    return this;
  }

   /**
   * The progression of steps or events performed by this execution. Only available for executions on masking engines that are version 6.0.14.0 and higher.
   * @return taskEvents
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[{\"event\":\"Initializing\",\"status\":\"SUCCEEDED\"},{\"event\":\"Job Completed\",\"status\":\"FAILED\"}]", value = "The progression of steps or events performed by this execution. Only available for executions on masking engines that are version 6.0.14.0 and higher.")

  public List<TaskEvent> getTaskEvents() {
    return taskEvents;
  }


  public void setTaskEvents(List<TaskEvent> taskEvents) {
    this.taskEvents = taskEvents;
  }


  public Execution hyperscaleTaskEvents(List<HyperscaleTaskEvent> hyperscaleTaskEvents) {
    
    this.hyperscaleTaskEvents = hyperscaleTaskEvents;
    return this;
  }

  public Execution addHyperscaleTaskEventsItem(HyperscaleTaskEvent hyperscaleTaskEventsItem) {
    if (this.hyperscaleTaskEvents == null) {
      this.hyperscaleTaskEvents = new ArrayList<HyperscaleTaskEvent>();
    }
    this.hyperscaleTaskEvents.add(hyperscaleTaskEventsItem);
    return this;
  }

   /**
   * Get hyperscaleTaskEvents
   * @return hyperscaleTaskEvents
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<HyperscaleTaskEvent> getHyperscaleTaskEvents() {
    return hyperscaleTaskEvents;
  }


  public void setHyperscaleTaskEvents(List<HyperscaleTaskEvent> hyperscaleTaskEvents) {
    this.hyperscaleTaskEvents = hyperscaleTaskEvents;
  }


  public Execution progress(BigDecimal progress) {
    
    this.progress = progress;
    return this;
  }

   /**
   * Progress of the task (value between 0 and 1, Hyperscale executions only)
   * @return progress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0.34", value = "Progress of the task (value between 0 and 1, Hyperscale executions only)")

  public BigDecimal getProgress() {
    return progress;
  }


  public void setProgress(BigDecimal progress) {
    this.progress = progress;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Execution execution = (Execution) o;
    return Objects.equals(this.id, execution.id) &&
        Objects.equals(this.engineId, execution.engineId) &&
        Objects.equals(this.hyperscaleInstanceId, execution.hyperscaleInstanceId) &&
        Objects.equals(this.engineName, execution.engineName) &&
        Objects.equals(this.maskingJobId, execution.maskingJobId) &&
        Objects.equals(this.maskingJobName, execution.maskingJobName) &&
        Objects.equals(this.sourceConnectorId, execution.sourceConnectorId) &&
        Objects.equals(this.targetConnectorId, execution.targetConnectorId) &&
        Objects.equals(this.status, execution.status) &&
        Objects.equals(this.rowsMasked, execution.rowsMasked) &&
        Objects.equals(this.rowsTotal, execution.rowsTotal) &&
        Objects.equals(this.bytesProcessed, execution.bytesProcessed) &&
        Objects.equals(this.bytesTotal, execution.bytesTotal) &&
        Objects.equals(this.startTime, execution.startTime) &&
        Objects.equals(this.submitTime, execution.submitTime) &&
        Objects.equals(this.endTime, execution.endTime) &&
        Objects.equals(this.taskEvents, execution.taskEvents) &&
        Objects.equals(this.hyperscaleTaskEvents, execution.hyperscaleTaskEvents) &&
        Objects.equals(this.progress, execution.progress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, engineId, hyperscaleInstanceId, engineName, maskingJobId, maskingJobName, sourceConnectorId, targetConnectorId, status, rowsMasked, rowsTotal, bytesProcessed, bytesTotal, startTime, submitTime, endTime, taskEvents, hyperscaleTaskEvents, progress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Execution {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    engineId: ").append(toIndentedString(engineId)).append("\n");
    sb.append("    hyperscaleInstanceId: ").append(toIndentedString(hyperscaleInstanceId)).append("\n");
    sb.append("    engineName: ").append(toIndentedString(engineName)).append("\n");
    sb.append("    maskingJobId: ").append(toIndentedString(maskingJobId)).append("\n");
    sb.append("    maskingJobName: ").append(toIndentedString(maskingJobName)).append("\n");
    sb.append("    sourceConnectorId: ").append(toIndentedString(sourceConnectorId)).append("\n");
    sb.append("    targetConnectorId: ").append(toIndentedString(targetConnectorId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    rowsMasked: ").append(toIndentedString(rowsMasked)).append("\n");
    sb.append("    rowsTotal: ").append(toIndentedString(rowsTotal)).append("\n");
    sb.append("    bytesProcessed: ").append(toIndentedString(bytesProcessed)).append("\n");
    sb.append("    bytesTotal: ").append(toIndentedString(bytesTotal)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    submitTime: ").append(toIndentedString(submitTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    taskEvents: ").append(toIndentedString(taskEvents)).append("\n");
    sb.append("    hyperscaleTaskEvents: ").append(toIndentedString(hyperscaleTaskEvents)).append("\n");
    sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

