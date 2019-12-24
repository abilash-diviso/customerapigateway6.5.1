package com.diviso.graeshoppe.customerappgateway.client.report.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * OrderLine
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-10-15T11:16:15.523+05:30[Asia/Kolkata]")

public class OrderLine   {
  @JsonProperty("auxItems")
  @Valid
  private List<AuxItem> auxItems = null;

  @JsonProperty("combos")
  @Valid
  private List<ComboItem> combos = null;

  @JsonProperty("item")
  private String item = null;

  @JsonProperty("quantity")
  private Integer quantity = null;

  @JsonProperty("total")
  private Double total = null;

  public OrderLine auxItems(List<AuxItem> auxItems) {
    this.auxItems = auxItems;
    return this;
  }

  public OrderLine addAuxItemsItem(AuxItem auxItemsItem) {
    if (this.auxItems == null) {
      this.auxItems = new ArrayList<AuxItem>();
    }
    this.auxItems.add(auxItemsItem);
    return this;
  }

  /**
   * Get auxItems
   * @return auxItems
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<AuxItem> getAuxItems() {
    return auxItems;
  }

  public void setAuxItems(List<AuxItem> auxItems) {
    this.auxItems = auxItems;
  }

  public OrderLine combos(List<ComboItem> combos) {
    this.combos = combos;
    return this;
  }

  public OrderLine addCombosItem(ComboItem combosItem) {
    if (this.combos == null) {
      this.combos = new ArrayList<ComboItem>();
    }
    this.combos.add(combosItem);
    return this;
  }

  /**
   * Get combos
   * @return combos
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<ComboItem> getCombos() {
    return combos;
  }

  public void setCombos(List<ComboItem> combos) {
    this.combos = combos;
  }

  public OrderLine item(String item) {
    this.item = item;
    return this;
  }

  /**
   * Get item
   * @return item
  **/
  @ApiModelProperty(value = "")


  public String getItem() {
    return item;
  }

  public void setItem(String item) {
    this.item = item;
  }

  public OrderLine quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

  /**
   * Get quantity
   * @return quantity
  **/
  @ApiModelProperty(value = "")


  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public OrderLine total(Double total) {
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
    OrderLine orderLine = (OrderLine) o;
    return Objects.equals(this.auxItems, orderLine.auxItems) &&
        Objects.equals(this.combos, orderLine.combos) &&
        Objects.equals(this.item, orderLine.item) &&
        Objects.equals(this.quantity, orderLine.quantity) &&
        Objects.equals(this.total, orderLine.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(auxItems, combos, item, quantity, total);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderLine {\n");
    
    sb.append("    auxItems: ").append(toIndentedString(auxItems)).append("\n");
    sb.append("    combos: ").append(toIndentedString(combos)).append("\n");
    sb.append("    item: ").append(toIndentedString(item)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
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

