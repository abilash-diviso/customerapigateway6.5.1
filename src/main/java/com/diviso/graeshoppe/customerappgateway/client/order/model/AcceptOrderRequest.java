package com.diviso.graeshoppe.customerappgateway.client.order.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

/**
 * AcceptOrderRequest
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-08-15T11:27:57.484310+05:30[Asia/Kolkata]")

public class AcceptOrderRequest   {
  @JsonProperty("decision")
  private String decision = null;

  @JsonProperty("deliveryTime")
  private String deliveryTime = null;

  @JsonProperty("orderId")
  private String orderId = null;

  @JsonProperty("taskId")
  private String taskId = null;

  public AcceptOrderRequest decision(String decision) {
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

  public AcceptOrderRequest deliveryTime(String deliveryTime) {
    this.deliveryTime = deliveryTime;
    return this;
  }

  /**
   * Get deliveryTime
   * @return deliveryTime
  **/
  @ApiModelProperty(value = "")


  public String getDeliveryTime() {
    return deliveryTime;
  }

  public void setDeliveryTime(String deliveryTime) {
    this.deliveryTime = deliveryTime;
  }

  public AcceptOrderRequest orderId(String orderId) {
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

  public AcceptOrderRequest taskId(String taskId) {
    this.taskId = taskId;
    return this;
  }

  /**
   * Get taskId
   * @return taskId
  **/
  @ApiModelProperty(value = "")


  public String getTaskId() {
    return taskId;
  }

  public void setTaskId(String taskId) {
    this.taskId = taskId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AcceptOrderRequest acceptOrderRequest = (AcceptOrderRequest) o;
    return Objects.equals(this.decision, acceptOrderRequest.decision) &&
        Objects.equals(this.deliveryTime, acceptOrderRequest.deliveryTime) &&
        Objects.equals(this.orderId, acceptOrderRequest.orderId) &&
        Objects.equals(this.taskId, acceptOrderRequest.taskId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(decision, deliveryTime, orderId, taskId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AcceptOrderRequest {\n");
    
    sb.append("    decision: ").append(toIndentedString(decision)).append("\n");
    sb.append("    deliveryTime: ").append(toIndentedString(deliveryTime)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
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

