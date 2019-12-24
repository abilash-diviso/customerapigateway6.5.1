package com.diviso.graeshoppe.customerappgateway.client.offer.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * OfferDTO
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-08-15T16:47:08.654128+05:30[Asia/Kolkata]")

public class OfferDTO   {
  @JsonProperty("createdDate")
  private OffsetDateTime createdDate = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("orderRuleId")
  private Long orderRuleId = null;

  @JsonProperty("paymentRuleId")
  private Long paymentRuleId = null;

  @JsonProperty("priceRuleId")
  private Long priceRuleId = null;

  @JsonProperty("promoCode")
  private String promoCode = null;

  @JsonProperty("title")
  private String title = null;

  @JsonProperty("updatedDate")
  private OffsetDateTime updatedDate = null;

  @JsonProperty("usageCount")
  private Long usageCount = null;

  public OfferDTO createdDate(OffsetDateTime createdDate) {
    this.createdDate = createdDate;
    return this;
  }

  /**
   * Get createdDate
   * @return createdDate
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(OffsetDateTime createdDate) {
    this.createdDate = createdDate;
  }

  public OfferDTO description(String description) {
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

  public OfferDTO id(Long id) {
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

  public OfferDTO orderRuleId(Long orderRuleId) {
    this.orderRuleId = orderRuleId;
    return this;
  }

  /**
   * Get orderRuleId
   * @return orderRuleId
  **/
  @ApiModelProperty(value = "")


  public Long getOrderRuleId() {
    return orderRuleId;
  }

  public void setOrderRuleId(Long orderRuleId) {
    this.orderRuleId = orderRuleId;
  }

  public OfferDTO paymentRuleId(Long paymentRuleId) {
    this.paymentRuleId = paymentRuleId;
    return this;
  }

  /**
   * Get paymentRuleId
   * @return paymentRuleId
  **/
  @ApiModelProperty(value = "")


  public Long getPaymentRuleId() {
    return paymentRuleId;
  }

  public void setPaymentRuleId(Long paymentRuleId) {
    this.paymentRuleId = paymentRuleId;
  }

  public OfferDTO priceRuleId(Long priceRuleId) {
    this.priceRuleId = priceRuleId;
    return this;
  }

  /**
   * Get priceRuleId
   * @return priceRuleId
  **/
  @ApiModelProperty(value = "")


  public Long getPriceRuleId() {
    return priceRuleId;
  }

  public void setPriceRuleId(Long priceRuleId) {
    this.priceRuleId = priceRuleId;
  }

  public OfferDTO promoCode(String promoCode) {
    this.promoCode = promoCode;
    return this;
  }

  /**
   * Get promoCode
   * @return promoCode
  **/
  @ApiModelProperty(value = "")


  public String getPromoCode() {
    return promoCode;
  }

  public void setPromoCode(String promoCode) {
    this.promoCode = promoCode;
  }

  public OfferDTO title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
  **/
  @ApiModelProperty(value = "")


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public OfferDTO updatedDate(OffsetDateTime updatedDate) {
    this.updatedDate = updatedDate;
    return this;
  }

  /**
   * Get updatedDate
   * @return updatedDate
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getUpdatedDate() {
    return updatedDate;
  }

  public void setUpdatedDate(OffsetDateTime updatedDate) {
    this.updatedDate = updatedDate;
  }

  public OfferDTO usageCount(Long usageCount) {
    this.usageCount = usageCount;
    return this;
  }

  /**
   * Get usageCount
   * @return usageCount
  **/
  @ApiModelProperty(value = "")


  public Long getUsageCount() {
    return usageCount;
  }

  public void setUsageCount(Long usageCount) {
    this.usageCount = usageCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OfferDTO offerDTO = (OfferDTO) o;
    return Objects.equals(this.createdDate, offerDTO.createdDate) &&
        Objects.equals(this.description, offerDTO.description) &&
        Objects.equals(this.id, offerDTO.id) &&
        Objects.equals(this.orderRuleId, offerDTO.orderRuleId) &&
        Objects.equals(this.paymentRuleId, offerDTO.paymentRuleId) &&
        Objects.equals(this.priceRuleId, offerDTO.priceRuleId) &&
        Objects.equals(this.promoCode, offerDTO.promoCode) &&
        Objects.equals(this.title, offerDTO.title) &&
        Objects.equals(this.updatedDate, offerDTO.updatedDate) &&
        Objects.equals(this.usageCount, offerDTO.usageCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdDate, description, id, orderRuleId, paymentRuleId, priceRuleId, promoCode, title, updatedDate, usageCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfferDTO {\n");
    
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    orderRuleId: ").append(toIndentedString(orderRuleId)).append("\n");
    sb.append("    paymentRuleId: ").append(toIndentedString(paymentRuleId)).append("\n");
    sb.append("    priceRuleId: ").append(toIndentedString(priceRuleId)).append("\n");
    sb.append("    promoCode: ").append(toIndentedString(promoCode)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    updatedDate: ").append(toIndentedString(updatedDate)).append("\n");
    sb.append("    usageCount: ").append(toIndentedString(usageCount)).append("\n");
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

