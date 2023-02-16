package com.createiq.example2;

import java.io.PrintWriter;

public class PrintWriterDemo {
	public static void main(String[] args) {
		PrintWriter writer=new PrintWriter(System.out);
		writer.print(125.90);
		writer.print(" createiq");
		writer.print(55);
		writer.print(11);
		writer.flush();
		System.out.println();
	}


}
