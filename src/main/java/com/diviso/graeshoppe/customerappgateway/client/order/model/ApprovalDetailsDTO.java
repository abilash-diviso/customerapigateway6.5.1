package com.diviso.graeshoppe.customerappgateway.client.order.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ApprovalDetailsDTO
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-12-12T14:59:45.796530+05:30[Asia/Kolkata]")

public class ApprovalDetailsDTO   {
  @JsonProperty("acceptedAt")
  private OffsetDateTime acceptedAt = null;

  @JsonProperty("customerId")
  private String customerId = null;

  @JsonProperty("decision")
  private String decision = null;

  @JsonProperty("expectedDelivery")
  private OffsetDateTime expectedDelivery = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("orderId")
  private String orderId = null;

  public ApprovalDetailsDTO acceptedAt(OffsetDateTime acceptedAt) {
    this.acceptedAt = acceptedAt;
    return this;
  }

  /**
   * Get acceptedAt
   * @return acceptedAt
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getAcceptedAt() {
    return acceptedAt;
  }

  public void setAcceptedAt(OffsetDateTime acceptedAt) {
    this.acceptedAt = acceptedAt;
  }

  public ApprovalDetailsDTO customerId(String customerId) {
    this.customerId = customerId;
    return this;
  }

  /**
   * Get customerId
   * @return customerId
  **/
  @ApiModelProperty(value = "")


  public String getCustomerId() {
    return customerId;
  }

  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }

  public ApprovalDetailsDTO decision(String decision) {
    this.decision = decision;
    return this;
  }

  /**
   * Get decision
   * @return decision
  **/
  @ApiModelProperty(value = "")


  public String getDecision() {
    return decision;
  }

  public void setDecision(String decision) {
    this.decision = decision;
  }

  public ApprovalDetailsDTO expectedDelivery(OffsetDateTime expectedDelivery) {
    this.expectedDelivery = expectedDelivery;
    return this;
  }

  /**
   * Get expectedDelivery
   * @return expectedDelivery
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getExpectedDelivery() {
    return expectedDelivery;
  }

  public void setExpectedDelivery(OffsetDateTime expectedDelivery) {
    this.expectedDelivery = expectedDelivery;
  }

  public ApprovalDetailsDTO id(Long id) {
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

  public ApprovalDetailsDTO orderId(String orderId) {
    this.orderId = orderId;
    return this;
  }

  /**
   * Get orderId
   * @return orderId
  **/
  @ApiModelProperty(value = "")


  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
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
    ApprovalDetailsDTO approvalDetailsDTO = (ApprovalDetailsDTO) o;
    return Objects.equals(this.acceptedAt, approvalDetailsDTO.acceptedAt) &&
        Objects.equals(this.customerId, approvalDetailsDTO.customerId) &&
        Objects.equals(this.decision, approvalDetailsDTO.decision) &&
        Objects.equals(this.expectedDelivery, approvalDetailsDTO.expectedDelivery) &&
        Objects.equals(this.id, approvalDetailsDTO.id) &&
        Objects.equals(this.orderId, approvalDetailsDTO.orderId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acceptedAt, customerId, decision, expectedDelivery, id, orderId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApprovalDetailsDTO {\n");
    
    sb.append("    acceptedAt: ").append(toIndentedString(acceptedAt)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    decision: ").append(toIndentedString(decision)).append("\n");
    sb.append("    expectedDelivery: ").append(toIndentedString(expectedDelivery)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

