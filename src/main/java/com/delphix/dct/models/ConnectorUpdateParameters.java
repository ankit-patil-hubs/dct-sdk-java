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
 * Parameters used to update a Masking Connector.
 */
@ApiModel(description = "Parameters used to update a Masking Connector.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-03T12:50:51.668272+05:30[Asia/Kolkata]")
public class ConnectorUpdateParameters {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_HOSTNAME = "hostname";
  @SerializedName(SERIALIZED_NAME_HOSTNAME)
  private String hostname;

  public static final String SERIALIZED_NAME_PORT = "port";
  @SerializedName(SERIALIZED_NAME_PORT)
  private Integer port;

  public static final String SERIALIZED_NAME_USERNAME = "username";
  @SerializedName(SERIALIZED_NAME_USERNAME)
  private String username;

  public static final String SERIALIZED_NAME_PASSWORD = "password";
  @SerializedName(SERIALIZED_NAME_PASSWORD)
  private String password;


  public ConnectorUpdateParameters name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The Connector name.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The Connector name.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public ConnectorUpdateParameters hostname(String hostname) {
    
    this.hostname = hostname;
    return this;
  }

   /**
   * The network hostname or IP address of the database server.
   * @return hostname
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The network hostname or IP address of the database server.")

  public String getHostname() {
    return hostname;
  }


  public void setHostname(String hostname) {
    this.hostname = hostname;
  }


  public ConnectorUpdateParameters port(Integer port) {
    
    this.port = port;
    return this;
  }

   /**
   * The TCP port of the server.
   * minimum: 1
   * maximum: 65535
   * @return port
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The TCP port of the server.")

  public Integer getPort() {
    return port;
  }


  public void setPort(Integer port) {
    this.port = port;
  }


  public ConnectorUpdateParameters username(String username) {
    
    this.username = username;
    return this;
  }

   /**
   * The username this Connector will use to connect to the database.
   * @return username
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The username this Connector will use to connect to the database.")

  public String getUsername() {
    return username;
  }


  public void setUsername(String username) {
    this.username = username;
  }


  public ConnectorUpdateParameters password(String password) {
    
    this.password = password;
    return this;
  }

   /**
   * The password this Connector will use to connect to the database.
   * @return password
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The password this Connector will use to connect to the database.")

  public String getPassword() {
    return password;
  }


  public void setPassword(String password) {
    this.password = password;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConnectorUpdateParameters connectorUpdateParameters = (ConnectorUpdateParameters) o;
    return Objects.equals(this.name, connectorUpdateParameters.name) &&
        Objects.equals(this.hostname, connectorUpdateParameters.hostname) &&
        Objects.equals(this.port, connectorUpdateParameters.port) &&
        Objects.equals(this.username, connectorUpdateParameters.username) &&
        Objects.equals(this.password, connectorUpdateParameters.password);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, hostname, port, username, password);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectorUpdateParameters {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
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

