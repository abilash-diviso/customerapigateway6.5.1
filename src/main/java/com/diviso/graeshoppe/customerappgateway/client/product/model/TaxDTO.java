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
 * TaxDTO
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-11-29T15:19:12.817+05:30[Asia/Kolkata]")

public class TaxDTO   {
  @JsonProperty("description")
  private String description = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("rate")
  private Double rate = null;

  @JsonProperty("taxCategoryId")
  private Long taxCategoryId = null;

  public TaxDTO description(String description) {
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

  public TaxDTO id(Long id) {
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

  public TaxDTO name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public TaxDTO rate(Double rate) {
    this.rate = rate;
    return this;
  }

  /**
   * Get rate
   * @return rate
  **/
  @ApiModelProperty(value = "")


  public Double getRate() {
    return rate;
  }

  public void setRate(Double rate) {
    this.rate = rate;
  }

  public TaxDTO taxCategoryId(Long taxCategoryId) {
    this.taxCategoryId = taxCategoryId;
    return this;
  }

  /**
   * Get taxCategoryId
   * @return taxCategoryId
  **/
  @ApiModelProperty(value = "")


  public Long getTaxCategoryId() {
    return taxCategoryId;
  }

  public void setTaxCategoryId(Long taxCategoryId) {
    this.taxCategoryId = taxCategoryId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaxDTO taxDTO = (TaxDTO) o;
    return Objects.equals(this.description, taxDTO.description) &&
        Objects.equals(this.id, taxDTO.id) &&
        Objects.equals(this.name, taxDTO.name) &&
        Objects.equals(this.rate, taxDTO.rate) &&
        Objects.equals(this.taxCategoryId, taxDTO.taxCategoryId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, id, name, rate, taxCategoryId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaxDTO {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
    sb.append("    taxCategoryId: ").append(toIndentedString(taxCategoryId)).append("\n");
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

