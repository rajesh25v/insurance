package com.iq;

import java.io.FileNotFoundException;
import java.io.FileReader;
public class FileReaderE {
	public static void main(String[] args) throws Exception  {
	
		 FileReader fr=new FileReader("D:\\testout.txt");    
         int i;    
         while((i=fr.read())!=-1)    
         System.out.print((char)i);    
         fr.close();
		
	}
}
