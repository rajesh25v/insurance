package com.iq;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileRead {
	public static void main(String[] args) throws IOException {
		try {
			FileInputStream raju=new FileInputStream("D:\\testout.txt");
			int value=0;
			while((value=raju.read())!=-1)
			{
				System.out.print((char)value);
			}
			raju.close();
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
	}

}
