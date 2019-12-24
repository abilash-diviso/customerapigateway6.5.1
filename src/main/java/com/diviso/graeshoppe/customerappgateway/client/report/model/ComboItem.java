package com.diviso.graeshoppe.customerappgateway.client.report.model;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * ComboItem
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-10-15T11:16:15.523+05:30[Asia/Kolkata]")

public class ComboItem   {
  @JsonProperty("comboItem")
  private String comboItem = null;

  @JsonProperty("quantity")
  private Double quantity = null;

  public ComboItem comboItem(String comboItem) {
    this.comboItem = comboItem;
    return this;
  }

  /**
   * Get comboItem
   * @return comboItem
  **/
  @ApiModelProperty(value = "")


  public String getComboItem() {
    return comboItem;
  }

  public void setComboItem(String comboItem) {
    this.comboItem = comboItem;
  }

  public ComboItem quantity(Double quantity) {
    this.quantity = quantity;
    return this;
  }

  /**
   * Get quantity
   * @return quantity
  **/
  @ApiModelProperty(value = "")


  public Double getQuantity() {
    return quantity;
  }

  public void setQuantity(Double quantity) {
    this.quantity = quantity;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComboItem comboItem = (ComboItem) o;
    return Objects.equals(this.comboItem, comboItem.comboItem) &&
        Objects.equals(this.quantity, comboItem.quantity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comboItem, quantity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComboItem {\n");
    
    sb.append("    comboItem: ").append(toIndentedString(comboItem)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
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

