package com.tcp.study;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;

public class Student {
	private int stNumber;
	private String major;

	public Student(int stNumber, String major) {
		this.stNumber = stNumber;
		this.major = new String(major);
	}

	public int getStNumber() {
		return stNumber;
	}

	public void setStNumber(int stNumber) {
		this.stNumber = stNumber;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (!(obj instanceof Student))
			return false;

		Student st = (Student) obj;
		return Objects.equal(major, st.major) && Objects.equal(stNumber, st.stNumber);
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hashCode(stNumber,major);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return MoreObjects.toStringHelper(this).add("stNumber", stNumber).add("major", major).toString();
	}

}
