package com.mahindra.Test;

import com.machindra.dao.OneToManyDao;
import com.machindra.dao.OneToManyFactory;
import com.machindra.utility.HibernateUtil;

public class oneToManyTest {

	public static void main(String[] args) {

		OneToManyDao dao = null;
		dao = OneToManyFactory.getInstance();
		dao.saveData();
		HibernateUtil.closeSession();
		HibernateUtil.closeSessionFactory();
		System.out.println("wellcome");
	}
}
