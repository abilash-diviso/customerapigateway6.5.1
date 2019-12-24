package com.diviso.graeshoppe.customerappgateway.client.payment.model;

import java.util.Objects;
import com.diviso.graeshoppe.customerappgateway.client.payment.model.Amount;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * Sale
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-09-23T12:15:47.246272+05:30[Asia/Kolkata]")

public class Sale   {
  @JsonProperty("amount")
  private Amount amount = null;

  @JsonProperty("create_time")
  private String createTime = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("parent_payment")
  private String parentPayment = null;

  @JsonProperty("payment_mode")
  private String paymentMode = null;

  @JsonProperty("reasonCode")
  private String reasonCode = null;

  @JsonProperty("receiptId")
  private String receiptId = null;

  @JsonProperty("state")
  private String state = null;

  @JsonProperty("update_time")
  private String updateTime = null;

  public Sale amount(Amount amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Get amount
   * @return amount
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Amount getAmount() {
    return amount;
  }

  public void setAmount(Amount amount) {
    this.amount = amount;
  }

  public Sale createTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Get createTime
   * @return createTime
  **/
  @ApiModelProperty(value = "")


  public String getCreateTime() {
    return createTime;
  }

  public void setCreateTime(String createTime) {
    this.createTime = createTime;
  }

  public Sale id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Sale parentPayment(String parentPayment) {
    this.parentPayment = parentPayment;
    return this;
  }

  /**
   * Get parentPayment
   * @return parentPayment
  **/
  @ApiModelProperty(value = "")


  public String getParentPayment() {
    return parentPayment;
  }

  public void setParentPayment(String parentPayment) {
    this.parentPayment = parentPayment;
  }

  public Sale paymentMode(String paymentMode) {
    this.paymentMode = paymentMode;
    return this;
  }

  /**
   * Get paymentMode
   * @return paymentMode
  **/
  @ApiModelProperty(value = "")


  public String getPaymentMode() {
    return paymentMode;
  }

  public void setPaymentMode(String paymentMode) {
    this.paymentMode = paymentMode;
  }

  public Sale reasonCode(String reasonCode) {
    this.reasonCode = reasonCode;
    return this;
  }

  /**
   * Get reasonCode
   * @return reasonCode
  **/
  @ApiModelProperty(value = "")


  public String getReasonCode() {
    return reasonCode;
  }

  public void setReasonCode(String reasonCode) {
    this.reasonCode = reasonCode;
  }

  public Sale receiptId(String receiptId) {
    this.receiptId = receiptId;
    return this;
  }

  /**
   * Get receiptId
   * @return receiptId
  **/
  @ApiModelProperty(value = "")


  public String getReceiptId() {
    return receiptId;
  }

  public void setReceiptId(String receiptId) {
    this.receiptId = receiptId;
  }

  public Sale state(String state) {
    this.state = state;
    return this;
  }

  /**
   * Get state
   * @return state
  **/
  @ApiModelProperty(value = "")


  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public Sale updateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  /**
   * Get updateTime
   * @return updateTime
  **/
  @ApiModelProperty(value = "")


  public String getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Sale sale = (Sale) o;
    return Objects.equals(this.amount, sale.amount) &&
        Objects.equals(this.createTime, sale.createTime) &&
        Objects.equals(this.id, sale.id) &&
        Objects.equals(this.parentPayment, sale.parentPayment) &&
        Objects.equals(this.paymentMode, sale.paymentMode) &&
        Objects.equals(this.reasonCode, sale.reasonCode) &&
        Objects.equals(this.receiptId, sale.receiptId) &&
        Objects.equals(this.state, sale.state) &&
        Objects.equals(this.updateTime, sale.updateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, createTime, id, parentPayment, paymentMode, reasonCode, receiptId, state, updateTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Sale {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    parentPayment: ").append(toIndentedString(parentPayment)).append("\n");
    sb.append("    paymentMode: ").append(toIndentedString(paymentMode)).append("\n");
    sb.append("    reasonCode: ").append(toIndentedString(reasonCode)).append("\n");
    sb.append("    receiptId: ").append(toIndentedString(receiptId)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
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

