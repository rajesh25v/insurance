package com.buffer;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class BufferWriter {
	public static void main(String[] args) throws Exception {
		File file=new File("person.txt");
		BufferedWriter writer=new BufferedWriter(new FileWriter(file));
		Person p1=new Person(100,"rajesh");
		
		writer.close();
		
	}

}
