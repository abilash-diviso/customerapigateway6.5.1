package com.diviso.graeshoppe.customerappgateway.client.payment.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

/**
 * PaymentTransaction
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-09-23T12:15:47.246272+05:30[Asia/Kolkata]")

public class PaymentTransaction   {
  @JsonProperty("amount")
  private Double amount = null;

  @JsonProperty("customerId")
  private String customerId = null;

  @JsonProperty("nounce")
  private String nounce = null;

  public PaymentTransaction amount(Double amount) {
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

  public PaymentTransaction customerId(String customerId) {
    this.customerId = customerId;
    return this;
  }

  /**
   * Get customerId
   * @return customerId
  **/
  @ApiModelProperty(value = "")


  public String getCustomerId() {
    return customerId;
  }

  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }

  public PaymentTransaction nounce(String nounce) {
    this.nounce = nounce;
    return this;
  }

  /**
   * Get nounce
   * @return nounce
  **/
  @ApiModelProperty(value = "")


  public String getNounce() {
    return nounce;
  }

  public void setNounce(String nounce) {
    this.nounce = nounce;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentTransaction paymentTransaction = (PaymentTransaction) o;
    return Objects.equals(this.amount, paymentTransaction.amount) &&
        Objects.equals(this.customerId, paymentTransaction.customerId) &&
        Objects.equals(this.nounce, paymentTransaction.nounce);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, customerId, nounce);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentTransaction {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    nounce: ").append(toIndentedString(nounce)).append("\n");
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

