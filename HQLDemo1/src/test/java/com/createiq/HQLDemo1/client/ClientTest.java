package com.createiq.HQLDemo1.client;

import java.util.List;

import javax.management.Query;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import com.createiq.HQLDemo1.Student;
import com.createiq.service.StudentserviceImpl;
import com.createiq.utility.SessionUtility;

public class ClientTest {
	
	public static void main(String[] args) {
		

	StudentserviceImpl imp=new StudentserviceImpl();
//	Student s1=new Student(102,"Hyd","Govardhan");
//	Student s2=new Student(101,"Delhi","Ramu");
//	Student s3=new Student();
//	s3.setName("Madhu");
//	s3.setAddress("Kolkatta");
//	s3.setId(13);
//	//imp.save(s1);
//	imp.update(s2);
//	imp.update(s3);
//1.
	System.out.println(imp.range(5,8).toString());
	System.out.println("getting table all student details:----");
//	2.
	System.out.println(imp.getAll().toString());
	//3.
//	imp.setName("Haritha",5);
	//4.
//	System.out.println("one row deleted:---"+imp.delete(4));
	System.out.println("successfully completed");
	
	//5.
	System.out.println("sorting asc name:---");
	System.out.println(imp.AscName("name"));
	//6.
	System.out.println(imp.projections("address"));
	imp.projections("id");
	
	}
}
