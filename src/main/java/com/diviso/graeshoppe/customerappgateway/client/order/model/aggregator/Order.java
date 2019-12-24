package com.diviso.graeshoppe.customerappgateway.client.order.model.aggregator;

import java.util.Set;

import com.diviso.graeshoppe.customerappgateway.client.order.model.aggregator.ApprovalDetails;
import com.diviso.graeshoppe.customerappgateway.client.order.model.aggregator.DeliveryInfo;
import com.diviso.graeshoppe.customerappgateway.client.order.model.aggregator.Offer;
import com.diviso.graeshoppe.customerappgateway.client.order.model.aggregator.OrderLine;
import com.diviso.graeshoppe.customerappgateway.client.order.model.aggregator.Status;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import javax.validation.Valid;

/**
 * Order
 */

public class Order   {
  @JsonProperty("appliedOffers")
  @Valid
  private List<Offer> appliedOffers = new ArrayList<>();

  @JsonProperty("approvalDetails")
  private ApprovalDetails approvalDetails = null;
  
  @JsonProperty("paymentMode")
private String paymentMode;

  public String getPaymentMode() {
	return paymentMode;
}

public void setPaymentMode(String paymentMode) {
	this.paymentMode = paymentMode;
}

@JsonProperty("customerId")
  private String customerId = null;

  @JsonProperty("date")
  //@JsonFormat(pattern = "yyyy-MM-dd HH:mm")
  private OffsetDateTime date = null;
  
  @JsonProperty( "allergyNote")
  private String allergyNote;

  @JsonProperty( "preOrderDate")
  private OffsetDateTime preOrderDate;
  
  private String state ="NIL";
  /**
 * @return the allergyNote
 */
public String getAllergyNote() {
	return allergyNote;
}

/**
 * @param allergyNote the allergyNote to set
 */
public void setAllergyNote(String allergyNote) {
	this.allergyNote = allergyNote;
}

/**
 * @return the preOrderDate
 */
public OffsetDateTime getPreOrderDate() {
	return preOrderDate;
}

/**
 * @param preOrderDate the preOrderDate to set
 */
public void setPreOrderDate(OffsetDateTime preOrderDate) {
	this.preOrderDate = preOrderDate;
}

@JsonProperty("deliveryInfo")
  private DeliveryInfo deliveryInfo = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("grandTotal")
  private Double grandTotal = null;
  @JsonProperty("subTotal")
  private Double subTotal = null;
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("orderId")
  private String orderId = null;

  @JsonProperty("orderLines")
  @Valid
  private Set<OrderLine> orderLines = new HashSet<>();

  @JsonProperty("paymentRef")
  private String paymentRef = null;

  @JsonProperty("status")
  private Status status = null;

  @JsonProperty("storeId")
  private String storeId = null;

  public Order appliedOffers(List<Offer> appliedOffers) {
    this.appliedOffers = appliedOffers;
    return this;
  }

  public Order addAppliedOffersItem(Offer appliedOffersItem) {
    if (this.appliedOffers == null) {
      this.appliedOffers = new ArrayList<Offer>();
    }
    this.appliedOffers.add(appliedOffersItem);
    return this;
  }

  /**
   * Get appliedOffers
   * @return appliedOffers
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<Offer> getAppliedOffers() {
    return appliedOffers;
  }

  public void setAppliedOffers(List<Offer> appliedOffers) {
    this.appliedOffers = appliedOffers;
  }

  public Order approvalDetails(ApprovalDetails approvalDetails) {
    this.approvalDetails = approvalDetails;
    return this;
  }

  /**
   * Get approvalDetails
   * @return approvalDetails
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ApprovalDetails getApprovalDetails() {
    return approvalDetails;
  }

  public void setApprovalDetails(ApprovalDetails approvalDetails) {
    this.approvalDetails = approvalDetails;
  }

  public Order customerId(String customerId) {
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

  public Order date(OffsetDateTime date) {
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

  public Order deliveryInfo(DeliveryInfo deliveryInfo) {
    this.deliveryInfo = deliveryInfo;
    return this;
  }

  /**
   * Get deliveryInfo
   * @return deliveryInfo
  **/
  @ApiModelProperty(value = "")

  @Valid

  public DeliveryInfo getDeliveryInfo() {
    return deliveryInfo;
  }

  public void setDeliveryInfo(DeliveryInfo deliveryInfo) {
    this.deliveryInfo = deliveryInfo;
  }

