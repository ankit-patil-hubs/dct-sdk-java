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
 * Parameters to read or update SAML Config
 */
@ApiModel(description = "Parameters to read or update SAML Config")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-03T12:50:51.668272+05:30[Asia/Kolkata]")
public class SAMLConfigParams {
  public static final String SERIALIZED_NAME_ENABLED = "enabled";
  @SerializedName(SERIALIZED_NAME_ENABLED)
  private Boolean enabled = false;

  public static final String SERIALIZED_NAME_AUTO_CREATE_USERS = "auto_create_users";
  @SerializedName(SERIALIZED_NAME_AUTO_CREATE_USERS)
  private Boolean autoCreateUsers = true;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private String metadata;

  public static final String SERIALIZED_NAME_ENTITY_ID = "entity_id";
  @SerializedName(SERIALIZED_NAME_ENTITY_ID)
  private String entityId;

  public static final String SERIALIZED_NAME_RESPONSE_SKEW = "response_skew";
  @SerializedName(SERIALIZED_NAME_RESPONSE_SKEW)
  private Integer responseSkew = 120;

  public static final String SERIALIZED_NAME_GROUP_ATTR = "group_attr";
  @SerializedName(SERIALIZED_NAME_GROUP_ATTR)
  private String groupAttr = "groups";

  public static final String SERIALIZED_NAME_FIRST_NAME_ATTR = "first_name_attr";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME_ATTR)
  private String firstNameAttr = "firstName";

  public static final String SERIALIZED_NAME_LAST_NAME_ATTR = "last_name_attr";
  @SerializedName(SERIALIZED_NAME_LAST_NAME_ATTR)
  private String lastNameAttr = "lastName";


  public SAMLConfigParams enabled(Boolean enabled) {
    
    this.enabled = enabled;
    return this;
  }

   /**
   * When set, SAML settings are enabled. False by default.
   * @return enabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "When set, SAML settings are enabled. False by default.")

  public Boolean getEnabled() {
    return enabled;
  }


  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  public SAMLConfigParams autoCreateUsers(Boolean autoCreateUsers) {
    
    this.autoCreateUsers = autoCreateUsers;
    return this;
  }

   /**
   * When set, the system will automatically create new Accounts for those who have logged in using SAML. This must be true if SAML user is not already registered in system. True by default.
   * @return autoCreateUsers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "When set, the system will automatically create new Accounts for those who have logged in using SAML. This must be true if SAML user is not already registered in system. True by default.")

  public Boolean getAutoCreateUsers() {
    return autoCreateUsers;
  }


  public void setAutoCreateUsers(Boolean autoCreateUsers) {
    this.autoCreateUsers = autoCreateUsers;
  }


  public SAMLConfigParams metadata(String metadata) {
    
    this.metadata = metadata;
    return this;
  }

   /**
   * IdP metadata for this service provider. This is a required property for successful SAML authentication.
   * @return metadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "IdP metadata for this service provider. This is a required property for successful SAML authentication.")

  public String getMetadata() {
    return metadata;
  }


  public void setMetadata(String metadata) {
    this.metadata = metadata;
  }


  public SAMLConfigParams entityId(String entityId) {
    
    this.entityId = entityId;
    return this;
  }

   /**
   * Unique identifier of this instance as a SAML/SSO service provider.
   * @return entityId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://dct.delphix.com", value = "Unique identifier of this instance as a SAML/SSO service provider.")

  public String getEntityId() {
    return entityId;
  }


  public void setEntityId(String entityId) {
    this.entityId = entityId;
  }


  public SAMLConfigParams responseSkew(Integer responseSkew) {
    
    this.responseSkew = responseSkew;
    return this;
  }

   /**
   * Maximum time difference allowed between a SAML response and the DCT&#39;s current time, in seconds. If not set, it defaults to 120 seconds.
   * @return responseSkew
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "120", value = "Maximum time difference allowed between a SAML response and the DCT's current time, in seconds. If not set, it defaults to 120 seconds.")

  public Integer getResponseSkew() {
    return responseSkew;
  }


  public void setResponseSkew(Integer responseSkew) {
    this.responseSkew = responseSkew;
  }


  public SAMLConfigParams groupAttr(String groupAttr) {
    
    this.groupAttr = groupAttr;
    return this;
  }

   /**
   * Group mapped attribute on SAML to create account tags in DCT.
   * @return groupAttr
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "groups", value = "Group mapped attribute on SAML to create account tags in DCT.")

  public String getGroupAttr() {
    return groupAttr;
  }


  public void setGroupAttr(String groupAttr) {
    this.groupAttr = groupAttr;
  }


  public SAMLConfigParams firstNameAttr(String firstNameAttr) {
    
    this.firstNameAttr = firstNameAttr;
    return this;
  }

   /**
   * First name attribute mapped on SAML used for mapping on DCT account.
   * @return firstNameAttr
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "firstName", value = "First name attribute mapped on SAML used for mapping on DCT account.")

  public String getFirstNameAttr() {
    return firstNameAttr;
  }


  public void setFirstNameAttr(String firstNameAttr) {
    this.firstNameAttr = firstNameAttr;
  }


  public SAMLConfigParams lastNameAttr(String lastNameAttr) {
    
    this.lastNameAttr = lastNameAttr;
    return this;
  }

   /**
   * Last name attribute mapped on SAML used for mapping on DCT account.
   * @return lastNameAttr
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "lastName", value = "Last name attribute mapped on SAML used for mapping on DCT account.")

  public String getLastNameAttr() {
    return lastNameAttr;
  }


  public void setLastNameAttr(String lastNameAttr) {
    this.lastNameAttr = lastNameAttr;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SAMLConfigParams saMLConfigParams = (SAMLConfigParams) o;
    return Objects.equals(this.enabled, saMLConfigParams.enabled) &&
        Objects.equals(this.autoCreateUsers, saMLConfigParams.autoCreateUsers) &&
        Objects.equals(this.metadata, saMLConfigParams.metadata) &&
        Objects.equals(this.entityId, saMLConfigParams.entityId) &&
        Objects.equals(this.responseSkew, saMLConfigParams.responseSkew) &&
        Objects.equals(this.groupAttr, saMLConfigParams.groupAttr) &&
        Objects.equals(this.firstNameAttr, saMLConfigParams.firstNameAttr) &&
        Objects.equals(this.lastNameAttr, saMLConfigParams.lastNameAttr);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, autoCreateUsers, metadata, entityId, responseSkew, groupAttr, firstNameAttr, lastNameAttr);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SAMLConfigParams {\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    autoCreateUsers: ").append(toIndentedString(autoCreateUsers)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
    sb.append("    responseSkew: ").append(toIndentedString(responseSkew)).append("\n");
    sb.append("    groupAttr: ").append(toIndentedString(groupAttr)).append("\n");
    sb.append("    firstNameAttr: ").append(toIndentedString(firstNameAttr)).append("\n");
    sb.append("    lastNameAttr: ").append(toIndentedString(lastNameAttr)).append("\n");
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

