package com.serilazation;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Writer;

import org.json.JSONObject;

public class Student2 {
	

//		 public static void main(String[] args) throws IOException {
//			
//
//			FileOutputStream fos = new FileOutputStream("student.ser");
//			ObjectOutputStream oos = new ObjectOutputStream(fos);
//			Student1 s1 = new Student1(100, "anil", 15000.00, "anil@gmail.com");
//			oos.writeObject(s1);
//			oos.flush();
//
//			System.out.println(s1);
//		}
			public static void serializationTest() throws IOException {
				FileOutputStream fos = new FileOutputStream("student.ser");
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				Student2 s1 = new Student2();
				oos.writeObject(s1);
				System.out.println(s1);
			}

			public static void deserialization() throws IOException, ClassNotFoundException {
				FileInputStream fis = new FileInputStream("student.ser");
				ObjectInputStream ois = new ObjectInputStream(fis);
				Student2 student = (Student2) ois.readObject();
				System.out.println(student);

			}

			public static void main(String[] args) throws IOException, ClassNotFoundException {
//				deserialization();
				Student2 s1 = new Student2();
				JSONObject jsonObject = new JSONObject(s1);
				Writer writer = new FileWriter("student.json");
				System.out.println(jsonObject);
				writer.write(s1.toString().toCharArray());
				writer.flush();
				jsonObject.write(writer);

			}



	}	