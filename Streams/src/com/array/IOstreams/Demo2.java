package com.array.IOstreams;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class Demo2 {
	public static void main(String[] args) throws IOException {
		byte[] c= {12,33,45,66,78};
		
		ByteArrayInputStream bi=new ByteArrayInputStream(c);
		int k=0;
		while((k=bi.read())!=-1) { 
			char ch=(char)k;
			System.out.println("ASCI value of character is: "+k+"  charater  :"+ch);
		}
		bi.close();
		
	}

}
