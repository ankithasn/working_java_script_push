/*
 * Open Service Broker API
 * The Open Service Broker API defines an HTTP(S) interface between Platforms and Service Brokers.
 *
 * OpenAPI spec version: master - might contain changes that are not yet released
 * Contact: open-service-broker-api@googlegroups.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.client.model.ServiceBindingEndpoint;
import io.swagger.client.model.ServiceBindingMetadata;
import io.swagger.client.model.ServiceBindingVolumeMount;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * ServiceBindingResource
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-11-26T00:39:47.253666+05:30[Asia/Kolkata]")
public class ServiceBindingResource {
  @SerializedName("metadata")
  private ServiceBindingMetadata metadata = null;

  @SerializedName("credentials")
  private Object credentials = null;

  @SerializedName("syslog_drain_url")
  private String syslogDrainUrl = null;

  @SerializedName("route_service_url")
  private String routeServiceUrl = null;

  @SerializedName("volume_mounts")
  private List<ServiceBindingVolumeMount> volumeMounts = null;

  @SerializedName("endpoints")
  private List<ServiceBindingEndpoint> endpoints = null;

  @SerializedName("parameters")
  private Object parameters = null;

  public ServiceBindingResource metadata(ServiceBindingMetadata metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @Schema(description = "")
  public ServiceBindingMetadata getMetadata() {
    return metadata;
  }

  public void setMetadata(ServiceBindingMetadata metadata) {
    this.metadata = metadata;
  }

  public ServiceBindingResource credentials(Object credentials) {
    this.credentials = credentials;
    return this;
  }

   /**
   * Get credentials
   * @return credentials
  **/
  @Schema(description = "")
  public Object getCredentials() {
    return credentials;
  }

  public void setCredentials(Object credentials) {
    this.credentials = credentials;
  }

  public ServiceBindingResource syslogDrainUrl(String syslogDrainUrl) {
    this.syslogDrainUrl = syslogDrainUrl;
    return this;
  }

   /**
   * Get syslogDrainUrl
   * @return syslogDrainUrl
  **/
  @Schema(description = "")
  public String getSyslogDrainUrl() {
    return syslogDrainUrl;
  }

  public void setSyslogDrainUrl(String syslogDrainUrl) {
    this.syslogDrainUrl = syslogDrainUrl;
  }

  public ServiceBindingResource routeServiceUrl(String routeServiceUrl) {
    this.routeServiceUrl = routeServiceUrl;
    return this;
  }

   /**
   * Get routeServiceUrl
   * @return routeServiceUrl
  **/
  @Schema(description = "")
  public String getRouteServiceUrl() {
    return routeServiceUrl;
  }

  public void setRouteServiceUrl(String routeServiceUrl) {
    this.routeServiceUrl = routeServiceUrl;
  }

  public ServiceBindingResource volumeMounts(List<ServiceBindingVolumeMount> volumeMounts) {
    this.volumeMounts = volumeMounts;
    return this;
  }

  public ServiceBindingResource addVolumeMountsItem(ServiceBindingVolumeMount volumeMountsItem) {
    if (this.volumeMounts == null) {
      this.volumeMounts = new ArrayList<ServiceBindingVolumeMount>();
    }
    this.volumeMounts.add(volumeMountsItem);
    return this;
  }

   /**
   * Get volumeMounts
   * @return volumeMounts
  **/
  @Schema(description = "")
  public List<ServiceBindingVolumeMount> getVolumeMounts() {
    return volumeMounts;
  }

  public void setVolumeMounts(List<ServiceBindingVolumeMount> volumeMounts) {
    this.volumeMounts = volumeMounts;
  }

  public ServiceBindingResource endpoints(List<ServiceBindingEndpoint> endpoints) {
    this.endpoints = endpoints;
    return this;
  }

  public ServiceBindingResource addEndpointsItem(ServiceBindingEndpoint endpointsItem) {
    if (this.endpoints == null) {
      this.endpoints = new ArrayList<ServiceBindingEndpoint>();
    }
    this.endpoints.add(endpointsItem);
    return this;
  }

   /**
   * Get endpoints
   * @return endpoints
  **/
  @Schema(description = "")
  public List<ServiceBindingEndpoint> getEndpoints() {
    return endpoints;
  }

  public void setEndpoints(List<ServiceBindingEndpoint> endpoints) {
    this.endpoints = endpoints;
  }

  public ServiceBindingResource parameters(Object parameters) {
    this.parameters = parameters;
    return this;
  }

   /**
   * Get parameters
   * @return parameters
  **/
  @Schema(description = "")
  public Object getParameters() {
    return parameters;
  }

  public void setParameters(Object parameters) {
    this.parameters = parameters;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceBindingResource serviceBindingResource = (ServiceBindingResource) o;
    return Objects.equals(this.metadata, serviceBindingResource.metadata) &&
        Objects.equals(this.credentials, serviceBindingResource.credentials) &&
        Objects.equals(this.syslogDrainUrl, serviceBindingResource.syslogDrainUrl) &&
        Objects.equals(this.routeServiceUrl, serviceBindingResource.routeServiceUrl) &&
        Objects.equals(this.volumeMounts, serviceBindingResource.volumeMounts) &&
        Objects.equals(this.endpoints, serviceBindingResource.endpoints) &&
        Objects.equals(this.parameters, serviceBindingResource.parameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metadata, credentials, syslogDrainUrl, routeServiceUrl, volumeMounts, endpoints, parameters);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceBindingResource {\n");
    
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    credentials: ").append(toIndentedString(credentials)).append("\n");
    sb.append("    syslogDrainUrl: ").append(toIndentedString(syslogDrainUrl)).append("\n");
    sb.append("    routeServiceUrl: ").append(toIndentedString(routeServiceUrl)).append("\n");
    sb.append("    volumeMounts: ").append(toIndentedString(volumeMounts)).append("\n");
    sb.append("    endpoints: ").append(toIndentedString(endpoints)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
