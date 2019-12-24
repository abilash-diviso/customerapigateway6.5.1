package com.diviso.graeshoppe.customerappgateway.client.product.model;

import java.util.Objects;
import com.diviso.graeshoppe.customerappgateway.client.product.model.Product;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ComboLineItem
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-11-29T15:19:12.817+05:30[Asia/Kolkata]")

public class ComboLineItem   {
  @JsonProperty("comboItem")
  private Product comboItem = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("product")
  private Product product = null;

  @JsonProperty("quantity")
  private Double quantity = null;

  public ComboLineItem comboItem(Product comboItem) {
    this.comboItem = comboItem;
    return this;
  }

  /**
   * Get comboItem
   * @return comboItem
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Product getComboItem() {
    return comboItem;
  }

  public void setComboItem(Product comboItem) {
    this.comboItem = comboItem;
  }

  public ComboLineItem description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ComboLineItem id(Long id) {
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

  public ComboLineItem product(Product product) {
    this.product = product;
    return this;
  }

  /**
   * Get product
   * @return product
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Product getProduct() {
    return product;
  }

  public void setProduct(Product product) {
    this.product = product;
  }

  public ComboLineItem quantity(Double quantity) {
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
    ComboLineItem comboLineItem = (ComboLineItem) o;
    return Objects.equals(this.comboItem, comboLineItem.comboItem) &&
        Objects.equals(this.description, comboLineItem.description) &&
        Objects.equals(this.id, comboLineItem.id) &&
        Objects.equals(this.product, comboLineItem.product) &&
        Objects.equals(this.quantity, comboLineItem.quantity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comboItem, description, id, product, quantity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComboLineItem {\n");
    
    sb.append("    comboItem: ").append(toIndentedString(comboItem)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
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

