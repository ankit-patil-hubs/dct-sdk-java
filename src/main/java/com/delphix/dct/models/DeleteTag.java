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
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 * DeleteTag
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-03T12:50:51.668272+05:30[Asia/Kolkata]")
public class DeleteTag {
  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private Set<Tag> tags = null;


  public DeleteTag key(String key) {
    
    this.key = key;
    return this;
  }

   /**
   * Key of the tag
   * @return key
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "key-1", value = "Key of the tag")

  public String getKey() {
    return key;
  }


  public void setKey(String key) {
    this.key = key;
  }


  public DeleteTag value(String value) {
    
    this.value = value;
    return this;
  }

   /**
   * Value of the tag
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "value-1", value = "Value of the tag")

  public String getValue() {
    return value;
  }


  public void setValue(String value) {
    this.value = value;
  }


  public DeleteTag tags(Set<Tag> tags) {
    
    this.tags = tags;
    return this;
  }

  public DeleteTag addTagsItem(Tag tagsItem) {
    if (this.tags == null) {
      this.tags = new LinkedHashSet<Tag>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * List of tags to be deleted
   * @return tags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of tags to be deleted")

  public Set<Tag> getTags() {
    return tags;
  }


  public void setTags(Set<Tag> tags) {
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
    DeleteTag deleteTag = (DeleteTag) o;
    return Objects.equals(this.key, deleteTag.key) &&
        Objects.equals(this.value, deleteTag.value) &&
        Objects.equals(this.tags, deleteTag.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, value, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteTag {\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

