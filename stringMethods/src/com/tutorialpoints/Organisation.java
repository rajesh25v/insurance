package com.tutorialpoints;

public class Organisation {
	private String org_name;
	private String dept;
	private int id;
	public String getOrg_name() {
		return org_name;
	}
	public void setOrg_name(String org_name) {
		this.org_name = org_name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Organisation [org_name=" + org_name + ", dept=" + dept + ", id=" + id + "]";
	}
	
	
	

}
