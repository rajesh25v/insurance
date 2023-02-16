package com.serilazation.hasA;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import jdk.nashorn.api.scripting.JSObject;

public class Employee implements Serializable{
	int id;
	String name;
	Address add;//has -A
	public Employee(int id, String name,Address add) {
		this.id=id;
		this.name=name;
		
	}
	public static void main(String[] args) {
		
		System.out.println("successs..");
		
		try {
			FileOutputStream fos = new FileOutputStream("hasA.ser");
			Address d1=new Address("hyderabad","s r nagar",12001);
			Employee e1=new Employee(102,"ramu",d1);
		
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			
			oos.writeObject(d1);
			oos.flush();
			oos.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
	}

}
