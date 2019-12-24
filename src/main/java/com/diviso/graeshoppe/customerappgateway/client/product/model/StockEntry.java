package com.diviso.graeshoppe.customerappgateway.client.product.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * A StockEntry.
 */


public class StockEntry implements Serializable {

    private static final long serialVersionUID = 1L;
    
   
    private Long id;


    private String iDPcode;


    private String reference;


    private LocalDate date;

    private String description;


    private Set<EntryLineItem> entryLineItems = new HashSet<>();

    private Reason reason;

    private Location location;

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

    public StockEntry iDPcode(String iDPcode) {
        this.iDPcode = iDPcode;
        return this;
    }

    public void setiDPcode(String iDPcode) {
        this.iDPcode = iDPcode;
    }

    public String getReference() {
        return reference;
    }

    public StockEntry reference(String reference) {
        this.reference = reference;
        return this;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public LocalDate getDate() {
        return date;
    }

    public StockEntry date(LocalDate date) {
        this.date = date;
        return this;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public StockEntry description(String description) {
        this.description = description;
        return this;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<EntryLineItem> getEntryLineItems() {
        return entryLineItems;
    }

    public StockEntry entryLineItems(Set<EntryLineItem> entryLineItems) {
        this.entryLineItems = entryLineItems;
        return this;
    }

    public StockEntry addEntryLineItems(EntryLineItem entryLineItem) {
        this.entryLineItems.add(entryLineItem);
        entryLineItem.setStockEntry(this);
        return this;
    }

    public StockEntry removeEntryLineItems(EntryLineItem entryLineItem) {
        this.entryLineItems.remove(entryLineItem);
        entryLineItem.setStockEntry(null);
        return this;
    }

    public void setEntryLineItems(Set<EntryLineItem> entryLineItems) {
        this.entryLineItems = entryLineItems;
    }

    public Reason getReason() {
        return reason;
    }

    public StockEntry reason(Reason reason) {
        this.reason = reason;
        return this;
    }

    public void setReason(Reason reason) {
        this.reason = reason;
    }

    public Location getLocation() {
        return location;
    }

    public StockEntry location(Location location) {
        this.location = location;
        return this;
    }

    public void setLocation(Location location) {
        this.location = location;
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
        StockEntry stockEntry = (StockEntry) o;
        if (stockEntry.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), stockEntry.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "StockEntry{" +
            "id=" + getId() +
            ", iDPcode='" + getiDPcode() + "'" +
            ", reference='" + getReference() + "'" +
            ", date='" + getDate() + "'" +
            ", description='" + getDescription() + "'" +
            "}";
    }
}
