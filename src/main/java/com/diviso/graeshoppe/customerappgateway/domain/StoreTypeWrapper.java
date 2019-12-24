package com.diviso.graeshoppe.customerappgateway.domain;

import java.util.List;
import java.util.Set;

public class StoreTypeWrapper {
	

	private Set<String> typeName;

	public Set<String> getTypeName() {
		return typeName;
	}

	public void setTypeName(Set<String> typeName) {
		this.typeName = typeName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((typeName == null) ? 0 : typeName.hashCode());
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
		StoreTypeWrapper other = (StoreTypeWrapper) obj;
		if (typeName == null) {
			if (other.typeName != null)
				return false;
		} else if (!typeName.equals(other.typeName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "StoreTypeWrapper [typeName=" + typeName + "]";
	}

	
}
