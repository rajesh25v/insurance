package com.machindra.domain;

import java.util.Set;

public class User {

	private int userid;
	private String fname;
	private String lname;
	private String address;
	private Set<PhoneNumber> phoneNo;

	public Set<PhoneNumber> getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(Set<PhoneNumber> phoneNo) {
		this.phoneNo = phoneNo;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "User [userid=" + userid + ", fname=" + fname + ", lname=" + lname + ", address=" + address + "]";
	}

}
