package com.sequenc;

import java.io.*;

public class InputStreamEx {
	public static void main(String[] args) throws Exception {
		FileInputStream in=new FileInputStream("D:\\testout.txt");
		FileInputStream in2=new FileInputStream("D:\\testout.txt");
		
		
		SequenceInputStream inst=new SequenceInputStream(in, in2);
		int j;
		while((j=inst.read())!=-1){
			System.out.print((char)j);
			
		}
		inst.close();
		in.close();
		in2.close();
		System.out.println("success....");
	}

}
