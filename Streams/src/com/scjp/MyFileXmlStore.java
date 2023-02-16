package com.scjp;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class MyFileXmlStore {
	public static void main(String[] args) throws IOException {
		
		 OutputStream os = null;
	        Properties prop = new Properties();
	        prop.setProperty("name", "java2novice");
	        prop.setProperty("domain", "www.java2novice.com");
	        prop.setProperty("email", "java2novice@gmail.com");
	        try {
	            os = new FileOutputStream("MyProp.xml");
	            prop.storeToXML(os, "Dynamic Property File");
	        } catch (FileNotFoundException e) {
	            e.printStackTrace();
	        }
	        File file = new File("MyProp.xml");
	        System.out.println(file.lastModified());
	    
	}

}