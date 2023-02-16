package com.iq;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo1 {
	public static void main(String[] args) throws IOException {
		System.out.write(105);
		System.out.flush();
		System.out.close();
		System.out.println("a");
		String greating="Well come to java";
		File file=new File("greating");
		FileOutputStream fos=new FileOutputStream(file);
		byte[] bye=greating.getBytes();
		fos.write(bye);
		
		fos.close();
	}

}
