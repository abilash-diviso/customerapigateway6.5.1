package com.diviso.graeshoppe.customerappgateway.client.product.model;

import java.util.Objects;
import com.diviso.graeshoppe.customerappgateway.client.product.model.Address;
import com.diviso.graeshoppe.customerappgateway.client.product.model.Contact;
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
 * Supplier
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-11-29T15:19:12.817+05:30[Asia/Kolkata]")

public class Supplier   {
  @JsonProperty("address")
  private Address address = null;

  @JsonProperty("companyName")
  private String companyName = null;

  @JsonProperty("contact")
  private Contact contact = null;

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

  public Supplier address(Address address) {
    this.address = address;
    return this;
  }

  /**
   * Get address
   * @return address
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  public Supplier companyName(String companyName) {
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

  public Supplier contact(Contact contact) {
    this.contact = contact;
    return this;
  }

  /**
   * Get contact
   * @return contact
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Contact getContact() {
    return contact;
  }

  public void setContact(Contact contact) {
    this.contact = contact;
  }

  public Supplier creditLimit(Double creditLimit) {
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

  public Supplier currentDebt(Double currentDebt) {
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

  public Supplier debtDate(LocalDate debtDate) {
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

  public Supplier iDPcode(String iDPcode) {
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

  public Supplier id(Long id) {
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

  public Supplier visible(Boolean visible) {
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
    Supplier supplier = (Supplier) o;
    return Objects.equals(this.address, supplier.address) &&
        Objects.equals(this.companyName, supplier.companyName) &&
        Objects.equals(this.contact, supplier.contact) &&
        Objects.equals(this.creditLimit, supplier.creditLimit) &&
        Objects.equals(this.currentDebt, supplier.currentDebt) &&
        Objects.equals(this.debtDate, supplier.debtDate) &&
        Objects.equals(this.iDPcode, supplier.iDPcode) &&
        Objects.equals(this.id, supplier.id) &&
        Objects.equals(this.visible, supplier.visible);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, companyName, contact, creditLimit, currentDebt, debtDate, iDPcode, id, visible);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Supplier {\n");
    
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
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

