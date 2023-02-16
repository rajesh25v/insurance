package com.createiq.example2;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.xml.crypto.Data;

public class DataOutputStream2 {
	public static void main(String[] args) throws IOException {
		FileOutputStream file = new FileOutputStream("jj.txt");
		DataOutputStream data = new DataOutputStream(file);
		String[] fruits = { "mangao", "banana", "orange" };
		int a = 10;
//		byte [] bytes=fruits.ggggg

//		data.write( );
		file.write(a);
		data.writeInt(65);
		double d = 1000.00;
		data.writeDouble(d);
		data.flush();
		data.close();
		System.out.println("Succcess...");
	}
	


}
