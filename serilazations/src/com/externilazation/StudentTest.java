package com.externilazation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class StudentTest {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		FileOutputStream fos;
		try {
			fos = new FileOutputStream("studentExternalizable.ser");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			Student s1=new Student();
			s1.name="ramu";
			s1.age=26;
			s1.fees=25000;
			s1.mobileNo=96453213;
			s1.place="hyderabad";
			oos.writeObject(s1);
			System.out.println("success..");
			oos.close();
			
		
		} catch (IOException e) {
	
			e.printStackTrace();
		}
		ObjectInputStream obi=new ObjectInputStream(new FileInputStream("studentExternalizable.ser"));
		obi.readObject();
		System.out.println(obi);
		obi.close();
	}

}
