package com.diviso.graeshoppe.customerappgateway.client.payment.model;

import java.util.Objects;
import com.diviso.graeshoppe.customerappgateway.client.payment.model.Amount;
import com.diviso.graeshoppe.customerappgateway.client.payment.model.Payee;
import com.diviso.graeshoppe.customerappgateway.client.payment.model.RelatedResources;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * Transaction
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-09-23T12:15:47.246272+05:30[Asia/Kolkata]")

public class Transaction   {
  @JsonProperty("amount")
  private Amount amount = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("invoice_number")
  private String invoiceNumber = null;

  @JsonProperty("note_to_payee")
  private String noteToPayee = null;

  @JsonProperty("payee")
  private Payee payee = null;

  @JsonProperty("related_resources")
  @Valid
  private List<RelatedResources> relatedResources = null;

  public Transaction amount(Amount amount) {
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

  public Transaction description(String description) {
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

  public Transaction invoiceNumber(String invoiceNumber) {
    this.invoiceNumber = invoiceNumber;
    return this;
  }

  /**
   * Get invoiceNumber
   * @return invoiceNumber
  **/
  @ApiModelProperty(value = "")


  public String getInvoiceNumber() {
    return invoiceNumber;
  }

  public void setInvoiceNumber(String invoiceNumber) {
    this.invoiceNumber = invoiceNumber;
  }

  public Transaction noteToPayee(String noteToPayee) {
    this.noteToPayee = noteToPayee;
    return this;
  }

  /**
   * Get noteToPayee
   * @return noteToPayee
  **/
  @ApiModelProperty(value = "")


  public String getNoteToPayee() {
    return noteToPayee;
  }

  public void setNoteToPayee(String noteToPayee) {
    this.noteToPayee = noteToPayee;
  }

  public Transaction payee(Payee payee) {
    this.payee = payee;
    return this;
  }

  /**
   * Get payee
   * @return payee
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Payee getPayee() {
    return payee;
  }

  public void setPayee(Payee payee) {
    this.payee = payee;
  }

  public Transaction relatedResources(List<RelatedResources> relatedResources) {
    this.relatedResources = relatedResources;
    return this;
  }

  public Transaction addRelatedResourcesItem(RelatedResources relatedResourcesItem) {
    if (this.relatedResources == null) {
      this.relatedResources = new ArrayList<RelatedResources>();
    }
    this.relatedResources.add(relatedResourcesItem);
    return this;
  }

  /**
   * Get relatedResources
   * @return relatedResources
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<RelatedResources> getRelatedResources() {
    return relatedResources;
  }

  public void setRelatedResources(List<RelatedResources> relatedResources) {
    this.relatedResources = relatedResources;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Transaction transaction = (Transaction) o;
    return Objects.equals(this.amount, transaction.amount) &&
        Objects.equals(this.description, transaction.description) &&
        Objects.equals(this.invoiceNumber, transaction.invoiceNumber) &&
        Objects.equals(this.noteToPayee, transaction.noteToPayee) &&
        Objects.equals(this.payee, transaction.payee) &&
        Objects.equals(this.relatedResources, transaction.relatedResources);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, description, invoiceNumber, noteToPayee, payee, relatedResources);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Transaction {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    invoiceNumber: ").append(toIndentedString(invoiceNumber)).append("\n");
    sb.append("    noteToPayee: ").append(toIndentedString(noteToPayee)).append("\n");
    sb.append("    payee: ").append(toIndentedString(payee)).append("\n");
    sb.append("    relatedResources: ").append(toIndentedString(relatedResources)).append("\n");
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

