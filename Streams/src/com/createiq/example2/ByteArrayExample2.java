package com.createiq.example2;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class ByteArrayExample2 {
	public static void main(String args[]) throws IOException {
		// create an object for the bytearrayoutputstream
		ByteArrayOutputStream bobj = new ByteArrayOutputStream(20);
		while (bobj.size() !=5) {
			bobj.write("happy".getBytes());
		}
		byte byt[] = bobj.toByteArray();
		int ch;
		
		ByteArrayInputStream biobj = new ByteArrayInputStream(byt);
		System.out.println("Conversion of each character to Upper case ");
		for (int j = 0; j < 1; j++) {
			while ((ch = biobj.read()) != -1) {
				// convert character to upper case
				System.out.print(Character.toUpperCase((char) ch));
				
			}
			biobj.reset();
		}
	}
}

