package com.diviso.graeshoppe.customerappgateway.client.order.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DeliveryInfoDTO
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-12-12T14:59:45.796530+05:30[Asia/Kolkata]")

public class DeliveryInfoDTO   {
  @JsonProperty("deliveryAddressId")
  private Long deliveryAddressId = null;

  @JsonProperty("deliveryCharge")
  private Double deliveryCharge = null;

  @JsonProperty("deliveryNotes")
  private String deliveryNotes = null;

  @JsonProperty("deliveryType")
  private String deliveryType = null;

  @JsonProperty("id")
  private Long id = null;

  public DeliveryInfoDTO deliveryAddressId(Long deliveryAddressId) {
    this.deliveryAddressId = deliveryAddressId;
    return this;
  }

  /**
   * Get deliveryAddressId
   * @return deliveryAddressId
  **/
  @ApiModelProperty(value = "")


  public Long getDeliveryAddressId() {
    return deliveryAddressId;
  }

  public void setDeliveryAddressId(Long deliveryAddressId) {
    this.deliveryAddressId = deliveryAddressId;
  }

  public DeliveryInfoDTO deliveryCharge(Double deliveryCharge) {
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

  public DeliveryInfoDTO deliveryNotes(String deliveryNotes) {
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

  public DeliveryInfoDTO deliveryType(String deliveryType) {
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

  public DeliveryInfoDTO id(Long id) {
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
    DeliveryInfoDTO deliveryInfoDTO = (DeliveryInfoDTO) o;
    return Objects.equals(this.deliveryAddressId, deliveryInfoDTO.deliveryAddressId) &&
        Objects.equals(this.deliveryCharge, deliveryInfoDTO.deliveryCharge) &&
        Objects.equals(this.deliveryNotes, deliveryInfoDTO.deliveryNotes) &&
        Objects.equals(this.deliveryType, deliveryInfoDTO.deliveryType) &&
        Objects.equals(this.id, deliveryInfoDTO.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deliveryAddressId, deliveryCharge, deliveryNotes, deliveryType, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeliveryInfoDTO {\n");
    
    sb.append("    deliveryAddressId: ").append(toIndentedString(deliveryAddressId)).append("\n");
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

