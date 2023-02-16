package com.serilazation;

import java.io.Serializable;

public class Student1 implements Serializable{
	private static final long serialVersionUID=1l;
	private int id;
	private String name;
	private double fees;
	private String email;
	public Student1(int id, String name, double fees, String email) {
		super();
		this.id = id;
		this.name = name;
		this.fees = fees;
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getFees() {
		return fees;
	}
	public void setFees(double fees) {
		this.fees = fees;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Student1 [id=" + id + ", name=" + name + ", fees=" + fees + ", email=" + email + "]";
	}
	

}