  public Order email(String email) {
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

  public Order grandTotal(Double grandTotal) {
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

  public Order id(Long id) {
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

  public Order orderId(String orderId) {
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

  public Order orderLines(Set<OrderLine> orderLines) {
    this.orderLines = orderLines;
    return this;
  }

  public Order addOrderLinesItem(OrderLine orderLinesItem) {
    if (this.orderLines == null) {
      this.orderLines = new HashSet<OrderLine>();
    }
    this.orderLines.add(orderLinesItem);
    return this;
  }

  /**
   * Get orderLines
   * @return orderLines
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Set<OrderLine> getOrderLines() {
    return orderLines;
  }

  public void setOrderLines(Set<OrderLine> orderLines) {
    this.orderLines = orderLines;
  }

  public Order paymentRef(String paymentRef) {
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

  public Order status(Status status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Status getStatus() {
    return status;
  }

  public void setStatus(Status status) {
    this.status = status;
  }

  public Order storeId(String storeId) {
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

  @Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((allergyNote == null) ? 0 : allergyNote.hashCode());
	result = prime * result + ((appliedOffers == null) ? 0 : appliedOffers.hashCode());
	result = prime * result + ((approvalDetails == null) ? 0 : approvalDetails.hashCode());
	result = prime * result + ((customerId == null) ? 0 : customerId.hashCode());
	result = prime * result + ((date == null) ? 0 : date.hashCode());
	result = prime * result + ((deliveryInfo == null) ? 0 : deliveryInfo.hashCode());
	result = prime * result + ((email == null) ? 0 : email.hashCode());
	result = prime * result + ((grandTotal == null) ? 0 : grandTotal.hashCode());
	result = prime * result + ((id == null) ? 0 : id.hashCode());
	result = prime * result + ((orderId == null) ? 0 : orderId.hashCode());
	result = prime * result + ((orderLines == null) ? 0 : orderLines.hashCode());
	result = prime * result + ((paymentRef == null) ? 0 : paymentRef.hashCode());
	result = prime * result + ((preOrderDate == null) ? 0 : preOrderDate.hashCode());
	result = prime * result + ((status == null) ? 0 : status.hashCode());
	result = prime * result + ((storeId == null) ? 0 : storeId.hashCode());
	result = prime * result + ((subTotal == null) ? 0 : subTotal.hashCode());
	return result;
}

/**
 * @return the subTotal
 */
public Double getSubTotal() {
	return subTotal;
}

/**
 * @param subTotal the subTotal to set
 */
public void setSubTotal(Double subTotal) {
	this.subTotal = subTotal;
}



@Override
public String toString() {
	return "Order [appliedOffers=" + appliedOffers + ", approvalDetails=" + approvalDetails + ", paymentMode="
			+ paymentMode + ", customerId=" + customerId + ", date=" + date + ", allergyNote=" + allergyNote
			+ ", preOrderDate=" + preOrderDate + ", state=" + state + ", deliveryInfo=" + deliveryInfo + ", email="
			+ email + ", grandTotal=" + grandTotal + ", subTotal=" + subTotal + ", id=" + id + ", orderId=" + orderId
			+ ", orderLines=" + orderLines + ", paymentRef=" + paymentRef + ", status=" + status + ", storeId="
			+ storeId + "]";
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (!(obj instanceof Order))
		return false;
	Order other = (Order) obj;
	if (allergyNote == null) {
		if (other.allergyNote != null)
			return false;
	} else if (!allergyNote.equals(other.allergyNote))
		return false;
	if (appliedOffers == null) {
		if (other.appliedOffers != null)
			return false;
	} else if (!appliedOffers.equals(other.appliedOffers))
		return false;
	if (approvalDetails == null) {
		if (other.approvalDetails != null)
			return false;
	} else if (!approvalDetails.equals(other.approvalDetails))
		return false;
	if (customerId == null) {
		if (other.customerId != null)
			return false;
	} else if (!customerId.equals(other.customerId))
		return false;
	if (date == null) {
		if (other.date != null)
			return false;
	} else if (!date.equals(other.date))
		return false;
	if (deliveryInfo == null) {
		if (other.deliveryInfo != null)
			return false;
	} else if (!deliveryInfo.equals(other.deliveryInfo))
		return false;
	if (email == null) {
		if (other.email != null)
			return false;
	} else if (!email.equals(other.email))
		return false;
	if (grandTotal == null) {
		if (other.grandTotal != null)
			return false;
	} else if (!grandTotal.equals(other.grandTotal))
		return false;
	if (id == null) {
		if (other.id != null)
			return false;
	} else if (!id.equals(other.id))
		return false;
	if (orderId == null) {
		if (other.orderId != null)
			return false;
	} else if (!orderId.equals(other.orderId))
		return false;
	if (orderLines == null) {
		if (other.orderLines != null)
			return false;
	} else if (!orderLines.equals(other.orderLines))
		return false;
	if (paymentRef == null) {
		if (other.paymentRef != null)
			return false;
	} else if (!paymentRef.equals(other.paymentRef))
		return false;
	if (preOrderDate == null) {
		if (other.preOrderDate != null)
			return false;
	} else if (!preOrderDate.equals(other.preOrderDate))
		return false;
	if (status == null) {
		if (other.status != null)
			return false;
	} else if (!status.equals(other.status))
		return false;
	if (storeId == null) {
		if (other.storeId != null)
			return false;
	} else if (!storeId.equals(other.storeId))
		return false;
	if (subTotal == null) {
		if (other.subTotal != null)
			return false;
	} else if (!subTotal.equals(other.subTotal))
		return false;
	return true;
}

public void setStoreId(String storeId) {
    this.storeId = storeId;
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

public String getState() {
	return state;
}

public void setState(String state) {
	this.state = state;
}




}

