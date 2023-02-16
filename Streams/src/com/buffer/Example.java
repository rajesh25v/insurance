package com.buffer;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import com.iq.FileRead;

public class Example {
	public static void main(String[] args) throws Exception {
		 BufferedReader br = null;
	        String strLine = "";
	        try {
	            br = new BufferedReader( new FileReader("cricket.txt"));
	            while( (strLine = br.readLine()) != null){
	                System.out.println(strLine);
	            }
	        } catch (FileNotFoundException e) {
	            System.err.println("Unable to find the file: fileName");
	        } catch (IOException e) {
	            System.err.println("Unable to read the file: fileName");
	        }
		
		
		
	}
}