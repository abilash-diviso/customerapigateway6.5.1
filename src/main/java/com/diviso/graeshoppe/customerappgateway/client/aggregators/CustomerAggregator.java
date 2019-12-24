package com.diviso.graeshoppe.customerappgateway.client.aggregators;

public class CustomerAggregator {
	
	private String name;
	private Long mobileNumber;
	private String idpCode;
	private String email;
	private String imageLink;
	
	
	public String getImageLink() {
		return imageLink;
	}



	public void setImageLink(String imageLink) {
		this.imageLink = imageLink;
	}



	public String getIdpCode() {
		return idpCode;
	}



	public void setIdpCode(String idpCode) {
		this.idpCode = idpCode;
	}



	public String getIdpSub() {
		return idpSub;
	}



	public void setIdpSub(String idpSub) {
		this.idpSub = idpSub;
	}
	private Long phoneCode;
	private String idpSub;
	
	
	
	@Override
	public String toString() {
		return "CustomerAggregator [name=" + name + ", mobileNumber=" + mobileNumber + ", idpCode=" + idpCode
				+ ", email=" + email + ", phoneCode=" + phoneCode + ", idpSub=" + idpSub + "]";
	}
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((mobileNumber == null) ? 0 : mobileNumber.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((phoneCode == null) ? 0 : phoneCode.hashCode());
		result = prime * result + ((idpCode == null) ? 0 : idpCode.hashCode());
		result = prime * result + ((idpSub == null) ? 0 : idpSub.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CustomerAggregator other = (CustomerAggregator) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (mobileNumber == null) {
			if (other.mobileNumber != null)
				return false;
		} else if (!mobileNumber.equals(other.mobileNumber))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (phoneCode == null) {
			if (other.phoneCode != null)
				return false;
		} else if (!phoneCode.equals(other.phoneCode))
			return false;
		if (idpCode == null) {
			if (other.idpCode != null)
				return false;
		} else if (!idpCode.equals(other.idpCode))
			return false;
		if (idpSub == null) {
			if (other.idpSub != null)
				return false;
		} else if (!idpSub.equals(other.idpSub))
			return false;
		return true;
	}



	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(Long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getPhoneCode() {
		return phoneCode;
	}
	public void setPhoneCode(Long phoneCode) {
		this.phoneCode = phoneCode;
	}

	

	
}
