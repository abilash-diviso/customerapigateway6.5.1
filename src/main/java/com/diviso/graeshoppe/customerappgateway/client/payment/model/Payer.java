package com.diviso.graeshoppe.customerappgateway.client.payment.model;

import java.util.Objects;
import com.diviso.graeshoppe.customerappgateway.client.payment.model.FundingInstrument;
import com.diviso.graeshoppe.customerappgateway.client.payment.model.PayerInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * Payer
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-09-23T12:15:47.246272+05:30[Asia/Kolkata]")

public class Payer   {
  @JsonProperty("funding_instruments")
  @Valid
  private List<FundingInstrument> fundingInstruments = null;

  @JsonProperty("payer_info")
  private PayerInfo payerInfo = null;

  @JsonProperty("payment_method")
  private String paymentMethod = null;

  @JsonProperty("status")
  private String status = null;

  public Payer fundingInstruments(List<FundingInstrument> fundingInstruments) {
    this.fundingInstruments = fundingInstruments;
    return this;
  }

  public Payer addFundingInstrumentsItem(FundingInstrument fundingInstrumentsItem) {
    if (this.fundingInstruments == null) {
      this.fundingInstruments = new ArrayList<FundingInstrument>();
    }
    this.fundingInstruments.add(fundingInstrumentsItem);
    return this;
  }

  /**
   * Get fundingInstruments
   * @return fundingInstruments
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<FundingInstrument> getFundingInstruments() {
    return fundingInstruments;
  }

  public void setFundingInstruments(List<FundingInstrument> fundingInstruments) {
    this.fundingInstruments = fundingInstruments;
  }

  public Payer payerInfo(PayerInfo payerInfo) {
    this.payerInfo = payerInfo;
    return this;
  }

  /**
   * Get payerInfo
   * @return payerInfo
  **/
  @ApiModelProperty(value = "")

  @Valid

  public PayerInfo getPayerInfo() {
    return payerInfo;
  }

  public void setPayerInfo(PayerInfo payerInfo) {
    this.payerInfo = payerInfo;
  }

  public Payer paymentMethod(String paymentMethod) {
    this.paymentMethod = paymentMethod;
    return this;
  }

  /**
   * Get paymentMethod
   * @return paymentMethod
  **/
  @ApiModelProperty(value = "")


  public String getPaymentMethod() {
    return paymentMethod;
  }

  public void setPaymentMethod(String paymentMethod) {
    this.paymentMethod = paymentMethod;
  }

  public Payer status(String status) {
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
    Payer payer = (Payer) o;
    return Objects.equals(this.fundingInstruments, payer.fundingInstruments) &&
        Objects.equals(this.payerInfo, payer.payerInfo) &&
        Objects.equals(this.paymentMethod, payer.paymentMethod) &&
        Objects.equals(this.status, payer.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fundingInstruments, payerInfo, paymentMethod, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Payer {\n");
    
    sb.append("    fundingInstruments: ").append(toIndentedString(fundingInstruments)).append("\n");
    sb.append("    payerInfo: ").append(toIndentedString(payerInfo)).append("\n");
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
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

