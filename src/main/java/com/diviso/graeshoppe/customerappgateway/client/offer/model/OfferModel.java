package com.diviso.graeshoppe.customerappgateway.client.offer.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * OfferModel
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-08-15T16:47:08.654128+05:30[Asia/Kolkata]")

public class OfferModel   {
  @JsonProperty("deductionValue")
  private Long deductionValue = null;

  @JsonProperty("deduction_value_type_id")
  private Long deductionValueTypeId = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("endDate")
  private OffsetDateTime endDate = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("prerequisiteOrderNumber")
  private Long prerequisiteOrderNumber = null;

  @JsonProperty("promoCode")
  private String promoCode = null;

  @JsonProperty("startDate")
  private OffsetDateTime startDate = null;

  @JsonProperty("storeId")
  private Long storeId = null;

  public OfferModel deductionValue(Long deductionValue) {
    this.deductionValue = deductionValue;
    return this;
  }

  /**
   * Get deductionValue
   * @return deductionValue
  **/
  @ApiModelProperty(value = "")


  public Long getDeductionValue() {
    return deductionValue;
  }

  public void setDeductionValue(Long deductionValue) {
    this.deductionValue = deductionValue;
  }

  public OfferModel deductionValueTypeId(Long deductionValueTypeId) {
    this.deductionValueTypeId = deductionValueTypeId;
    return this;
  }

  /**
   * Get deductionValueTypeId
   * @return deductionValueTypeId
  **/
  @ApiModelProperty(value = "")


  public Long getDeductionValueTypeId() {
    return deductionValueTypeId;
  }

  public void setDeductionValueTypeId(Long deductionValueTypeId) {
    this.deductionValueTypeId = deductionValueTypeId;
  }

  public OfferModel description(String description) {
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

  public OfferModel endDate(OffsetDateTime endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * Get endDate
   * @return endDate
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getEndDate() {
    return endDate;
  }

  public void setEndDate(OffsetDateTime endDate) {
    this.endDate = endDate;
  }

  public OfferModel id(Long id) {
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

  public OfferModel prerequisiteOrderNumber(Long prerequisiteOrderNumber) {
    this.prerequisiteOrderNumber = prerequisiteOrderNumber;
    return this;
  }

  /**
   * Get prerequisiteOrderNumber
   * @return prerequisiteOrderNumber
  **/
  @ApiModelProperty(value = "")


  public Long getPrerequisiteOrderNumber() {
    return prerequisiteOrderNumber;
  }

  public void setPrerequisiteOrderNumber(Long prerequisiteOrderNumber) {
    this.prerequisiteOrderNumber = prerequisiteOrderNumber;
  }

  public OfferModel promoCode(String promoCode) {
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

  public OfferModel startDate(OffsetDateTime startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Get startDate
   * @return startDate
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getStartDate() {
    return startDate;
  }

  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }

  public OfferModel storeId(Long storeId) {
    this.storeId = storeId;
    return this;
  }

  /**
   * Get storeId
   * @return storeId
  **/
  @ApiModelProperty(value = "")


  public Long getStoreId() {
    return storeId;
  }

  public void setStoreId(Long storeId) {
    this.storeId = storeId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OfferModel offerModel = (OfferModel) o;
    return Objects.equals(this.deductionValue, offerModel.deductionValue) &&
        Objects.equals(this.deductionValueTypeId, offerModel.deductionValueTypeId) &&
        Objects.equals(this.description, offerModel.description) &&
        Objects.equals(this.endDate, offerModel.endDate) &&
        Objects.equals(this.id, offerModel.id) &&
        Objects.equals(this.prerequisiteOrderNumber, offerModel.prerequisiteOrderNumber) &&
        Objects.equals(this.promoCode, offerModel.promoCode) &&
        Objects.equals(this.startDate, offerModel.startDate) &&
        Objects.equals(this.storeId, offerModel.storeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deductionValue, deductionValueTypeId, description, endDate, id, prerequisiteOrderNumber, promoCode, startDate, storeId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfferModel {\n");
    
    sb.append("    deductionValue: ").append(toIndentedString(deductionValue)).append("\n");
    sb.append("    deductionValueTypeId: ").append(toIndentedString(deductionValueTypeId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    prerequisiteOrderNumber: ").append(toIndentedString(prerequisiteOrderNumber)).append("\n");
    sb.append("    promoCode: ").append(toIndentedString(promoCode)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    storeId: ").append(toIndentedString(storeId)).append("\n");
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

