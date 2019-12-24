package com.diviso.graeshoppe.customerappgateway.client.store.model;

import java.util.Objects;
import com.diviso.graeshoppe.customerappgateway.client.store.model.Store;
import com.diviso.graeshoppe.customerappgateway.client.store.model.Type;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DeliveryInfo
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-12-02T13:57:13.442+05:30[Asia/Kolkata]")

public class DeliveryInfo   {
  @JsonProperty("endTime")
  private OffsetDateTime endTime = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("startingTime")
  private OffsetDateTime startingTime = null;

  @JsonProperty("store")
  private Store store = null;

  @JsonProperty("type")
  private Type type = null;

  public DeliveryInfo endTime(OffsetDateTime endTime) {
    this.endTime = endTime;
    return this;
  }

  /**
   * Get endTime
   * @return endTime
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getEndTime() {
    return endTime;
  }

  public void setEndTime(OffsetDateTime endTime) {
    this.endTime = endTime;
  }

  public DeliveryInfo id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public DeliveryInfo startingTime(OffsetDateTime startingTime) {
    this.startingTime = startingTime;
    return this;
  }

  /**
   * Get startingTime
   * @return startingTime
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getStartingTime() {
    return startingTime;
  }

  public void setStartingTime(OffsetDateTime startingTime) {
    this.startingTime = startingTime;
  }

  public DeliveryInfo store(Store store) {
    this.store = store;
    return this;
  }

  /**
   * Get store
   * @return store
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Store getStore() {
    return store;
  }

  public void setStore(Store store) {
    this.store = store;
  }

  public DeliveryInfo type(Type type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Type getType() {
    return type;
  }

  public void setType(Type type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeliveryInfo deliveryInfo = (DeliveryInfo) o;
    return Objects.equals(this.endTime, deliveryInfo.endTime) &&
        Objects.equals(this.id, deliveryInfo.id) &&
        Objects.equals(this.startingTime, deliveryInfo.startingTime) &&
        Objects.equals(this.store, deliveryInfo.store) &&
        Objects.equals(this.type, deliveryInfo.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endTime, id, startingTime, store, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeliveryInfo {\n");
    
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    startingTime: ").append(toIndentedString(startingTime)).append("\n");
    sb.append("    store: ").append(toIndentedString(store)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

