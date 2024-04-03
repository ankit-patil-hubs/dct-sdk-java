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
import com.delphix.dct.models.ScopedObjectItem;
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
 * DeleteScopedObjectItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-03T12:50:51.668272+05:30[Asia/Kolkata]")
public class DeleteScopedObjectItem {
  public static final String SERIALIZED_NAME_OBJECTS = "objects";
  @SerializedName(SERIALIZED_NAME_OBJECTS)
  private Set<ScopedObjectItem> objects = new LinkedHashSet<ScopedObjectItem>();


  public DeleteScopedObjectItem objects(Set<ScopedObjectItem> objects) {
    
    this.objects = objects;
    return this;
  }

  public DeleteScopedObjectItem addObjectsItem(ScopedObjectItem objectsItem) {
    this.objects.add(objectsItem);
    return this;
  }

   /**
   * List of scoped objects to be deleted
   * @return objects
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "List of scoped objects to be deleted")

  public Set<ScopedObjectItem> getObjects() {
    return objects;
  }


  public void setObjects(Set<ScopedObjectItem> objects) {
    this.objects = objects;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeleteScopedObjectItem deleteScopedObjectItem = (DeleteScopedObjectItem) o;
    return Objects.equals(this.objects, deleteScopedObjectItem.objects);
  }

  @Override
  public int hashCode() {
    return Objects.hash(objects);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteScopedObjectItem {\n");
    sb.append("    objects: ").append(toIndentedString(objects)).append("\n");
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

