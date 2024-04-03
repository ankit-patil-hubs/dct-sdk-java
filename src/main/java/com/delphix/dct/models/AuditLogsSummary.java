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
 * The summary of actions performed by an account.
 */
@ApiModel(description = "The summary of actions performed by an account.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-03T12:50:51.668272+05:30[Asia/Kolkata]")
public class AuditLogsSummary {
  public static final String SERIALIZED_NAME_ACCOUNT_ID = "account_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private Long accountId;

  public static final String SERIALIZED_NAME_ACCOUNT_FIRST_NAME = "account_first_name";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_FIRST_NAME)
  private String accountFirstName;

  public static final String SERIALIZED_NAME_ACCOUNT_LAST_NAME = "account_last_name";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_LAST_NAME)
  private String accountLastName;

  public static final String SERIALIZED_NAME_VDB_REFRESHES = "vdb_refreshes";
  @SerializedName(SERIALIZED_NAME_VDB_REFRESHES)
  private Integer vdbRefreshes;

  public static final String SERIALIZED_NAME_MASKING_JOBS = "masking_jobs";
  @SerializedName(SERIALIZED_NAME_MASKING_JOBS)
  private Integer maskingJobs;


  public AuditLogsSummary accountId(Long accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * Get accountId
   * @return accountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getAccountId() {
    return accountId;
  }


  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }


  public AuditLogsSummary accountFirstName(String accountFirstName) {
    
    this.accountFirstName = accountFirstName;
    return this;
  }

   /**
   * Get accountFirstName
   * @return accountFirstName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAccountFirstName() {
    return accountFirstName;
  }


  public void setAccountFirstName(String accountFirstName) {
    this.accountFirstName = accountFirstName;
  }


  public AuditLogsSummary accountLastName(String accountLastName) {
    
    this.accountLastName = accountLastName;
    return this;
  }

   /**
   * Get accountLastName
   * @return accountLastName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAccountLastName() {
    return accountLastName;
  }


  public void setAccountLastName(String accountLastName) {
    this.accountLastName = accountLastName;
  }


  public AuditLogsSummary vdbRefreshes(Integer vdbRefreshes) {
    
    this.vdbRefreshes = vdbRefreshes;
    return this;
  }

   /**
   * The number of VDB refreshes performed by the account.
   * @return vdbRefreshes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of VDB refreshes performed by the account.")

  public Integer getVdbRefreshes() {
    return vdbRefreshes;
  }


  public void setVdbRefreshes(Integer vdbRefreshes) {
    this.vdbRefreshes = vdbRefreshes;
  }


  public AuditLogsSummary maskingJobs(Integer maskingJobs) {
    
    this.maskingJobs = maskingJobs;
    return this;
  }

   /**
   * The number of compliance jobs executed by the account.
   * @return maskingJobs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of compliance jobs executed by the account.")

  public Integer getMaskingJobs() {
    return maskingJobs;
  }


  public void setMaskingJobs(Integer maskingJobs) {
    this.maskingJobs = maskingJobs;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuditLogsSummary auditLogsSummary = (AuditLogsSummary) o;
    return Objects.equals(this.accountId, auditLogsSummary.accountId) &&
        Objects.equals(this.accountFirstName, auditLogsSummary.accountFirstName) &&
        Objects.equals(this.accountLastName, auditLogsSummary.accountLastName) &&
        Objects.equals(this.vdbRefreshes, auditLogsSummary.vdbRefreshes) &&
        Objects.equals(this.maskingJobs, auditLogsSummary.maskingJobs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, accountFirstName, accountLastName, vdbRefreshes, maskingJobs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditLogsSummary {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    accountFirstName: ").append(toIndentedString(accountFirstName)).append("\n");
    sb.append("    accountLastName: ").append(toIndentedString(accountLastName)).append("\n");
    sb.append("    vdbRefreshes: ").append(toIndentedString(vdbRefreshes)).append("\n");
    sb.append("    maskingJobs: ").append(toIndentedString(maskingJobs)).append("\n");
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

