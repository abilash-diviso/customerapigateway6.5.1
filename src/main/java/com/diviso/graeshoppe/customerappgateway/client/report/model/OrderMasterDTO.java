package com.diviso.graeshoppe.customerappgateway.client.report.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * OrderMasterDTO
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-10-15T11:16:15.523+05:30[Asia/Kolkata]")

public class OrderMasterDTO   {
  @JsonProperty("addressType")
  private String addressType = null;

  @JsonProperty("alternatePhone")
  private Long alternatePhone = null;

  @JsonProperty("city")
  private String city = null;

  @JsonProperty("customerId")
  private String customerId = null;

  @JsonProperty("customerOrder")
  private Long customerOrder = null;

  @JsonProperty("deliveryCharge")
  private Double deliveryCharge = null;

  @JsonProperty("dueDateAndTime")
  private OffsetDateTime dueDateAndTime = null;

  @JsonProperty("houseNoOrBuildingName")
  private String houseNoOrBuildingName = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("landmark")
  private String landmark = null;

  @JsonProperty("methodOfOrder")
  private String methodOfOrder = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("notes")
  private String notes = null;

  @JsonProperty("orderAcceptedAt")
  private OffsetDateTime orderAcceptedAt = null;

  @JsonProperty("orderFromCustomer")
  private Long orderFromCustomer = null;

  @JsonProperty("orderNumber")
  private String orderNumber = null;

  @JsonProperty("orderPlaceAt")
  private OffsetDateTime orderPlaceAt = null;

  @JsonProperty("orderStatus")
  private String orderStatus = null;

  @JsonProperty("phone")
  private Long phone = null;

  @JsonProperty("pincode")
  private String pincode = null;

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

