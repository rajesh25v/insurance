package com.serilazation.hasA;

import java.io.Serializable;

public class TriansientEx implements Serializable{
	int id;
	String name;
	transient int age;
	public TriansientEx(int id, String name, int age) {
		this.id=id;
		this.name=name;
		this.age=age;
		
	}
	

}
