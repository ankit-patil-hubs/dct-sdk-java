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
 * Parameters to migrate a masking job.
 */
@ApiModel(description = "Parameters to migrate a masking job.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-03T12:50:51.668272+05:30[Asia/Kolkata]")
public class MigrateMaskingJobParameters {
  public static final String SERIALIZED_NAME_TARGET_ENGINE_ID = "target_engine_id";
  @SerializedName(SERIALIZED_NAME_TARGET_ENGINE_ID)
  private String targetEngineId;

  public static final String SERIALIZED_NAME_SOURCE_ENVIRONMENT_ID = "source_environment_id";
  @SerializedName(SERIALIZED_NAME_SOURCE_ENVIRONMENT_ID)
  private String sourceEnvironmentId;

  public static final String SERIALIZED_NAME_TARGET_ENVIRONMENT_ID = "target_environment_id";
  @SerializedName(SERIALIZED_NAME_TARGET_ENVIRONMENT_ID)
  private String targetEnvironmentId;

  public static final String SERIALIZED_NAME_FORCE_OVERWRITE = "force_overwrite";
  @SerializedName(SERIALIZED_NAME_FORCE_OVERWRITE)
  private Boolean forceOverwrite = false;


  public MigrateMaskingJobParameters targetEngineId(String targetEngineId) {
    
    this.targetEngineId = targetEngineId;
    return this;
  }

   /**
   * The ID of the engine to migrate the job to.
   * @return targetEngineId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1", required = true, value = "The ID of the engine to migrate the job to.")

  public String getTargetEngineId() {
    return targetEngineId;
  }


  public void setTargetEngineId(String targetEngineId) {
    this.targetEngineId = targetEngineId;
  }


  public MigrateMaskingJobParameters sourceEnvironmentId(String sourceEnvironmentId) {
    
    this.sourceEnvironmentId = sourceEnvironmentId;
    return this;
  }

   /**
   * The ID or name of the source environment on the target engine. This only applies to On-The-Fly jobs.
   * @return sourceEnvironmentId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "test-on-the-fly-mask1", value = "The ID or name of the source environment on the target engine. This only applies to On-The-Fly jobs.")

  public String getSourceEnvironmentId() {
    return sourceEnvironmentId;
  }


  public void setSourceEnvironmentId(String sourceEnvironmentId) {
    this.sourceEnvironmentId = sourceEnvironmentId;
  }


  public MigrateMaskingJobParameters targetEnvironmentId(String targetEnvironmentId) {
    
    this.targetEnvironmentId = targetEnvironmentId;
    return this;
  }

   /**
   * The ID or name of the target environment on the target engine to migrate the job into.
   * @return targetEnvironmentId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "prod-in-place-mask1", value = "The ID or name of the target environment on the target engine to migrate the job into.")

  public String getTargetEnvironmentId() {
    return targetEnvironmentId;
  }


  public void setTargetEnvironmentId(String targetEnvironmentId) {
    this.targetEnvironmentId = targetEnvironmentId;
  }


  public MigrateMaskingJobParameters forceOverwrite(Boolean forceOverwrite) {
    
    this.forceOverwrite = forceOverwrite;
    return this;
  }

   /**
   * Whether to overwrite objects that already exist on the target engine.
   * @return forceOverwrite
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether to overwrite objects that already exist on the target engine.")

  public Boolean getForceOverwrite() {
    return forceOverwrite;
  }


  public void setForceOverwrite(Boolean forceOverwrite) {
    this.forceOverwrite = forceOverwrite;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MigrateMaskingJobParameters migrateMaskingJobParameters = (MigrateMaskingJobParameters) o;
    return Objects.equals(this.targetEngineId, migrateMaskingJobParameters.targetEngineId) &&
        Objects.equals(this.sourceEnvironmentId, migrateMaskingJobParameters.sourceEnvironmentId) &&
        Objects.equals(this.targetEnvironmentId, migrateMaskingJobParameters.targetEnvironmentId) &&
        Objects.equals(this.forceOverwrite, migrateMaskingJobParameters.forceOverwrite);
  }

  @Override
  public int hashCode() {
    return Objects.hash(targetEngineId, sourceEnvironmentId, targetEnvironmentId, forceOverwrite);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MigrateMaskingJobParameters {\n");
    sb.append("    targetEngineId: ").append(toIndentedString(targetEngineId)).append("\n");
    sb.append("    sourceEnvironmentId: ").append(toIndentedString(sourceEnvironmentId)).append("\n");
    sb.append("    targetEnvironmentId: ").append(toIndentedString(targetEnvironmentId)).append("\n");
    sb.append("    forceOverwrite: ").append(toIndentedString(forceOverwrite)).append("\n");
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
