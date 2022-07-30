package com.createiq.utility;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionUtility {
	private static SessionFactory sf = null;
	static {
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		sf = configuration.buildSessionFactory();
	}

	public static Session getSession() {
		Session ses = sf.openSession();

		return ses;

	}

	public static void closeSession(Session session) {
		if (session != null) {
			session.close();
		}
	}

}
