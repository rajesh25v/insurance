package com.org;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class Subject {
	@Id
	@GeneratedValue
	int sid;
	String subName;
	String period;
	@ManyToOne
	@JoinColumn
	private Course course;
	
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	public Subject(String subName, String period) {
		super();
		this.subName = subName;
		this.period = period;
	}
	public String getSubName() {
		return subName;
	}
	public void setSubName(String subName) {
		this.subName = subName;
	}
	public String getPeriod() {
		return period;
	}
	public void setPeriod(String period) {
		this.period = period;
	}
	@Override
	public String toString() {
		return "Subject [subName=" + subName + ", period=" + period + "]";
	}
	
	

}
