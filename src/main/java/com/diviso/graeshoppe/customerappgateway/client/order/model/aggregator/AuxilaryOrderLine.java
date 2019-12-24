package com.diviso.graeshoppe.customerappgateway.client.order.model.aggregator;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

/**
 * AuxilaryOrderLine
 */

public class AuxilaryOrderLine   {
  @JsonProperty("id")
  private Long id = null;


  @JsonProperty("pricePerUnit")
  private Double pricePerUnit = null;

  @JsonProperty("productId")
  private Long productId = null;

  @JsonProperty("quantity")
  private Integer quantity = null;

  @JsonProperty("total")
  private Double total = null;

  private String state ="NIL";

  public AuxilaryOrderLine id(Long id) {
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

 

  public AuxilaryOrderLine pricePerUnit(Double pricePerUnit) {
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

  public AuxilaryOrderLine productId(Long productId) {
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

  public AuxilaryOrderLine quantity(Integer quantity) {
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

  public AuxilaryOrderLine total(Double total) {
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
    AuxilaryOrderLine auxilaryOrderLine = (AuxilaryOrderLine) o;
    return Objects.equals(this.id, auxilaryOrderLine.id) &&
        Objects.equals(this.pricePerUnit, auxilaryOrderLine.pricePerUnit) &&
        Objects.equals(this.productId, auxilaryOrderLine.productId) &&
        Objects.equals(this.quantity, auxilaryOrderLine.quantity) &&
        Objects.equals(this.total, auxilaryOrderLine.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, pricePerUnit, productId, quantity, total);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuxilaryOrderLine {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

public String getState() {
	return state;
}

public void setState(String state) {
	this.state = state;
}
}

