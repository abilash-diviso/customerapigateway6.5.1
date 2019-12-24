package com.diviso.graeshoppe.customerappgateway.client.customer.model;

import java.io.Serializable;
import java.util.Objects;

/**
 * A UniqueCustomerID.
 */

public class UniqueCustomerID implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
        UniqueCustomerID uniqueCustomerID = (UniqueCustomerID) o;
        if (uniqueCustomerID.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), uniqueCustomerID.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "UniqueCustomerID{" +
            "id=" + getId() +
            "}";
    }
}
