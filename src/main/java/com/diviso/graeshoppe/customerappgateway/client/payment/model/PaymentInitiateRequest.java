package com.diviso.graeshoppe.customerappgateway.client.payment.model;

import java.util.Objects;
import com.diviso.graeshoppe.customerappgateway.client.payment.model.Link;
import com.diviso.graeshoppe.customerappgateway.client.payment.model.Payer;
import com.diviso.graeshoppe.customerappgateway.client.payment.model.Transaction;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * PaymentInitiateRequest
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-09-23T12:15:47.246272+05:30[Asia/Kolkata]")

public class PaymentInitiateRequest   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("intent")
  private String intent = null;

  @JsonProperty("note_to_payer")
  private String noteToPayer = null;

  @JsonProperty("payer")
  private Payer payer = null;

  @JsonProperty("redirect_urls")
  private Link redirectUrls = null;

  @JsonProperty("state")
  private String state = null;

  @JsonProperty("transactions")
  @Valid
  private List<Transaction> transactions = null;

  public PaymentInitiateRequest id(String id) {
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

  public PaymentInitiateRequest intent(String intent) {
    this.intent = intent;
    return this;
  }

  /**
   * Get intent
   * @return intent
  **/
  @ApiModelProperty(value = "")


  public String getIntent() {
    return intent;
  }

  public void setIntent(String intent) {
    this.intent = intent;
  }

  public PaymentInitiateRequest noteToPayer(String noteToPayer) {
    this.noteToPayer = noteToPayer;
    return this;
  }

  /**
   * Get noteToPayer
   * @return noteToPayer
  **/
  @ApiModelProperty(value = "")


  public String getNoteToPayer() {
    return noteToPayer;
  }

  public void setNoteToPayer(String noteToPayer) {
    this.noteToPayer = noteToPayer;
  }

  public PaymentInitiateRequest payer(Payer payer) {
    this.payer = payer;
    return this;
  }

  /**
   * Get payer
   * @return payer
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Payer getPayer() {
    return payer;
  }

  public void setPayer(Payer payer) {
    this.payer = payer;
  }

  public PaymentInitiateRequest redirectUrls(Link redirectUrls) {
    this.redirectUrls = redirectUrls;
    return this;
  }

  /**
   * Get redirectUrls
   * @return redirectUrls
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Link getRedirectUrls() {
    return redirectUrls;
  }

  public void setRedirectUrls(Link redirectUrls) {
    this.redirectUrls = redirectUrls;
  }

  public PaymentInitiateRequest state(String state) {
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

  public PaymentInitiateRequest transactions(List<Transaction> transactions) {
    this.transactions = transactions;
    return this;
  }

  public PaymentInitiateRequest addTransactionsItem(Transaction transactionsItem) {
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
    PaymentInitiateRequest paymentInitiateRequest = (PaymentInitiateRequest) o;
    return Objects.equals(this.id, paymentInitiateRequest.id) &&
        Objects.equals(this.intent, paymentInitiateRequest.intent) &&
        Objects.equals(this.noteToPayer, paymentInitiateRequest.noteToPayer) &&
        Objects.equals(this.payer, paymentInitiateRequest.payer) &&
        Objects.equals(this.redirectUrls, paymentInitiateRequest.redirectUrls) &&
        Objects.equals(this.state, paymentInitiateRequest.state) &&
        Objects.equals(this.transactions, paymentInitiateRequest.transactions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, intent, noteToPayer, payer, redirectUrls, state, transactions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentInitiateRequest {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    intent: ").append(toIndentedString(intent)).append("\n");
    sb.append("    noteToPayer: ").append(toIndentedString(noteToPayer)).append("\n");
    sb.append("    payer: ").append(toIndentedString(payer)).append("\n");
    sb.append("    redirectUrls: ").append(toIndentedString(redirectUrls)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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

