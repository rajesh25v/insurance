package com.createiq.example2;

import java.io.File;
import java.io.FilenameFilter;

public class MyfileFilter {
	public static void main(String[] args) {
		File file=new File("D:\\");
		String[] s=file.list(new FilenameFilter() {
			
			@Override
			public boolean accept(File dir, String name) {
				
			if(name.toLowerCase().endsWith(".pdf")) {
				return true;
			}else {
				return false;
			}
		}
	});
		for(String f:s) {
			System.out.println(f);
		}
	}

}
