package com.sequenc;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

public class InputVector {
	public static void main(String[] args) throws Exception {
		FileInputStream f1=new FileInputStream("D:\\testout.txt");
		FileInputStream f2=new FileInputStream("E:\\\\streams\\\\files.txt");
		FileInputStream f3=new FileInputStream("D:\\\\FileAll.txt");
		
		Vector v=new Vector();
		v.add(f1);
		v.add(f2);
		v.add(f3);
		Enumeration e=v.elements();
		
		SequenceInputStream bin=new SequenceInputStream(e);
		int i=0;
		while((i=bin.read())!=-1) {
			System.out.print((char)i);
		}
		bin.close();
		f1.close();
		f2.close();
		f3.close();
	}

}
