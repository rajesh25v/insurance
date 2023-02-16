package com.stringEx;

public class CharAt {
	public static void main(String[] args) {
		
	String str="BeginnersBook";
	char ch=str.charAt(4);
	System.out.println("character at index :"+ch);
	
	for(int i=0;i<str.length();i++) {
		System.out.println("printing all using charAt: "+str.charAt(i));
	}
		int count=0;
		for(int i1=0;i1<str.length()-1;i1++) {
			if(str.charAt(i1)=='B') {
				count++;
			}
		}
		System.out.println("char'B' :"+count+"times in the string");
		
	
		
	}
	
 
}
