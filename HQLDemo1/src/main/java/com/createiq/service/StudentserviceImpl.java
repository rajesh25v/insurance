package com.createiq.service;

import java.util.List;

import com.createiq.Dao.StudentDao;
import com.createiq.Dao.StudentDaoimpl;
import com.createiq.HQLDemo1.Student;

public class StudentserviceImpl implements studentService {

	static StudentDao dao = new StudentDaoimpl();

	@Override
	public void save(Student st) {
		dao.save(st);

	}

	@Override
	public void update(Student st) {
		dao.update(st);

	}
	public static List getAll() {
		
		List l=dao.getAll();
		return l;
	}
	public static List range(int a,int b) {
		List l=dao.getRange(a, b);
		return l;
	}

	@Override
	public int setName(String name,int id) {
		
		int l=dao.setName(name, id);
		return l;
	}

	@Override
	public int delete(int sid) {
		
		int d=dao.delete(sid);
		return d;
	}

	@Override
	public List AscName(String name) {
	List l=dao.AscName(name);
		return l;
	}

	@Override
	public List projections(String column) {
		List l=dao.projections(column);
		return l;
	}
	

}
