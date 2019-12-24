package com.diviso.graeshoppe.customerappgateway.client.payment.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

/**
 * OrderRequest
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-09-23T12:15:47.246272+05:30[Asia/Kolkata]")

public class OrderRequest   {
  @JsonProperty("amount")
  private Double amount = null;

  @JsonProperty("currency")
  private String currency = null;

  @JsonProperty("payment_capture")
  private Integer paymentCapture = null;

  @JsonProperty("receipt")
  private String receipt = null;

  public OrderRequest amount(Double amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Get amount
   * @return amount
  **/
  @ApiModelProperty(value = "")


  public Double getAmount() {
    return amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }

  public OrderRequest currency(String currency) {
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

  public OrderRequest paymentCapture(Integer paymentCapture) {
    this.paymentCapture = paymentCapture;
    return this;
  }

  /**
   * Get paymentCapture
   * @return paymentCapture
  **/
  @ApiModelProperty(value = "")


  public Integer getPaymentCapture() {
    return paymentCapture;
  }

  public void setPaymentCapture(Integer paymentCapture) {
    this.paymentCapture = paymentCapture;
  }

  public OrderRequest receipt(String receipt) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderRequest orderRequest = (OrderRequest) o;
    return Objects.equals(this.amount, orderRequest.amount) &&
        Objects.equals(this.currency, orderRequest.currency) &&
        Objects.equals(this.paymentCapture, orderRequest.paymentCapture) &&
        Objects.equals(this.receipt, orderRequest.receipt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, currency, paymentCapture, receipt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderRequest {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    paymentCapture: ").append(toIndentedString(paymentCapture)).append("\n");
    sb.append("    receipt: ").append(toIndentedString(receipt)).append("\n");
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

