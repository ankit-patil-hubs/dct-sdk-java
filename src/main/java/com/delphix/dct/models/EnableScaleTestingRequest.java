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
import java.util.ArrayList;
import java.util.List;

/**
 * EnableScaleTestingRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-03T12:50:51.668272+05:30[Asia/Kolkata]")
public class EnableScaleTestingRequest {
  public static final String SERIALIZED_NAME_ENGINES_COUNT = "engines_count";
  @SerializedName(SERIALIZED_NAME_ENGINES_COUNT)
  private Integer enginesCount;

  public static final String SERIALIZED_NAME_VIRT_ENGINES_LIST = "virt_engines_list";
  @SerializedName(SERIALIZED_NAME_VIRT_ENGINES_LIST)
  private List<String> virtEnginesList = null;

  public static final String SERIALIZED_NAME_MASKING_ENGINES_LIST = "masking_engines_list";
  @SerializedName(SERIALIZED_NAME_MASKING_ENGINES_LIST)
  private List<String> maskingEnginesList = null;

  public static final String SERIALIZED_NAME_VIRT_OBJECTS_COUNT = "virt_objects_count";
  @SerializedName(SERIALIZED_NAME_VIRT_OBJECTS_COUNT)
  private Integer virtObjectsCount;

  public static final String SERIALIZED_NAME_SNAPSHOTS_COUNT = "snapshots_count";
  @SerializedName(SERIALIZED_NAME_SNAPSHOTS_COUNT)
  private Integer snapshotsCount;

  public static final String SERIALIZED_NAME_MASKING_OBJECTS_COUNT = "masking_objects_count";
  @SerializedName(SERIALIZED_NAME_MASKING_OBJECTS_COUNT)
  private Integer maskingObjectsCount;


  public EnableScaleTestingRequest enginesCount(Integer enginesCount) {
    
    this.enginesCount = enginesCount;
    return this;
  }

   /**
   * no. of times same engine needs to be registered
   * @return enginesCount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "no. of times same engine needs to be registered")

  public Integer getEnginesCount() {
    return enginesCount;
  }


  public void setEnginesCount(Integer enginesCount) {
    this.enginesCount = enginesCount;
  }


  public EnableScaleTestingRequest virtEnginesList(List<String> virtEnginesList) {
    
    this.virtEnginesList = virtEnginesList;
    return this;
  }

  public EnableScaleTestingRequest addVirtEnginesListItem(String virtEnginesListItem) {
    if (this.virtEnginesList == null) {
      this.virtEnginesList = new ArrayList<String>();
    }
    this.virtEnginesList.add(virtEnginesListItem);
    return this;
  }

   /**
   * list of virt engine hostnames to be registered engines_count times
   * @return virtEnginesList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "list of virt engine hostnames to be registered engines_count times")

  public List<String> getVirtEnginesList() {
    return virtEnginesList;
  }


  public void setVirtEnginesList(List<String> virtEnginesList) {
    this.virtEnginesList = virtEnginesList;
  }


  public EnableScaleTestingRequest maskingEnginesList(List<String> maskingEnginesList) {
    
    this.maskingEnginesList = maskingEnginesList;
    return this;
  }

  public EnableScaleTestingRequest addMaskingEnginesListItem(String maskingEnginesListItem) {
    if (this.maskingEnginesList == null) {
      this.maskingEnginesList = new ArrayList<String>();
    }
    this.maskingEnginesList.add(maskingEnginesListItem);
    return this;
  }

   /**
   * list of masking engine hostnames to be registered engines_count times
   * @return maskingEnginesList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "list of masking engine hostnames to be registered engines_count times")

  public List<String> getMaskingEnginesList() {
    return maskingEnginesList;
  }


  public void setMaskingEnginesList(List<String> maskingEnginesList) {
    this.maskingEnginesList = maskingEnginesList;
  }


  public EnableScaleTestingRequest virtObjectsCount(Integer virtObjectsCount) {
    
    this.virtObjectsCount = virtObjectsCount;
    return this;
  }

   /**
   * no. of times to duplicate sources, containers, and timeflows
   * @return virtObjectsCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "no. of times to duplicate sources, containers, and timeflows")

  public Integer getVirtObjectsCount() {
    return virtObjectsCount;
  }


  public void setVirtObjectsCount(Integer virtObjectsCount) {
    this.virtObjectsCount = virtObjectsCount;
  }


  public EnableScaleTestingRequest snapshotsCount(Integer snapshotsCount) {
    
    this.snapshotsCount = snapshotsCount;
    return this;
  }

   /**
   * no. of times to duplicate snapshots
   * @return snapshotsCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "no. of times to duplicate snapshots")

  public Integer getSnapshotsCount() {
    return snapshotsCount;
  }


  public void setSnapshotsCount(Integer snapshotsCount) {
    this.snapshotsCount = snapshotsCount;
  }


  public EnableScaleTestingRequest maskingObjectsCount(Integer maskingObjectsCount) {
    
    this.maskingObjectsCount = maskingObjectsCount;
    return this;
  }

   /**
   * no. of times to duplicate jobs, rulesets, and connectors
   * @return maskingObjectsCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "no. of times to duplicate jobs, rulesets, and connectors")

  public Integer getMaskingObjectsCount() {
    return maskingObjectsCount;
  }


  public void setMaskingObjectsCount(Integer maskingObjectsCount) {
    this.maskingObjectsCount = maskingObjectsCount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnableScaleTestingRequest enableScaleTestingRequest = (EnableScaleTestingRequest) o;
    return Objects.equals(this.enginesCount, enableScaleTestingRequest.enginesCount) &&
        Objects.equals(this.virtEnginesList, enableScaleTestingRequest.virtEnginesList) &&
        Objects.equals(this.maskingEnginesList, enableScaleTestingRequest.maskingEnginesList) &&
        Objects.equals(this.virtObjectsCount, enableScaleTestingRequest.virtObjectsCount) &&
        Objects.equals(this.snapshotsCount, enableScaleTestingRequest.snapshotsCount) &&
        Objects.equals(this.maskingObjectsCount, enableScaleTestingRequest.maskingObjectsCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enginesCount, virtEnginesList, maskingEnginesList, virtObjectsCount, snapshotsCount, maskingObjectsCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnableScaleTestingRequest {\n");
    sb.append("    enginesCount: ").append(toIndentedString(enginesCount)).append("\n");
    sb.append("    virtEnginesList: ").append(toIndentedString(virtEnginesList)).append("\n");
    sb.append("    maskingEnginesList: ").append(toIndentedString(maskingEnginesList)).append("\n");
    sb.append("    virtObjectsCount: ").append(toIndentedString(virtObjectsCount)).append("\n");
    sb.append("    snapshotsCount: ").append(toIndentedString(snapshotsCount)).append("\n");
    sb.append("    maskingObjectsCount: ").append(toIndentedString(maskingObjectsCount)).append("\n");
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

