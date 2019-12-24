package com.diviso.graeshoppe.customerappgateway.domain;

import org.springframework.validation.annotation.Validated;
import java.time.*;
/**
 * Store
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-08-02T11:19:44.906+05:30[Asia/Calcutta]")

public class Cart  {
 

  
  
  private Long id = null;



 private String location = null;

private LocalDate date;

private ZonedDateTime zdate;

private Instant idate;

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getLocation() {
	return location;
}

public void setLocation(String location) {
	this.location = location;
}

public LocalDate getDate() {
	return date;
}

public void setDate(LocalDate date) {
	this.date = date;
}

public ZonedDateTime getZdate() {
	return zdate;
}

public void setZdate(ZonedDateTime zdate) {
	this.zdate = zdate;
}

public Instant getIdate() {
	return idate;
}

public void setIdate(Instant idate) {
	this.idate = idate;
}

@Override
public String toString() {
	return "Cart [id=" + id + ", location=" + location + ", date=" + date + ", zdate=" + zdate + ", idate=" + idate
			+ ", getId()=" + getId() + ", getLocation()=" + getLocation() + ", getDate()=" + getDate() + ", getZdate()="
			+ getZdate() + ", getIdate()=" + getIdate() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
			+ ", toString()=" + super.toString() + "]";
}



    }

