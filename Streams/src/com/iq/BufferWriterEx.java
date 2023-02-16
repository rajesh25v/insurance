package com.iq;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriterEx {
	public static void main(String[] args) {
		try {
			FileWriter writer=new FileWriter("cricket.txt");
			BufferedWriter buffer=new BufferedWriter(writer);
			buffer.write("welcome to java tpoint");
			buffer.close();
			System.out.println("success...");
		
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}

}
