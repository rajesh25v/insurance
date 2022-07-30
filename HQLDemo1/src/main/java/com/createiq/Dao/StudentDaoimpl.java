package com.createiq.Dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;

import com.createiq.HQLDemo1.Student;
import com.createiq.utility.SessionUtility;

public class StudentDaoimpl implements StudentDao {

	@Override
	public void save(Student st) {
		Session session = SessionUtility.getSession();
		session.save(st);
		session.beginTransaction().commit();
		session.close();
		SessionUtility.closeSession(session);

	}

	@Override
	public void update(Student st) {
		Session session = SessionUtility.getSession();
		session.update(st);
		session.beginTransaction().commit();
		session.close();

	}
	@Override
	public List getAll() {
		Session session=SessionUtility.getSession();
		session.beginTransaction();
		Query query=session.createQuery("from Student");//here persistent class name is Emp  
		List list=query.list();
		session.close();
		return list;  
	}

	@Override
	public List getRange(int a, int b) {
		
		Session session=SessionUtility.getSession();
		session.beginTransaction();
		Query query=session.createQuery("from Student");  
		query.setFirstResult(a);  
		query.setMaxResults(b);  
		List list=query.list();//will return the records from a to b number  
		session.close();
		return list;
	}
	public int setName(String name,int id) {
	
		Session session=SessionUtility.getSession();
		Transaction tr=session.beginTransaction();
		
		//Belove query Student is the Entity class name. not a table name
		Query q=session.createQuery("update Student set name=:n where id=:i");
		q.setParameter("i",id);
		q.setParameter("n",name);
		int status=q.executeUpdate();
		System.out.println(status);
		tr.commit();
		
		return status;
		
	}

	@Override
	public int delete(int sid) {
		
		Session session=SessionUtility.getSession();
		Query q=session.createQuery("delete from Student where id=:id");
		q.setParameter("id", sid);
		
		return q.executeUpdate();
		
	}

	@Override
	public List AscName(String name) {
		Session session=SessionUtility.getSession();
		Criteria c=session.createCriteria(Student.class);
		c.addOrder( Order.asc(name));
		List l=c.list();
		
		return l;
	}

	@Override
	public List projections(String column) {
		
		Session session=SessionUtility.getSession();
		Criteria c=session.createCriteria(Student.class);
		c.setProjection(Projections.property(column));
			List l=c.list();
		return null;
	}
	
	
	

}
