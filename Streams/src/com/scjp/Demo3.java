package com.scjp;

import java.io.File;

public class Demo3 {
	public static void main(String[] args) {
		int count=0;
		File f=new File("E:\\");
		String[] s3=f.list();
		
		for(String a:s3) {
			File f2=new File(f,a);
			if(f2.isDirectory()) {
				count++;
				System.out.println(a);
			}
			 System.out.println("total number :"+count);
			
		}
		
	}

}
