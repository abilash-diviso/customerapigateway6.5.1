package com.diviso.graeshoppe.customerappgateway.client.order.model.aggregator;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * * A Offer.
 */

public class Offer implements Serializable {

	private static final long serialVersionUID = 1L;

	@JsonProperty("id")
	private Long id;
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	@JsonProperty("offerRef")
	private String offerRef;
	@JsonProperty("orderDiscountAmount")
	private Double orderDiscountAmount;
	
	  private String state ="NIL";

	@Override
	public String toString() {
		return String.format("Offer [offerRef=%s,\n orderDiscountAmount=%s,\n description=%s]", offerRef,
				orderDiscountAmount, description);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((offerRef == null) ? 0 : offerRef.hashCode());
		result = prime * result + ((orderDiscountAmount == null) ? 0 : orderDiscountAmount.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Offer))
			return false;
		Offer other = (Offer) obj;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (offerRef == null) {
			if (other.offerRef != null)
				return false;
		} else if (!offerRef.equals(other.offerRef))
			return false;
		if (orderDiscountAmount == null) {
			if (other.orderDiscountAmount != null)
				return false;
		} else if (!orderDiscountAmount.equals(other.orderDiscountAmount))
			return false;
		return true;
	}

	@JsonProperty("description")
	private String description;

	// jhipster-needle-entity-add-field - JHipster will add fields here, do not
	// remove

	public String getOfferRef() {
		return offerRef;
	}

	public Offer offerRef(String offerRef) {
		this.offerRef = offerRef;
		return this;
	}

	public void setOfferRef(String offerRef) {
		this.offerRef = offerRef;
	}

	public Double getOrderDiscountAmount() {
		return orderDiscountAmount;
	}

	public Offer orderDiscountAmount(Double orderDiscountAmount) {
		this.orderDiscountAmount = orderDiscountAmount;
		return this;
	}

	public void setOrderDiscountAmount(Double orderDiscountAmount) {
		this.orderDiscountAmount = orderDiscountAmount;
	}

	public String getDescription() {
		return description;
	}

	public Offer description(String description) {
		this.description = description;
		return this;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	// jhipster-needle-entity-add-getters-setters - JHipster will add getters and
	// setters here, do not remove

}
