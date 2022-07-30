package com.machindra.domain;

public class PhoneNumber {
	
	private long phone;
	private String phonenumberType;
	private String provider;
	public long getPhonenumber() {
		return phone;
	}
	public void setPhonenumber(long phone) {
		this.phone = phone;
	}
	public String getPhonenumberType() {
		return phonenumberType;
	}
	public void setPhonenumberType(String phonenumberType) {
		this.phonenumberType = phonenumberType;
	}
	public String getProvider() {
		return provider;
	}
	public void setProvider(String provider) {
		this.provider = provider;
	}
	@Override
	public String toString() {
		return "PhoneNumber [phonenumber=" + phone + ", phonenumberType=" + phonenumberType + ", provider="
				+ provider + "]";
	}
	

}
