package com.sequenc;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataInputStreamEx {
	public static void main(String[] args) throws IOException {
		String filepath="D:\\ioStreamsfile\\datainputstream.txt";
		FileOutputStream fos=new FileOutputStream(filepath);
		DataOutputStream dos=new DataOutputStream(fos);
		dos.write(12);
		dos.writeBoolean(false);
		dos.writeChar('V');
		dos.writeDouble(125.01);
		dos.writeUTF(" wellcome to java world");
		System.out.println("successfull");
		dos.close();
		fos.close();
		
		FileInputStream fis=new FileInputStream( filepath);
		DataInputStream dis=new DataInputStream(fis);
		System.out.println(dis.read());
		System.out.println(dis.readBoolean());
		System.out.println(dis.readChar());
		System.out.println(dis.readDouble());
		
		dis.close();
		fis.close();
	
	}

}
