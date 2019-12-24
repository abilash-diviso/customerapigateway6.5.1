package com.diviso.graeshoppe.customerappgateway.domain;

public class GraeshoppeGeneric<T> {
	T obj;

	void add(T obj) {
		this.obj = obj;
	}

	T get() {
		return obj;
	}
}
