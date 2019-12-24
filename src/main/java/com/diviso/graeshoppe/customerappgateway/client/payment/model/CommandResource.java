package com.diviso.graeshoppe.customerappgateway.client.payment.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

/**
 * CommandResource
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-09-23T12:15:47.246272+05:30[Asia/Kolkata]")

public class CommandResource   {
  @JsonProperty("nextTaskId")
  private String nextTaskId = null;

  @JsonProperty("nextTaskName")
  private String nextTaskName = null;

  @JsonProperty("orderId")
  private String orderId = null;

  @JsonProperty("selfId")
  private Long selfId = null;

  public CommandResource nextTaskId(String nextTaskId) {
    this.nextTaskId = nextTaskId;
    return this;
  }

  /**
   * Get nextTaskId
   * @return nextTaskId
  **/
  @ApiModelProperty(value = "")


  public String getNextTaskId() {
    return nextTaskId;
  }

  public void setNextTaskId(String nextTaskId) {
    this.nextTaskId = nextTaskId;
  }

  public CommandResource nextTaskName(String nextTaskName) {
    this.nextTaskName = nextTaskName;
    return this;
  }

  /**
   * Get nextTaskName
   * @return nextTaskName
  **/
  @ApiModelProperty(value = "")


  public String getNextTaskName() {
    return nextTaskName;
  }

  public void setNextTaskName(String nextTaskName) {
    this.nextTaskName = nextTaskName;
  }

  public CommandResource orderId(String orderId) {
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

  public CommandResource selfId(Long selfId) {
    this.selfId = selfId;
    return this;
  }

  /**
   * Get selfId
   * @return selfId
  **/
  @ApiModelProperty(value = "")


  public Long getSelfId() {
    return selfId;
  }

  public void setSelfId(Long selfId) {
    this.selfId = selfId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommandResource commandResource = (CommandResource) o;
    return Objects.equals(this.nextTaskId, commandResource.nextTaskId) &&
        Objects.equals(this.nextTaskName, commandResource.nextTaskName) &&
        Objects.equals(this.orderId, commandResource.orderId) &&
        Objects.equals(this.selfId, commandResource.selfId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextTaskId, nextTaskName, orderId, selfId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommandResource {\n");
    
    sb.append("    nextTaskId: ").append(toIndentedString(nextTaskId)).append("\n");
    sb.append("    nextTaskName: ").append(toIndentedString(nextTaskName)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    selfId: ").append(toIndentedString(selfId)).append("\n");
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

