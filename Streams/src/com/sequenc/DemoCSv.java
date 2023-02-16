package com.sequenc;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class DemoCSv {
	public static void main(String[] args) {
		FileReader fr=null;
		BufferedReader br=null;
		try {
			fr=new FileReader("D:\\employee.csv");
			br=new BufferedReader(fr);
			String line=null;
			while((line=br.readLine())!=null) {
				System.out.println(line);
			}
			
		}catch(Exception fn) {
			System.out.println(fn);
		}
	}

}
