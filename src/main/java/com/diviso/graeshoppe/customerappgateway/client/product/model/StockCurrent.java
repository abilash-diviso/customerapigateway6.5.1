package com.diviso.graeshoppe.customerappgateway.client.product.model;

import java.io.Serializable;
import java.util.Objects;

/**
 * A StockCurrent.
 */

public class StockCurrent implements Serializable {

    private static final long serialVersionUID = 1L;
    
    
    private Long id;


    private String iDPcode;

  
    private Double quantity;

    private Double sellPrice;


    private String notes;


    private Product product;

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getiDPcode() {
        return iDPcode;
    }

    public StockCurrent iDPcode(String iDPcode) {
        this.iDPcode = iDPcode;
        return this;
    }

    public void setiDPcode(String iDPcode) {
        this.iDPcode = iDPcode;
    }

    public Double getQuantity() {
        return quantity;
    }

    public StockCurrent quantity(Double quantity) {
        this.quantity = quantity;
        return this;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    public Double getSellPrice() {
        return sellPrice;
    }

    public StockCurrent sellPrice(Double sellPrice) {
        this.sellPrice = sellPrice;
        return this;
    }

    public void setSellPrice(Double sellPrice) {
        this.sellPrice = sellPrice;
    }

    public String getNotes() {
        return notes;
    }

    public StockCurrent notes(String notes) {
        this.notes = notes;
        return this;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Product getProduct() {
        return product;
    }

    public StockCurrent product(Product product) {
        this.product = product;
        return this;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here, do not remove

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        StockCurrent stockCurrent = (StockCurrent) o;
        if (stockCurrent.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), stockCurrent.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "StockCurrent{" +
            "id=" + getId() +
            ", iDPcode='" + getiDPcode() + "'" +
            ", quantity=" + getQuantity() +
            ", sellPrice=" + getSellPrice() +
            ", notes='" + getNotes() + "'" +
            "}";
    }
}
