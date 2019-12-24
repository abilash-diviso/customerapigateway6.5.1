package com.diviso.graeshoppe.customerappgateway.client.order.model.aggregator;

import java.util.Objects;
import com.diviso.graeshoppe.customerappgateway.client.order.model.aggregator.Address;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;

/**
 * DeliveryInfo
 */

public class DeliveryInfo   {
  @JsonProperty("deliveryAddress")
  private Address deliveryAddress = null;

  @JsonProperty("deliveryCharge")
  private Double deliveryCharge = null;

  @JsonProperty("deliveryNotes")
  private String deliveryNotes = null;

  @JsonProperty("deliveryType")
  private String deliveryType = null;

  @JsonProperty("id")
  private Long id = null;

  public DeliveryInfo deliveryAddress(Address deliveryAddress) {
    this.deliveryAddress = deliveryAddress;
    return this;
  }

  /**
   * Get deliveryAddress
   * @return deliveryAddress
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Address getDeliveryAddress() {
    return deliveryAddress;
  }

  public void setDeliveryAddress(Address deliveryAddress) {
    this.deliveryAddress = deliveryAddress;
  }

  public DeliveryInfo deliveryCharge(Double deliveryCharge) {
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

  public DeliveryInfo deliveryNotes(String deliveryNotes) {
    this.deliveryNotes = deliveryNotes;
    return this;
  }

  /**
   * Get deliveryNotes
   * @return deliveryNotes
  **/
  @ApiModelProperty(value = "")


  public String getDeliveryNotes() {
    return deliveryNotes;
  }

  public void setDeliveryNotes(String deliveryNotes) {
    this.deliveryNotes = deliveryNotes;
  }

  public DeliveryInfo deliveryType(String deliveryType) {
    this.deliveryType = deliveryType;
    return this;
  }

  /**
   * Get deliveryType
   * @return deliveryType
  **/
  @ApiModelProperty(value = "")


  public String getDeliveryType() {
    return deliveryType;
  }

  public void setDeliveryType(String deliveryType) {
    this.deliveryType = deliveryType;
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeliveryInfo deliveryInfo = (DeliveryInfo) o;
    return Objects.equals(this.deliveryAddress, deliveryInfo.deliveryAddress) &&
        Objects.equals(this.deliveryCharge, deliveryInfo.deliveryCharge) &&
        Objects.equals(this.deliveryNotes, deliveryInfo.deliveryNotes) &&
        Objects.equals(this.deliveryType, deliveryInfo.deliveryType) &&
        Objects.equals(this.id, deliveryInfo.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deliveryAddress, deliveryCharge, deliveryNotes, deliveryType, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeliveryInfo {\n");
    
    sb.append("    deliveryAddress: ").append(toIndentedString(deliveryAddress)).append("\n");
    sb.append("    deliveryCharge: ").append(toIndentedString(deliveryCharge)).append("\n");
    sb.append("    deliveryNotes: ").append(toIndentedString(deliveryNotes)).append("\n");
    sb.append("    deliveryType: ").append(toIndentedString(deliveryType)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

