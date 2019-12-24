package com.diviso.graeshoppe.customerappgateway.client.order.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OrderDTO
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-12-12T14:59:45.796530+05:30[Asia/Kolkata]")

public class OrderDTO   {
  @JsonProperty("allergyNote")
  private String allergyNote = null;

  @JsonProperty("approvalDetailsId")
  private Long approvalDetailsId = null;

  @JsonProperty("customerId")
  private String customerId = null;

  @JsonProperty("date")
  private OffsetDateTime date = null;

  @JsonProperty("deliveryInfoId")
  private Long deliveryInfoId = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("grandTotal")
  private Double grandTotal = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("orderId")
  private String orderId = null;

  @JsonProperty("paymentMode")
  private String paymentMode = null;

  @JsonProperty("paymentRef")
  private String paymentRef = null;

  @JsonProperty("preOrderDate")
  private OffsetDateTime preOrderDate = null;

  @JsonProperty("statusId")
  private Long statusId = null;

  @JsonProperty("storeId")
  private String storeId = null;

  @JsonProperty("subTotal")
  private Double subTotal = null;

  public OrderDTO allergyNote(String allergyNote) {
    this.allergyNote = allergyNote;
    return this;
  }

  /**
   * Get allergyNote
   * @return allergyNote
  **/
  @ApiModelProperty(value = "")


  public String getAllergyNote() {
    return allergyNote;
  }

  public void setAllergyNote(String allergyNote) {
    this.allergyNote = allergyNote;
  }

  public OrderDTO approvalDetailsId(Long approvalDetailsId) {
    this.approvalDetailsId = approvalDetailsId;
    return this;
  }

  /**
   * Get approvalDetailsId
   * @return approvalDetailsId
  **/
  @ApiModelProperty(value = "")


  public Long getApprovalDetailsId() {
    return approvalDetailsId;
  }

  public void setApprovalDetailsId(Long approvalDetailsId) {
    this.approvalDetailsId = approvalDetailsId;
  }

  public OrderDTO customerId(String customerId) {
    this.customerId = customerId;
    return this;
  }

  /**
   * Get customerId
   * @return customerId
  **/
  @ApiModelProperty(value = "")


