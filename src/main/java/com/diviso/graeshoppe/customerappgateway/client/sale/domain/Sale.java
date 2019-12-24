 /*
 * Copyright 2002-2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.diviso.graeshoppe.customerappgateway.client.sale.domain;

import java.io.Serializable;
import java.time.Instant;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;



/**
 * TODO Provide a detailed description here 
 * @author MayaSanjeev
 * mayabytatech, maya.k.k@lxisoft.com
 */

public class Sale implements Serializable {

    private static final long serialVersionUID = 1L;
    
  
    private Long id;

   
    private Long customerId;

    private Double grandTotal;
    
    private Instant date ;

 
    public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	private String userId ;
    private Set<TicketLine> ticketLines = new HashSet<>();
    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public Sale customerId(Long customerId) {
        this.customerId = customerId;
        return this;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public Double getGrandTotal() {
        return grandTotal;
    }

    public Sale grandTotal(Double grandTotal) {
        this.grandTotal = grandTotal;
        return this;
    }

    public void setGrandTotal(Double grandTotal) {
        this.grandTotal = grandTotal;
    }

    public Set<TicketLine> getTicketLines() {
        return ticketLines;
    }

    public Sale ticketLines(Set<TicketLine> ticketLines) {
        this.ticketLines = ticketLines;
        return this;
    }

    public Sale addTicketLine(TicketLine ticketLine) {
        this.ticketLines.add(ticketLine);
        ticketLine.setSale(this);
        return this;
    }

    public Sale removeTicketLine(TicketLine ticketLine) {
        this.ticketLines.remove(ticketLine);
        ticketLine.setSale(null);
        return this;
    }

    public void setTicketLines(Set<TicketLine> ticketLines) {
        this.ticketLines = ticketLines;
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
        Sale sale = (Sale) o;
        if (sale.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), sale.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

   

	@Override
	public String toString() {
		return "Sale [id=" + id + ", customerId=" + customerId + ", grandTotal=" + grandTotal + ", date=" + date
				+ ", userId=" + userId + ", ticketLines=" + ticketLines + "]";
	}

	public Instant getDate() {
		return date;
	}

	public void setDate(Instant date) {
		this.date = date;
	}
}