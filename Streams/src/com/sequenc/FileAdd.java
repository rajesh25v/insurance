package com.sequenc;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;

public class FileAdd {
	public static void main(String[] args) throws Exception {
		FileInputStream f1=new FileInputStream("D:\\testout.txt");
		FileInputStream f2=new FileInputStream("E:\\streams\\files.txt");
		
		FileOutputStream fout=new FileOutputStream("D:\\FileAll.txt");
		SequenceInputStream sis=new SequenceInputStream(f1,f2);
		
		int j;
		while((j=sis.read())!=-1)
		{
			fout.write(j);
		}
		sis.close();
		fout.close();
		f2.close();
		f1.close();
		System.out.println("success.........");

	}

}
