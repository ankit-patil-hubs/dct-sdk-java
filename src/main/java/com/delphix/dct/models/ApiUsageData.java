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
 * ApiUsageData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-03T12:50:51.668272+05:30[Asia/Kolkata]")
public class ApiUsageData {
  public static final String SERIALIZED_NAME_API_ENDPOINT = "api_endpoint";
  @SerializedName(SERIALIZED_NAME_API_ENDPOINT)
  private String apiEndpoint;

  public static final String SERIALIZED_NAME_API_METHOD = "api_method";
  @SerializedName(SERIALIZED_NAME_API_METHOD)
  private String apiMethod;

  public static final String SERIALIZED_NAME_API_COUNT = "api_count";
  @SerializedName(SERIALIZED_NAME_API_COUNT)
  private Long apiCount;

  /**
   * Whether the API calls are of kind automation or governance
   */
  @JsonAdapter(KindEnum.Adapter.class)
  public enum KindEnum {
    AUTOMATION("automation"),
    
    GOVERNANCE("governance");

    private String value;

    KindEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static KindEnum fromValue(String value) {
      for (KindEnum b : KindEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<KindEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final KindEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public KindEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return KindEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_KIND = "kind";
  @SerializedName(SERIALIZED_NAME_KIND)
  private KindEnum kind;

  public static final String SERIALIZED_NAME_CLIENT_NAME = "client_name";
  @SerializedName(SERIALIZED_NAME_CLIENT_NAME)
  private String clientName;

  public static final String SERIALIZED_NAME_USER_AGENT = "user_agent";
  @SerializedName(SERIALIZED_NAME_USER_AGENT)
  private String userAgent;

  public static final String SERIALIZED_NAME_DCT_VERSION = "dct_version";
  @SerializedName(SERIALIZED_NAME_DCT_VERSION)
  private String dctVersion;


  public ApiUsageData apiEndpoint(String apiEndpoint) {
    
    this.apiEndpoint = apiEndpoint;
    return this;
  }

   /**
   * API called.
   * @return apiEndpoint
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "/v2/management/engines", value = "API called.")

  public String getApiEndpoint() {
    return apiEndpoint;
  }


  public void setApiEndpoint(String apiEndpoint) {
    this.apiEndpoint = apiEndpoint;
  }


  public ApiUsageData apiMethod(String apiMethod) {
    
    this.apiMethod = apiMethod;
    return this;
  }

   /**
   * HTTP method for API called.
   * @return apiMethod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "GET", value = "HTTP method for API called.")

  public String getApiMethod() {
    return apiMethod;
  }


  public void setApiMethod(String apiMethod) {
    this.apiMethod = apiMethod;
  }


  public ApiUsageData apiCount(Long apiCount) {
    
    this.apiCount = apiCount;
    return this;
  }

   /**
   * Count of API calls over the requested timeframe.
   * @return apiCount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "4200", required = true, value = "Count of API calls over the requested timeframe.")

  public Long getApiCount() {
    return apiCount;
  }


  public void setApiCount(Long apiCount) {
    this.apiCount = apiCount;
  }


  public ApiUsageData kind(KindEnum kind) {
    
    this.kind = kind;
    return this;
  }

   /**
   * Whether the API calls are of kind automation or governance
   * @return kind
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "automation", value = "Whether the API calls are of kind automation or governance")

  public KindEnum getKind() {
    return kind;
  }


  public void setKind(KindEnum kind) {
    this.kind = kind;
  }


  public ApiUsageData clientName(String clientName) {
    
    this.clientName = clientName;
    return this;
  }

   /**
   * Name of the api client that called the API endpoint
   * @return clientName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "client-123", value = "Name of the api client that called the API endpoint")

  public String getClientName() {
    return clientName;
  }


  public void setClientName(String clientName) {
    this.clientName = clientName;
  }


  public ApiUsageData userAgent(String userAgent) {
    
    this.userAgent = userAgent;
    return this;
  }

   /**
   * Version of the api client that called the API endpoint
   * @return userAgent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1.0-beta", value = "Version of the api client that called the API endpoint")

  public String getUserAgent() {
    return userAgent;
  }


  public void setUserAgent(String userAgent) {
    this.userAgent = userAgent;
  }


  public ApiUsageData dctVersion(String dctVersion) {
    
    this.dctVersion = dctVersion;
    return this;
  }

   /**
   * DCT version at the time of api call
   * @return dctVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2.2.0", value = "DCT version at the time of api call")

  public String getDctVersion() {
    return dctVersion;
  }


  public void setDctVersion(String dctVersion) {
    this.dctVersion = dctVersion;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiUsageData apiUsageData = (ApiUsageData) o;
    return Objects.equals(this.apiEndpoint, apiUsageData.apiEndpoint) &&
        Objects.equals(this.apiMethod, apiUsageData.apiMethod) &&
        Objects.equals(this.apiCount, apiUsageData.apiCount) &&
        Objects.equals(this.kind, apiUsageData.kind) &&
        Objects.equals(this.clientName, apiUsageData.clientName) &&
        Objects.equals(this.userAgent, apiUsageData.userAgent) &&
        Objects.equals(this.dctVersion, apiUsageData.dctVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiEndpoint, apiMethod, apiCount, kind, clientName, userAgent, dctVersion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiUsageData {\n");
    sb.append("    apiEndpoint: ").append(toIndentedString(apiEndpoint)).append("\n");
    sb.append("    apiMethod: ").append(toIndentedString(apiMethod)).append("\n");
    sb.append("    apiCount: ").append(toIndentedString(apiCount)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    clientName: ").append(toIndentedString(clientName)).append("\n");
    sb.append("    userAgent: ").append(toIndentedString(userAgent)).append("\n");
    sb.append("    dctVersion: ").append(toIndentedString(dctVersion)).append("\n");
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

