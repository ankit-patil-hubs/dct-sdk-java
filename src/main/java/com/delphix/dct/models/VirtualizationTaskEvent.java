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
 * VirtualizationTaskEvent
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-03T12:50:51.668272+05:30[Asia/Kolkata]")
public class VirtualizationTaskEvent {
  public static final String SERIALIZED_NAME_MESSAGE_DETAILS = "message_details";
  @SerializedName(SERIALIZED_NAME_MESSAGE_DETAILS)
  private String messageDetails;


  public VirtualizationTaskEvent messageDetails(String messageDetails) {
    
    this.messageDetails = messageDetails;
    return this;
  }

   /**
   * Get messageDetails
   * @return messageDetails
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMessageDetails() {
    return messageDetails;
  }


  public void setMessageDetails(String messageDetails) {
    this.messageDetails = messageDetails;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VirtualizationTaskEvent virtualizationTaskEvent = (VirtualizationTaskEvent) o;
    return Objects.equals(this.messageDetails, virtualizationTaskEvent.messageDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(messageDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VirtualizationTaskEvent {\n");
    sb.append("    messageDetails: ").append(toIndentedString(messageDetails)).append("\n");
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

