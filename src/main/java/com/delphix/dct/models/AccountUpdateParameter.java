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
 * AccountUpdateParameter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-03T12:50:51.668272+05:30[Asia/Kolkata]")
public class AccountUpdateParameter {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_API_CLIENT_ID = "api_client_id";
  @SerializedName(SERIALIZED_NAME_API_CLIENT_ID)
  private String apiClientId;

  public static final String SERIALIZED_NAME_FIRST_NAME = "first_name";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private String firstName;

  public static final String SERIALIZED_NAME_LAST_NAME = "last_name";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  private String lastName;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_USERNAME = "username";
  @SerializedName(SERIALIZED_NAME_USERNAME)
  private String username;

  public static final String SERIALIZED_NAME_LDAP_PRINCIPAL = "ldap_principal";
  @SerializedName(SERIALIZED_NAME_LDAP_PRINCIPAL)
  private String ldapPrincipal;


   /**
   * Numeric ID of the Account.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Numeric ID of the Account.")

  public Long getId() {
    return id;
  }




  public AccountUpdateParameter apiClientId(String apiClientId) {
    
    this.apiClientId = apiClientId;
    return this;
  }

   /**
   * The unique ID which is used to identify the identity of an API request. The web server (nginx) configuration must be configured so as to include the external ID as the value of the X_CLIENT_ID HTTP request header when requests are proxied. For OAuth2/JWT based authentication, this typically corresponds to a value extracted from the JWT, uniquely identifying the Account.
   * @return apiClientId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The unique ID which is used to identify the identity of an API request. The web server (nginx) configuration must be configured so as to include the external ID as the value of the X_CLIENT_ID HTTP request header when requests are proxied. For OAuth2/JWT based authentication, this typically corresponds to a value extracted from the JWT, uniquely identifying the Account.")

  public String getApiClientId() {
    return apiClientId;
  }


  public void setApiClientId(String apiClientId) {
    this.apiClientId = apiClientId;
  }


  public AccountUpdateParameter firstName(String firstName) {
    
    this.firstName = firstName;
    return this;
  }

   /**
   * An optional first name for the Account.
   * @return firstName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An optional first name for the Account.")

  public String getFirstName() {
    return firstName;
  }


  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


  public AccountUpdateParameter lastName(String lastName) {
    
    this.lastName = lastName;
    return this;
  }

   /**
   * An optional last name for the Account.
   * @return lastName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An optional last name for the Account.")

  public String getLastName() {
    return lastName;
  }


  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  public AccountUpdateParameter email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * An optional email for the Account.
   * @return email
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An optional email for the Account.")

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  public AccountUpdateParameter username(String username) {
    
    this.username = username;
    return this;
  }

   /**
   * The username for username/password authentication. This can also be used to provide an optional logical name for the Account.
   * @return username
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The username for username/password authentication. This can also be used to provide an optional logical name for the Account.")

  public String getUsername() {
    return username;
  }


  public void setUsername(String username) {
    this.username = username;
  }


  public AccountUpdateParameter ldapPrincipal(String ldapPrincipal) {
    
    this.ldapPrincipal = ldapPrincipal;
    return this;
  }

   /**
   * This value will be used for linking this account to an LDAP user when authenticated with the same LDAP principal. When accounts authenticate with LDAP, an LDAP principal value is calculated based on the username, msad_domain_name, search_base and username_pattern.
   * @return ldapPrincipal
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This value will be used for linking this account to an LDAP user when authenticated with the same LDAP principal. When accounts authenticate with LDAP, an LDAP principal value is calculated based on the username, msad_domain_name, search_base and username_pattern.")

  public String getLdapPrincipal() {
    return ldapPrincipal;
  }


  public void setLdapPrincipal(String ldapPrincipal) {
    this.ldapPrincipal = ldapPrincipal;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountUpdateParameter accountUpdateParameter = (AccountUpdateParameter) o;
    return Objects.equals(this.id, accountUpdateParameter.id) &&
        Objects.equals(this.apiClientId, accountUpdateParameter.apiClientId) &&
        Objects.equals(this.firstName, accountUpdateParameter.firstName) &&
        Objects.equals(this.lastName, accountUpdateParameter.lastName) &&
        Objects.equals(this.email, accountUpdateParameter.email) &&
        Objects.equals(this.username, accountUpdateParameter.username) &&
        Objects.equals(this.ldapPrincipal, accountUpdateParameter.ldapPrincipal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, apiClientId, firstName, lastName, email, username, ldapPrincipal);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountUpdateParameter {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    apiClientId: ").append(toIndentedString(apiClientId)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    ldapPrincipal: ").append(toIndentedString(ldapPrincipal)).append("\n");
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
