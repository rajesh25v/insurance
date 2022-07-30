package com.machindra.onoTooneUiAssociation.dao;



import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.machindra.domain.PhoneNumber;
import com.machindra.domain.User;
import com.machindra.utility.HibernateUtil;

public class OneToManyDao implements OntoToMany{

	@Override
	public void saveData() {
		Session ses=null;
		User user=null;
		PhoneNumber phone1=null,phone2=null;
		Set<PhoneNumber> set=null;
		Transaction tx=null;
		ses=HibernateUtil.getSession();
		user=new User();
		
		user.setUserid(100);
		user.setFname("vadlamudi");
		user.setLname("Rajesh");
		user.setAddress("Guntakal");
		
		phone1=new PhoneNumber();
		phone1.setPhonenumber(99621L);
		phone1.setPhonenumberType("bussiness");
		phone1.setProvider("aritel");
		
		phone2=new PhoneNumber();
		phone2.setPhonenumber(98221L);
		phone2.setPhonenumberType("commercial");
		phone2.setProvider("jio");
		
		set=new HashSet<>();
		set.add(phone1);
		set.add(phone2);
		user.setPhoneNo(set);
		try {
		 tx=ses.beginTransaction();
		ses.save(user);
		tx.commit();
		System.out.println("object saved success");
	}catch(Exception e) {
		e.printStackTrace();
		tx.rollback();
		System.out.println("object are not saved");
	}
	}
}
