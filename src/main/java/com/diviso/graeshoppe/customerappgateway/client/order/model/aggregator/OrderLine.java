package com.diviso.graeshoppe.customerappgateway.client.order.model.aggregator;

import java.util.Objects;
import com.diviso.graeshoppe.customerappgateway.client.order.model.aggregator.AuxilaryOrderLine;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

/**
 * OrderLine
 */

public class OrderLine   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("pricePerUnit")
  private Double pricePerUnit = null;

  @JsonProperty("productId")
  private Long productId = null;

  @JsonProperty("quantity")
  private Integer quantity = null;

  private String state ="NIL";

  @JsonProperty("requiedAuxilaries")
  @Valid
  private List<AuxilaryOrderLine> requiedAuxilaries = new ArrayList<>();

  @JsonProperty("total")
  private Double total = null;

  public OrderLine id(Long id) {
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



  /**
   * Get order
   * @return order
  **/


  public OrderLine pricePerUnit(Double pricePerUnit) {
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

  public OrderLine productId(Long productId) {
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

  public OrderLine requiedAuxilaries(List<AuxilaryOrderLine> requiedAuxilaries) {
    this.requiedAuxilaries = requiedAuxilaries;
    return this;
  }

  public OrderLine addRequiedAuxilariesItem(AuxilaryOrderLine requiedAuxilariesItem) {
    if (this.requiedAuxilaries == null) {
      this.requiedAuxilaries = new ArrayList<AuxilaryOrderLine>();
    }
    this.requiedAuxilaries.add(requiedAuxilariesItem);
    return this;
  }

  /**
   * Get requiedAuxilaries
   * @return requiedAuxilaries
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<AuxilaryOrderLine> getRequiedAuxilaries() {
    return requiedAuxilaries;
  }

  public void setRequiedAuxilaries(List<AuxilaryOrderLine> requiedAuxilaries) {
    this.requiedAuxilaries = requiedAuxilaries;
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
    return 
        Objects.equals(this.pricePerUnit, orderLine.pricePerUnit) &&
        Objects.equals(this.productId, orderLine.productId) &&
        Objects.equals(this.quantity, orderLine.quantity) &&
        Objects.equals(this.requiedAuxilaries, orderLine.requiedAuxilaries) &&
        Objects.equals(this.total, orderLine.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, pricePerUnit, productId, quantity, requiedAuxilaries, total);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderLine {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    pricePerUnit: ").append(toIndentedString(pricePerUnit)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    requiedAuxilaries: ").append(toIndentedString(requiedAuxilaries)).append("\n");
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

