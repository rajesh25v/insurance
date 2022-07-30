package com.createiq.service;

import java.util.List;

import com.createiq.HQLDemo1.Student;

public interface studentService {

	public void save(Student st);

	public void update(Student st);

	public int setName(String name, int id);

	public int delete(int sid);
	
	public List AscName(String name);
	
	public List projections(String column);

}
