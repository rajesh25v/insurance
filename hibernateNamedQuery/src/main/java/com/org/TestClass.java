package com.org;

import org.apache.log4j.Logger;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestClass {
	private static Logger LOGGER = Logger.getLogger(TestClass.class);

	// 1..CREATING TABLE IN SQL USING MAVEEN AND ANNOTATION
	public static void main(String[] args) throws Throwable {
		System.out.println("hibernate connection started");
		LOGGER.info("hibernate connection started");

		Course c1 = new Course();
		Subject s1 = new Subject("Java developer", "three months");
		Subject s2 = new Subject("html, css", "one month");
		Subject s3 = new Subject("python", "six months");
		Subject s4 = new Subject("Sql", "10 days");
		Subject s5 = new Subject("hibernate", "1 months");
		c1.getSubjects().add(s1);
		c1.getSubjects().add(s2);
		c1.setCname("Rajesh");
		c1.setFees(2500.1);

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		Session session = cfg.buildSessionFactory().openSession();
		LOGGER.info("session is created: " + session);
		Transaction tx = session.beginTransaction();
		LOGGER.info("session is created: " + tx);
		session.save(c1);
		session.save(s1);
		session.save(s2);
		session.save(s3);
		session.save(s4);
		session.save(s5);

		tx.commit();
		session.close();
		LOGGER.info("session is clsoed: " + session.isOpen());
	}
}
