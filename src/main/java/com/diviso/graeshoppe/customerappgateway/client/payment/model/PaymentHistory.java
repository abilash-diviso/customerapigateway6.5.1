package com.diviso.graeshoppe.customerappgateway.client.payment.model;

import java.util.Objects;
import com.diviso.graeshoppe.customerappgateway.client.payment.model.PaymentDetails;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * PaymentHistory
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-09-23T12:15:47.246272+05:30[Asia/Kolkata]")

public class PaymentHistory   {
  @JsonProperty("count")
  private Integer count = null;

  @JsonProperty("nextId")
  private String nextId = null;

  @JsonProperty("payments")
  @Valid
  private List<PaymentDetails> payments = null;

  public PaymentHistory count(Integer count) {
    this.count = count;
    return this;
  }

  /**
   * Get count
   * @return count
  **/
  @ApiModelProperty(value = "")


  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public PaymentHistory nextId(String nextId) {
    this.nextId = nextId;
    return this;
  }

  /**
   * Get nextId
   * @return nextId
  **/
  @ApiModelProperty(value = "")


  public String getNextId() {
    return nextId;
  }

  public void setNextId(String nextId) {
    this.nextId = nextId;
  }

  public PaymentHistory payments(List<PaymentDetails> payments) {
    this.payments = payments;
    return this;
  }

  public PaymentHistory addPaymentsItem(PaymentDetails paymentsItem) {
    if (this.payments == null) {
      this.payments = new ArrayList<PaymentDetails>();
    }
    this.payments.add(paymentsItem);
    return this;
  }

  /**
   * Get payments
   * @return payments
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<PaymentDetails> getPayments() {
    return payments;
  }

  public void setPayments(List<PaymentDetails> payments) {
    this.payments = payments;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentHistory paymentHistory = (PaymentHistory) o;
    return Objects.equals(this.count, paymentHistory.count) &&
        Objects.equals(this.nextId, paymentHistory.nextId) &&
        Objects.equals(this.payments, paymentHistory.payments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, nextId, payments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentHistory {\n");
    
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    nextId: ").append(toIndentedString(nextId)).append("\n");
    sb.append("    payments: ").append(toIndentedString(payments)).append("\n");
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

