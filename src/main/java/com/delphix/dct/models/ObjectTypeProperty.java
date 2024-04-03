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
 * A DCT object type.
 */
@ApiModel(description = "A DCT object type.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-03T12:50:51.668272+05:30[Asia/Kolkata]")
public class ObjectTypeProperty {
  /**
   * Object type.
   */
  @JsonAdapter(ObjectTypeEnum.Adapter.class)
  public enum ObjectTypeEnum {
    ACCESS_GROUP("ACCESS_GROUP"),
    
    ACCOUNT("ACCOUNT"),
    
    AUDIT_LOGS_SUMMARY_REPORT("AUDIT_LOGS_SUMMARY_REPORT"),
    
    ROLE("ROLE"),
    
    API_USAGE_REPORT("API_USAGE_REPORT"),
    
    BOOKMARK("BOOKMARK"),
    
    CDB("CDB"),
    
    DATABASE_TEMPLATE("DATABASE_TEMPLATE"),
    
    DSOURCE("DSOURCE"),
    
    ENGINE("ENGINE"),
    
    ENVIRONMENT("ENVIRONMENT"),
    
    MASKING_JOB("MASKING_JOB"),
    
    MASKING_ENVIRONMENT("MASKING_ENVIRONMENT"),
    
    MASKING_ALGORITHM_REVISION("MASKING_ALGORITHM_REVISION"),
    
    MASKING_JOB_SET("MASKING_JOB_SET"),
    
    REPORT_SCHEDULE("REPORT_SCHEDULE"),
    
    SOURCE("SOURCE"),
    
    VAULT("VAULT"),
    
    VCDB("VCDB"),
    
    VDB("VDB"),
    
    VDB_GROUP("VDB_GROUP"),
    
    CONNECTOR("CONNECTOR"),
    
    CONNECTIVITY_CHECK("CONNECTIVITY_CHECK"),
    
    DSOURCE_USAGE_REPORT("DSOURCE_USAGE_REPORT"),
    
    DSOURCE_CONSUMPTION_REPORT("DSOURCE_CONSUMPTION_REPORT"),
    
    JOB("JOB"),
    
    PHONEHOME_BUNDLE("PHONEHOME_BUNDLE"),
    
    PRODUCT_INFO("PRODUCT_INFO"),
    
    PRODUCT_REGISTRATION("PRODUCT_REGISTRATION"),
    
    PROXY_CONFIGURATION("PROXY_CONFIGURATION"),
    
    SMTP_CONFIG("SMTP_CONFIG"),
    
    MASKING_EXECUTION_METRICS_REPORT("MASKING_EXECUTION_METRICS_REPORT"),
    
    STORAGE_SUMMARY_REPORT("STORAGE_SUMMARY_REPORT"),
    
    STORAGE_SAVINGS_SUMMARY_REPORT("STORAGE_SAVINGS_SUMMARY_REPORT"),
    
    VDB_INVENTORY_REPORT("VDB_INVENTORY_REPORT"),
    
    LDAP("LDAP"),
    
    SAML("SAML"),
    
    PASSWORD_POLICY("PASSWORD_POLICY"),
    
    GLOBAL_PROPERTIES("GLOBAL_PROPERTIES"),
    
    SYSTEM("SYSTEM"),
    
    API_CLASSIFICATION("API_CLASSIFICATION"),
    
    VIRTUALIZATION_POLICY("VIRTUALIZATION_POLICY"),
    
    DATASET_GROUP("DATASET_GROUP"),
    
    METADATA_DATABASE("METADATA_DATABASE"),
    
    ENGINE_VAULT("ENGINE_VAULT"),
    
    KERBEROS_CONFIG("KERBEROS_CONFIG"),
    
    TIMEFLOW("TIMEFLOW"),
    
    MASKING_ALGORITHM("MASKING_ALGORITHM"),
    
    HYPERSCALE_INSTANCE("HYPERSCALE_INSTANCE"),
    
    HYPERSCALE_CONNECTOR("HYPERSCALE_CONNECTOR"),
    
    HYPERSCALE_DATASET("HYPERSCALE_DATASET"),
    
    TOOLKIT("TOOLKIT"),
    
    MASKING_PLUGIN("MASKING_PLUGIN"),
    
    REPLICATION_PROFILE("REPLICATION_PROFILE"),
    
    ENGINE_PERFORMANCE_ANALYTIC_REPORT("ENGINE_PERFORMANCE_ANALYTIC_REPORT"),
    
    STAGING_SOURCE("STAGING_SOURCE"),
    
    ENGINE_GLOBAL_OBJECT_STATE_REPORT("ENGINE_GLOBAL_OBJECT_STATE_REPORT");

    private String value;

    ObjectTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ObjectTypeEnum fromValue(String value) {
      for (ObjectTypeEnum b : ObjectTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ObjectTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ObjectTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ObjectTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ObjectTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_OBJECT_TYPE = "object_type";
  @SerializedName(SERIALIZED_NAME_OBJECT_TYPE)
  private ObjectTypeEnum objectType;


  public ObjectTypeProperty objectType(ObjectTypeEnum objectType) {
    
    this.objectType = objectType;
    return this;
  }

   /**
   * Object type.
   * @return objectType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "VDB", required = true, value = "Object type.")

  public ObjectTypeEnum getObjectType() {
    return objectType;
  }


  public void setObjectType(ObjectTypeEnum objectType) {
    this.objectType = objectType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObjectTypeProperty objectTypeProperty = (ObjectTypeProperty) o;
    return Objects.equals(this.objectType, objectTypeProperty.objectType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(objectType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObjectTypeProperty {\n");
    sb.append("    objectType: ").append(toIndentedString(objectType)).append("\n");
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

