package com.stringEx;

public class FormatMethod {
	//public static String format(String format,object..args)
	public static void main(String[] args) {
		String str="just a string";
		String stk="88";
		
		//concatenating String using format
		String fs1=String.format("my string is %s", str);
		
		String fs2=String.format("my string is %.6f",12.121);
		
		System.out.println(fs1);
		System.out.println(fs2);
		//%1$ for first argument. %2$ for second argument
		
		String fstr=String.format("My String is: %1$s, %1$s and %2$s", str, stk);
	}

}
