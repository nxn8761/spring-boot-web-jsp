package com.beans;

import java.io.Serializable;

public class EmpBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int empAge;
	
	private String empName;

	public int getEmpAge() {
		return empAge;
	}

	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
}