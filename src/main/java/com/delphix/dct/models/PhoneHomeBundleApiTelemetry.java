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
 * Telemetry data for an HTTP API call.
 */
@ApiModel(description = "Telemetry data for an HTTP API call.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-03T12:50:51.668272+05:30[Asia/Kolkata]")
public class PhoneHomeBundleApiTelemetry {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_API_ENDPOINT = "api_endpoint";
  @SerializedName(SERIALIZED_NAME_API_ENDPOINT)
  private String apiEndpoint;

  /**
   * The HTTP method used to call the API endpoint.
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

  public static final String SERIALIZED_NAME_START_TIME = "start_time";
  @SerializedName(SERIALIZED_NAME_START_TIME)
  private String startTime;

  public static final String SERIALIZED_NAME_END_TIME = "end_time";
  @SerializedName(SERIALIZED_NAME_END_TIME)
  private String endTime;

  public static final String SERIALIZED_NAME_RESPONSE_STATUS = "response_status";
  @SerializedName(SERIALIZED_NAME_RESPONSE_STATUS)
  private Integer responseStatus;

  public static final String SERIALIZED_NAME_USER_AGENT = "user_agent";
  @SerializedName(SERIALIZED_NAME_USER_AGENT)
  private String userAgent;

  public static final String SERIALIZED_NAME_CLIENT_NAME = "client_name";
  @SerializedName(SERIALIZED_NAME_CLIENT_NAME)
  private String clientName;

  public static final String SERIALIZED_NAME_IS_AUTOMATION = "is_automation";
  @SerializedName(SERIALIZED_NAME_IS_AUTOMATION)
  private Boolean isAutomation;

  public static final String SERIALIZED_NAME_DCT_VERSION = "dct_version";
  @SerializedName(SERIALIZED_NAME_DCT_VERSION)
  private String dctVersion;

  public static final String SERIALIZED_NAME_ACCOUNT_ID = "account_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private Long accountId;


  public PhoneHomeBundleApiTelemetry id(Long id) {
    
    this.id = id;
    return this;
  }

   /**
   * A programmatically-generated and auto-incrementing ID number for the API call.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "A programmatically-generated and auto-incrementing ID number for the API call.")

  public Long getId() {
    return id;
  }


  public void setId(Long id) {
    this.id = id;
  }


  public PhoneHomeBundleApiTelemetry apiEndpoint(String apiEndpoint) {
    
    this.apiEndpoint = apiEndpoint;
    return this;
  }

   /**
   * The template of the API endpoint path that was called.
   * @return apiEndpoint
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "/management/engines/{engineId}", required = true, value = "The template of the API endpoint path that was called.")

  public String getApiEndpoint() {
    return apiEndpoint;
  }


  public void setApiEndpoint(String apiEndpoint) {
    this.apiEndpoint = apiEndpoint;
  }


  public PhoneHomeBundleApiTelemetry apiMethod(ApiMethodEnum apiMethod) {
    
    this.apiMethod = apiMethod;
    return this;
  }

   /**
   * The HTTP method used to call the API endpoint.
   * @return apiMethod
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "GET", required = true, value = "The HTTP method used to call the API endpoint.")

  public ApiMethodEnum getApiMethod() {
    return apiMethod;
  }


  public void setApiMethod(ApiMethodEnum apiMethod) {
    this.apiMethod = apiMethod;
  }


  public PhoneHomeBundleApiTelemetry startTime(String startTime) {
    
    this.startTime = startTime;
    return this;
  }

   /**
   * UTC time the API call was initiated (ISO 8601 format)
   * @return startTime
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "UTC time the API call was initiated (ISO 8601 format)")

  public String getStartTime() {
    return startTime;
  }


  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }


  public PhoneHomeBundleApiTelemetry endTime(String endTime) {
    
    this.endTime = endTime;
    return this;
  }

   /**
   * UTC time the API call returned a response (ISO 8601 format)
   * @return endTime
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "UTC time the API call returned a response (ISO 8601 format)")

  public String getEndTime() {
    return endTime;
  }


  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }


  public PhoneHomeBundleApiTelemetry responseStatus(Integer responseStatus) {
    
    this.responseStatus = responseStatus;
    return this;
  }

   /**
   * The HTTP status code of the response.
   * @return responseStatus
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The HTTP status code of the response.")

  public Integer getResponseStatus() {
    return responseStatus;
  }


  public void setResponseStatus(Integer responseStatus) {
    this.responseStatus = responseStatus;
  }


  public PhoneHomeBundleApiTelemetry userAgent(String userAgent) {
    
    this.userAgent = userAgent;
    return this;
  }

   /**
   * The value of the \&quot;User-Agent\&quot; header in the request, if present.
   * @return userAgent
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "[\"Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/122.0.0.0 Safari/537.36\",\"curl/7.55.1\",\"PostmanRuntime/7.26.8\",\"node\"]", required = true, value = "The value of the \"User-Agent\" header in the request, if present.")

  public String getUserAgent() {
    return userAgent;
  }


  public void setUserAgent(String userAgent) {
    this.userAgent = userAgent;
  }


  public PhoneHomeBundleApiTelemetry clientName(String clientName) {
    
    this.clientName = clientName;
    return this;
  }

   /**
   * The DCT client name (X-Dct-Client-Name HTTP header).
   * @return clientName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The DCT client name (X-Dct-Client-Name HTTP header).")

  public String getClientName() {
    return clientName;
  }


  public void setClientName(String clientName) {
    this.clientName = clientName;
  }


  public PhoneHomeBundleApiTelemetry isAutomation(Boolean isAutomation) {
    
    this.isAutomation = isAutomation;
    return this;
  }

   /**
   * True if the API is classified as an automation API.
   * @return isAutomation
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "True if the API is classified as an automation API.")

  public Boolean getIsAutomation() {
    return isAutomation;
  }


  public void setIsAutomation(Boolean isAutomation) {
    this.isAutomation = isAutomation;
  }


  public PhoneHomeBundleApiTelemetry dctVersion(String dctVersion) {
    
    this.dctVersion = dctVersion;
    return this;
  }

   /**
   * The version of this Data Control Tower instance at the time the API was called.
   * @return dctVersion
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The version of this Data Control Tower instance at the time the API was called.")

  public String getDctVersion() {
    return dctVersion;
  }


  public void setDctVersion(String dctVersion) {
    this.dctVersion = dctVersion;
  }


  public PhoneHomeBundleApiTelemetry accountId(Long accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * A number to distinguish the user account that performed this API call.
   * @return accountId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A number to distinguish the user account that performed this API call.")

  public Long getAccountId() {
    return accountId;
  }


  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PhoneHomeBundleApiTelemetry phoneHomeBundleApiTelemetry = (PhoneHomeBundleApiTelemetry) o;
    return Objects.equals(this.id, phoneHomeBundleApiTelemetry.id) &&
        Objects.equals(this.apiEndpoint, phoneHomeBundleApiTelemetry.apiEndpoint) &&
        Objects.equals(this.apiMethod, phoneHomeBundleApiTelemetry.apiMethod) &&
        Objects.equals(this.startTime, phoneHomeBundleApiTelemetry.startTime) &&
        Objects.equals(this.endTime, phoneHomeBundleApiTelemetry.endTime) &&
        Objects.equals(this.responseStatus, phoneHomeBundleApiTelemetry.responseStatus) &&
        Objects.equals(this.userAgent, phoneHomeBundleApiTelemetry.userAgent) &&
        Objects.equals(this.clientName, phoneHomeBundleApiTelemetry.clientName) &&
        Objects.equals(this.isAutomation, phoneHomeBundleApiTelemetry.isAutomation) &&
        Objects.equals(this.dctVersion, phoneHomeBundleApiTelemetry.dctVersion) &&
        Objects.equals(this.accountId, phoneHomeBundleApiTelemetry.accountId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, apiEndpoint, apiMethod, startTime, endTime, responseStatus, userAgent, clientName, isAutomation, dctVersion, accountId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PhoneHomeBundleApiTelemetry {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    apiEndpoint: ").append(toIndentedString(apiEndpoint)).append("\n");
    sb.append("    apiMethod: ").append(toIndentedString(apiMethod)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    responseStatus: ").append(toIndentedString(responseStatus)).append("\n");
    sb.append("    userAgent: ").append(toIndentedString(userAgent)).append("\n");
    sb.append("    clientName: ").append(toIndentedString(clientName)).append("\n");
    sb.append("    isAutomation: ").append(toIndentedString(isAutomation)).append("\n");
    sb.append("    dctVersion: ").append(toIndentedString(dctVersion)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
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

