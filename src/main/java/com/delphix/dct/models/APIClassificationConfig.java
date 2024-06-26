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
import com.delphix.dct.models.ApiClassificationObject;
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
 * Api Classification Config.
 */
@ApiModel(description = "Api Classification Config.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-03T12:50:51.668272+05:30[Asia/Kolkata]")
public class APIClassificationConfig {
  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;

  public static final String SERIALIZED_NAME_API_CLASSIFICATION = "api_classification";
  @SerializedName(SERIALIZED_NAME_API_CLASSIFICATION)
  private List<ApiClassificationObject> apiClassification = null;


  public APIClassificationConfig version(String version) {
    
    this.version = version;
    return this;
  }

   /**
   * Api Classification Config Version.
   * @return version
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1.0.0", value = "Api Classification Config Version.")

  public String getVersion() {
    return version;
  }


  public void setVersion(String version) {
    this.version = version;
  }


  public APIClassificationConfig apiClassification(List<ApiClassificationObject> apiClassification) {
    
    this.apiClassification = apiClassification;
    return this;
  }

  public APIClassificationConfig addApiClassificationItem(ApiClassificationObject apiClassificationItem) {
    if (this.apiClassification == null) {
      this.apiClassification = new ArrayList<ApiClassificationObject>();
    }
    this.apiClassification.add(apiClassificationItem);
    return this;
  }

   /**
   * The classification of each APIs, either it is automation or not.
   * @return apiClassification
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The classification of each APIs, either it is automation or not.")

  public List<ApiClassificationObject> getApiClassification() {
    return apiClassification;
  }


  public void setApiClassification(List<ApiClassificationObject> apiClassification) {
    this.apiClassification = apiClassification;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    APIClassificationConfig apIClassificationConfig = (APIClassificationConfig) o;
    return Objects.equals(this.version, apIClassificationConfig.version) &&
        Objects.equals(this.apiClassification, apIClassificationConfig.apiClassification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(version, apiClassification);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APIClassificationConfig {\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    apiClassification: ").append(toIndentedString(apiClassification)).append("\n");
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

