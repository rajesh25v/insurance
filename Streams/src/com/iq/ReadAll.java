package com.iq;

import java.io.FileInputStream;

public class ReadAll {
	 public static void main(String args[]){
		 try {
			 FileInputStream fis=new FileInputStream("D:\\testout.txt");
			 int value=fis.read();
			 System.out.println("reading a value in byte form: "+value);
			 
			 System.out.println((char)value);
			 fis.close();
			 
		 }catch(Exception e) {
			 System.out.println(e);
		 }
	         }    
	        }  

