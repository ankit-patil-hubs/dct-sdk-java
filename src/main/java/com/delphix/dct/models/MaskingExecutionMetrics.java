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
 * Metrics for a masking job.
 */
@ApiModel(description = "Metrics for a masking job.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-03T12:50:51.668272+05:30[Asia/Kolkata]")
public class MaskingExecutionMetrics {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_MASKING_JOB_NAME = "masking_job_name";
  @SerializedName(SERIALIZED_NAME_MASKING_JOB_NAME)
  private String maskingJobName;

  /**
   * The type of the Masking job.
   */
  @JsonAdapter(MaskingJobTypeEnum.Adapter.class)
  public enum MaskingJobTypeEnum {
    STANDARD("STANDARD"),
    
    HYPERSCALE("HYPERSCALE");

    private String value;

    MaskingJobTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static MaskingJobTypeEnum fromValue(String value) {
      for (MaskingJobTypeEnum b : MaskingJobTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<MaskingJobTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final MaskingJobTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public MaskingJobTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return MaskingJobTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_MASKING_JOB_TYPE = "masking_job_type";
  @SerializedName(SERIALIZED_NAME_MASKING_JOB_TYPE)
  private MaskingJobTypeEnum maskingJobType;

  public static final String SERIALIZED_NAME_CONNECTOR_TYPE = "connector_type";
  @SerializedName(SERIALIZED_NAME_CONNECTOR_TYPE)
  private String connectorType;

  public static final String SERIALIZED_NAME_RULESET_NAME = "ruleset_name";
  @SerializedName(SERIALIZED_NAME_RULESET_NAME)
  private String rulesetName;

  public static final String SERIALIZED_NAME_ROWS_MASKED = "rows_masked";
  @SerializedName(SERIALIZED_NAME_ROWS_MASKED)
  private Long rowsMasked;

  public static final String SERIALIZED_NAME_ROWS_TOTAL = "rows_total";
  @SerializedName(SERIALIZED_NAME_ROWS_TOTAL)
  private Long rowsTotal;

  public static final String SERIALIZED_NAME_BYTES_MASKED = "bytes_masked";
  @SerializedName(SERIALIZED_NAME_BYTES_MASKED)
  private Long bytesMasked;

  public static final String SERIALIZED_NAME_BYTES_TOTAL = "bytes_total";
  @SerializedName(SERIALIZED_NAME_BYTES_TOTAL)
  private Long bytesTotal;

  public static final String SERIALIZED_NAME_DURATION = "duration";
  @SerializedName(SERIALIZED_NAME_DURATION)
  private Long duration;

  public static final String SERIALIZED_NAME_TABLES_FILES_COUNT = "tables_files_count";
  @SerializedName(SERIALIZED_NAME_TABLES_FILES_COUNT)
  private Long tablesFilesCount;

  public static final String SERIALIZED_NAME_MASKED_TABLES_FILES_COUNT = "masked_tables_files_count";
  @SerializedName(SERIALIZED_NAME_MASKED_TABLES_FILES_COUNT)
  private Long maskedTablesFilesCount;

  public static final String SERIALIZED_NAME_COLUMNS_FIELDS_COUNT = "columns_fields_count";
  @SerializedName(SERIALIZED_NAME_COLUMNS_FIELDS_COUNT)
  private Long columnsFieldsCount;

  public static final String SERIALIZED_NAME_MASKED_COLUMNS_FIELDS_COUNT = "masked_columns_fields_count";
  @SerializedName(SERIALIZED_NAME_MASKED_COLUMNS_FIELDS_COUNT)
  private Long maskedColumnsFieldsCount;


  public MaskingExecutionMetrics id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The MaskingJob entity ID.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "masking-job-1", value = "The MaskingJob entity ID.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public MaskingExecutionMetrics maskingJobName(String maskingJobName) {
    
    this.maskingJobName = maskingJobName;
    return this;
  }

   /**
   * The name of the MaskingJob.
   * @return maskingJobName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "My favorite MaskingJob", value = "The name of the MaskingJob.")

  public String getMaskingJobName() {
    return maskingJobName;
  }


  public void setMaskingJobName(String maskingJobName) {
    this.maskingJobName = maskingJobName;
  }


  public MaskingExecutionMetrics maskingJobType(MaskingJobTypeEnum maskingJobType) {
    
    this.maskingJobType = maskingJobType;
    return this;
  }

   /**
   * The type of the Masking job.
   * @return maskingJobType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "STANDARD", value = "The type of the Masking job.")

  public MaskingJobTypeEnum getMaskingJobType() {
    return maskingJobType;
  }


  public void setMaskingJobType(MaskingJobTypeEnum maskingJobType) {
    this.maskingJobType = maskingJobType;
  }


  public MaskingExecutionMetrics connectorType(String connectorType) {
    
    this.connectorType = connectorType;
    return this;
  }

   /**
   * The type of data being masked by this Job. If the Masking Job is masking a database this is the type of the database, otherwise \&quot;FILE\&quot; or \&quot;MAINFRAME_DATASET\&quot;.
   * @return connectorType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "MARIADB", value = "The type of data being masked by this Job. If the Masking Job is masking a database this is the type of the database, otherwise \"FILE\" or \"MAINFRAME_DATASET\".")

  public String getConnectorType() {
    return connectorType;
  }


  public void setConnectorType(String connectorType) {
    this.connectorType = connectorType;
  }


  public MaskingExecutionMetrics rulesetName(String rulesetName) {
    
    this.rulesetName = rulesetName;
    return this;
  }

   /**
   * Name of the ruleset for the Masking job.
   * @return rulesetName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "my-ruleset", value = "Name of the ruleset for the Masking job.")

  public String getRulesetName() {
    return rulesetName;
  }


  public void setRulesetName(String rulesetName) {
    this.rulesetName = rulesetName;
  }


  public MaskingExecutionMetrics rowsMasked(Long rowsMasked) {
    
    this.rowsMasked = rowsMasked;
    return this;
  }

   /**
   * The number of rows masked. This is not applicable for JSON file type.
   * @return rowsMasked
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1000", value = "The number of rows masked. This is not applicable for JSON file type.")

  public Long getRowsMasked() {
    return rowsMasked;
  }


  public void setRowsMasked(Long rowsMasked) {
    this.rowsMasked = rowsMasked;
  }


  public MaskingExecutionMetrics rowsTotal(Long rowsTotal) {
    
    this.rowsTotal = rowsTotal;
    return this;
  }

   /**
   * The total number of rows. This is not applicable for JSON file type.
   * @return rowsTotal
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "5000", value = "The total number of rows. This is not applicable for JSON file type.")

  public Long getRowsTotal() {
    return rowsTotal;
  }


  public void setRowsTotal(Long rowsTotal) {
    this.rowsTotal = rowsTotal;
  }


  public MaskingExecutionMetrics bytesMasked(Long bytesMasked) {
    
    this.bytesMasked = bytesMasked;
    return this;
  }

   /**
   * The number of bytes masked. This is only applicable for JSON file type.
   * @return bytesMasked
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "500", value = "The number of bytes masked. This is only applicable for JSON file type.")

  public Long getBytesMasked() {
    return bytesMasked;
  }


  public void setBytesMasked(Long bytesMasked) {
    this.bytesMasked = bytesMasked;
  }


  public MaskingExecutionMetrics bytesTotal(Long bytesTotal) {
    
    this.bytesTotal = bytesTotal;
    return this;
  }

   /**
   * The total number of bytes. This is only applicable for JSON file type.
   * @return bytesTotal
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "5000000", value = "The total number of bytes. This is only applicable for JSON file type.")

  public Long getBytesTotal() {
    return bytesTotal;
  }


  public void setBytesTotal(Long bytesTotal) {
    this.bytesTotal = bytesTotal;
  }


  public MaskingExecutionMetrics duration(Long duration) {
    
    this.duration = duration;
    return this;
  }

   /**
   * The time taken by the execution in ms. Only available for successful executions.
   * @return duration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "5000000", value = "The time taken by the execution in ms. Only available for successful executions.")

  public Long getDuration() {
    return duration;
  }


  public void setDuration(Long duration) {
    this.duration = duration;
  }


  public MaskingExecutionMetrics tablesFilesCount(Long tablesFilesCount) {
    
    this.tablesFilesCount = tablesFilesCount;
    return this;
  }

   /**
   * The number of tables or files in the ruleset associated to the Masking job.
   * @return tablesFilesCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "5000000", value = "The number of tables or files in the ruleset associated to the Masking job.")

  public Long getTablesFilesCount() {
    return tablesFilesCount;
  }


  public void setTablesFilesCount(Long tablesFilesCount) {
    this.tablesFilesCount = tablesFilesCount;
  }


  public MaskingExecutionMetrics maskedTablesFilesCount(Long maskedTablesFilesCount) {
    
    this.maskedTablesFilesCount = maskedTablesFilesCount;
    return this;
  }

   /**
   * The number of tables or files in the ruleset associated to the Masking job for which at least one column or field is masked.
   * @return maskedTablesFilesCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "5000000", value = "The number of tables or files in the ruleset associated to the Masking job for which at least one column or field is masked.")

  public Long getMaskedTablesFilesCount() {
    return maskedTablesFilesCount;
  }


  public void setMaskedTablesFilesCount(Long maskedTablesFilesCount) {
    this.maskedTablesFilesCount = maskedTablesFilesCount;
  }


  public MaskingExecutionMetrics columnsFieldsCount(Long columnsFieldsCount) {
    
    this.columnsFieldsCount = columnsFieldsCount;
    return this;
  }

   /**
   * The number of columns or fields across all tables or files in the ruleset associated to the Masking job.
   * @return columnsFieldsCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "5000000", value = "The number of columns or fields across all tables or files in the ruleset associated to the Masking job.")

  public Long getColumnsFieldsCount() {
    return columnsFieldsCount;
  }


  public void setColumnsFieldsCount(Long columnsFieldsCount) {
    this.columnsFieldsCount = columnsFieldsCount;
  }


  public MaskingExecutionMetrics maskedColumnsFieldsCount(Long maskedColumnsFieldsCount) {
    
    this.maskedColumnsFieldsCount = maskedColumnsFieldsCount;
    return this;
  }

   /**
   * The number of columns or fields across all tables or files in the ruleset associated to the Masking job which are masked.
   * @return maskedColumnsFieldsCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "5000000", value = "The number of columns or fields across all tables or files in the ruleset associated to the Masking job which are masked.")

  public Long getMaskedColumnsFieldsCount() {
    return maskedColumnsFieldsCount;
  }


  public void setMaskedColumnsFieldsCount(Long maskedColumnsFieldsCount) {
    this.maskedColumnsFieldsCount = maskedColumnsFieldsCount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MaskingExecutionMetrics maskingExecutionMetrics = (MaskingExecutionMetrics) o;
    return Objects.equals(this.id, maskingExecutionMetrics.id) &&
        Objects.equals(this.maskingJobName, maskingExecutionMetrics.maskingJobName) &&
        Objects.equals(this.maskingJobType, maskingExecutionMetrics.maskingJobType) &&
        Objects.equals(this.connectorType, maskingExecutionMetrics.connectorType) &&
        Objects.equals(this.rulesetName, maskingExecutionMetrics.rulesetName) &&
        Objects.equals(this.rowsMasked, maskingExecutionMetrics.rowsMasked) &&
        Objects.equals(this.rowsTotal, maskingExecutionMetrics.rowsTotal) &&
        Objects.equals(this.bytesMasked, maskingExecutionMetrics.bytesMasked) &&
        Objects.equals(this.bytesTotal, maskingExecutionMetrics.bytesTotal) &&
        Objects.equals(this.duration, maskingExecutionMetrics.duration) &&
        Objects.equals(this.tablesFilesCount, maskingExecutionMetrics.tablesFilesCount) &&
        Objects.equals(this.maskedTablesFilesCount, maskingExecutionMetrics.maskedTablesFilesCount) &&
        Objects.equals(this.columnsFieldsCount, maskingExecutionMetrics.columnsFieldsCount) &&
        Objects.equals(this.maskedColumnsFieldsCount, maskingExecutionMetrics.maskedColumnsFieldsCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, maskingJobName, maskingJobType, connectorType, rulesetName, rowsMasked, rowsTotal, bytesMasked, bytesTotal, duration, tablesFilesCount, maskedTablesFilesCount, columnsFieldsCount, maskedColumnsFieldsCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MaskingExecutionMetrics {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    maskingJobName: ").append(toIndentedString(maskingJobName)).append("\n");
    sb.append("    maskingJobType: ").append(toIndentedString(maskingJobType)).append("\n");
    sb.append("    connectorType: ").append(toIndentedString(connectorType)).append("\n");
    sb.append("    rulesetName: ").append(toIndentedString(rulesetName)).append("\n");
    sb.append("    rowsMasked: ").append(toIndentedString(rowsMasked)).append("\n");
    sb.append("    rowsTotal: ").append(toIndentedString(rowsTotal)).append("\n");
    sb.append("    bytesMasked: ").append(toIndentedString(bytesMasked)).append("\n");
    sb.append("    bytesTotal: ").append(toIndentedString(bytesTotal)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    tablesFilesCount: ").append(toIndentedString(tablesFilesCount)).append("\n");
    sb.append("    maskedTablesFilesCount: ").append(toIndentedString(maskedTablesFilesCount)).append("\n");
    sb.append("    columnsFieldsCount: ").append(toIndentedString(columnsFieldsCount)).append("\n");
    sb.append("    maskedColumnsFieldsCount: ").append(toIndentedString(maskedColumnsFieldsCount)).append("\n");
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

