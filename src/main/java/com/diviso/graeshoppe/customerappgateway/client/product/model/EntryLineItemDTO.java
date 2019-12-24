package com.diviso.graeshoppe.customerappgateway.client.product.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * EntryLineItemDTO
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-11-29T15:19:12.817+05:30[Asia/Kolkata]")

public class EntryLineItemDTO   {
  @JsonProperty("description")
  private String description = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("productId")
  private Long productId = null;

  @JsonProperty("quantityAdjustment")
  private Double quantityAdjustment = null;

  @JsonProperty("stockEntryId")
  private Long stockEntryId = null;

  @JsonProperty("valueAdjustment")
  private Double valueAdjustment = null;

  public EntryLineItemDTO description(String description) {
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

  public EntryLineItemDTO id(Long id) {
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

  public EntryLineItemDTO productId(Long productId) {
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

  public EntryLineItemDTO quantityAdjustment(Double quantityAdjustment) {
    this.quantityAdjustment = quantityAdjustment;
    return this;
  }

  /**
   * Get quantityAdjustment
   * @return quantityAdjustment
  **/
  @ApiModelProperty(value = "")


  public Double getQuantityAdjustment() {
    return quantityAdjustment;
  }

  public void setQuantityAdjustment(Double quantityAdjustment) {
    this.quantityAdjustment = quantityAdjustment;
  }

  public EntryLineItemDTO stockEntryId(Long stockEntryId) {
    this.stockEntryId = stockEntryId;
    return this;
  }

  /**
   * Get stockEntryId
   * @return stockEntryId
  **/
  @ApiModelProperty(value = "")


  public Long getStockEntryId() {
    return stockEntryId;
  }

  public void setStockEntryId(Long stockEntryId) {
    this.stockEntryId = stockEntryId;
  }

  public EntryLineItemDTO valueAdjustment(Double valueAdjustment) {
    this.valueAdjustment = valueAdjustment;
    return this;
  }

  /**
   * Get valueAdjustment
   * @return valueAdjustment
  **/
  @ApiModelProperty(value = "")


  public Double getValueAdjustment() {
    return valueAdjustment;
  }

  public void setValueAdjustment(Double valueAdjustment) {
    this.valueAdjustment = valueAdjustment;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EntryLineItemDTO entryLineItemDTO = (EntryLineItemDTO) o;
    return Objects.equals(this.description, entryLineItemDTO.description) &&
        Objects.equals(this.id, entryLineItemDTO.id) &&
        Objects.equals(this.productId, entryLineItemDTO.productId) &&
        Objects.equals(this.quantityAdjustment, entryLineItemDTO.quantityAdjustment) &&
        Objects.equals(this.stockEntryId, entryLineItemDTO.stockEntryId) &&
        Objects.equals(this.valueAdjustment, entryLineItemDTO.valueAdjustment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, id, productId, quantityAdjustment, stockEntryId, valueAdjustment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntryLineItemDTO {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    quantityAdjustment: ").append(toIndentedString(quantityAdjustment)).append("\n");
    sb.append("    stockEntryId: ").append(toIndentedString(stockEntryId)).append("\n");
    sb.append("    valueAdjustment: ").append(toIndentedString(valueAdjustment)).append("\n");
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

