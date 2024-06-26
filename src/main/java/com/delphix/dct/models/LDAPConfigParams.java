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
import com.delphix.dct.models.Domain;
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
 * Parameters to read or update LDAP Config
 */
@ApiModel(description = "Parameters to read or update LDAP Config")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-03T12:50:51.668272+05:30[Asia/Kolkata]")
public class LDAPConfigParams {
  public static final String SERIALIZED_NAME_ENABLED = "enabled";
  @SerializedName(SERIALIZED_NAME_ENABLED)
  private Boolean enabled = true;

  public static final String SERIALIZED_NAME_AUTO_CREATE_USERS = "auto_create_users";
  @SerializedName(SERIALIZED_NAME_AUTO_CREATE_USERS)
  private Boolean autoCreateUsers = true;

  public static final String SERIALIZED_NAME_HOSTNAME = "hostname";
  @SerializedName(SERIALIZED_NAME_HOSTNAME)
  private String hostname;

  public static final String SERIALIZED_NAME_PORT = "port";
  @SerializedName(SERIALIZED_NAME_PORT)
  private Integer port;

  public static final String SERIALIZED_NAME_DOMAINS = "domains";
  @SerializedName(SERIALIZED_NAME_DOMAINS)
  private List<Domain> domains = null;

  public static final String SERIALIZED_NAME_ENABLE_SSL = "enable_ssl";
  @SerializedName(SERIALIZED_NAME_ENABLE_SSL)
  private Boolean enableSsl = true;

  public static final String SERIALIZED_NAME_TRUSTSTORE_FILENAME = "truststore_filename";
  @SerializedName(SERIALIZED_NAME_TRUSTSTORE_FILENAME)
  private String truststoreFilename;

  public static final String SERIALIZED_NAME_TRUSTSTORE_PASSWORD = "truststore_password";
  @SerializedName(SERIALIZED_NAME_TRUSTSTORE_PASSWORD)
  private String truststorePassword;

  public static final String SERIALIZED_NAME_INSECURE_SSL = "insecure_ssl";
  @SerializedName(SERIALIZED_NAME_INSECURE_SSL)
  private Boolean insecureSsl = false;

  public static final String SERIALIZED_NAME_UNSAFE_SSL_HOSTNAME_CHECK = "unsafe_ssl_hostname_check";
  @SerializedName(SERIALIZED_NAME_UNSAFE_SSL_HOSTNAME_CHECK)
  private Boolean unsafeSslHostnameCheck = false;


  public LDAPConfigParams enabled(Boolean enabled) {
    
    this.enabled = enabled;
    return this;
  }

