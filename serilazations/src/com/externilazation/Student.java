package com.externilazation;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Student extends Person implements Externalizable {
	static String clgName;
	int fees;
	int mobileNo;
	public static String getClgName() {
		return clgName;
	}
	public static void setClgName(String clgName) {
		Student.clgName = clgName;
	}
	public int getFees() {
		return fees;
	}
	public void setFees(int fees) {
		this.fees = fees;
	}
	public int getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(int mobileNo) {
		this.mobileNo = mobileNo;
	}
	@Override
	public String toString() {
		return "Student [fees=" + fees + ", mobileNo=" + mobileNo + "]";
	}
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.write(this.getAge());
		out.writeObject(getClgName());
		
	}
	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
	setFees(in.read());
	
		
	}
	
	


}
