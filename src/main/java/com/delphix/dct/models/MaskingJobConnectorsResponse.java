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
import com.delphix.dct.models.Connector;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Connector(s) for a masking job.
 */
@ApiModel(description = "Connector(s) for a masking job.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-03T12:50:51.668272+05:30[Asia/Kolkata]")
public class MaskingJobConnectorsResponse {
  public static final String SERIALIZED_NAME_CONNECTOR = "connector";
  @SerializedName(SERIALIZED_NAME_CONNECTOR)
  private Connector connector;

  public static final String SERIALIZED_NAME_ON_THE_FLY_CONNECTOR = "on_the_fly_connector";
  @SerializedName(SERIALIZED_NAME_ON_THE_FLY_CONNECTOR)
  private Connector onTheFlyConnector;


  public MaskingJobConnectorsResponse connector(Connector connector) {
    
    this.connector = connector;
    return this;
  }

   /**
   * Get connector
   * @return connector
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Connector getConnector() {
    return connector;
  }


  public void setConnector(Connector connector) {
    this.connector = connector;
  }


  public MaskingJobConnectorsResponse onTheFlyConnector(Connector onTheFlyConnector) {
    
    this.onTheFlyConnector = onTheFlyConnector;
    return this;
  }

   /**
   * Get onTheFlyConnector
   * @return onTheFlyConnector
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Connector getOnTheFlyConnector() {
    return onTheFlyConnector;
  }


  public void setOnTheFlyConnector(Connector onTheFlyConnector) {
    this.onTheFlyConnector = onTheFlyConnector;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MaskingJobConnectorsResponse maskingJobConnectorsResponse = (MaskingJobConnectorsResponse) o;
    return Objects.equals(this.connector, maskingJobConnectorsResponse.connector) &&
        Objects.equals(this.onTheFlyConnector, maskingJobConnectorsResponse.onTheFlyConnector);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connector, onTheFlyConnector);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MaskingJobConnectorsResponse {\n");
    sb.append("    connector: ").append(toIndentedString(connector)).append("\n");
    sb.append("    onTheFlyConnector: ").append(toIndentedString(onTheFlyConnector)).append("\n");
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