  public OrderMasterDTO addressType(String addressType) {
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

  public OrderMasterDTO alternatePhone(Long alternatePhone) {
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

  public OrderMasterDTO city(String city) {
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

  public OrderMasterDTO customerId(String customerId) {
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

  public OrderMasterDTO customerOrder(Long customerOrder) {
    this.customerOrder = customerOrder;
    return this;
  }

  /**
   * Get customerOrder
   * @return customerOrder
  **/
  @ApiModelProperty(value = "")


  public Long getCustomerOrder() {
    return customerOrder;
  }

  public void setCustomerOrder(Long customerOrder) {
    this.customerOrder = customerOrder;
  }

  public OrderMasterDTO deliveryCharge(Double deliveryCharge) {
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

  public OrderMasterDTO dueDateAndTime(OffsetDateTime dueDateAndTime) {
    this.dueDateAndTime = dueDateAndTime;
    return this;
  }

  /**
   * Get dueDateAndTime
   * @return dueDateAndTime
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getDueDateAndTime() {
    return dueDateAndTime;
  }

  public void setDueDateAndTime(OffsetDateTime dueDateAndTime) {
    this.dueDateAndTime = dueDateAndTime;
  }

  public OrderMasterDTO houseNoOrBuildingName(String houseNoOrBuildingName) {
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

  public OrderMasterDTO id(Long id) {
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

  public OrderMasterDTO landmark(String landmark) {
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

  public OrderMasterDTO methodOfOrder(String methodOfOrder) {
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

  public OrderMasterDTO name(String name) {
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

  public OrderMasterDTO notes(String notes) {
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

  public OrderMasterDTO orderAcceptedAt(OffsetDateTime orderAcceptedAt) {
    this.orderAcceptedAt = orderAcceptedAt;
    return this;
  }

  /**
   * Get orderAcceptedAt
   * @return orderAcceptedAt
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getOrderAcceptedAt() {
    return orderAcceptedAt;
  }

  public void setOrderAcceptedAt(OffsetDateTime orderAcceptedAt) {
    this.orderAcceptedAt = orderAcceptedAt;
  }

  public OrderMasterDTO orderFromCustomer(Long orderFromCustomer) {
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

  public OrderMasterDTO orderNumber(String orderNumber) {
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

  public OrderMasterDTO orderPlaceAt(OffsetDateTime orderPlaceAt) {
    this.orderPlaceAt = orderPlaceAt;
    return this;
  }

  /**
   * Get orderPlaceAt
   * @return orderPlaceAt
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getOrderPlaceAt() {
    return orderPlaceAt;
  }

  public void setOrderPlaceAt(OffsetDateTime orderPlaceAt) {
    this.orderPlaceAt = orderPlaceAt;
  }

  public OrderMasterDTO orderStatus(String orderStatus) {
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

  public OrderMasterDTO phone(Long phone) {
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

  public OrderMasterDTO pincode(String pincode) {
    this.pincode = pincode;
    return this;
  }

  /**
   * Get pincode
   * @return pincode
  **/
  @ApiModelProperty(value = "")


  public String getPincode() {
    return pincode;
  }

  public void setPincode(String pincode) {
    this.pincode = pincode;
  }

  public OrderMasterDTO roadNameAreaOrStreet(String roadNameAreaOrStreet) {
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

  public OrderMasterDTO serviceCharge(Double serviceCharge) {
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

  public OrderMasterDTO state(String state) {
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

  public OrderMasterDTO storeName(String storeName) {
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

  public OrderMasterDTO storePhone(Long storePhone) {
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

  public OrderMasterDTO totalDue(Double totalDue) {
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
    OrderMasterDTO orderMasterDTO = (OrderMasterDTO) o;
    return Objects.equals(this.addressType, orderMasterDTO.addressType) &&
        Objects.equals(this.alternatePhone, orderMasterDTO.alternatePhone) &&
        Objects.equals(this.city, orderMasterDTO.city) &&
        Objects.equals(this.customerId, orderMasterDTO.customerId) &&
        Objects.equals(this.customerOrder, orderMasterDTO.customerOrder) &&
        Objects.equals(this.deliveryCharge, orderMasterDTO.deliveryCharge) &&
        Objects.equals(this.dueDateAndTime, orderMasterDTO.dueDateAndTime) &&
        Objects.equals(this.houseNoOrBuildingName, orderMasterDTO.houseNoOrBuildingName) &&
        Objects.equals(this.id, orderMasterDTO.id) &&
        Objects.equals(this.landmark, orderMasterDTO.landmark) &&
        Objects.equals(this.methodOfOrder, orderMasterDTO.methodOfOrder) &&
        Objects.equals(this.name, orderMasterDTO.name) &&
        Objects.equals(this.notes, orderMasterDTO.notes) &&
        Objects.equals(this.orderAcceptedAt, orderMasterDTO.orderAcceptedAt) &&
        Objects.equals(this.orderFromCustomer, orderMasterDTO.orderFromCustomer) &&
        Objects.equals(this.orderNumber, orderMasterDTO.orderNumber) &&
        Objects.equals(this.orderPlaceAt, orderMasterDTO.orderPlaceAt) &&
        Objects.equals(this.orderStatus, orderMasterDTO.orderStatus) &&
        Objects.equals(this.phone, orderMasterDTO.phone) &&
        Objects.equals(this.pincode, orderMasterDTO.pincode) &&
        Objects.equals(this.roadNameAreaOrStreet, orderMasterDTO.roadNameAreaOrStreet) &&
        Objects.equals(this.serviceCharge, orderMasterDTO.serviceCharge) &&
        Objects.equals(this.state, orderMasterDTO.state) &&
        Objects.equals(this.storeName, orderMasterDTO.storeName) &&
        Objects.equals(this.storePhone, orderMasterDTO.storePhone) &&
        Objects.equals(this.totalDue, orderMasterDTO.totalDue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressType, alternatePhone, city, customerId, customerOrder, deliveryCharge, dueDateAndTime, houseNoOrBuildingName, id, landmark, methodOfOrder, name, notes, orderAcceptedAt, orderFromCustomer, orderNumber, orderPlaceAt, orderStatus, phone, pincode, roadNameAreaOrStreet, serviceCharge, state, storeName, storePhone, totalDue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderMasterDTO {\n");
    
    sb.append("    addressType: ").append(toIndentedString(addressType)).append("\n");
    sb.append("    alternatePhone: ").append(toIndentedString(alternatePhone)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    customerOrder: ").append(toIndentedString(customerOrder)).append("\n");
    sb.append("    deliveryCharge: ").append(toIndentedString(deliveryCharge)).append("\n");
    sb.append("    dueDateAndTime: ").append(toIndentedString(dueDateAndTime)).append("\n");
    sb.append("    houseNoOrBuildingName: ").append(toIndentedString(houseNoOrBuildingName)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    landmark: ").append(toIndentedString(landmark)).append("\n");
    sb.append("    methodOfOrder: ").append(toIndentedString(methodOfOrder)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    orderAcceptedAt: ").append(toIndentedString(orderAcceptedAt)).append("\n");
    sb.append("    orderFromCustomer: ").append(toIndentedString(orderFromCustomer)).append("\n");
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

