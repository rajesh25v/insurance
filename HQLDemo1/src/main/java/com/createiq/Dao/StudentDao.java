package com.createiq.Dao;

import java.util.List;

import com.createiq.HQLDemo1.Student;

public interface StudentDao {

	public void save(Student st);

	public void update(Student st);
	
	public List getAll();
	
	public List getRange(int a,int b);
	
	public int setName(String name,int id);
	
	public int delete(int id);
	
	public List AscName(String name);
	
	public List projections(String column);
	
}
