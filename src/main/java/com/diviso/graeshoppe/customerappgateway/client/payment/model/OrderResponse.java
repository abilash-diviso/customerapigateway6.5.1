package com.diviso.graeshoppe.customerappgateway.client.payment.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * OrderResponse
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-09-23T12:15:47.246272+05:30[Asia/Kolkata]")

public class OrderResponse   {
  @JsonProperty("amount")
  private Integer amount = null;

  @JsonProperty("amount_due")
  private Integer amountDue = null;

  @JsonProperty("amount_paid")
  private Integer amountPaid = null;

  @JsonProperty("attempts")
  private Integer attempts = null;

  @JsonProperty("created_at")
  private OffsetDateTime createdAt = null;

  @JsonProperty("currency")
  private String currency = null;

  @JsonProperty("entity")
  private String entity = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("notes")
  @Valid
  private List<String> notes = null;

  @JsonProperty("offer_id")
  private String offerId = null;

  @JsonProperty("receipt")
  private String receipt = null;

  @JsonProperty("status")
  private String status = null;

  public OrderResponse amount(Integer amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Get amount
   * @return amount
  **/
  @ApiModelProperty(value = "")


  public Integer getAmount() {
    return amount;
  }

  public void setAmount(Integer amount) {
    this.amount = amount;
  }

  public OrderResponse amountDue(Integer amountDue) {
    this.amountDue = amountDue;
    return this;
  }

  /**
   * Get amountDue
   * @return amountDue
  **/
  @ApiModelProperty(value = "")


  public Integer getAmountDue() {
    return amountDue;
  }

  public void setAmountDue(Integer amountDue) {
    this.amountDue = amountDue;
  }

  public OrderResponse amountPaid(Integer amountPaid) {
    this.amountPaid = amountPaid;
    return this;
  }

  /**
   * Get amountPaid
   * @return amountPaid
  **/
  @ApiModelProperty(value = "")


  public Integer getAmountPaid() {
    return amountPaid;
  }

  public void setAmountPaid(Integer amountPaid) {
    this.amountPaid = amountPaid;
  }

  public OrderResponse attempts(Integer attempts) {
    this.attempts = attempts;
    return this;
  }

  /**
   * Get attempts
   * @return attempts
  **/
  @ApiModelProperty(value = "")


  public Integer getAttempts() {
    return attempts;
  }

  public void setAttempts(Integer attempts) {
    this.attempts = attempts;
  }

  public OrderResponse createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Get createdAt
   * @return createdAt
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public OrderResponse currency(String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * Get currency
   * @return currency
  **/
  @ApiModelProperty(value = "")


  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public OrderResponse entity(String entity) {
    this.entity = entity;
    return this;
  }

  /**
   * Get entity
   * @return entity
  **/
  @ApiModelProperty(value = "")


  public String getEntity() {
    return entity;
  }

  public void setEntity(String entity) {
    this.entity = entity;
  }

  public OrderResponse id(String id) {
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

  public OrderResponse notes(List<String> notes) {
    this.notes = notes;
    return this;
  }

  public OrderResponse addNotesItem(String notesItem) {
    if (this.notes == null) {
      this.notes = new ArrayList<String>();
    }
    this.notes.add(notesItem);
    return this;
  }

  /**
   * Get notes
   * @return notes
  **/
  @ApiModelProperty(value = "")


  public List<String> getNotes() {
    return notes;
  }

  public void setNotes(List<String> notes) {
    this.notes = notes;
  }

  public OrderResponse offerId(String offerId) {
    this.offerId = offerId;
    return this;
  }

  /**
   * Get offerId
   * @return offerId
  **/
  @ApiModelProperty(value = "")


  public String getOfferId() {
    return offerId;
  }

  public void setOfferId(String offerId) {
    this.offerId = offerId;
  }

  public OrderResponse receipt(String receipt) {
    this.receipt = receipt;
    return this;
  }

  /**
   * Get receipt
   * @return receipt
  **/
  @ApiModelProperty(value = "")


  public String getReceipt() {
    return receipt;
  }

  public void setReceipt(String receipt) {
    this.receipt = receipt;
  }

  public OrderResponse status(String status) {
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
    OrderResponse orderResponse = (OrderResponse) o;
    return Objects.equals(this.amount, orderResponse.amount) &&
        Objects.equals(this.amountDue, orderResponse.amountDue) &&
        Objects.equals(this.amountPaid, orderResponse.amountPaid) &&
        Objects.equals(this.attempts, orderResponse.attempts) &&
        Objects.equals(this.createdAt, orderResponse.createdAt) &&
        Objects.equals(this.currency, orderResponse.currency) &&
        Objects.equals(this.entity, orderResponse.entity) &&
        Objects.equals(this.id, orderResponse.id) &&
        Objects.equals(this.notes, orderResponse.notes) &&
        Objects.equals(this.offerId, orderResponse.offerId) &&
        Objects.equals(this.receipt, orderResponse.receipt) &&
        Objects.equals(this.status, orderResponse.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, amountDue, amountPaid, attempts, createdAt, currency, entity, id, notes, offerId, receipt, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderResponse {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    amountDue: ").append(toIndentedString(amountDue)).append("\n");
    sb.append("    amountPaid: ").append(toIndentedString(amountPaid)).append("\n");
    sb.append("    attempts: ").append(toIndentedString(attempts)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    entity: ").append(toIndentedString(entity)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    offerId: ").append(toIndentedString(offerId)).append("\n");
    sb.append("    receipt: ").append(toIndentedString(receipt)).append("\n");
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

