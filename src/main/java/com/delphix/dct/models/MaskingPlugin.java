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
import com.delphix.dct.models.Framework;
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
import org.openapitools.jackson.nullable.JsonNullable;
import org.threeten.bp.OffsetDateTime;

/**
 * A masking plugin.
 */
@ApiModel(description = "A masking plugin.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-03T12:50:51.668272+05:30[Asia/Kolkata]")
public class MaskingPlugin {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  /**
   * The plugin type.
   */
  @JsonAdapter(PluginTypeEnum.Adapter.class)
  public enum PluginTypeEnum {
    EXTENDED_ALGORITHM("EXTENDED_ALGORITHM");

    private String value;

    PluginTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PluginTypeEnum fromValue(String value) {
      for (PluginTypeEnum b : PluginTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<PluginTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PluginTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PluginTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return PluginTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_PLUGIN_TYPE = "plugin_type";
  @SerializedName(SERIALIZED_NAME_PLUGIN_TYPE)
  private PluginTypeEnum pluginType;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_INSTALL_DATE = "install_date";
  @SerializedName(SERIALIZED_NAME_INSTALL_DATE)
  private OffsetDateTime installDate;

  public static final String SERIALIZED_NAME_BUILT_IN = "built_in";
  @SerializedName(SERIALIZED_NAME_BUILT_IN)
  private Boolean builtIn;

  public static final String SERIALIZED_NAME_SDK_VERSION = "sdk_version";
  @SerializedName(SERIALIZED_NAME_SDK_VERSION)
  private String sdkVersion;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;

  public static final String SERIALIZED_NAME_AUTHOR = "author";
  @SerializedName(SERIALIZED_NAME_AUTHOR)
  private String author;

  public static final String SERIALIZED_NAME_FRAMEWORKS = "frameworks";
  @SerializedName(SERIALIZED_NAME_FRAMEWORKS)
  private List<Framework> frameworks = null;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<Tag> tags = null;


  public MaskingPlugin id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The masking plugin entity ID.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "dc91e41c-aade-4404-9084-179cb90d07c6", value = "The masking plugin entity ID.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public MaskingPlugin name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of this plugin.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "dlpx-core", value = "The name of this plugin.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public MaskingPlugin pluginType(PluginTypeEnum pluginType) {
    
    this.pluginType = pluginType;
    return this;
  }

   /**
   * The plugin type.
   * @return pluginType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The plugin type.")

  public PluginTypeEnum getPluginType() {
    return pluginType;
  }


  public void setPluginType(PluginTypeEnum pluginType) {
    this.pluginType = pluginType;
  }


  public MaskingPlugin description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * A description of this plugin.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Delphix Core Masking Algorithm Plugin", value = "A description of this plugin.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public MaskingPlugin installDate(OffsetDateTime installDate) {
    
    this.installDate = installDate;
    return this;
  }

   /**
   * The date and time when this plugin is installed.
   * @return installDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date and time when this plugin is installed.")

  public OffsetDateTime getInstallDate() {
    return installDate;
  }


  public void setInstallDate(OffsetDateTime installDate) {
    this.installDate = installDate;
  }


  public MaskingPlugin builtIn(Boolean builtIn) {
    
    this.builtIn = builtIn;
    return this;
  }

   /**
   * Whether this plugin is a built-in plugin.
   * @return builtIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether this plugin is a built-in plugin.")

  public Boolean getBuiltIn() {
    return builtIn;
  }


  public void setBuiltIn(Boolean builtIn) {
    this.builtIn = builtIn;
  }


  public MaskingPlugin sdkVersion(String sdkVersion) {
    
    this.sdkVersion = sdkVersion;
    return this;
  }

   /**
   * The masking SDK version that this plugin is built from.
   * @return sdkVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1.20.0", value = "The masking SDK version that this plugin is built from.")

  public String getSdkVersion() {
    return sdkVersion;
  }


  public void setSdkVersion(String sdkVersion) {
    this.sdkVersion = sdkVersion;
  }


  public MaskingPlugin version(String version) {
    
    this.version = version;
    return this;
  }

   /**
   * The version of this plugin.
   * @return version
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1.20.0", value = "The version of this plugin.")

  public String getVersion() {
    return version;
  }


  public void setVersion(String version) {
    this.version = version;
  }


  public MaskingPlugin author(String author) {
    
    this.author = author;
    return this;
  }

   /**
   * The author of this plugin.
   * @return author
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Delphix", value = "The author of this plugin.")

  public String getAuthor() {
    return author;
  }


  public void setAuthor(String author) {
    this.author = author;
  }


  public MaskingPlugin frameworks(List<Framework> frameworks) {
    
    this.frameworks = frameworks;
    return this;
  }

  public MaskingPlugin addFrameworksItem(Framework frameworksItem) {
    if (this.frameworks == null) {
      this.frameworks = new ArrayList<Framework>();
    }
    this.frameworks.add(frameworksItem);
    return this;
  }

   /**
   * The list of frameworks for this plugin.
   * @return frameworks
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The list of frameworks for this plugin.")

  public List<Framework> getFrameworks() {
    return frameworks;
  }


  public void setFrameworks(List<Framework> frameworks) {
    this.frameworks = frameworks;
  }


  public MaskingPlugin tags(List<Tag> tags) {
    
    this.tags = tags;
    return this;
  }

  public MaskingPlugin addTagsItem(Tag tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<Tag>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * The tags of this plugin.
   * @return tags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The tags of this plugin.")

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
    MaskingPlugin maskingPlugin = (MaskingPlugin) o;
    return Objects.equals(this.id, maskingPlugin.id) &&
        Objects.equals(this.name, maskingPlugin.name) &&
        Objects.equals(this.pluginType, maskingPlugin.pluginType) &&
        Objects.equals(this.description, maskingPlugin.description) &&
        Objects.equals(this.installDate, maskingPlugin.installDate) &&
        Objects.equals(this.builtIn, maskingPlugin.builtIn) &&
        Objects.equals(this.sdkVersion, maskingPlugin.sdkVersion) &&
        Objects.equals(this.version, maskingPlugin.version) &&
        Objects.equals(this.author, maskingPlugin.author) &&
        Objects.equals(this.frameworks, maskingPlugin.frameworks) &&
        Objects.equals(this.tags, maskingPlugin.tags);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && a.get().getClass().isArray() ? Arrays.equals((T[])a.get(), (T[])b.get()) : Objects.equals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, pluginType, description, installDate, builtIn, sdkVersion, version, author, frameworks, tags);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent()
      ? (a.get().getClass().isArray() ? Arrays.hashCode((T[])a.get()) : Objects.hashCode(a.get()))
      : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MaskingPlugin {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    pluginType: ").append(toIndentedString(pluginType)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    installDate: ").append(toIndentedString(installDate)).append("\n");
    sb.append("    builtIn: ").append(toIndentedString(builtIn)).append("\n");
    sb.append("    sdkVersion: ").append(toIndentedString(sdkVersion)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    frameworks: ").append(toIndentedString(frameworks)).append("\n");
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
