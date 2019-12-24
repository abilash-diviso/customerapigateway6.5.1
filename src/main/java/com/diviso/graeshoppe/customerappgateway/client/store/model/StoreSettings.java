package com.diviso.graeshoppe.customerappgateway.client.store.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * StoreSettings
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-12-02T13:57:13.442+05:30[Asia/Kolkata]")

public class StoreSettings   {
  @JsonProperty("deliveryCharge")
  private Double deliveryCharge = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("isActive")
  private Boolean isActive = null;

  @JsonProperty("isInventoryRequired")
  private Boolean isInventoryRequired = null;

  @JsonProperty("orderAcceptType")
  private String orderAcceptType = null;

  @JsonProperty("serviceCharge")
  private Double serviceCharge = null;

  public StoreSettings deliveryCharge(Double deliveryCharge) {
    this.deliveryCharge = deliveryCharge;
    return this;
  }

  /**
   * Get deliveryCharge
   * @return deliveryCharge
  **/
  @ApiModelProperty(value = "")


  public Double getDeliveryCharge() {
    return deliveryCharge;
  }

  public void setDeliveryCharge(Double deliveryCharge) {
    this.deliveryCharge = deliveryCharge;
  }

  public StoreSettings id(Long id) {
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

  public StoreSettings isActive(Boolean isActive) {
    this.isActive = isActive;
    return this;
  }

  /**
   * Get isActive
   * @return isActive
  **/
  @ApiModelProperty(value = "")


  public Boolean isIsActive() {
    return isActive;
  }

  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }

  public StoreSettings isInventoryRequired(Boolean isInventoryRequired) {
    this.isInventoryRequired = isInventoryRequired;
    return this;
  }

  /**
   * Get isInventoryRequired
   * @return isInventoryRequired
  **/
  @ApiModelProperty(value = "")


  public Boolean isIsInventoryRequired() {
    return isInventoryRequired;
  }

  public void setIsInventoryRequired(Boolean isInventoryRequired) {
    this.isInventoryRequired = isInventoryRequired;
  }

  public StoreSettings orderAcceptType(String orderAcceptType) {
    this.orderAcceptType = orderAcceptType;
    return this;
  }

  /**
   * Get orderAcceptType
   * @return orderAcceptType
  **/
  @ApiModelProperty(value = "")


  public String getOrderAcceptType() {
    return orderAcceptType;
  }

  public void setOrderAcceptType(String orderAcceptType) {
    this.orderAcceptType = orderAcceptType;
  }

  public StoreSettings serviceCharge(Double serviceCharge) {
    this.serviceCharge = serviceCharge;
    return this;
  }

  /**
   * Get serviceCharge
   * @return serviceCharge
  **/
  @ApiModelProperty(value = "")


  public Double getServiceCharge() {
    return serviceCharge;
  }

  public void setServiceCharge(Double serviceCharge) {
    this.serviceCharge = serviceCharge;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StoreSettings storeSettings = (StoreSettings) o;
    return Objects.equals(this.deliveryCharge, storeSettings.deliveryCharge) &&
        Objects.equals(this.id, storeSettings.id) &&
        Objects.equals(this.isActive, storeSettings.isActive) &&
        Objects.equals(this.isInventoryRequired, storeSettings.isInventoryRequired) &&
        Objects.equals(this.orderAcceptType, storeSettings.orderAcceptType) &&
        Objects.equals(this.serviceCharge, storeSettings.serviceCharge);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deliveryCharge, id, isActive, isInventoryRequired, orderAcceptType, serviceCharge);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StoreSettings {\n");
    
    sb.append("    deliveryCharge: ").append(toIndentedString(deliveryCharge)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    isInventoryRequired: ").append(toIndentedString(isInventoryRequired)).append("\n");
    sb.append("    orderAcceptType: ").append(toIndentedString(orderAcceptType)).append("\n");
    sb.append("    serviceCharge: ").append(toIndentedString(serviceCharge)).append("\n");
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

