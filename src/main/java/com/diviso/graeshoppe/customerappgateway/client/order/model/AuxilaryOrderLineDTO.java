package com.diviso.graeshoppe.customerappgateway.client.order.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AuxilaryOrderLineDTO
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-12-12T14:59:45.796530+05:30[Asia/Kolkata]")

public class AuxilaryOrderLineDTO   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("orderLineId")
  private Long orderLineId = null;

  @JsonProperty("pricePerUnit")
  private Double pricePerUnit = null;

  @JsonProperty("productId")
  private Long productId = null;

  @JsonProperty("quantity")
  private Integer quantity = null;

  @JsonProperty("total")
  private Double total = null;

  public AuxilaryOrderLineDTO id(Long id) {
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

  public AuxilaryOrderLineDTO orderLineId(Long orderLineId) {
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

  public AuxilaryOrderLineDTO pricePerUnit(Double pricePerUnit) {
    this.pricePerUnit = pricePerUnit;
    return this;
  }

  /**
   * Get pricePerUnit
   * @return pricePerUnit
  **/
  @ApiModelProperty(value = "")


  public Double getPricePerUnit() {
    return pricePerUnit;
  }

  public void setPricePerUnit(Double pricePerUnit) {
    this.pricePerUnit = pricePerUnit;
  }

  public AuxilaryOrderLineDTO productId(Long productId) {
    this.productId = productId;
    return this;
  }

  /**
   * Get productId
   * @return productId
  **/
  @ApiModelProperty(value = "")


  public Long getProductId() {
    return productId;
  }

  public void setProductId(Long productId) {
    this.productId = productId;
  }

  public AuxilaryOrderLineDTO quantity(Integer quantity) {
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

  public AuxilaryOrderLineDTO total(Double total) {
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
    AuxilaryOrderLineDTO auxilaryOrderLineDTO = (AuxilaryOrderLineDTO) o;
    return Objects.equals(this.id, auxilaryOrderLineDTO.id) &&
        Objects.equals(this.orderLineId, auxilaryOrderLineDTO.orderLineId) &&
        Objects.equals(this.pricePerUnit, auxilaryOrderLineDTO.pricePerUnit) &&
        Objects.equals(this.productId, auxilaryOrderLineDTO.productId) &&
        Objects.equals(this.quantity, auxilaryOrderLineDTO.quantity) &&
        Objects.equals(this.total, auxilaryOrderLineDTO.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, orderLineId, pricePerUnit, productId, quantity, total);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuxilaryOrderLineDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    orderLineId: ").append(toIndentedString(orderLineId)).append("\n");
    sb.append("    pricePerUnit: ").append(toIndentedString(pricePerUnit)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
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

