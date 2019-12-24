package com.diviso.graeshoppe.customerappgateway.client.report.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.time.LocalDate;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * ReportSummary
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-10-15T11:16:15.523+05:30[Asia/Kolkata]")

public class ReportSummary   {
  @JsonProperty("localDate")
  private LocalDate localDate = null;

  @JsonProperty("storeId")
  private String storeId = null;

  @JsonProperty("typeAllCount")
  private Long typeAllCount = null;

  @JsonProperty("typeAllTotal")
  private Double typeAllTotal = null;

  @JsonProperty("typeCardCount")
  private Integer typeCardCount = null;

  @JsonProperty("typeCardTotal")
  private Double typeCardTotal = null;

  @JsonProperty("typeCashCount")
  private Integer typeCashCount = null;

  @JsonProperty("typeCashTotal")
  private Double typeCashTotal = null;

  @JsonProperty("typeCollectionCount")
  private Integer typeCollectionCount = null;

  @JsonProperty("typeCollectionTotal")
  private Double typeCollectionTotal = null;

  @JsonProperty("typeDeliveryCount")
  private Integer typeDeliveryCount = null;

  @JsonProperty("typeDeliveryTotal")
  private Double typeDeliveryTotal = null;

  public ReportSummary localDate(LocalDate localDate) {
    this.localDate = localDate;
    return this;
  }

  /**
   * Get localDate
   * @return localDate
  **/
  @ApiModelProperty(value = "")

  @Valid

  public LocalDate getLocalDate() {
    return localDate;
  }

  public void setLocalDate(LocalDate localDate) {
    this.localDate = localDate;
  }

  public ReportSummary storeId(String storeId) {
    this.storeId = storeId;
    return this;
  }

  /**
   * Get storeId
   * @return storeId
  **/
  @ApiModelProperty(value = "")


  public String getStoreId() {
    return storeId;
  }

  public void setStoreId(String storeId) {
    this.storeId = storeId;
  }

  public ReportSummary typeAllCount(Long typeAllCount) {
    this.typeAllCount = typeAllCount;
    return this;
  }

  /**
   * Get typeAllCount
   * @return typeAllCount
  **/
  @ApiModelProperty(value = "")


  public Long getTypeAllCount() {
    return typeAllCount;
  }

  public void setTypeAllCount(Long typeAllCount) {
    this.typeAllCount = typeAllCount;
  }

  public ReportSummary typeAllTotal(Double typeAllTotal) {
    this.typeAllTotal = typeAllTotal;
    return this;
  }

  /**
   * Get typeAllTotal
   * @return typeAllTotal
  **/
  @ApiModelProperty(value = "")


  public Double getTypeAllTotal() {
    return typeAllTotal;
  }

  public void setTypeAllTotal(Double typeAllTotal) {
    this.typeAllTotal = typeAllTotal;
  }

  public ReportSummary typeCardCount(Integer typeCardCount) {
    this.typeCardCount = typeCardCount;
    return this;
  }

  /**
   * Get typeCardCount
   * @return typeCardCount
  **/
  @ApiModelProperty(value = "")


  public Integer getTypeCardCount() {
    return typeCardCount;
  }

  public void setTypeCardCount(Integer typeCardCount) {
    this.typeCardCount = typeCardCount;
  }

  public ReportSummary typeCardTotal(Double typeCardTotal) {
    this.typeCardTotal = typeCardTotal;
    return this;
  }

  /**
   * Get typeCardTotal
   * @return typeCardTotal
  **/
  @ApiModelProperty(value = "")


  public Double getTypeCardTotal() {
    return typeCardTotal;
  }

  public void setTypeCardTotal(Double typeCardTotal) {
    this.typeCardTotal = typeCardTotal;
  }

  public ReportSummary typeCashCount(Integer typeCashCount) {
    this.typeCashCount = typeCashCount;
    return this;
  }

  /**
   * Get typeCashCount
   * @return typeCashCount
  **/
  @ApiModelProperty(value = "")


  public Integer getTypeCashCount() {
    return typeCashCount;
  }

  public void setTypeCashCount(Integer typeCashCount) {
    this.typeCashCount = typeCashCount;
  }

  public ReportSummary typeCashTotal(Double typeCashTotal) {
    this.typeCashTotal = typeCashTotal;
    return this;
  }

  /**
   * Get typeCashTotal
   * @return typeCashTotal
  **/
  @ApiModelProperty(value = "")


  public Double getTypeCashTotal() {
    return typeCashTotal;
  }

  public void setTypeCashTotal(Double typeCashTotal) {
    this.typeCashTotal = typeCashTotal;
  }

