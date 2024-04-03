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
import com.delphix.dct.models.VirtualizationTaskEvent;
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
import org.threeten.bp.OffsetDateTime;

/**
 * VirtualizationTask
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-03T12:50:51.668272+05:30[Asia/Kolkata]")
public class VirtualizationTask {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_PARENT_JOB_ID = "parent_job_id";
  @SerializedName(SERIALIZED_NAME_PARENT_JOB_ID)
  private String parentJobId;

  public static final String SERIALIZED_NAME_START_TIME = "start_time";
  @SerializedName(SERIALIZED_NAME_START_TIME)
  private OffsetDateTime startTime;

  public static final String SERIALIZED_NAME_END_TIME = "end_time";
  @SerializedName(SERIALIZED_NAME_END_TIME)
  private OffsetDateTime endTime;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_PERCENT_COMPLETE = "percent_complete";
  @SerializedName(SERIALIZED_NAME_PERCENT_COMPLETE)
  private Integer percentComplete;

  public static final String SERIALIZED_NAME_EVENTS = "events";
  @SerializedName(SERIALIZED_NAME_EVENTS)
  private List<VirtualizationTaskEvent> events = null;

  /**
   * Gets or Sets status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    PENDING("PENDING"),
    
    STARTED("STARTED"),
    
    TIMEDOUT("TIMEDOUT"),
    
    RUNNING("RUNNING"),
    
    CANCELED("CANCELED"),
    
    FAILED("FAILED"),
    
    SUSPENDED("SUSPENDED"),
    
    WAITING("WAITING"),
    
    COMPLETED("COMPLETED"),
    
    ABANDONED("ABANDONED");

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


  public VirtualizationTask id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public VirtualizationTask parentJobId(String parentJobId) {
    
    this.parentJobId = parentJobId;
    return this;
  }

   /**
   * Get parentJobId
   * @return parentJobId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getParentJobId() {
    return parentJobId;
  }


  public void setParentJobId(String parentJobId) {
    this.parentJobId = parentJobId;
  }


  public VirtualizationTask startTime(OffsetDateTime startTime) {
    
    this.startTime = startTime;
    return this;
  }

   /**
   * Get startTime
   * @return startTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getStartTime() {
    return startTime;
  }


  public void setStartTime(OffsetDateTime startTime) {
    this.startTime = startTime;
  }


  public VirtualizationTask endTime(OffsetDateTime endTime) {
    
    this.endTime = endTime;
    return this;
  }

   /**
   * Get endTime
   * @return endTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getEndTime() {
    return endTime;
  }


  public void setEndTime(OffsetDateTime endTime) {
    this.endTime = endTime;
  }


  public VirtualizationTask title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public VirtualizationTask percentComplete(Integer percentComplete) {
    
    this.percentComplete = percentComplete;
    return this;
  }

   /**
   * Get percentComplete
   * minimum: 0
   * maximum: 100
   * @return percentComplete
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getPercentComplete() {
    return percentComplete;
  }


  public void setPercentComplete(Integer percentComplete) {
    this.percentComplete = percentComplete;
  }


  public VirtualizationTask events(List<VirtualizationTaskEvent> events) {
    
    this.events = events;
    return this;
  }

  public VirtualizationTask addEventsItem(VirtualizationTaskEvent eventsItem) {
    if (this.events == null) {
      this.events = new ArrayList<VirtualizationTaskEvent>();
    }
    this.events.add(eventsItem);
    return this;
  }

   /**
   * Get events
   * @return events
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<VirtualizationTaskEvent> getEvents() {
    return events;
  }


  public void setEvents(List<VirtualizationTaskEvent> events) {
    this.events = events;
  }


  public VirtualizationTask status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VirtualizationTask virtualizationTask = (VirtualizationTask) o;
    return Objects.equals(this.id, virtualizationTask.id) &&
        Objects.equals(this.parentJobId, virtualizationTask.parentJobId) &&
        Objects.equals(this.startTime, virtualizationTask.startTime) &&
        Objects.equals(this.endTime, virtualizationTask.endTime) &&
        Objects.equals(this.title, virtualizationTask.title) &&
        Objects.equals(this.percentComplete, virtualizationTask.percentComplete) &&
        Objects.equals(this.events, virtualizationTask.events) &&
        Objects.equals(this.status, virtualizationTask.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, parentJobId, startTime, endTime, title, percentComplete, events, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VirtualizationTask {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    parentJobId: ").append(toIndentedString(parentJobId)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    percentComplete: ").append(toIndentedString(percentComplete)).append("\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
