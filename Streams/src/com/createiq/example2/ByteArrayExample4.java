package com.createiq.example2;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class ByteArrayExample4 {
	public static void main(String[] args) throws IOException {
		
	int a='a';
	System.out.println(a);
		
		ByteArrayOutputStream bobj = new ByteArrayOutputStream();
		byte[] buff = { 'H', 'A', 'P', 'P', 'Y' };
		// write to the buffer
		bobj.write(buff, 0, 5);
		System.out.print(" write ( buffER , off set, max len) by toByteArray( ) usage : ");
		// toByteArray() method usage
		for (byte byt : bobj.toByteArray()) {
			System.out.print("*" +(char) byt);
		}
	}


}
