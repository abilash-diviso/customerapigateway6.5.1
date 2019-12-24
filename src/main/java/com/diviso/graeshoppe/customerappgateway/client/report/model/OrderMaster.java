package com.diviso.graeshoppe.customerappgateway.client.report.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * OrderMaster
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-10-15T11:16:15.523+05:30[Asia/Kolkata]")

public class OrderMaster   {
  @JsonProperty("addressType")
  private String addressType = null;

  @JsonProperty("alternatePhone")
  private Long alternatePhone = null;

  @JsonProperty("city")
  private String city = null;

  @JsonProperty("customerId")
  private String customerId = null;

  @JsonProperty("customersOrder")
  private Long customersOrder = null;

  @JsonProperty("deliveryCharge")
  private Double deliveryCharge = null;

  @JsonProperty("dueDate")
  private String dueDate = null;

  @JsonProperty("dueTime")
  private String dueTime = null;

  @JsonProperty("houseNoOrBuildingName")
  private String houseNoOrBuildingName = null;

  @JsonProperty("landmark")
  private String landmark = null;

  @JsonProperty("methodOfOrder")
  private String methodOfOrder = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("notes")
  private String notes = null;

  @JsonProperty("orderAcceptedAt")
  private String orderAcceptedAt = null;

  @JsonProperty("orderFromCustomer")
  private Long orderFromCustomer = null;

  @JsonProperty("orderLines")
  @Valid
  private List<OrderLine> orderLine = null;

  @JsonProperty("orderNumber")
  private String orderNumber = null;

  @JsonProperty("orderPlaceAt")
  private String orderPlaceAt = null;

  @JsonProperty("orderStatus")
  private String orderStatus = null;

  @JsonProperty("phone")
  private Long phone = null;

  @JsonProperty("pincode")
  private Long pincode = null;

  @JsonProperty("roadNameAreaOrStreet")
  private String roadNameAreaOrStreet = null;

  @JsonProperty("serviceCharge")
  private Double serviceCharge = null;

  @JsonProperty("state")
  private String state = null;

  @JsonProperty("storeName")
  private String storeName = null;

  @JsonProperty("storePhone")
  private Long storePhone = null;

  @JsonProperty("totalDue")
  private Double totalDue = null;

  public OrderMaster addressType(String addressType) {
    this.addressType = addressType;
    return this;
  }

  /**
   * Get addressType
   * @return addressType
  **/
  @ApiModelProperty(value = "")


  public String getAddressType() {
    return addressType;
  }

  public void setAddressType(String addressType) {
    this.addressType = addressType;
  }

  public OrderMaster alternatePhone(Long alternatePhone) {
    this.alternatePhone = alternatePhone;
    return this;
  }

  /**
   * Get alternatePhone
   * @return alternatePhone
  **/
  @ApiModelProperty(value = "")


  public Long getAlternatePhone() {
    return alternatePhone;
  }

  public void setAlternatePhone(Long alternatePhone) {
    this.alternatePhone = alternatePhone;
  }

  public OrderMaster city(String city) {
    this.city = city;
    return this;
  }

