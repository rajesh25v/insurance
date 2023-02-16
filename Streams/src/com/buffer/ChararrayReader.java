package com.buffer;

import java.io.CharArrayReader;
import java.io.IOException;

public class ChararrayReader {
	public static void main(String[] args) throws IOException {
		char[] ary= {'r','a','j','j','f'};
		CharArrayReader rd=new CharArrayReader(ary);
		int k=0;
		while((k=rd.read())!=-1) {
			char ch=(char)k;
			System.out.println(ch);
			System.out.println(k);
		}
		
		
	}

}
