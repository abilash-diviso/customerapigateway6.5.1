package com.diviso.graeshoppe.customerappgateway.client.payment.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * PaymentDTO
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-09-23T12:15:47.246272+05:30[Asia/Kolkata]")

public class PaymentDTO   {
  @JsonProperty("amount")
  private Double amount = null;

  @JsonProperty("dateAndTime")
  private OffsetDateTime dateAndTime = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("payee")
  private String payee = null;

  @JsonProperty("payer")
  private String payer = null;

  @JsonProperty("paymentType")
  private String paymentType = null;

  @JsonProperty("provider")
  private String provider = null;

  @JsonProperty("ref")
  private String ref = null;

  @JsonProperty("status")
  private String status = null;

  @JsonProperty("targetId")
  private String targetId = null;

  @JsonProperty("tax")
  private Double tax = null;

  @JsonProperty("total")
  private Double total = null;

  public PaymentDTO amount(Double amount) {
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

  public PaymentDTO dateAndTime(OffsetDateTime dateAndTime) {
    this.dateAndTime = dateAndTime;
    return this;
  }

  /**
   * Get dateAndTime
   * @return dateAndTime
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getDateAndTime() {
    return dateAndTime;
  }

  public void setDateAndTime(OffsetDateTime dateAndTime) {
    this.dateAndTime = dateAndTime;
  }

  public PaymentDTO id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public PaymentDTO payee(String payee) {
    this.payee = payee;
    return this;
  }

  /**
   * Get payee
   * @return payee
  **/
  @ApiModelProperty(value = "")


  public String getPayee() {
    return payee;
  }

  public void setPayee(String payee) {
    this.payee = payee;
  }

  public PaymentDTO payer(String payer) {
    this.payer = payer;
    return this;
  }

  /**
   * Get payer
   * @return payer
  **/
  @ApiModelProperty(value = "")


  public String getPayer() {
    return payer;
  }

  public void setPayer(String payer) {
    this.payer = payer;
  }

  public PaymentDTO paymentType(String paymentType) {
    this.paymentType = paymentType;
    return this;
  }

  /**
   * Get paymentType
   * @return paymentType
  **/
  @ApiModelProperty(value = "")


  public String getPaymentType() {
    return paymentType;
  }

  public void setPaymentType(String paymentType) {
    this.paymentType = paymentType;
  }

  public PaymentDTO provider(String provider) {
    this.provider = provider;
    return this;
  }

  /**
   * Get provider
   * @return provider
  **/
  @ApiModelProperty(value = "")


  public String getProvider() {
    return provider;
  }

  public void setProvider(String provider) {
    this.provider = provider;
  }

  public PaymentDTO ref(String ref) {
    this.ref = ref;
    return this;
  }

  /**
   * Get ref
   * @return ref
  **/
  @ApiModelProperty(value = "")


  public String getRef() {
    return ref;
  }

  public void setRef(String ref) {
    this.ref = ref;
  }

  public PaymentDTO status(String status) {
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

  public PaymentDTO targetId(String targetId) {
    this.targetId = targetId;
    return this;
  }

  /**
   * Get targetId
   * @return targetId
  **/
  @ApiModelProperty(value = "")


  public String getTargetId() {
    return targetId;
  }

  public void setTargetId(String targetId) {
    this.targetId = targetId;
  }

  public PaymentDTO tax(Double tax) {
    this.tax = tax;
    return this;
  }

  /**
   * Get tax
   * @return tax
  **/
  @ApiModelProperty(value = "")


  public Double getTax() {
    return tax;
  }

  public void setTax(Double tax) {
    this.tax = tax;
  }

  public PaymentDTO total(Double total) {
    this.total = total;
    return this;
  }

  /**
   * Get total
   * @return total
  **/
  @ApiModelProperty(value = "")


  public Double getTotal() {
    return total;
  }

  public void setTotal(Double total) {
    this.total = total;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentDTO paymentDTO = (PaymentDTO) o;
    return Objects.equals(this.amount, paymentDTO.amount) &&
        Objects.equals(this.dateAndTime, paymentDTO.dateAndTime) &&
        Objects.equals(this.id, paymentDTO.id) &&
        Objects.equals(this.payee, paymentDTO.payee) &&
        Objects.equals(this.payer, paymentDTO.payer) &&
        Objects.equals(this.paymentType, paymentDTO.paymentType) &&
        Objects.equals(this.provider, paymentDTO.provider) &&
        Objects.equals(this.ref, paymentDTO.ref) &&
        Objects.equals(this.status, paymentDTO.status) &&
        Objects.equals(this.targetId, paymentDTO.targetId) &&
        Objects.equals(this.tax, paymentDTO.tax) &&
        Objects.equals(this.total, paymentDTO.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, dateAndTime, id, payee, payer, paymentType, provider, ref, status, targetId, tax, total);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentDTO {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    dateAndTime: ").append(toIndentedString(dateAndTime)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    payee: ").append(toIndentedString(payee)).append("\n");
    sb.append("    payer: ").append(toIndentedString(payer)).append("\n");
    sb.append("    paymentType: ").append(toIndentedString(paymentType)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    ref: ").append(toIndentedString(ref)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    targetId: ").append(toIndentedString(targetId)).append("\n");
    sb.append("    tax: ").append(toIndentedString(tax)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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

