package com.stringEx;

public class CompareTO {
	//string converted to unicode value
	public static void main(String[] args) {
		String str="hello rajesh babu";
		String str1="Hello raju";
		
		
		System.out.println(str.compareTo(str1));
		System.out.println(str1.compareTo("Hello raju"));
		System.out.println("length of the string str :"+str.compareTo(""));
		System.out.println(str1.compareToIgnoreCase("hello raju"));
	}

}
