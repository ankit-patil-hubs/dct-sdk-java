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
import org.threeten.bp.OffsetDateTime;

/**
 * An API classification object which classifies APIs as automation or governance.
 */
@ApiModel(description = "An API classification object which classifies APIs as automation or governance.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-03T12:50:51.668272+05:30[Asia/Kolkata]")
public class ApiClassificationObject {
  /**
   * HTTP method of the API.
   */
  @JsonAdapter(ApiMethodEnum.Adapter.class)
  public enum ApiMethodEnum {
    GET("GET"),
    
    POST("POST"),
    
    PUT("PUT"),
    
    PATCH("PATCH"),
    
    DELETE("DELETE");

    private String value;

    ApiMethodEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ApiMethodEnum fromValue(String value) {
      for (ApiMethodEnum b : ApiMethodEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ApiMethodEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ApiMethodEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ApiMethodEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ApiMethodEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_API_METHOD = "api_method";
  @SerializedName(SERIALIZED_NAME_API_METHOD)
  private ApiMethodEnum apiMethod;

  public static final String SERIALIZED_NAME_PATH = "path";
  @SerializedName(SERIALIZED_NAME_PATH)
  private String path;

  public static final String SERIALIZED_NAME_IS_AUTOMATION = "is_automation";
  @SerializedName(SERIALIZED_NAME_IS_AUTOMATION)
  private Boolean isAutomation;

  public static final String SERIALIZED_NAME_START_DATE = "start_date";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private OffsetDateTime startDate;

  public static final String SERIALIZED_NAME_END_DATE = "end_date";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private OffsetDateTime endDate;


  public ApiClassificationObject apiMethod(ApiMethodEnum apiMethod) {
    
    this.apiMethod = apiMethod;
    return this;
  }

   /**
   * HTTP method of the API.
   * @return apiMethod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "POST", value = "HTTP method of the API.")

  public ApiMethodEnum getApiMethod() {
    return apiMethod;
  }


  public void setApiMethod(ApiMethodEnum apiMethod) {
    this.apiMethod = apiMethod;
  }


  public ApiClassificationObject path(String path) {
    
    this.path = path;
    return this;
  }

   /**
   * context path of the API.
   * @return path
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "/vdb-groups", value = "context path of the API.")

  public String getPath() {
    return path;
  }


  public void setPath(String path) {
    this.path = path;
  }


  public ApiClassificationObject isAutomation(Boolean isAutomation) {
    
    this.isAutomation = isAutomation;
    return this;
  }

   /**
   * Either this API is automation or not.
   * @return isAutomation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Either this API is automation or not.")

  public Boolean getIsAutomation() {
    return isAutomation;
  }


  public void setIsAutomation(Boolean isAutomation) {
    this.isAutomation = isAutomation;
  }


  public ApiClassificationObject startDate(OffsetDateTime startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * The start date and time from when this api&#39;s is_automation definition has changed.
   * @return startDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The start date and time from when this api's is_automation definition has changed.")

  public OffsetDateTime getStartDate() {
    return startDate;
  }


  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }


  public ApiClassificationObject endDate(OffsetDateTime endDate) {
    
    this.endDate = endDate;
    return this;
  }

   /**
   * The end date and time from when this api&#39;s is_automation definition has changed.
   * @return endDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The end date and time from when this api's is_automation definition has changed.")

  public OffsetDateTime getEndDate() {
    return endDate;
  }


  public void setEndDate(OffsetDateTime endDate) {
    this.endDate = endDate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiClassificationObject apiClassificationObject = (ApiClassificationObject) o;
    return Objects.equals(this.apiMethod, apiClassificationObject.apiMethod) &&
        Objects.equals(this.path, apiClassificationObject.path) &&
        Objects.equals(this.isAutomation, apiClassificationObject.isAutomation) &&
        Objects.equals(this.startDate, apiClassificationObject.startDate) &&
        Objects.equals(this.endDate, apiClassificationObject.endDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiMethod, path, isAutomation, startDate, endDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiClassificationObject {\n");
    sb.append("    apiMethod: ").append(toIndentedString(apiMethod)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    isAutomation: ").append(toIndentedString(isAutomation)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
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