   /**
   * When set, these settings are enabled. True by default.
   * @return enabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "When set, these settings are enabled. True by default.")

  public Boolean getEnabled() {
    return enabled;
  }


  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  public LDAPConfigParams autoCreateUsers(Boolean autoCreateUsers) {
    
    this.autoCreateUsers = autoCreateUsers;
    return this;
  }

   /**
   * When set, the system will automatically create new Accounts for those who have logged in using LDAP. This must be true if LDAP user is not already registered in system. True by default.
   * @return autoCreateUsers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "When set, the system will automatically create new Accounts for those who have logged in using LDAP. This must be true if LDAP user is not already registered in system. True by default.")

  public Boolean getAutoCreateUsers() {
    return autoCreateUsers;
  }


  public void setAutoCreateUsers(Boolean autoCreateUsers) {
    this.autoCreateUsers = autoCreateUsers;
  }


  public LDAPConfigParams hostname(String hostname) {
    
    this.hostname = hostname;
    return this;
  }

   /**
   * The hostname of the LDAP server.
   * @return hostname
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ldap.server.com", value = "The hostname of the LDAP server.")

  public String getHostname() {
    return hostname;
  }


  public void setHostname(String hostname) {
    this.hostname = hostname;
  }


  public LDAPConfigParams port(Integer port) {
    
    this.port = port;
    return this;
  }

   /**
   * The port of the LDAP server. Default port is 389 for non-SSL and 636 for SSL.
   * minimum: 0
   * maximum: 65535
   * @return port
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "389", value = "The port of the LDAP server. Default port is 389 for non-SSL and 636 for SSL.")

  public Integer getPort() {
    return port;
  }


  public void setPort(Integer port) {
    this.port = port;
  }


  public LDAPConfigParams domains(List<Domain> domains) {
    
    this.domains = domains;
    return this;
  }

  public LDAPConfigParams addDomainsItem(Domain domainsItem) {
    if (this.domains == null) {
      this.domains = new ArrayList<Domain>();
    }
    this.domains.add(domainsItem);
    return this;
  }

   /**
   * DCT will try to authenticate using each Domain given in this list.
   * @return domains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "DCT will try to authenticate using each Domain given in this list.")

  public List<Domain> getDomains() {
    return domains;
  }


  public void setDomains(List<Domain> domains) {
    this.domains = domains;
  }


  public LDAPConfigParams enableSsl(Boolean enableSsl) {
    
    this.enableSsl = enableSsl;
    return this;
  }

   /**
   * True if LDAP should be used over SSL.
   * @return enableSsl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "True if LDAP should be used over SSL.")

  public Boolean getEnableSsl() {
    return enableSsl;
  }


  public void setEnableSsl(Boolean enableSsl) {
    this.enableSsl = enableSsl;
  }


  public LDAPConfigParams truststoreFilename(String truststoreFilename) {
    
    this.truststoreFilename = truststoreFilename;
    return this;
  }

   /**
   * File name of a truststore which can be used to validate the TLS certificate of the LDAP server. The truststore must be available at /etc/config/certs/&lt;truststore_filename&gt;
   * @return truststoreFilename
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "File name of a truststore which can be used to validate the TLS certificate of the LDAP server. The truststore must be available at /etc/config/certs/<truststore_filename>")

  public String getTruststoreFilename() {
    return truststoreFilename;
  }


  public void setTruststoreFilename(String truststoreFilename) {
    this.truststoreFilename = truststoreFilename;
  }


  public LDAPConfigParams truststorePassword(String truststorePassword) {
    
    this.truststorePassword = truststorePassword;
    return this;
  }

   /**
   * Password for reading trustStore file provided in &#39;truststore_filename&#39; property
   * @return truststorePassword
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Password for reading trustStore file provided in 'truststore_filename' property")

  public String getTruststorePassword() {
    return truststorePassword;
  }


  public void setTruststorePassword(String truststorePassword) {
    this.truststorePassword = truststorePassword;
  }


  public LDAPConfigParams insecureSsl(Boolean insecureSsl) {
    
    this.insecureSsl = insecureSsl;
    return this;
  }

   /**
   * Allow connections to the LDAP server over LDAPS without validating the TLS certificate. Even though the connection to the server might be performed over LDAPS, setting this property eliminates the protection against a man-in-the-middle attach for connections to this server. Instead, consider creating a truststore with a Certificate Authority to validate the server&#39;s certificate, and set the truststore_filename property. 
   * @return insecureSsl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Allow connections to the LDAP server over LDAPS without validating the TLS certificate. Even though the connection to the server might be performed over LDAPS, setting this property eliminates the protection against a man-in-the-middle attach for connections to this server. Instead, consider creating a truststore with a Certificate Authority to validate the server's certificate, and set the truststore_filename property. ")

  public Boolean getInsecureSsl() {
    return insecureSsl;
  }


  public void setInsecureSsl(Boolean insecureSsl) {
    this.insecureSsl = insecureSsl;
  }


  public LDAPConfigParams unsafeSslHostnameCheck(Boolean unsafeSslHostnameCheck) {
    
    this.unsafeSslHostnameCheck = unsafeSslHostnameCheck;
    return this;
  }

   /**
   * Ignore validation of the name associated to the TLS certificate when connecting to the LDAP server over LDAPS. Setting this value must only be done if the TLS certificate of the server does not match the hostname, and the TLS configuration of the server cannot be fixed. Setting this property reduces the protection against a man-in-the-middle attack for connections to this server. This is ignored if insecure_ssl is set. 
   * @return unsafeSslHostnameCheck
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Ignore validation of the name associated to the TLS certificate when connecting to the LDAP server over LDAPS. Setting this value must only be done if the TLS certificate of the server does not match the hostname, and the TLS configuration of the server cannot be fixed. Setting this property reduces the protection against a man-in-the-middle attack for connections to this server. This is ignored if insecure_ssl is set. ")

  public Boolean getUnsafeSslHostnameCheck() {
    return unsafeSslHostnameCheck;
  }


  public void setUnsafeSslHostnameCheck(Boolean unsafeSslHostnameCheck) {
    this.unsafeSslHostnameCheck = unsafeSslHostnameCheck;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LDAPConfigParams ldAPConfigParams = (LDAPConfigParams) o;
    return Objects.equals(this.enabled, ldAPConfigParams.enabled) &&
        Objects.equals(this.autoCreateUsers, ldAPConfigParams.autoCreateUsers) &&
        Objects.equals(this.hostname, ldAPConfigParams.hostname) &&
        Objects.equals(this.port, ldAPConfigParams.port) &&
        Objects.equals(this.domains, ldAPConfigParams.domains) &&
        Objects.equals(this.enableSsl, ldAPConfigParams.enableSsl) &&
        Objects.equals(this.truststoreFilename, ldAPConfigParams.truststoreFilename) &&
        Objects.equals(this.truststorePassword, ldAPConfigParams.truststorePassword) &&
        Objects.equals(this.insecureSsl, ldAPConfigParams.insecureSsl) &&
        Objects.equals(this.unsafeSslHostnameCheck, ldAPConfigParams.unsafeSslHostnameCheck);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, autoCreateUsers, hostname, port, domains, enableSsl, truststoreFilename, truststorePassword, insecureSsl, unsafeSslHostnameCheck);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LDAPConfigParams {\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    autoCreateUsers: ").append(toIndentedString(autoCreateUsers)).append("\n");
    sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    domains: ").append(toIndentedString(domains)).append("\n");
    sb.append("    enableSsl: ").append(toIndentedString(enableSsl)).append("\n");
    sb.append("    truststoreFilename: ").append(toIndentedString(truststoreFilename)).append("\n");
    sb.append("    truststorePassword: ").append(toIndentedString(truststorePassword)).append("\n");
    sb.append("    insecureSsl: ").append(toIndentedString(insecureSsl)).append("\n");
    sb.append("    unsafeSslHostnameCheck: ").append(toIndentedString(unsafeSslHostnameCheck)).append("\n");
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

