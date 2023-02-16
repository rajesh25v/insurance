package com.serilazation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Student extends Person{
	static String course;
	static int fee;
	
	Student(int id, String name,String course,int fee,String address) {
		super(id, name);
	 this.course=course;
	 this.fee=fee;
	}
	public static void main(String[] args) throws ClassNotFoundException {
		Student s1=new Student(101,"rajesh","EEE",12000,"hyderabad");
		
		try {
			FileOutputStream fout = new FileOutputStream("student.ser");
			ObjectOutputStream out=new ObjectOutputStream(fout);
			out.writeObject(s1);
			out.flush();
			out.close();
			 System.out.println("success..");
			 
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		ObjectInputStream in;
		try {
			in = new ObjectInputStream(new FileInputStream("student.ser"));
			Student s=(Student) in.readObject();
			
			System.out.println(s.id+" "+s.name+" "+s.course+" "+s.fee);
			in.close();
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		
	}
	
	
	

}
