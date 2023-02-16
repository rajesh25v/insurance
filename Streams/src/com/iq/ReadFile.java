package com.iq;

import java.io.FileInputStream;

public class ReadFile {
	public static void main(String[] args) {
		try {
			FileInputStream fis=new FileInputStream("D:\\testout.txt");
			int value=0;
			while((value=fis.read())!=-1)
			{
				System.out.print(value+" ");
			}
			fis.close();
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
