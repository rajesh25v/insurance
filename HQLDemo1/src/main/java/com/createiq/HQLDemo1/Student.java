package com.createiq.HQLDemo1;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Student")
public class Student {
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private int id;
	@Column
	private String address;
	@Column
	private String name;

	public Student(int id, String address, String name) {
		super();
		this.id = id;
		this.address = address;
		this.name = name;
	}

	public Student() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", address=" + address + ", name=" + name + "]";
	}
	

}
