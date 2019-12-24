package com.diviso.graeshoppe.customerappgateway.client.customer.model;

import java.util.Objects;
import com.diviso.graeshoppe.customerappgateway.client.customer.model.Message;
import com.diviso.graeshoppe.customerappgateway.client.customer.model.MessageRecipient;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OTPResponse
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-11-27T10:26:27.966+05:30[Asia/Kolkata]")

public class OTPResponse   {
  @JsonProperty("balance")
  private Long balance = null;

  @JsonProperty("batch_id")
  private Long batchId = null;

  @JsonProperty("cost")
  private Long cost = null;

  @JsonProperty("custom")
  private String custom = null;

  @JsonProperty("message")
  private Message message = null;

  @JsonProperty("messages")
  @Valid
  private List<MessageRecipient> messages = null;

  @JsonProperty("num_messages")
  private Long numMessages = null;

  @JsonProperty("receipt_url")
  private String receiptUrl = null;

  @JsonProperty("status")
  private String status = null;

  public OTPResponse balance(Long balance) {
    this.balance = balance;
    return this;
  }

  /**
   * Get balance
   * @return balance
  **/
  @ApiModelProperty(value = "")


  public Long getBalance() {
    return balance;
  }

  public void setBalance(Long balance) {
    this.balance = balance;
  }

  public OTPResponse batchId(Long batchId) {
    this.batchId = batchId;
    return this;
  }

  /**
   * Get batchId
   * @return batchId
  **/
  @ApiModelProperty(value = "")


  public Long getBatchId() {
    return batchId;
  }

  public void setBatchId(Long batchId) {
    this.batchId = batchId;
  }

  public OTPResponse cost(Long cost) {
    this.cost = cost;
    return this;
  }

  /**
   * Get cost
   * @return cost
  **/
  @ApiModelProperty(value = "")


  public Long getCost() {
    return cost;
  }

  public void setCost(Long cost) {
    this.cost = cost;
  }

  public OTPResponse custom(String custom) {
    this.custom = custom;
    return this;
  }

  /**
   * Get custom
   * @return custom
  **/
  @ApiModelProperty(value = "")


  public String getCustom() {
    return custom;
  }

  public void setCustom(String custom) {
    this.custom = custom;
  }

  public OTPResponse message(Message message) {
    this.message = message;
    return this;
  }

  /**
   * Get message
   * @return message
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Message getMessage() {
    return message;
  }

  public void setMessage(Message message) {
    this.message = message;
  }

  public OTPResponse messages(List<MessageRecipient> messages) {
    this.messages = messages;
    return this;
  }

  public OTPResponse addMessagesItem(MessageRecipient messagesItem) {
    if (this.messages == null) {
      this.messages = new ArrayList<MessageRecipient>();
    }
    this.messages.add(messagesItem);
    return this;
  }

  /**
   * Get messages
   * @return messages
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<MessageRecipient> getMessages() {
    return messages;
  }

  public void setMessages(List<MessageRecipient> messages) {
    this.messages = messages;
  }

  public OTPResponse numMessages(Long numMessages) {
    this.numMessages = numMessages;
    return this;
  }

  /**
   * Get numMessages
   * @return numMessages
  **/
  @ApiModelProperty(value = "")


  public Long getNumMessages() {
    return numMessages;
  }

  public void setNumMessages(Long numMessages) {
    this.numMessages = numMessages;
  }

  public OTPResponse receiptUrl(String receiptUrl) {
    this.receiptUrl = receiptUrl;
    return this;
  }

  /**
   * Get receiptUrl
   * @return receiptUrl
  **/
  @ApiModelProperty(value = "")


  public String getReceiptUrl() {
    return receiptUrl;
  }

  public void setReceiptUrl(String receiptUrl) {
    this.receiptUrl = receiptUrl;
  }

  public OTPResponse status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")


  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OTPResponse otPResponse = (OTPResponse) o;
    return Objects.equals(this.balance, otPResponse.balance) &&
        Objects.equals(this.batchId, otPResponse.batchId) &&
        Objects.equals(this.cost, otPResponse.cost) &&
        Objects.equals(this.custom, otPResponse.custom) &&
        Objects.equals(this.message, otPResponse.message) &&
        Objects.equals(this.messages, otPResponse.messages) &&
        Objects.equals(this.numMessages, otPResponse.numMessages) &&
        Objects.equals(this.receiptUrl, otPResponse.receiptUrl) &&
        Objects.equals(this.status, otPResponse.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(balance, batchId, cost, custom, message, messages, numMessages, receiptUrl, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OTPResponse {\n");
    
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    batchId: ").append(toIndentedString(batchId)).append("\n");
    sb.append("    cost: ").append(toIndentedString(cost)).append("\n");
    sb.append("    custom: ").append(toIndentedString(custom)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    messages: ").append(toIndentedString(messages)).append("\n");
    sb.append("    numMessages: ").append(toIndentedString(numMessages)).append("\n");
    sb.append("    receiptUrl: ").append(toIndentedString(receiptUrl)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

