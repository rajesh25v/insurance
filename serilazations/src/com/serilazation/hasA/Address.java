package com.serilazation.hasA;

import java.io.Serializable;

public class Address implements Serializable{
	String city,state;
	int pincode;
	public Address(String city,String state, int pincode) {
		this.city=city;
		this.pincode=pincode;
		this.state=state;
	}

}
