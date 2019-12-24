package com.diviso.graeshoppe.customerappgateway.client.report.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

/**
 * AuxItemDTO
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-10-15T11:16:15.523+05:30[Asia/Kolkata]")

public class AuxItemDTO   {
  @JsonProperty("auxItem")
  private String auxItem = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("orderLineId")
  private Long orderLineId = null;

  @JsonProperty("quantity")
  private Integer quantity = null;

  @JsonProperty("total")
  private Double total = null;

  public AuxItemDTO auxItem(String auxItem) {
    this.auxItem = auxItem;
    return this;
  }

  /**
   * Get auxItem
   * @return auxItem
  **/
  @ApiModelProperty(value = "")


  public String getAuxItem() {
    return auxItem;
  }

  public void setAuxItem(String auxItem) {
    this.auxItem = auxItem;
  }

  public AuxItemDTO id(Long id) {
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

  public AuxItemDTO orderLineId(Long orderLineId) {
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

  public AuxItemDTO quantity(Integer quantity) {
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

  public AuxItemDTO total(Double total) {
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
    AuxItemDTO auxItemDTO = (AuxItemDTO) o;
    return Objects.equals(this.auxItem, auxItemDTO.auxItem) &&
        Objects.equals(this.id, auxItemDTO.id) &&
        Objects.equals(this.orderLineId, auxItemDTO.orderLineId) &&
        Objects.equals(this.quantity, auxItemDTO.quantity) &&
        Objects.equals(this.total, auxItemDTO.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(auxItem, id, orderLineId, quantity, total);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuxItemDTO {\n");
    
    sb.append("    auxItem: ").append(toIndentedString(auxItem)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    orderLineId: ").append(toIndentedString(orderLineId)).append("\n");
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

