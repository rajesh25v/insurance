package com.serilazation;

import java.io.Serializable;

public class Person implements Serializable{
	int id;
	String name;
	private static String address;
	Person(int id, String name){
		this.id=id;
		this.name=name;
		
	}
	public static String getAddress() {
		return address;
	}
	public static void setAddress(String address) {
		Person.address = address;
	}

}
