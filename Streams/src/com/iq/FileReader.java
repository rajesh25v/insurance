package com.iq;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReader {
	public static void main(String[] args) throws IOException {
		FileInputStream f=new FileInputStream("D:\\testout.txt");
		int size=f.available();
		System.out.println("this number of available bytes: "+size);
		int n=size/10;
		for(int i=0;i<n;i++) {
			System.out.println((char)f.read());
		}
		
	}

}
