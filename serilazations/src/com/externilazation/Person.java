package com.externilazation;

public class Person {
	String place;
	String name;
	int age;
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [place=" + place + ", name=" + name + ", age=" + age + "]";
	}
	
}
