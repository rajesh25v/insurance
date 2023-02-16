package com.stringEx;

public class AnnualTest extends Test {

	@Override
	public void print() {
	//	super.print();
	}
	public void printAgain() {
		System.out.println("printing again");
	}
	public static void main(String[] args) {
		Test ts=new AnnualTest();
		ts.print();
		
	}
	

}
