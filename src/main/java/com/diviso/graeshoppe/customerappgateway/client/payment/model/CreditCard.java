package com.diviso.graeshoppe.customerappgateway.client.payment.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

/**
 * CreditCard
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-09-23T12:15:47.246272+05:30[Asia/Kolkata]")

public class CreditCard   {
  @JsonProperty("cvv2")
  private Integer cvv2 = null;

  @JsonProperty("expireMonth")
  private Integer expireMonth = null;

  @JsonProperty("expireYear")
  private Integer expireYear = null;

  @JsonProperty("number")
  private String number = null;

  @JsonProperty("type")
  private String type = null;

  public CreditCard cvv2(Integer cvv2) {
    this.cvv2 = cvv2;
    return this;
  }

  /**
   * Get cvv2
   * @return cvv2
  **/
  @ApiModelProperty(value = "")


  public Integer getCvv2() {
    return cvv2;
  }

  public void setCvv2(Integer cvv2) {
    this.cvv2 = cvv2;
  }

  public CreditCard expireMonth(Integer expireMonth) {
    this.expireMonth = expireMonth;
    return this;
  }

  /**
   * Get expireMonth
   * @return expireMonth
  **/
  @ApiModelProperty(value = "")


  public Integer getExpireMonth() {
    return expireMonth;
  }

  public void setExpireMonth(Integer expireMonth) {
    this.expireMonth = expireMonth;
  }

  public CreditCard expireYear(Integer expireYear) {
    this.expireYear = expireYear;
    return this;
  }

  /**
   * Get expireYear
   * @return expireYear
  **/
  @ApiModelProperty(value = "")


  public Integer getExpireYear() {
    return expireYear;
  }

  public void setExpireYear(Integer expireYear) {
    this.expireYear = expireYear;
  }

  public CreditCard number(String number) {
    this.number = number;
    return this;
  }

  /**
   * Get number
   * @return number
  **/
  @ApiModelProperty(value = "")


  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public CreditCard type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreditCard creditCard = (CreditCard) o;
    return Objects.equals(this.cvv2, creditCard.cvv2) &&
        Objects.equals(this.expireMonth, creditCard.expireMonth) &&
        Objects.equals(this.expireYear, creditCard.expireYear) &&
        Objects.equals(this.number, creditCard.number) &&
        Objects.equals(this.type, creditCard.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cvv2, expireMonth, expireYear, number, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditCard {\n");
    
    sb.append("    cvv2: ").append(toIndentedString(cvv2)).append("\n");
    sb.append("    expireMonth: ").append(toIndentedString(expireMonth)).append("\n");
    sb.append("    expireYear: ").append(toIndentedString(expireYear)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

