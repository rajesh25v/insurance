package com.scjp;

import java.io.File;
import java.io.IOException;

public class DirectoryTest {
	public static void main(String[] args) throws IOException {
		int count=0;
		File f=new File("E:\\");
		String[] s=f.list();
		
		for(String s1:s) {
			count++;
			System.out.println(s1);
		}
		for(String s1:s) {
			File f1=new File(f,s1);
			if(f1.isFile()) {
				count++;
				System.out.println(s1);
			}
		}
		
		System.out.println("total number : "+count);
	}

}
