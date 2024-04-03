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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * A log containing warnings or errors associated with a job execution.
 */
@ApiModel(description = "A log containing warnings or errors associated with a job execution.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-03T12:50:51.668272+05:30[Asia/Kolkata]")
public class ExecutionLog {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_EXECUTION_ID = "execution_id";
  @SerializedName(SERIALIZED_NAME_EXECUTION_ID)
  private String executionId;

  public static final String SERIALIZED_NAME_MASKING_JOB_ID = "masking_job_id";
  @SerializedName(SERIALIZED_NAME_MASKING_JOB_ID)
  private String maskingJobId;

  /**
   * The status of the execution regarding its completion.
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    CANCELLED("CANCELLED"),
    
    FAILED("FAILED"),
    
    QUEUED("QUEUED"),
    
    RUNNING("RUNNING"),
    
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

  public static final String SERIALIZED_NAME_LOG = "log";
  @SerializedName(SERIALIZED_NAME_LOG)
  private String log;


  public ExecutionLog id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The ExecutionLog entity ID.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1-LOG-1", value = "The ExecutionLog entity ID.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public ExecutionLog executionId(String executionId) {
    
    this.executionId = executionId;
    return this;
  }

   /**
   * The ID of the execution.
   * @return executionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "414ed52c-fa89-455d-9fb9-9c2fa5115f80", value = "The ID of the execution.")

  public String getExecutionId() {
    return executionId;
  }


  public void setExecutionId(String executionId) {
    this.executionId = executionId;
  }


  public ExecutionLog maskingJobId(String maskingJobId) {
    
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


  public ExecutionLog status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * The status of the execution regarding its completion.
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The status of the execution regarding its completion.")

  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public ExecutionLog log(String log) {
    
    this.log = log;
    return this;
  }

   /**
   * The log file contents.
   * @return log
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ORA-12505, TNS:listener does not currently know of SID given in connect descriptor", value = "The log file contents.")

  public String getLog() {
    return log;
  }


  public void setLog(String log) {
    this.log = log;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExecutionLog executionLog = (ExecutionLog) o;
    return Objects.equals(this.id, executionLog.id) &&
        Objects.equals(this.executionId, executionLog.executionId) &&
        Objects.equals(this.maskingJobId, executionLog.maskingJobId) &&
        Objects.equals(this.status, executionLog.status) &&
        Objects.equals(this.log, executionLog.log);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, executionId, maskingJobId, status, log);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExecutionLog {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    executionId: ").append(toIndentedString(executionId)).append("\n");
    sb.append("    maskingJobId: ").append(toIndentedString(maskingJobId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    log: ").append(toIndentedString(log)).append("\n");
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

