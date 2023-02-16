package com.createiq.example2;

import java.io.File;

public class MyFileOperations {
	public static void main(String[] args) {
		try {
	File file=new File("D:\\ioStreamsfile\\datainputstream.txt");
	System.out.println(file.canRead());
	System.out.println(file.canWrite());
	System.out.println(file.createNewFile());
	System.out.println(file.delete());
	System.out.println(file.exists());
	System.out.println(file.getAbsolutePath());
	System.out.println(file.isDirectory());
	System.out.println(file.isHidden());
	System.out.println(file.list());
		}catch(Exception e) {
			System.out.println(e);
		}
		 System.out.println("get folder list of files: ");
		File file=new File("D:\\sorting");
		String[] filelist=file.list();
		for(String name : filelist) {
			 System.out.println(name);
		}
	}

}
