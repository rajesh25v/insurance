package com.array.IOstreams;

import java.io.DataOutputStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class DateOutStream1 {
	public static void main(String[] args) {
		
		try {
			FileOutputStream fos=new FileOutputStream("D:\\student11.txt");
			
			DataOutputStream data=new DataOutputStream(fos);
			
			data.writeFloat((float)101);
			data.flush();
			data.close();
		} catch (IOException e) {
	
			e.printStackTrace();
		}
		System.out.println("success .....");

	}

}
