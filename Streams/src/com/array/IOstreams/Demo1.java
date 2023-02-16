package com.array.IOstreams;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Demo1 {
	public static void main(String[] args) throws Exception {
		FileOutputStream fout1=new FileOutputStream("D:\\student11.txt");
		FileOutputStream fout2=new FileOutputStream("D:\\student1.txt");
		
		ByteArrayOutputStream bot=new ByteArrayOutputStream();
		bot.write(110);
		bot.writeTo(fout1);
		bot.writeTo(fout2);
		
		bot.flush();
		bot.close();
		System.out.println("success..");
		
	
	}

}
