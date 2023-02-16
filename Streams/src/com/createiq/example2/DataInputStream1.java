package com.createiq.example2;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class DataInputStream1 {
	public static void main(String[] args) throws IOException {
		InputStream input = null;
		DataInputStream dis = null;
		input = new FileInputStream("D:\\testout.txt");
		dis = new DataInputStream(input);
		int count = input.available();
		byte[] ary = new byte[count];
		
		dis.read(ary);
		dis.close();
		for (byte bt : ary) {
			char k = (char) bt;
			System.out.print(k + "-");
		}
	}

}
