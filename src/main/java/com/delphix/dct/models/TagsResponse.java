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
import com.delphix.dct.models.Tag;
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
 * TagsResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-03T12:50:51.668272+05:30[Asia/Kolkata]")
public class TagsResponse {
  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<Tag> tags = null;


  public TagsResponse tags(List<Tag> tags) {
    
    this.tags = tags;
    return this;
  }

  public TagsResponse addTagsItem(Tag tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<Tag>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Array of tags with key value pairs
   * @return tags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Array of tags with key value pairs")

  public List<Tag> getTags() {
    return tags;
  }


  public void setTags(List<Tag> tags) {
    this.tags = tags;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TagsResponse tagsResponse = (TagsResponse) o;
    return Objects.equals(this.tags, tagsResponse.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TagsResponse {\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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

