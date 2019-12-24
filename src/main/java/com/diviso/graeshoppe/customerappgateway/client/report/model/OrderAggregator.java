package com.diviso.graeshoppe.customerappgateway.client.report.model;

import java.util.Objects;
import com.diviso.graeshoppe.customerappgateway.client.report.model.AuxItem;
import com.diviso.graeshoppe.customerappgateway.client.report.model.ComboItem;
import com.diviso.graeshoppe.customerappgateway.client.report.model.OrderLine;
import com.diviso.graeshoppe.customerappgateway.client.report.model.OrderMaster;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * OrderAggregator
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-10-15T11:16:15.523+05:30[Asia/Kolkata]")

public class OrderAggregator   {
  @JsonProperty("auxitem")
  @Valid
  private List<AuxItem> auxitem = null;

  @JsonProperty("comboItem")
  @Valid
  private List<ComboItem> comboItem = null;

  @JsonProperty("orderLine")
  @Valid
  private List<OrderLine> orderLine = null;

  @JsonProperty("orderMaster")
  private OrderMaster orderMaster = null;

  public OrderAggregator auxitem(List<AuxItem> auxitem) {
    this.auxitem = auxitem;
    return this;
  }

  public OrderAggregator addAuxitemItem(AuxItem auxitemItem) {
    if (this.auxitem == null) {
      this.auxitem = new ArrayList<AuxItem>();
    }
    this.auxitem.add(auxitemItem);
    return this;
  }

  /**
   * Get auxitem
   * @return auxitem
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<AuxItem> getAuxitem() {
    return auxitem;
  }

  public void setAuxitem(List<AuxItem> auxitem) {
    this.auxitem = auxitem;
  }

  public OrderAggregator comboItem(List<ComboItem> comboItem) {
    this.comboItem = comboItem;
    return this;
  }

  public OrderAggregator addComboItemItem(ComboItem comboItemItem) {
    if (this.comboItem == null) {
      this.comboItem = new ArrayList<ComboItem>();
    }
    this.comboItem.add(comboItemItem);
    return this;
  }

  /**
   * Get comboItem
   * @return comboItem
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<ComboItem> getComboItem() {
    return comboItem;
  }

  public void setComboItem(List<ComboItem> comboItem) {
    this.comboItem = comboItem;
  }

  public OrderAggregator orderLine(List<OrderLine> orderLine) {
    this.orderLine = orderLine;
    return this;
  }

  public OrderAggregator addOrderLineItem(OrderLine orderLineItem) {
    if (this.orderLine == null) {
      this.orderLine = new ArrayList<OrderLine>();
    }
    this.orderLine.add(orderLineItem);
    return this;
  }

  /**
   * Get orderLine
   * @return orderLine
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<OrderLine> getOrderLine() {
    return orderLine;
  }

  public void setOrderLine(List<OrderLine> orderLine) {
    this.orderLine = orderLine;
  }

  public OrderAggregator orderMaster(OrderMaster orderMaster) {
    this.orderMaster = orderMaster;
    return this;
  }

  /**
   * Get orderMaster
   * @return orderMaster
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OrderMaster getOrderMaster() {
    return orderMaster;
  }

  public void setOrderMaster(OrderMaster orderMaster) {
    this.orderMaster = orderMaster;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderAggregator orderAggregator = (OrderAggregator) o;
    return Objects.equals(this.auxitem, orderAggregator.auxitem) &&
        Objects.equals(this.comboItem, orderAggregator.comboItem) &&
        Objects.equals(this.orderLine, orderAggregator.orderLine) &&
        Objects.equals(this.orderMaster, orderAggregator.orderMaster);
  }

  @Override
  public int hashCode() {
    return Objects.hash(auxitem, comboItem, orderLine, orderMaster);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderAggregator {\n");
    
    sb.append("    auxitem: ").append(toIndentedString(auxitem)).append("\n");
    sb.append("    comboItem: ").append(toIndentedString(comboItem)).append("\n");
    sb.append("    orderLine: ").append(toIndentedString(orderLine)).append("\n");
    sb.append("    orderMaster: ").append(toIndentedString(orderMaster)).append("\n");
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

