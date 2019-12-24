package com.diviso.graeshoppe.customerappgateway.client.payment.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

/**
 * Details
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-09-23T12:15:47.246272+05:30[Asia/Kolkata]")

public class Details   {
  @JsonProperty("handling_fee")
  private String handlingFee = null;

  @JsonProperty("insurance")
  private String insurance = null;

  @JsonProperty("shipping")
  private String shipping = null;

  @JsonProperty("shipping_discount")
  private String shippingDiscount = null;

  @JsonProperty("subtotal")
  private String subtotal = null;

  @JsonProperty("tax")
  private String tax = null;

  public Details handlingFee(String handlingFee) {
    this.handlingFee = handlingFee;
    return this;
  }

  /**
   * Get handlingFee
   * @return handlingFee
  **/
  @ApiModelProperty(value = "")


  public String getHandlingFee() {
    return handlingFee;
  }

  public void setHandlingFee(String handlingFee) {
    this.handlingFee = handlingFee;
  }

  public Details insurance(String insurance) {
    this.insurance = insurance;
    return this;
  }

  /**
   * Get insurance
   * @return insurance
  **/
  @ApiModelProperty(value = "")


  public String getInsurance() {
    return insurance;
  }

  public void setInsurance(String insurance) {
    this.insurance = insurance;
  }

  public Details shipping(String shipping) {
    this.shipping = shipping;
    return this;
  }

  /**
   * Get shipping
   * @return shipping
  **/
  @ApiModelProperty(value = "")


  public String getShipping() {
    return shipping;
  }

  public void setShipping(String shipping) {
    this.shipping = shipping;
  }

  public Details shippingDiscount(String shippingDiscount) {
    this.shippingDiscount = shippingDiscount;
    return this;
  }

  /**
   * Get shippingDiscount
   * @return shippingDiscount
  **/
  @ApiModelProperty(value = "")


  public String getShippingDiscount() {
    return shippingDiscount;
  }

  public void setShippingDiscount(String shippingDiscount) {
    this.shippingDiscount = shippingDiscount;
  }

  public Details subtotal(String subtotal) {
    this.subtotal = subtotal;
    return this;
  }

  /**
   * Get subtotal
   * @return subtotal
  **/
  @ApiModelProperty(value = "")


  public String getSubtotal() {
    return subtotal;
  }

  public void setSubtotal(String subtotal) {
    this.subtotal = subtotal;
  }

  public Details tax(String tax) {
    this.tax = tax;
    return this;
  }

  /**
   * Get tax
   * @return tax
  **/
  @ApiModelProperty(value = "")


  public String getTax() {
    return tax;
  }

  public void setTax(String tax) {
    this.tax = tax;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Details details = (Details) o;
    return Objects.equals(this.handlingFee, details.handlingFee) &&
        Objects.equals(this.insurance, details.insurance) &&
        Objects.equals(this.shipping, details.shipping) &&
        Objects.equals(this.shippingDiscount, details.shippingDiscount) &&
        Objects.equals(this.subtotal, details.subtotal) &&
        Objects.equals(this.tax, details.tax);
  }

  @Override
  public int hashCode() {
    return Objects.hash(handlingFee, insurance, shipping, shippingDiscount, subtotal, tax);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Details {\n");
    
    sb.append("    handlingFee: ").append(toIndentedString(handlingFee)).append("\n");
    sb.append("    insurance: ").append(toIndentedString(insurance)).append("\n");
    sb.append("    shipping: ").append(toIndentedString(shipping)).append("\n");
    sb.append("    shippingDiscount: ").append(toIndentedString(shippingDiscount)).append("\n");
    sb.append("    subtotal: ").append(toIndentedString(subtotal)).append("\n");
    sb.append("    tax: ").append(toIndentedString(tax)).append("\n");
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

