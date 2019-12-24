package com.diviso.graeshoppe.customerappgateway.client.order.model.aggregator;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;

import javax.validation.Valid;

/**
 * ApprovalDetails
 */

public class ApprovalDetails   {
  @JsonProperty("acceptedAt")
  private OffsetDateTime acceptedAt = null;

  @JsonProperty("decision")
  private String decision = null;

  @JsonProperty("expectedDelivery")
  private OffsetDateTime expectedDelivery = null;

  @JsonProperty("id")
  private Long id = null;

  public ApprovalDetails acceptedAt(OffsetDateTime acceptedAt) {
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

  public ApprovalDetails decision(String decision) {
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

  public ApprovalDetails expectedDelivery(OffsetDateTime expectedDelivery) {
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

  public ApprovalDetails id(Long id) {
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
    ApprovalDetails approvalDetails = (ApprovalDetails) o;
    return Objects.equals(this.acceptedAt, approvalDetails.acceptedAt) &&
        Objects.equals(this.decision, approvalDetails.decision) &&
        Objects.equals(this.expectedDelivery, approvalDetails.expectedDelivery) &&
        Objects.equals(this.id, approvalDetails.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acceptedAt, decision, expectedDelivery, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApprovalDetails {\n");
    
    sb.append("    acceptedAt: ").append(toIndentedString(acceptedAt)).append("\n");
    sb.append("    decision: ").append(toIndentedString(decision)).append("\n");
    sb.append("    expectedDelivery: ").append(toIndentedString(expectedDelivery)).append("\n");
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

