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
import com.delphix.dct.models.AuditLogsSummary;
import com.delphix.dct.models.AuditLogsSummaryTotals;
import com.delphix.dct.models.PaginatedResponseMetadata;
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
 * AuditLogsSummaryReportResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-03T12:50:51.668272+05:30[Asia/Kolkata]")
public class AuditLogsSummaryReportResponse {
  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List<AuditLogsSummary> items = null;

  public static final String SERIALIZED_NAME_RESPONSE_METADATA = "response_metadata";
  @SerializedName(SERIALIZED_NAME_RESPONSE_METADATA)
  private PaginatedResponseMetadata responseMetadata;

  public static final String SERIALIZED_NAME_TOTALS = "totals";
  @SerializedName(SERIALIZED_NAME_TOTALS)
  private AuditLogsSummaryTotals totals;


  public AuditLogsSummaryReportResponse items(List<AuditLogsSummary> items) {
    
    this.items = items;
    return this;
  }

  public AuditLogsSummaryReportResponse addItemsItem(AuditLogsSummary itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<AuditLogsSummary>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<AuditLogsSummary> getItems() {
    return items;
  }


  public void setItems(List<AuditLogsSummary> items) {
    this.items = items;
  }


  public AuditLogsSummaryReportResponse responseMetadata(PaginatedResponseMetadata responseMetadata) {
    
    this.responseMetadata = responseMetadata;
    return this;
  }

   /**
   * Get responseMetadata
   * @return responseMetadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PaginatedResponseMetadata getResponseMetadata() {
    return responseMetadata;
  }


  public void setResponseMetadata(PaginatedResponseMetadata responseMetadata) {
    this.responseMetadata = responseMetadata;
  }


  public AuditLogsSummaryReportResponse totals(AuditLogsSummaryTotals totals) {
    
    this.totals = totals;
    return this;
  }

   /**
   * Get totals
   * @return totals
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AuditLogsSummaryTotals getTotals() {
    return totals;
  }


  public void setTotals(AuditLogsSummaryTotals totals) {
    this.totals = totals;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuditLogsSummaryReportResponse auditLogsSummaryReportResponse = (AuditLogsSummaryReportResponse) o;
    return Objects.equals(this.items, auditLogsSummaryReportResponse.items) &&
        Objects.equals(this.responseMetadata, auditLogsSummaryReportResponse.responseMetadata) &&
        Objects.equals(this.totals, auditLogsSummaryReportResponse.totals);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, responseMetadata, totals);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditLogsSummaryReportResponse {\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    responseMetadata: ").append(toIndentedString(responseMetadata)).append("\n");
    sb.append("    totals: ").append(toIndentedString(totals)).append("\n");
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

