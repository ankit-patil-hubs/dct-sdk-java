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
import com.delphix.dct.models.MaskingRuleset;
import com.delphix.dct.models.Tag;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.threeten.bp.OffsetDateTime;

/**
 * A masking job.
 */
@ApiModel(description = "A masking job.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-03T12:50:51.668272+05:30[Asia/Kolkata]")
public class MaskingJob {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_RULESET = "ruleset";
  @SerializedName(SERIALIZED_NAME_RULESET)
  private MaskingRuleset ruleset;

  public static final String SERIALIZED_NAME_CONNECTOR_TYPE = "connector_type";
  @SerializedName(SERIALIZED_NAME_CONNECTOR_TYPE)
  private String connectorType;

  public static final String SERIALIZED_NAME_IS_ON_THE_FLY_MASKING = "is_on_the_fly_masking";
  @SerializedName(SERIALIZED_NAME_IS_ON_THE_FLY_MASKING)
  private Boolean isOnTheFlyMasking;

  public static final String SERIALIZED_NAME_CREATION_DATE = "creation_date";
  @SerializedName(SERIALIZED_NAME_CREATION_DATE)
  private OffsetDateTime creationDate;

  public static final String SERIALIZED_NAME_LAST_COMPLETED_EXECUTION_DATE = "last_completed_execution_date";
  @SerializedName(SERIALIZED_NAME_LAST_COMPLETED_EXECUTION_DATE)
  private OffsetDateTime lastCompletedExecutionDate;

  /**
   * The status of this MaskingJob&#39;s last execution.
   */
  @JsonAdapter(LastExecutionStatusEnum.Adapter.class)
  public enum LastExecutionStatusEnum {
    PENDING("PENDING"),
    
    CANCELLED("CANCELLED"),
    
    FAILED("FAILED"),
    
    QUEUED("QUEUED"),
    
    RUNNING("RUNNING"),
    
    SUCCEEDED("SUCCEEDED");

    private String value;

    LastExecutionStatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static LastExecutionStatusEnum fromValue(String value) {
      for (LastExecutionStatusEnum b : LastExecutionStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<LastExecutionStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final LastExecutionStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public LastExecutionStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return LastExecutionStatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_LAST_EXECUTION_STATUS = "last_execution_status";
  @SerializedName(SERIALIZED_NAME_LAST_EXECUTION_STATUS)
  private LastExecutionStatusEnum lastExecutionStatus;

  public static final String SERIALIZED_NAME_LAST_EXECUTION_ID = "last_execution_id";
  @SerializedName(SERIALIZED_NAME_LAST_EXECUTION_ID)
  private String lastExecutionId;

  public static final String SERIALIZED_NAME_CONNECTOR_USERNAME = "connector_username";
  @SerializedName(SERIALIZED_NAME_CONNECTOR_USERNAME)
  private String connectorUsername;

  public static final String SERIALIZED_NAME_CONNECTOR_PASSWORD = "connector_password";
  @SerializedName(SERIALIZED_NAME_CONNECTOR_PASSWORD)
  private String connectorPassword;

  public static final String SERIALIZED_NAME_ON_THE_FLY_SOURCE_CONNECTOR_USERNAME = "on_the_fly_source_connector_username";
  @SerializedName(SERIALIZED_NAME_ON_THE_FLY_SOURCE_CONNECTOR_USERNAME)
  private String onTheFlySourceConnectorUsername;

  public static final String SERIALIZED_NAME_ON_THE_FLY_SOURCE_CONNECTOR_PASSWORD = "on_the_fly_source_connector_password";
  @SerializedName(SERIALIZED_NAME_ON_THE_FLY_SOURCE_CONNECTOR_PASSWORD)
  private String onTheFlySourceConnectorPassword;

  /**
   * The type of this Job.
   */
  @JsonAdapter(JobTypeEnum.Adapter.class)
  public enum JobTypeEnum {
    STANDARD("STANDARD"),
    
    HYPERSCALE("HYPERSCALE");

    private String value;

    JobTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static JobTypeEnum fromValue(String value) {
      for (JobTypeEnum b : JobTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<JobTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final JobTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public JobTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return JobTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_JOB_TYPE = "job_type";
  @SerializedName(SERIALIZED_NAME_JOB_TYPE)
  private JobTypeEnum jobType;

  public static final String SERIALIZED_NAME_HYPERSCALE_INSTANCE_ID = "hyperscale_instance_id";
  @SerializedName(SERIALIZED_NAME_HYPERSCALE_INSTANCE_ID)
  private String hyperscaleInstanceId;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_DATASET_ID = "dataset_id";
  @SerializedName(SERIALIZED_NAME_DATASET_ID)
  private String datasetId;

  /**
   * Defines whether execution data will be stored after execution is complete (Hyperscale Job only).
   */
  @JsonAdapter(RetainExecutionDataEnum.Adapter.class)
  public enum RetainExecutionDataEnum {
    NO("NO"),
    
    ON_ERROR("ON_ERROR"),
    
    ALWAYS("ALWAYS");

    private String value;

    RetainExecutionDataEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static RetainExecutionDataEnum fromValue(String value) {
      for (RetainExecutionDataEnum b : RetainExecutionDataEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<RetainExecutionDataEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RetainExecutionDataEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RetainExecutionDataEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return RetainExecutionDataEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_RETAIN_EXECUTION_DATA = "retain_execution_data";
  @SerializedName(SERIALIZED_NAME_RETAIN_EXECUTION_DATA)
  private RetainExecutionDataEnum retainExecutionData;

  public static final String SERIALIZED_NAME_MAX_MEMORY = "max_memory";
  @SerializedName(SERIALIZED_NAME_MAX_MEMORY)
  private Integer maxMemory;

  public static final String SERIALIZED_NAME_MIN_MEMORY = "min_memory";
  @SerializedName(SERIALIZED_NAME_MIN_MEMORY)
  private Integer minMemory;

  public static final String SERIALIZED_NAME_FEEDBACK_SIZE = "feedback_size";
  @SerializedName(SERIALIZED_NAME_FEEDBACK_SIZE)
  private Integer feedbackSize;

  public static final String SERIALIZED_NAME_STREAM_ROW_LIMIT = "stream_row_limit";
  @SerializedName(SERIALIZED_NAME_STREAM_ROW_LIMIT)
  private Integer streamRowLimit;

  public static final String SERIALIZED_NAME_NUM_INPUT_STREAMS = "num_input_streams";
  @SerializedName(SERIALIZED_NAME_NUM_INPUT_STREAMS)
  private Integer numInputStreams;

  public static final String SERIALIZED_NAME_MAX_CONCURRENT_SOURCE_CONNECTIONS = "max_concurrent_source_connections";
  @SerializedName(SERIALIZED_NAME_MAX_CONCURRENT_SOURCE_CONNECTIONS)
  private Integer maxConcurrentSourceConnections;

  public static final String SERIALIZED_NAME_MAX_CONCURRENT_TARGET_CONNECTIONS = "max_concurrent_target_connections";
  @SerializedName(SERIALIZED_NAME_MAX_CONCURRENT_TARGET_CONNECTIONS)
  private Integer maxConcurrentTargetConnections;

  public static final String SERIALIZED_NAME_PARALLELISM_DEGREE = "parallelism_degree";
  @SerializedName(SERIALIZED_NAME_PARALLELISM_DEGREE)
  private Integer parallelismDegree;

  public static final String SERIALIZED_NAME_SOURCE_MASKING_JOB_ID = "source_masking_job_id";
  @SerializedName(SERIALIZED_NAME_SOURCE_MASKING_JOB_ID)
  private String sourceMaskingJobId;

  public static final String SERIALIZED_NAME_ENGINE_IDS = "engine_ids";
  @SerializedName(SERIALIZED_NAME_ENGINE_IDS)
  private List<String> engineIds = null;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<Tag> tags = null;


   /**
   * The Masking Job entity ID.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "masking-job-1", value = "The Masking Job entity ID.")

  public String getId() {
    return id;
  }




  public MaskingJob name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of this Masking Job.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "My favorite MaskingJob", value = "The name of this Masking Job.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public MaskingJob ruleset(MaskingRuleset ruleset) {
    
    this.ruleset = ruleset;
    return this;
  }

   /**
   * Get ruleset
   * @return ruleset
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public MaskingRuleset getRuleset() {
    return ruleset;
  }


  public void setRuleset(MaskingRuleset ruleset) {
    this.ruleset = ruleset;
  }


  public MaskingJob connectorType(String connectorType) {
    
    this.connectorType = connectorType;
    return this;
  }

   /**
   * The type of data being masked by this Job. If the Masking Job is masking a database this is the type of the database (Standard Job only).
   * @return connectorType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "MARIADB", value = "The type of data being masked by this Job. If the Masking Job is masking a database this is the type of the database (Standard Job only).")

  public String getConnectorType() {
    return connectorType;
  }


  public void setConnectorType(String connectorType) {
    this.connectorType = connectorType;
  }


  public MaskingJob isOnTheFlyMasking(Boolean isOnTheFlyMasking) {
    
    this.isOnTheFlyMasking = isOnTheFlyMasking;
    return this;
  }

   /**
   * Whether this is an on-the-fly masking job (Standard Job only).
   * @return isOnTheFlyMasking
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Whether this is an on-the-fly masking job (Standard Job only).")

  public Boolean getIsOnTheFlyMasking() {
    return isOnTheFlyMasking;
  }


  public void setIsOnTheFlyMasking(Boolean isOnTheFlyMasking) {
    this.isOnTheFlyMasking = isOnTheFlyMasking;
  }


  public MaskingJob creationDate(OffsetDateTime creationDate) {
    
    this.creationDate = creationDate;
    return this;
  }

   /**
   * The date this MaskingJob was created (Standard Job only).
   * @return creationDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2022-11-30T08:51:34.148Z", value = "The date this MaskingJob was created (Standard Job only).")

  public OffsetDateTime getCreationDate() {
    return creationDate;
  }


  public void setCreationDate(OffsetDateTime creationDate) {
    this.creationDate = creationDate;
  }


  public MaskingJob lastCompletedExecutionDate(OffsetDateTime lastCompletedExecutionDate) {
    
    this.lastCompletedExecutionDate = lastCompletedExecutionDate;
    return this;
  }

   /**
   * The date this MaskingJob was last executed to completion.
   * @return lastCompletedExecutionDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2022-11-30T09:51:34.148Z", value = "The date this MaskingJob was last executed to completion.")

  public OffsetDateTime getLastCompletedExecutionDate() {
    return lastCompletedExecutionDate;
  }


  public void setLastCompletedExecutionDate(OffsetDateTime lastCompletedExecutionDate) {
    this.lastCompletedExecutionDate = lastCompletedExecutionDate;
  }


  public MaskingJob lastExecutionStatus(LastExecutionStatusEnum lastExecutionStatus) {
    
    this.lastExecutionStatus = lastExecutionStatus;
    return this;
  }

   /**
   * The status of this MaskingJob&#39;s last execution.
   * @return lastExecutionStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "SUCCEEDED", value = "The status of this MaskingJob's last execution.")

  public LastExecutionStatusEnum getLastExecutionStatus() {
    return lastExecutionStatus;
  }


  public void setLastExecutionStatus(LastExecutionStatusEnum lastExecutionStatus) {
    this.lastExecutionStatus = lastExecutionStatus;
  }


  public MaskingJob lastExecutionId(String lastExecutionId) {
    
    this.lastExecutionId = lastExecutionId;
    return this;
  }

   /**
   * The ID of this MaskingJob&#39;s last execution.
   * @return lastExecutionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "00e38996-7da2-4827-8f3e-0503234de537", value = "The ID of this MaskingJob's last execution.")

  public String getLastExecutionId() {
    return lastExecutionId;
  }


  public void setLastExecutionId(String lastExecutionId) {
    this.lastExecutionId = lastExecutionId;
  }


  public MaskingJob connectorUsername(String connectorUsername) {
    
    this.connectorUsername = connectorUsername;
    return this;
  }

   /**
   * The username of the Connector used by the MaskingJob (Standard Job only). For hyperscale jobs, see the connector of the dataset.
   * @return connectorUsername
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "user123", value = "The username of the Connector used by the MaskingJob (Standard Job only). For hyperscale jobs, see the connector of the dataset.")

  public String getConnectorUsername() {
    return connectorUsername;
  }


  public void setConnectorUsername(String connectorUsername) {
    this.connectorUsername = connectorUsername;
  }


  public MaskingJob connectorPassword(String connectorPassword) {
    
    this.connectorPassword = connectorPassword;
    return this;
  }

   /**
   * The password of the Connector used by the MaskingJob (Standard Job only). For hyperscale jobs, see the connector of the dataset.
   * @return connectorPassword
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "*****", value = "The password of the Connector used by the MaskingJob (Standard Job only). For hyperscale jobs, see the connector of the dataset.")

  public String getConnectorPassword() {
    return connectorPassword;
  }


  public void setConnectorPassword(String connectorPassword) {
    this.connectorPassword = connectorPassword;
  }


  public MaskingJob onTheFlySourceConnectorUsername(String onTheFlySourceConnectorUsername) {
    
    this.onTheFlySourceConnectorUsername = onTheFlySourceConnectorUsername;
    return this;
  }

   /**
   * The username of the source Connector used by the on-the-fly MaskingJob (Standard Job only).
   * @return onTheFlySourceConnectorUsername
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "user123", value = "The username of the source Connector used by the on-the-fly MaskingJob (Standard Job only).")

  public String getOnTheFlySourceConnectorUsername() {
    return onTheFlySourceConnectorUsername;
  }


  public void setOnTheFlySourceConnectorUsername(String onTheFlySourceConnectorUsername) {
    this.onTheFlySourceConnectorUsername = onTheFlySourceConnectorUsername;
  }


  public MaskingJob onTheFlySourceConnectorPassword(String onTheFlySourceConnectorPassword) {
    
    this.onTheFlySourceConnectorPassword = onTheFlySourceConnectorPassword;
    return this;
  }

   /**
   * The password of the source Connector used by the on-the-fly MaskingJob (Standard Job only).
   * @return onTheFlySourceConnectorPassword
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "*****", value = "The password of the source Connector used by the on-the-fly MaskingJob (Standard Job only).")

  public String getOnTheFlySourceConnectorPassword() {
    return onTheFlySourceConnectorPassword;
  }


  public void setOnTheFlySourceConnectorPassword(String onTheFlySourceConnectorPassword) {
    this.onTheFlySourceConnectorPassword = onTheFlySourceConnectorPassword;
  }


  public MaskingJob jobType(JobTypeEnum jobType) {
    
    this.jobType = jobType;
    return this;
  }

   /**
   * The type of this Job.
   * @return jobType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "STANDARD", value = "The type of this Job.")

  public JobTypeEnum getJobType() {
    return jobType;
  }


  public void setJobType(JobTypeEnum jobType) {
    this.jobType = jobType;
  }


  public MaskingJob hyperscaleInstanceId(String hyperscaleInstanceId) {
    
    this.hyperscaleInstanceId = hyperscaleInstanceId;
    return this;
  }

   /**
   * The ID of the Hyperscale instance of this Job (Hyperscale Job only).
   * @return hyperscaleInstanceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "abc", value = "The ID of the Hyperscale instance of this Job (Hyperscale Job only).")

  public String getHyperscaleInstanceId() {
    return hyperscaleInstanceId;
  }


  public void setHyperscaleInstanceId(String hyperscaleInstanceId) {
    this.hyperscaleInstanceId = hyperscaleInstanceId;
  }


  public MaskingJob description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Description of the Job (Hyperscale Job only).
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Job for app finance", value = "Description of the Job (Hyperscale Job only).")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public MaskingJob datasetId(String datasetId) {
    
    this.datasetId = datasetId;
    return this;
  }

   /**
   * Dataset of the Hyperscale Job (Hyperscale Job only).
   * @return datasetId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "dataset-123", value = "Dataset of the Hyperscale Job (Hyperscale Job only).")

  public String getDatasetId() {
    return datasetId;
  }


  public void setDatasetId(String datasetId) {
    this.datasetId = datasetId;
  }


  public MaskingJob retainExecutionData(RetainExecutionDataEnum retainExecutionData) {
    
    this.retainExecutionData = retainExecutionData;
    return this;
  }

   /**
   * Defines whether execution data will be stored after execution is complete (Hyperscale Job only).
   * @return retainExecutionData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "Defines whether execution data will be stored after execution is complete (Hyperscale Job only).")

  public RetainExecutionDataEnum getRetainExecutionData() {
    return retainExecutionData;
  }


  public void setRetainExecutionData(RetainExecutionDataEnum retainExecutionData) {
    this.retainExecutionData = retainExecutionData;
  }


  public MaskingJob maxMemory(Integer maxMemory) {
    
    this.maxMemory = maxMemory;
    return this;
  }

   /**
   * Maximum memory to be allocated for each Masking job (Hyperscale Job only).
   * @return maxMemory
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1024", value = "Maximum memory to be allocated for each Masking job (Hyperscale Job only).")

  public Integer getMaxMemory() {
    return maxMemory;
  }


  public void setMaxMemory(Integer maxMemory) {
    this.maxMemory = maxMemory;
  }


  public MaskingJob minMemory(Integer minMemory) {
    
    this.minMemory = minMemory;
    return this;
  }

   /**
   * Minimum memory to be allocated for each Masking job (Hyperscale Job only).
   * @return minMemory
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1024", value = "Minimum memory to be allocated for each Masking job (Hyperscale Job only).")

  public Integer getMinMemory() {
    return minMemory;
  }


  public void setMinMemory(Integer minMemory) {
    this.minMemory = minMemory;
  }


  public MaskingJob feedbackSize(Integer feedbackSize) {
    
    this.feedbackSize = feedbackSize;
    return this;
  }

   /**
   * Feedback Size for each Masking job (Hyperscale Job only).
   * @return feedbackSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "32", value = "Feedback Size for each Masking job (Hyperscale Job only).")

  public Integer getFeedbackSize() {
    return feedbackSize;
  }


  public void setFeedbackSize(Integer feedbackSize) {
    this.feedbackSize = feedbackSize;
  }


  public MaskingJob streamRowLimit(Integer streamRowLimit) {
    
    this.streamRowLimit = streamRowLimit;
    return this;
  }

   /**
   * Stream Row Limit for each Masking job (Hyperscale Job only).
   * @return streamRowLimit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "4", value = "Stream Row Limit for each Masking job (Hyperscale Job only).")

  public Integer getStreamRowLimit() {
    return streamRowLimit;
  }


  public void setStreamRowLimit(Integer streamRowLimit) {
    this.streamRowLimit = streamRowLimit;
  }


  public MaskingJob numInputStreams(Integer numInputStreams) {
    
    this.numInputStreams = numInputStreams;
    return this;
  }

   /**
   * Number of input streams to be configured for Masking Job (Hyperscale Job only).
   * @return numInputStreams
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "4", value = "Number of input streams to be configured for Masking Job (Hyperscale Job only).")

  public Integer getNumInputStreams() {
    return numInputStreams;
  }


  public void setNumInputStreams(Integer numInputStreams) {
    this.numInputStreams = numInputStreams;
  }


  public MaskingJob maxConcurrentSourceConnections(Integer maxConcurrentSourceConnections) {
    
    this.maxConcurrentSourceConnections = maxConcurrentSourceConnections;
    return this;
  }

   /**
   * Maximum number of parallel connection that the Hyperscale instance can have with the source datasource (Hyperscale Job only).
   * @return maxConcurrentSourceConnections
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "32", value = "Maximum number of parallel connection that the Hyperscale instance can have with the source datasource (Hyperscale Job only).")

  public Integer getMaxConcurrentSourceConnections() {
    return maxConcurrentSourceConnections;
  }


  public void setMaxConcurrentSourceConnections(Integer maxConcurrentSourceConnections) {
    this.maxConcurrentSourceConnections = maxConcurrentSourceConnections;
  }


  public MaskingJob maxConcurrentTargetConnections(Integer maxConcurrentTargetConnections) {
    
    this.maxConcurrentTargetConnections = maxConcurrentTargetConnections;
    return this;
  }

   /**
   * Maximum number of parallel connection that the Hyperscale instance can have with the target datasource (Hyperscale Job only).
   * @return maxConcurrentTargetConnections
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "32", value = "Maximum number of parallel connection that the Hyperscale instance can have with the target datasource (Hyperscale Job only).")

  public Integer getMaxConcurrentTargetConnections() {
    return maxConcurrentTargetConnections;
  }


  public void setMaxConcurrentTargetConnections(Integer maxConcurrentTargetConnections) {
    this.maxConcurrentTargetConnections = maxConcurrentTargetConnections;
  }


  public MaskingJob parallelismDegree(Integer parallelismDegree) {
    
    this.parallelismDegree = parallelismDegree;
    return this;
  }

   /**
   * The degree of parallelism (DOP) per Oracle job to recreate the index in the post-load process (Hyperscale Job only).
   * @return parallelismDegree
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "4", value = "The degree of parallelism (DOP) per Oracle job to recreate the index in the post-load process (Hyperscale Job only).")

  public Integer getParallelismDegree() {
    return parallelismDegree;
  }


  public void setParallelismDegree(Integer parallelismDegree) {
    this.parallelismDegree = parallelismDegree;
  }


  public MaskingJob sourceMaskingJobId(String sourceMaskingJobId) {
    
    this.sourceMaskingJobId = sourceMaskingJobId;
    return this;
  }

   /**
   * The ID of the MaskingJob that was used as the source to create this job (Hyperscale Job only).
   * @return sourceMaskingJobId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "masking-job-0", value = "The ID of the MaskingJob that was used as the source to create this job (Hyperscale Job only).")

  public String getSourceMaskingJobId() {
    return sourceMaskingJobId;
  }


  public void setSourceMaskingJobId(String sourceMaskingJobId) {
    this.sourceMaskingJobId = sourceMaskingJobId;
  }


  public MaskingJob engineIds(List<String> engineIds) {
    
    this.engineIds = engineIds;
    return this;
  }

  public MaskingJob addEngineIdsItem(String engineIdsItem) {
    if (this.engineIds == null) {
      this.engineIds = new ArrayList<String>();
    }
    this.engineIds.add(engineIdsItem);
    return this;
  }

   /**
   * List of engines that this job can run on (Hyperscale Job only).
   * @return engineIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of engines that this job can run on (Hyperscale Job only).")

  public List<String> getEngineIds() {
    return engineIds;
  }


  public void setEngineIds(List<String> engineIds) {
    this.engineIds = engineIds;
  }


  public MaskingJob tags(List<Tag> tags) {
    
    this.tags = tags;
    return this;
  }

  public MaskingJob addTagsItem(Tag tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<Tag>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Tag> getTags() {
    return tags;
  }


  public void setTags(List<Tag> tags) {
    this.tags = tags;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MaskingJob maskingJob = (MaskingJob) o;
    return Objects.equals(this.id, maskingJob.id) &&
        Objects.equals(this.name, maskingJob.name) &&
        Objects.equals(this.ruleset, maskingJob.ruleset) &&
        Objects.equals(this.connectorType, maskingJob.connectorType) &&
        Objects.equals(this.isOnTheFlyMasking, maskingJob.isOnTheFlyMasking) &&
        Objects.equals(this.creationDate, maskingJob.creationDate) &&
        Objects.equals(this.lastCompletedExecutionDate, maskingJob.lastCompletedExecutionDate) &&
        Objects.equals(this.lastExecutionStatus, maskingJob.lastExecutionStatus) &&
        Objects.equals(this.lastExecutionId, maskingJob.lastExecutionId) &&
        Objects.equals(this.connectorUsername, maskingJob.connectorUsername) &&
        Objects.equals(this.connectorPassword, maskingJob.connectorPassword) &&
        Objects.equals(this.onTheFlySourceConnectorUsername, maskingJob.onTheFlySourceConnectorUsername) &&
        Objects.equals(this.onTheFlySourceConnectorPassword, maskingJob.onTheFlySourceConnectorPassword) &&
        Objects.equals(this.jobType, maskingJob.jobType) &&
        Objects.equals(this.hyperscaleInstanceId, maskingJob.hyperscaleInstanceId) &&
        Objects.equals(this.description, maskingJob.description) &&
        Objects.equals(this.datasetId, maskingJob.datasetId) &&
        Objects.equals(this.retainExecutionData, maskingJob.retainExecutionData) &&
        Objects.equals(this.maxMemory, maskingJob.maxMemory) &&
        Objects.equals(this.minMemory, maskingJob.minMemory) &&
        Objects.equals(this.feedbackSize, maskingJob.feedbackSize) &&
        Objects.equals(this.streamRowLimit, maskingJob.streamRowLimit) &&
        Objects.equals(this.numInputStreams, maskingJob.numInputStreams) &&
        Objects.equals(this.maxConcurrentSourceConnections, maskingJob.maxConcurrentSourceConnections) &&
        Objects.equals(this.maxConcurrentTargetConnections, maskingJob.maxConcurrentTargetConnections) &&
        Objects.equals(this.parallelismDegree, maskingJob.parallelismDegree) &&
        Objects.equals(this.sourceMaskingJobId, maskingJob.sourceMaskingJobId) &&
        Objects.equals(this.engineIds, maskingJob.engineIds) &&
        Objects.equals(this.tags, maskingJob.tags);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && a.get().getClass().isArray() ? Arrays.equals((T[])a.get(), (T[])b.get()) : Objects.equals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, ruleset, connectorType, isOnTheFlyMasking, creationDate, lastCompletedExecutionDate, lastExecutionStatus, lastExecutionId, connectorUsername, connectorPassword, onTheFlySourceConnectorUsername, onTheFlySourceConnectorPassword, jobType, hyperscaleInstanceId, description, datasetId, retainExecutionData, maxMemory, minMemory, feedbackSize, streamRowLimit, numInputStreams, maxConcurrentSourceConnections, maxConcurrentTargetConnections, parallelismDegree, sourceMaskingJobId, engineIds, tags);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent()
      ? (a.get().getClass().isArray() ? Arrays.hashCode((T[])a.get()) : Objects.hashCode(a.get()))
      : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MaskingJob {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    ruleset: ").append(toIndentedString(ruleset)).append("\n");
    sb.append("    connectorType: ").append(toIndentedString(connectorType)).append("\n");
    sb.append("    isOnTheFlyMasking: ").append(toIndentedString(isOnTheFlyMasking)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    lastCompletedExecutionDate: ").append(toIndentedString(lastCompletedExecutionDate)).append("\n");
    sb.append("    lastExecutionStatus: ").append(toIndentedString(lastExecutionStatus)).append("\n");
    sb.append("    lastExecutionId: ").append(toIndentedString(lastExecutionId)).append("\n");
    sb.append("    connectorUsername: ").append(toIndentedString(connectorUsername)).append("\n");
    sb.append("    connectorPassword: ").append(toIndentedString(connectorPassword)).append("\n");
    sb.append("    onTheFlySourceConnectorUsername: ").append(toIndentedString(onTheFlySourceConnectorUsername)).append("\n");
    sb.append("    onTheFlySourceConnectorPassword: ").append(toIndentedString(onTheFlySourceConnectorPassword)).append("\n");
    sb.append("    jobType: ").append(toIndentedString(jobType)).append("\n");
    sb.append("    hyperscaleInstanceId: ").append(toIndentedString(hyperscaleInstanceId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    datasetId: ").append(toIndentedString(datasetId)).append("\n");
    sb.append("    retainExecutionData: ").append(toIndentedString(retainExecutionData)).append("\n");
    sb.append("    maxMemory: ").append(toIndentedString(maxMemory)).append("\n");
    sb.append("    minMemory: ").append(toIndentedString(minMemory)).append("\n");
    sb.append("    feedbackSize: ").append(toIndentedString(feedbackSize)).append("\n");
    sb.append("    streamRowLimit: ").append(toIndentedString(streamRowLimit)).append("\n");
    sb.append("    numInputStreams: ").append(toIndentedString(numInputStreams)).append("\n");
    sb.append("    maxConcurrentSourceConnections: ").append(toIndentedString(maxConcurrentSourceConnections)).append("\n");
    sb.append("    maxConcurrentTargetConnections: ").append(toIndentedString(maxConcurrentTargetConnections)).append("\n");
    sb.append("    parallelismDegree: ").append(toIndentedString(parallelismDegree)).append("\n");
    sb.append("    sourceMaskingJobId: ").append(toIndentedString(sourceMaskingJobId)).append("\n");
    sb.append("    engineIds: ").append(toIndentedString(engineIds)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