  public String getCustomerId() {
    return customerId;
  }

  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }

  public OrderDTO date(OffsetDateTime date) {
    this.date = date;
    return this;
  }

  /**
   * Get date
   * @return date
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getDate() {
    return date;
  }

  public void setDate(OffsetDateTime date) {
    this.date = date;
  }

  public OrderDTO deliveryInfoId(Long deliveryInfoId) {
    this.deliveryInfoId = deliveryInfoId;
    return this;
  }

  /**
   * Get deliveryInfoId
   * @return deliveryInfoId
  **/
  @ApiModelProperty(value = "")


  public Long getDeliveryInfoId() {
    return deliveryInfoId;
  }

  public void setDeliveryInfoId(Long deliveryInfoId) {
    this.deliveryInfoId = deliveryInfoId;
  }

  public OrderDTO email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
  **/
  @ApiModelProperty(value = "")


  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public OrderDTO grandTotal(Double grandTotal) {
    this.grandTotal = grandTotal;
    return this;
  }

  /**
   * Get grandTotal
   * @return grandTotal
  **/
  @ApiModelProperty(value = "")


  public Double getGrandTotal() {
    return grandTotal;
  }

  public void setGrandTotal(Double grandTotal) {
    this.grandTotal = grandTotal;
  }

  public OrderDTO id(Long id) {
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

  public OrderDTO orderId(String orderId) {
    this.orderId = orderId;
    return this;
  }

  /**
   * Get orderId
   * @return orderId
  **/
  @ApiModelProperty(value = "")


  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }

  public OrderDTO paymentMode(String paymentMode) {
    this.paymentMode = paymentMode;
    return this;
  }

  /**
   * Get paymentMode
   * @return paymentMode
  **/
  @ApiModelProperty(value = "")


  public String getPaymentMode() {
    return paymentMode;
  }

  public void setPaymentMode(String paymentMode) {
    this.paymentMode = paymentMode;
  }

  public OrderDTO paymentRef(String paymentRef) {
    this.paymentRef = paymentRef;
    return this;
  }

  /**
   * Get paymentRef
   * @return paymentRef
  **/
  @ApiModelProperty(value = "")


  public String getPaymentRef() {
    return paymentRef;
  }

  public void setPaymentRef(String paymentRef) {
    this.paymentRef = paymentRef;
  }

  public OrderDTO preOrderDate(OffsetDateTime preOrderDate) {
    this.preOrderDate = preOrderDate;
    return this;
  }

  /**
   * Get preOrderDate
   * @return preOrderDate
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getPreOrderDate() {
    return preOrderDate;
  }

  public void setPreOrderDate(OffsetDateTime preOrderDate) {
    this.preOrderDate = preOrderDate;
  }

  public OrderDTO statusId(Long statusId) {
    this.statusId = statusId;
    return this;
  }

  /**
   * Get statusId
   * @return statusId
  **/
  @ApiModelProperty(value = "")


  public Long getStatusId() {
    return statusId;
  }

  public void setStatusId(Long statusId) {
    this.statusId = statusId;
  }

  public OrderDTO storeId(String storeId) {
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

  public OrderDTO subTotal(Double subTotal) {
    this.subTotal = subTotal;
    return this;
  }

  /**
   * Get subTotal
   * @return subTotal
  **/
  @ApiModelProperty(value = "")


  public Double getSubTotal() {
    return subTotal;
  }

  public void setSubTotal(Double subTotal) {
    this.subTotal = subTotal;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderDTO orderDTO = (OrderDTO) o;
    return Objects.equals(this.allergyNote, orderDTO.allergyNote) &&
        Objects.equals(this.approvalDetailsId, orderDTO.approvalDetailsId) &&
        Objects.equals(this.customerId, orderDTO.customerId) &&
        Objects.equals(this.date, orderDTO.date) &&
        Objects.equals(this.deliveryInfoId, orderDTO.deliveryInfoId) &&
        Objects.equals(this.email, orderDTO.email) &&
        Objects.equals(this.grandTotal, orderDTO.grandTotal) &&
        Objects.equals(this.id, orderDTO.id) &&
        Objects.equals(this.orderId, orderDTO.orderId) &&
        Objects.equals(this.paymentMode, orderDTO.paymentMode) &&
        Objects.equals(this.paymentRef, orderDTO.paymentRef) &&
        Objects.equals(this.preOrderDate, orderDTO.preOrderDate) &&
        Objects.equals(this.statusId, orderDTO.statusId) &&
        Objects.equals(this.storeId, orderDTO.storeId) &&
        Objects.equals(this.subTotal, orderDTO.subTotal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allergyNote, approvalDetailsId, customerId, date, deliveryInfoId, email, grandTotal, id, orderId, paymentMode, paymentRef, preOrderDate, statusId, storeId, subTotal);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderDTO {\n");
    
    sb.append("    allergyNote: ").append(toIndentedString(allergyNote)).append("\n");
    sb.append("    approvalDetailsId: ").append(toIndentedString(approvalDetailsId)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    deliveryInfoId: ").append(toIndentedString(deliveryInfoId)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    grandTotal: ").append(toIndentedString(grandTotal)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    paymentMode: ").append(toIndentedString(paymentMode)).append("\n");
    sb.append("    paymentRef: ").append(toIndentedString(paymentRef)).append("\n");
    sb.append("    preOrderDate: ").append(toIndentedString(preOrderDate)).append("\n");
    sb.append("    statusId: ").append(toIndentedString(statusId)).append("\n");
    sb.append("    storeId: ").append(toIndentedString(storeId)).append("\n");
    sb.append("    subTotal: ").append(toIndentedString(subTotal)).append("\n");
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