  public ReportSummary typeCollectionCount(Integer typeCollectionCount) {
    this.typeCollectionCount = typeCollectionCount;
    return this;
  }

  /**
   * Get typeCollectionCount
   * @return typeCollectionCount
  **/
  @ApiModelProperty(value = "")


  public Integer getTypeCollectionCount() {
    return typeCollectionCount;
  }

  public void setTypeCollectionCount(Integer typeCollectionCount) {
    this.typeCollectionCount = typeCollectionCount;
  }

  public ReportSummary typeCollectionTotal(Double typeCollectionTotal) {
    this.typeCollectionTotal = typeCollectionTotal;
    return this;
  }

  /**
   * Get typeCollectionTotal
   * @return typeCollectionTotal
  **/
  @ApiModelProperty(value = "")


  public Double getTypeCollectionTotal() {
    return typeCollectionTotal;
  }

  public void setTypeCollectionTotal(Double typeCollectionTotal) {
    this.typeCollectionTotal = typeCollectionTotal;
  }

  public ReportSummary typeDeliveryCount(Integer typeDeliveryCount) {
    this.typeDeliveryCount = typeDeliveryCount;
    return this;
  }

  /**
   * Get typeDeliveryCount
   * @return typeDeliveryCount
  **/
  @ApiModelProperty(value = "")


  public Integer getTypeDeliveryCount() {
    return typeDeliveryCount;
  }

  public void setTypeDeliveryCount(Integer typeDeliveryCount) {
    this.typeDeliveryCount = typeDeliveryCount;
  }

  public ReportSummary typeDeliveryTotal(Double typeDeliveryTotal) {
    this.typeDeliveryTotal = typeDeliveryTotal;
    return this;
  }

  /**
   * Get typeDeliveryTotal
   * @return typeDeliveryTotal
  **/
  @ApiModelProperty(value = "")


  public Double getTypeDeliveryTotal() {
    return typeDeliveryTotal;
  }

  public void setTypeDeliveryTotal(Double typeDeliveryTotal) {
    this.typeDeliveryTotal = typeDeliveryTotal;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportSummary reportSummary = (ReportSummary) o;
    return Objects.equals(this.localDate, reportSummary.localDate) &&
        Objects.equals(this.storeId, reportSummary.storeId) &&
        Objects.equals(this.typeAllCount, reportSummary.typeAllCount) &&
        Objects.equals(this.typeAllTotal, reportSummary.typeAllTotal) &&
        Objects.equals(this.typeCardCount, reportSummary.typeCardCount) &&
        Objects.equals(this.typeCardTotal, reportSummary.typeCardTotal) &&
        Objects.equals(this.typeCashCount, reportSummary.typeCashCount) &&
        Objects.equals(this.typeCashTotal, reportSummary.typeCashTotal) &&
        Objects.equals(this.typeCollectionCount, reportSummary.typeCollectionCount) &&
        Objects.equals(this.typeCollectionTotal, reportSummary.typeCollectionTotal) &&
        Objects.equals(this.typeDeliveryCount, reportSummary.typeDeliveryCount) &&
        Objects.equals(this.typeDeliveryTotal, reportSummary.typeDeliveryTotal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(localDate, storeId, typeAllCount, typeAllTotal, typeCardCount, typeCardTotal, typeCashCount, typeCashTotal, typeCollectionCount, typeCollectionTotal, typeDeliveryCount, typeDeliveryTotal);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportSummary {\n");
    
    sb.append("    localDate: ").append(toIndentedString(localDate)).append("\n");
    sb.append("    storeId: ").append(toIndentedString(storeId)).append("\n");
    sb.append("    typeAllCount: ").append(toIndentedString(typeAllCount)).append("\n");
    sb.append("    typeAllTotal: ").append(toIndentedString(typeAllTotal)).append("\n");
    sb.append("    typeCardCount: ").append(toIndentedString(typeCardCount)).append("\n");
    sb.append("    typeCardTotal: ").append(toIndentedString(typeCardTotal)).append("\n");
    sb.append("    typeCashCount: ").append(toIndentedString(typeCashCount)).append("\n");
    sb.append("    typeCashTotal: ").append(toIndentedString(typeCashTotal)).append("\n");
    sb.append("    typeCollectionCount: ").append(toIndentedString(typeCollectionCount)).append("\n");
    sb.append("    typeCollectionTotal: ").append(toIndentedString(typeCollectionTotal)).append("\n");
    sb.append("    typeDeliveryCount: ").append(toIndentedString(typeDeliveryCount)).append("\n");
    sb.append("    typeDeliveryTotal: ").append(toIndentedString(typeDeliveryTotal)).append("\n");
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