  /**
   * Get city
   * @return city
  **/
  @ApiModelProperty(value = "")


  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public OrderMaster customerId(String customerId) {
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

  public OrderMaster customersOrder(Long customersOrder) {
    this.customersOrder = customersOrder;
    return this;
  }

  /**
   * Get customersOrder
   * @return customersOrder
  **/
  @ApiModelProperty(value = "")


  public Long getCustomersOrder() {
    return customersOrder;
  }

  public void setCustomersOrder(Long customersOrder) {
    this.customersOrder = customersOrder;
  }

  public OrderMaster deliveryCharge(Double deliveryCharge) {
    this.deliveryCharge = deliveryCharge;
    return this;
  }

  /**
   * Get deliveryCharge
   * @return deliveryCharge
  **/
  @ApiModelProperty(value = "")


  public Double getDeliveryCharge() {
    return deliveryCharge;
  }

  public void setDeliveryCharge(Double deliveryCharge) {
    this.deliveryCharge = deliveryCharge;
  }

  public OrderMaster dueDate(String dueDate) {
    this.dueDate = dueDate;
    return this;
  }

  /**
   * Get dueDate
   * @return dueDate
  **/
  @ApiModelProperty(value = "")


  public String getDueDate() {
    return dueDate;
  }

  public void setDueDate(String dueDate) {
    this.dueDate = dueDate;
  }

  public OrderMaster dueTime(String dueTime) {
    this.dueTime = dueTime;
    return this;
  }

  /**
   * Get dueTime
   * @return dueTime
  **/
  @ApiModelProperty(value = "")


  public String getDueTime() {
    return dueTime;
  }

  public void setDueTime(String dueTime) {
    this.dueTime = dueTime;
  }

  public OrderMaster houseNoOrBuildingName(String houseNoOrBuildingName) {
    this.houseNoOrBuildingName = houseNoOrBuildingName;
    return this;
  }

  /**
   * Get houseNoOrBuildingName
   * @return houseNoOrBuildingName
  **/
  @ApiModelProperty(value = "")


  public String getHouseNoOrBuildingName() {
    return houseNoOrBuildingName;
  }

  public void setHouseNoOrBuildingName(String houseNoOrBuildingName) {
    this.houseNoOrBuildingName = houseNoOrBuildingName;
  }

  public OrderMaster landmark(String landmark) {
    this.landmark = landmark;
    return this;
  }

  /**
   * Get landmark
   * @return landmark
  **/
  @ApiModelProperty(value = "")


  public String getLandmark() {
    return landmark;
  }

  public void setLandmark(String landmark) {
    this.landmark = landmark;
  }

  public OrderMaster methodOfOrder(String methodOfOrder) {
    this.methodOfOrder = methodOfOrder;
    return this;
  }

  /**
   * Get methodOfOrder
   * @return methodOfOrder
  **/
  @ApiModelProperty(value = "")


  public String getMethodOfOrder() {
    return methodOfOrder;
  }

  public void setMethodOfOrder(String methodOfOrder) {
    this.methodOfOrder = methodOfOrder;
  }

  public OrderMaster name(String name) {
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

  public OrderMaster notes(String notes) {
    this.notes = notes;
    return this;
  }

  /**
   * Get notes
   * @return notes
  **/
  @ApiModelProperty(value = "")


  public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }

  public OrderMaster orderAcceptedAt(String orderAcceptedAt) {
    this.orderAcceptedAt = orderAcceptedAt;
    return this;
  }

  /**
   * Get orderAcceptedAt
   * @return orderAcceptedAt
  **/
  @ApiModelProperty(value = "")


  public String getOrderAcceptedAt() {
    return orderAcceptedAt;
  }

  public void setOrderAcceptedAt(String orderAcceptedAt) {
    this.orderAcceptedAt = orderAcceptedAt;
  }

  public OrderMaster orderFromCustomer(Long orderFromCustomer) {
    this.orderFromCustomer = orderFromCustomer;
    return this;
  }

  /**
   * Get orderFromCustomer
   * @return orderFromCustomer
  **/
  @ApiModelProperty(value = "")


  public Long getOrderFromCustomer() {
    return orderFromCustomer;
  }

  public void setOrderFromCustomer(Long orderFromCustomer) {
    this.orderFromCustomer = orderFromCustomer;
  }

  public OrderMaster orderLine(List<OrderLine> orderLine) {
    this.orderLine = orderLine;
    return this;
  }

  public OrderMaster addOrderLineItem(OrderLine orderLineItem) {
    if (this.orderLine == null) {
      this.orderLine = new ArrayList<OrderLine>();
    }
    this.orderLine.add(orderLineItem);
    return this;
  }

  /**
   * Get orderLine
   * @return orderLine
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<OrderLine> getOrderLine() {
    return orderLine;
  }

  public void setOrderLine(List<OrderLine> orderLine) {
    this.orderLine = orderLine;
  }

  public OrderMaster orderNumber(String orderNumber) {
    this.orderNumber = orderNumber;
    return this;
  }

  /**
   * Get orderNumber
   * @return orderNumber
  **/
  @ApiModelProperty(value = "")


  public String getOrderNumber() {
    return orderNumber;
  }

  public void setOrderNumber(String orderNumber) {
    this.orderNumber = orderNumber;
  }

  public OrderMaster orderPlaceAt(String orderPlaceAt) {
    this.orderPlaceAt = orderPlaceAt;
    return this;
  }

  /**
   * Get orderPlaceAt
   * @return orderPlaceAt
  **/
  @ApiModelProperty(value = "")


  public String getOrderPlaceAt() {
    return orderPlaceAt;
  }

  public void setOrderPlaceAt(String orderPlaceAt) {
    this.orderPlaceAt = orderPlaceAt;
  }

  public OrderMaster orderStatus(String orderStatus) {
    this.orderStatus = orderStatus;
    return this;
  }

  /**
   * Get orderStatus
   * @return orderStatus
  **/
  @ApiModelProperty(value = "")


  public String getOrderStatus() {
    return orderStatus;
  }

  public void setOrderStatus(String orderStatus) {
    this.orderStatus = orderStatus;
  }

  public OrderMaster phone(Long phone) {
    this.phone = phone;
    return this;
  }

  /**
   * Get phone
   * @return phone
  **/
  @ApiModelProperty(value = "")


  public Long getPhone() {
    return phone;
  }

  public void setPhone(Long phone) {
    this.phone = phone;
  }

  public OrderMaster pincode(Long pincode) {
    this.pincode = pincode;
    return this;
  }

  /**
   * Get pincode
   * @return pincode
  **/
  @ApiModelProperty(value = "")


  public Long getPincode() {
    return pincode;
  }

  public void setPincode(Long pincode) {
    this.pincode = pincode;
  }

  public OrderMaster roadNameAreaOrStreet(String roadNameAreaOrStreet) {
    this.roadNameAreaOrStreet = roadNameAreaOrStreet;
    return this;
  }

  /**
   * Get roadNameAreaOrStreet
   * @return roadNameAreaOrStreet
  **/
  @ApiModelProperty(value = "")


  public String getRoadNameAreaOrStreet() {
    return roadNameAreaOrStreet;
  }

  public void setRoadNameAreaOrStreet(String roadNameAreaOrStreet) {
    this.roadNameAreaOrStreet = roadNameAreaOrStreet;
  }

  public OrderMaster serviceCharge(Double serviceCharge) {
    this.serviceCharge = serviceCharge;
    return this;
  }

  /**
   * Get serviceCharge
   * @return serviceCharge
  **/
  @ApiModelProperty(value = "")


  public Double getServiceCharge() {
    return serviceCharge;
  }

  public void setServiceCharge(Double serviceCharge) {
    this.serviceCharge = serviceCharge;
  }

  public OrderMaster state(String state) {
    this.state = state;
    return this;
  }

  /**
   * Get state
   * @return state
  **/
  @ApiModelProperty(value = "")


  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public OrderMaster storeName(String storeName) {
    this.storeName = storeName;
    return this;
  }

  /**
   * Get storeName
   * @return storeName
  **/
  @ApiModelProperty(value = "")


  public String getStoreName() {
    return storeName;
  }

  public void setStoreName(String storeName) {
    this.storeName = storeName;
  }

  public OrderMaster storePhone(Long storePhone) {
    this.storePhone = storePhone;
    return this;
  }

  /**
   * Get storePhone
   * @return storePhone
  **/
  @ApiModelProperty(value = "")


  public Long getStorePhone() {
    return storePhone;
  }

  public void setStorePhone(Long storePhone) {
    this.storePhone = storePhone;
  }

  public OrderMaster totalDue(Double totalDue) {
    this.totalDue = totalDue;
    return this;
  }

  /**
   * Get totalDue
   * @return totalDue
  **/
  @ApiModelProperty(value = "")


  public Double getTotalDue() {
    return totalDue;
  }

  public void setTotalDue(Double totalDue) {
    this.totalDue = totalDue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderMaster orderMaster = (OrderMaster) o;
    return Objects.equals(this.addressType, orderMaster.addressType) &&
        Objects.equals(this.alternatePhone, orderMaster.alternatePhone) &&
        Objects.equals(this.city, orderMaster.city) &&
        Objects.equals(this.customerId, orderMaster.customerId) &&
        Objects.equals(this.customersOrder, orderMaster.customersOrder) &&
        Objects.equals(this.deliveryCharge, orderMaster.deliveryCharge) &&
        Objects.equals(this.dueDate, orderMaster.dueDate) &&
        Objects.equals(this.dueTime, orderMaster.dueTime) &&
        Objects.equals(this.houseNoOrBuildingName, orderMaster.houseNoOrBuildingName) &&
        Objects.equals(this.landmark, orderMaster.landmark) &&
        Objects.equals(this.methodOfOrder, orderMaster.methodOfOrder) &&
        Objects.equals(this.name, orderMaster.name) &&
        Objects.equals(this.notes, orderMaster.notes) &&
        Objects.equals(this.orderAcceptedAt, orderMaster.orderAcceptedAt) &&
        Objects.equals(this.orderFromCustomer, orderMaster.orderFromCustomer) &&
        Objects.equals(this.orderLine, orderMaster.orderLine) &&
        Objects.equals(this.orderNumber, orderMaster.orderNumber) &&
        Objects.equals(this.orderPlaceAt, orderMaster.orderPlaceAt) &&
        Objects.equals(this.orderStatus, orderMaster.orderStatus) &&
        Objects.equals(this.phone, orderMaster.phone) &&
        Objects.equals(this.pincode, orderMaster.pincode) &&
        Objects.equals(this.roadNameAreaOrStreet, orderMaster.roadNameAreaOrStreet) &&
        Objects.equals(this.serviceCharge, orderMaster.serviceCharge) &&
        Objects.equals(this.state, orderMaster.state) &&
        Objects.equals(this.storeName, orderMaster.storeName) &&
        Objects.equals(this.storePhone, orderMaster.storePhone) &&
        Objects.equals(this.totalDue, orderMaster.totalDue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressType, alternatePhone, city, customerId, customersOrder, deliveryCharge, dueDate, dueTime, houseNoOrBuildingName, landmark, methodOfOrder, name, notes, orderAcceptedAt, orderFromCustomer, orderLine, orderNumber, orderPlaceAt, orderStatus, phone, pincode, roadNameAreaOrStreet, serviceCharge, state, storeName, storePhone, totalDue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderMaster {\n");
    
    sb.append("    addressType: ").append(toIndentedString(addressType)).append("\n");
    sb.append("    alternatePhone: ").append(toIndentedString(alternatePhone)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    customersOrder: ").append(toIndentedString(customersOrder)).append("\n");
    sb.append("    deliveryCharge: ").append(toIndentedString(deliveryCharge)).append("\n");
    sb.append("    dueDate: ").append(toIndentedString(dueDate)).append("\n");
    sb.append("    dueTime: ").append(toIndentedString(dueTime)).append("\n");
    sb.append("    houseNoOrBuildingName: ").append(toIndentedString(houseNoOrBuildingName)).append("\n");
    sb.append("    landmark: ").append(toIndentedString(landmark)).append("\n");
    sb.append("    methodOfOrder: ").append(toIndentedString(methodOfOrder)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    orderAcceptedAt: ").append(toIndentedString(orderAcceptedAt)).append("\n");
    sb.append("    orderFromCustomer: ").append(toIndentedString(orderFromCustomer)).append("\n");
    sb.append("    orderLine: ").append(toIndentedString(orderLine)).append("\n");
    sb.append("    orderNumber: ").append(toIndentedString(orderNumber)).append("\n");
    sb.append("    orderPlaceAt: ").append(toIndentedString(orderPlaceAt)).append("\n");
    sb.append("    orderStatus: ").append(toIndentedString(orderStatus)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    pincode: ").append(toIndentedString(pincode)).append("\n");
    sb.append("    roadNameAreaOrStreet: ").append(toIndentedString(roadNameAreaOrStreet)).append("\n");
    sb.append("    serviceCharge: ").append(toIndentedString(serviceCharge)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    storeName: ").append(toIndentedString(storeName)).append("\n");
    sb.append("    storePhone: ").append(toIndentedString(storePhone)).append("\n");
    sb.append("    totalDue: ").append(toIndentedString(totalDue)).append("\n");
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

