package com.org;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Course {
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	int sid;
	String sname;
	double fees;
	@OneToMany(mappedBy = "course")
	private Collection<Subject> subjects=new ArrayList<Subject>();
	
	
	public Course() {
		super();
	}


	public Collection<Subject> getSubjects() {
		return subjects;
	}


	public void setSubjects(Collection<Subject> subjects) {
		this.subjects = subjects;
	}


	public Course(int cid, String cname, double fees) {
		super();
		this.sid = cid;
		this.sname = cname;
		this.fees = fees;
	}


	public int getCid() {
		return sid;
	}


	public void setCid(int cid) {
		this.sid = cid;
	}


	public String getCname() {
		return sname;
	}


	public void setCname(String cname) {
		this.sname = cname;
	}


	public double getFees() {
		return fees;
	}


	public void setFees(double fees) {
		this.fees = fees;
	}


	@Override
	public String toString() {
		return "Course [cid=" + sid + ", sname=" + sname + ", fees=" + fees + "]";
	}
	
	

}
