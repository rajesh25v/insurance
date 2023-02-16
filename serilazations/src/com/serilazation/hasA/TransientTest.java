package com.serilazation.hasA;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TransientTest {
	public static void main(String[] args) {
		
		try {
			TriansientEx t1=new TriansientEx(101,"rajesh",25);

			FileOutputStream f = new FileOutputStream("f.txt");
			ObjectOutputStream ob=new ObjectOutputStream(f);
			ob.writeObject(t1);
			ob.flush();
			ob.close();
			f.close();
			System.out.println("success...");

		} catch (IOException e) {
		
			e.printStackTrace();
		}
		FileInputStream fi;
		try {
			fi = new FileInputStream("f.txt");
			ObjectInputStream oi=new ObjectInputStream(fi);
			TriansientEx s=(TriansientEx) oi.readObject();
			System.out.println(s.id+" "+s.name+" "+s.age);
			oi.close();
			
		} catch (IOException | ClassNotFoundException e) {
		
			e.printStackTrace();
		}
		
}
}