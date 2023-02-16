package com.iq;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterTest {
	public static void main(String[] args) throws IOException {
		Writer w=new FileWriter("E:\\streams\\Files Prgrms");
	String content="i love india";
	w.write(content);
	w.close();
	System.out.println("done");
	
	}

}
