package com.buffer;

import java.io.File;
import java.io.FilenameFilter;

public class MyFilteredFilealist {
	public static void main(String[] args) {
		File file=new File("C:\\Users\\Vadla");
		File[] files=file.listFiles(new FilenameFilter() {
			
			@Override
			public boolean accept(File dir, String name) {
				return false;
			}
		});
		for(File f:files) {
			System.out.println(f.getName());
		}
	}

}
