package com.diviso.graeshoppe.customerappgateway.client.product.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.time.LocalDate;
import java.util.Date;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SupplierDTO
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-11-29T15:19:12.817+05:30[Asia/Kolkata]")

public class SupplierDTO   {
  @JsonProperty("addressId")
  private Long addressId = null;

  @JsonProperty("companyName")
  private String companyName = null;

  @JsonProperty("contactId")
  private Long contactId = null;

  @JsonProperty("creditLimit")
  private Double creditLimit = null;

  @JsonProperty("currentDebt")
  private Double currentDebt = null;

  @JsonProperty("debtDate")
  private LocalDate debtDate = null;

  @JsonProperty("iDPcode")
  private String iDPcode = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("visible")
  private Boolean visible = null;

  public SupplierDTO addressId(Long addressId) {
    this.addressId = addressId;
    return this;
  }

  /**
   * Get addressId
   * @return addressId
  **/
  @ApiModelProperty(value = "")


  public Long getAddressId() {
    return addressId;
  }

  public void setAddressId(Long addressId) {
    this.addressId = addressId;
  }

  public SupplierDTO companyName(String companyName) {
    this.companyName = companyName;
    return this;
  }

  /**
   * Get companyName
   * @return companyName
  **/
  @ApiModelProperty(value = "")


  public String getCompanyName() {
    return companyName;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  public SupplierDTO contactId(Long contactId) {
    this.contactId = contactId;
    return this;
  }

  /**
   * Get contactId
   * @return contactId
  **/
  @ApiModelProperty(value = "")


  public Long getContactId() {
    return contactId;
  }

  public void setContactId(Long contactId) {
    this.contactId = contactId;
  }

  public SupplierDTO creditLimit(Double creditLimit) {
    this.creditLimit = creditLimit;
    return this;
  }

  /**
   * Get creditLimit
   * @return creditLimit
  **/
  @ApiModelProperty(value = "")


  public Double getCreditLimit() {
    return creditLimit;
  }

  public void setCreditLimit(Double creditLimit) {
    this.creditLimit = creditLimit;
  }

  public SupplierDTO currentDebt(Double currentDebt) {
    this.currentDebt = currentDebt;
    return this;
  }

  /**
   * Get currentDebt
   * @return currentDebt
  **/
  @ApiModelProperty(value = "")


  public Double getCurrentDebt() {
    return currentDebt;
  }

  public void setCurrentDebt(Double currentDebt) {
    this.currentDebt = currentDebt;
  }

  public SupplierDTO debtDate(LocalDate debtDate) {
    this.debtDate = debtDate;
    return this;
  }

  /**
   * Get debtDate
   * @return debtDate
  **/
  @ApiModelProperty(value = "")

  @Valid

  public LocalDate getDebtDate() {
    return debtDate;
  }

  public void setDebtDate(LocalDate debtDate) {
    this.debtDate = debtDate;
  }

  public SupplierDTO iDPcode(String iDPcode) {
    this.iDPcode = iDPcode;
    return this;
  }

  /**
   * Get iDPcode
   * @return iDPcode
  **/
  @ApiModelProperty(value = "")


  public String getIDPcode() {
    return iDPcode;
  }

  public void setIDPcode(String iDPcode) {
    this.iDPcode = iDPcode;
  }

  public SupplierDTO id(Long id) {
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

  public SupplierDTO visible(Boolean visible) {
    this.visible = visible;
    return this;
  }

  /**
   * Get visible
   * @return visible
  **/
  @ApiModelProperty(value = "")


  public Boolean isVisible() {
    return visible;
  }

  public void setVisible(Boolean visible) {
    this.visible = visible;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SupplierDTO supplierDTO = (SupplierDTO) o;
    return Objects.equals(this.addressId, supplierDTO.addressId) &&
        Objects.equals(this.companyName, supplierDTO.companyName) &&
        Objects.equals(this.contactId, supplierDTO.contactId) &&
        Objects.equals(this.creditLimit, supplierDTO.creditLimit) &&
        Objects.equals(this.currentDebt, supplierDTO.currentDebt) &&
        Objects.equals(this.debtDate, supplierDTO.debtDate) &&
        Objects.equals(this.iDPcode, supplierDTO.iDPcode) &&
        Objects.equals(this.id, supplierDTO.id) &&
        Objects.equals(this.visible, supplierDTO.visible);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressId, companyName, contactId, creditLimit, currentDebt, debtDate, iDPcode, id, visible);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SupplierDTO {\n");
    
    sb.append("    addressId: ").append(toIndentedString(addressId)).append("\n");
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    sb.append("    contactId: ").append(toIndentedString(contactId)).append("\n");
    sb.append("    creditLimit: ").append(toIndentedString(creditLimit)).append("\n");
    sb.append("    currentDebt: ").append(toIndentedString(currentDebt)).append("\n");
    sb.append("    debtDate: ").append(toIndentedString(debtDate)).append("\n");
    sb.append("    iDPcode: ").append(toIndentedString(iDPcode)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    visible: ").append(toIndentedString(visible)).append("\n");
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

