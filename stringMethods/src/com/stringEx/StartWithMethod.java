package com.stringEx;

public class StartWithMethod {
	//used for checking prefix of a string
	public static void main(String[] args) {
		//boolean startWith(String str)
		//boolean startWith(string str,index fromIndex)
		
		String s="this is just a sample string";
		
		System.out.println(s.startsWith("is"));
		
		System.out.println(s.startsWith("is",5));
		
		
	}

}
