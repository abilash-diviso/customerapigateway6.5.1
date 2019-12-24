package com.diviso.graeshoppe.customerappgateway.client.report.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

/**
 * ComboItemDTO
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-10-15T11:16:15.523+05:30[Asia/Kolkata]")

public class ComboItemDTO   {
  @JsonProperty("comboItem")
  private String comboItem = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("orderLineId")
  private Long orderLineId = null;

  @JsonProperty("quantity")
  private Double quantity = null;

  public ComboItemDTO comboItem(String comboItem) {
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

  public ComboItemDTO id(Long id) {
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

  public ComboItemDTO orderLineId(Long orderLineId) {
    this.orderLineId = orderLineId;
    return this;
  }

  /**
   * Get orderLineId
   * @return orderLineId
  **/
  @ApiModelProperty(value = "")


  public Long getOrderLineId() {
    return orderLineId;
  }

  public void setOrderLineId(Long orderLineId) {
    this.orderLineId = orderLineId;
  }

  public ComboItemDTO quantity(Double quantity) {
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
    ComboItemDTO comboItemDTO = (ComboItemDTO) o;
    return Objects.equals(this.comboItem, comboItemDTO.comboItem) &&
        Objects.equals(this.id, comboItemDTO.id) &&
        Objects.equals(this.orderLineId, comboItemDTO.orderLineId) &&
        Objects.equals(this.quantity, comboItemDTO.quantity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comboItem, id, orderLineId, quantity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComboItemDTO {\n");
    
    sb.append("    comboItem: ").append(toIndentedString(comboItem)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    orderLineId: ").append(toIndentedString(orderLineId)).append("\n");
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

