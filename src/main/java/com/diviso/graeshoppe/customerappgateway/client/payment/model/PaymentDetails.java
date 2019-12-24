package com.diviso.graeshoppe.customerappgateway.client.payment.model;

import java.util.Objects;
import com.diviso.graeshoppe.customerappgateway.client.payment.model.Links;
import com.diviso.graeshoppe.customerappgateway.client.payment.model.Payer;
import com.diviso.graeshoppe.customerappgateway.client.payment.model.Transaction;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * PaymentDetails
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-09-23T12:15:47.246272+05:30[Asia/Kolkata]")

public class PaymentDetails   {
  @JsonProperty("create_time")
  private String createTime = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("intent")
  private String intent = null;

  @JsonProperty("links")
  @Valid
  private List<Links> links = null;

  @JsonProperty("payer")
  private Payer payer = null;

  @JsonProperty("state")
  private String state = null;

  @JsonProperty("transactions")
  @Valid
  private List<Transaction> transactions = null;

  @JsonProperty("update_time")
  private String updateTime = null;

  public PaymentDetails createTime(String createTime) {
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

  public PaymentDetails id(String id) {
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

  public PaymentDetails intent(String intent) {
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

  public PaymentDetails links(List<Links> links) {
    this.links = links;
    return this;
  }

  public PaymentDetails addLinksItem(Links linksItem) {
    if (this.links == null) {
      this.links = new ArrayList<Links>();
    }
    this.links.add(linksItem);
    return this;
  }

  /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<Links> getLinks() {
    return links;
  }

  public void setLinks(List<Links> links) {
    this.links = links;
  }

  public PaymentDetails payer(Payer payer) {
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

  public PaymentDetails state(String state) {
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

  public PaymentDetails transactions(List<Transaction> transactions) {
    this.transactions = transactions;
    return this;
  }

  public PaymentDetails addTransactionsItem(Transaction transactionsItem) {
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

  public PaymentDetails updateTime(String updateTime) {
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
    PaymentDetails paymentDetails = (PaymentDetails) o;
    return Objects.equals(this.createTime, paymentDetails.createTime) &&
        Objects.equals(this.id, paymentDetails.id) &&
        Objects.equals(this.intent, paymentDetails.intent) &&
        Objects.equals(this.links, paymentDetails.links) &&
        Objects.equals(this.payer, paymentDetails.payer) &&
        Objects.equals(this.state, paymentDetails.state) &&
        Objects.equals(this.transactions, paymentDetails.transactions) &&
        Objects.equals(this.updateTime, paymentDetails.updateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createTime, id, intent, links, payer, state, transactions, updateTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentDetails {\n");
    
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    intent: ").append(toIndentedString(intent)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    payer: ").append(toIndentedString(payer)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    transactions: ").append(toIndentedString(transactions)).append("\n");
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

