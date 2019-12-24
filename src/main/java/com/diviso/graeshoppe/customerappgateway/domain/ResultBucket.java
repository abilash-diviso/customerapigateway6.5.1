package com.diviso.graeshoppe.customerappgateway.domain;

public class ResultBucket {
private String key;
private String keyAsString;
private Long docCount;
public String getKey() {
	return key;
}
public void setKey(String key) {
	this.key = key;
}
public String getKeyAsString() {
	return keyAsString;
}
public void setKeyAsString(String keyAsString) {
	this.keyAsString = keyAsString;
}
public Long getDocCount() {
	return docCount;
}
public void setDocCount(Long docCount) {
	this.docCount = docCount;
}
@Override
public String toString() {
	return "ResultBucket [key=" + key + ", keyAsString=" + keyAsString + ", docCount=" + docCount + "]";
}
}
