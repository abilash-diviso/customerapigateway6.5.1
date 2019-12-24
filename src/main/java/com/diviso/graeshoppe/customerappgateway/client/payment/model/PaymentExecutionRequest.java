package com.diviso.graeshoppe.customerappgateway.client.payment.model;

import java.util.Objects;
import com.diviso.graeshoppe.customerappgateway.client.payment.model.Transaction;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * PaymentExecutionRequest
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-09-23T12:15:47.246272+05:30[Asia/Kolkata]")

public class PaymentExecutionRequest   {
  @JsonProperty("payer_id")
  private String payerId = null;

  @JsonProperty("transactions")
  @Valid
  private List<Transaction> transactions = null;

  public PaymentExecutionRequest payerId(String payerId) {
    this.payerId = payerId;
    return this;
  }

  /**
   * Get payerId
   * @return payerId
  **/
  @ApiModelProperty(value = "")


  public String getPayerId() {
    return payerId;
  }

  public void setPayerId(String payerId) {
    this.payerId = payerId;
  }

  public PaymentExecutionRequest transactions(List<Transaction> transactions) {
    this.transactions = transactions;
    return this;
  }

  public PaymentExecutionRequest addTransactionsItem(Transaction transactionsItem) {
    if (this.transactions == null) {
      this.transactions = new ArrayList<Transaction>();
    }
    this.transactions.add(transactionsItem);
    return this;
  }

  /**
   * Get transactions
   * @return transactions
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<Transaction> getTransactions() {
    return transactions;
  }

  public void setTransactions(List<Transaction> transactions) {
    this.transactions = transactions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentExecutionRequest paymentExecutionRequest = (PaymentExecutionRequest) o;
    return Objects.equals(this.payerId, paymentExecutionRequest.payerId) &&
        Objects.equals(this.transactions, paymentExecutionRequest.transactions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(payerId, transactions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentExecutionRequest {\n");
    
    sb.append("    payerId: ").append(toIndentedString(payerId)).append("\n");
    sb.append("    transactions: ").append(toIndentedString(transactions)).append("\n");
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

