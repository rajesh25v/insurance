package com.createiq.example2;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class ByteArrayExampleOne {
	public static void main(String[] args) throws IOException {
		ByteArrayOutputStream bos=new ByteArrayOutputStream();
		while(bos.size()!=5) {
			bos.write("happy".getBytes());
		}
		System.out.println("size of "+bos.size());

			byte[] byt=bos.toByteArray();
			System.out.println("the content gets printed as");
			for(int i=0;i<byt.length;i++) {
				System.out.print((char)byt[i]+"***");
				
			}
			System.out.println(" ");
		
		
	}

}
