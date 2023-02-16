package com.stringEx;

public class Contains {
	public static void main(String[] args) {
		String  str="well come to infosys rajesh babu";
		//public boolean contains(charsequence str)
		boolean s=str.contains("infosys");
		System.out.println(s);
	//	System.out.println(str.contains(null));
		
		String str2="well come to our family";
		if(str2.contains("our")) {
			System.out.println("the person is our family");
		}else {
			System.out.println("the person is not our family");
		}
		//checking the case insensitive
		String str3="WELL";
		System.out.println(str2.toLowerCase().contains(str3.toLowerCase()));
	
	
	}

}
