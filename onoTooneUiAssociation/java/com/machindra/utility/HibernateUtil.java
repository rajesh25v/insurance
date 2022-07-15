package com.machindra.utility;

import javax.persistence.criteria.Selection;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	private static SessionFactory factory;
	private static Session ss = null;

	static {
		factory = new Configuration().configure("").buildSessionFactory();
	}

	public static Session getSession() {

		ss = factory.openSession();
		return ss;

	}

	public static void closeSession() {
		ss.close();
	}

	public static void closeSessionFactory() {
		factory.close();
	}

}
