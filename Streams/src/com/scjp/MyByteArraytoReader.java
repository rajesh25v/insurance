package com.scjp;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class MyByteArraytoReader {
	public static void main(String[] args) {
		String str="convert to input stream"+
	"\n and this is second line";
		byte[] content=str.getBytes();
		InputStream is=null;
		BufferedReader br=null;
		try {
			is=new ByteArrayInputStream(content);
			br=new BufferedReader(new InputStreamReader(is));
			String temp=null;
			while((temp=br.readLine()) != null) {
				 System.out.println(temp);
			}
			}catch(Exception e) {
				System.out.println(e);
			}
		}
}

