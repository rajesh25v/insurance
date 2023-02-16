package com.iq.equal;

public class EqualsAndHashCodeTest {
	

	public static void main(String[] args) {
		
		EqualsAndHashCode equalsAndHashCode=new EqualsAndHashCode(1, "rajesh");
		EqualsAndHashCode equalsAndHashCode1=new EqualsAndHashCode(2, "rajesh");
		System.out.println(equalsAndHashCode.toString());
		System.out.println(equalsAndHashCode.hashCode()==equalsAndHashCode1.hashCode());
		System.out.println(equalsAndHashCode.equals(equalsAndHashCode1));
		System.out.println(equalsAndHashCode);
		System.out.println(equalsAndHashCode.toString());
		System.out.println(equalsAndHashCode1.toString());
	}
}
