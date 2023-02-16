package com.stringEx;

public class EqualsMethod {
	//boolean equals(String str) case sensitive
	//boolean equalsIgnoreCase(String str) case in-sensitive
	public static void main(String[] args) {
		
		String s="hello java";
		String str2=new String("hello java");
		String str3=new String("hello java");
		
		System.out.println("s equals to str2 :"+s.equals(str2));
		System.out.println("str2 equals to str3 :"+str2.equals(str3));
		
		System.out.println("s equals to :"+s.equals("hello java"));
		System.out.println("str2 equals to :"+str2.equals("Hello java"));
		
		System.out.println(str2.equalsIgnoreCase("Hello java"));
		
	}

}
