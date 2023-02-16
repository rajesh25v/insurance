package com.createiq.example2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class FileToByteArray {
	public static void main(String[] args) {
		String filename="D:\\testout.txt";
	InputStream is=null;
	try {
		is=new FileInputStream(filename);
		byte[] content=new byte[2*1024];
		int readCount=0;
		while((readCount=is.read(content))>0) {
			System.out.println(new String(content,0,readCount-1));
		}
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException i) {
			i.printStackTrace();
		}finally {
			try {
			if(is !=null)is.close();
		}catch(Exception ex) {
		}
	}
	}

}
