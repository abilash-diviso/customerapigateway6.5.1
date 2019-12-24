package com.diviso.graeshoppe.customerappgateway.client.payment.model;

import java.util.Objects;
import com.diviso.graeshoppe.customerappgateway.client.payment.model.CreditCard;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * FundingInstrument
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-09-23T12:15:47.246272+05:30[Asia/Kolkata]")

public class FundingInstrument   {
  @JsonProperty("credit_card")
  private CreditCard creditCard = null;

  public FundingInstrument creditCard(CreditCard creditCard) {
    this.creditCard = creditCard;
    return this;
  }

  /**
   * Get creditCard
   * @return creditCard
  **/
  @ApiModelProperty(value = "")

  @Valid

  public CreditCard getCreditCard() {
    return creditCard;
  }

  public void setCreditCard(CreditCard creditCard) {
    this.creditCard = creditCard;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FundingInstrument fundingInstrument = (FundingInstrument) o;
    return Objects.equals(this.creditCard, fundingInstrument.creditCard);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creditCard);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FundingInstrument {\n");
    
    sb.append("    creditCard: ").append(toIndentedString(creditCard)).append("\n");
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

