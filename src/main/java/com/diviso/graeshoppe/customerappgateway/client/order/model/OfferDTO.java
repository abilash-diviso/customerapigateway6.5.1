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
 * OfferDTO
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-12-12T14:59:45.796530+05:30[Asia/Kolkata]")

public class OfferDTO   {
  @JsonProperty("description")
  private String description = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("offerRef")
  private String offerRef = null;

  @JsonProperty("orderDiscountAmount")
  private Double orderDiscountAmount = null;

  @JsonProperty("orderId")
  private Long orderId = null;

  public OfferDTO description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public OfferDTO id(Long id) {
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

  public OfferDTO offerRef(String offerRef) {
    this.offerRef = offerRef;
    return this;
  }

  /**
   * Get offerRef
   * @return offerRef
  **/
  @ApiModelProperty(value = "")


  public String getOfferRef() {
    return offerRef;
  }

  public void setOfferRef(String offerRef) {
    this.offerRef = offerRef;
  }

  public OfferDTO orderDiscountAmount(Double orderDiscountAmount) {
    this.orderDiscountAmount = orderDiscountAmount;
    return this;
  }

  /**
   * Get orderDiscountAmount
   * @return orderDiscountAmount
  **/
  @ApiModelProperty(value = "")


  public Double getOrderDiscountAmount() {
    return orderDiscountAmount;
  }

  public void setOrderDiscountAmount(Double orderDiscountAmount) {
    this.orderDiscountAmount = orderDiscountAmount;
  }

  public OfferDTO orderId(Long orderId) {
    this.orderId = orderId;
    return this;
  }

  /**
   * Get orderId
   * @return orderId
  **/
  @ApiModelProperty(value = "")


  public Long getOrderId() {
    return orderId;
  }

  public void setOrderId(Long orderId) {
    this.orderId = orderId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OfferDTO offerDTO = (OfferDTO) o;
    return Objects.equals(this.description, offerDTO.description) &&
        Objects.equals(this.id, offerDTO.id) &&
        Objects.equals(this.offerRef, offerDTO.offerRef) &&
        Objects.equals(this.orderDiscountAmount, offerDTO.orderDiscountAmount) &&
        Objects.equals(this.orderId, offerDTO.orderId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, id, offerRef, orderDiscountAmount, orderId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfferDTO {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    offerRef: ").append(toIndentedString(offerRef)).append("\n");
    sb.append("    orderDiscountAmount: ").append(toIndentedString(orderDiscountAmount)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
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

