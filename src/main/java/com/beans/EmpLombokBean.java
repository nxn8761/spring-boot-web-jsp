package com.beans;

import java.io.Serializable;

import lombok.Data;


@Data
public class EmpLombokBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String eName;
	
	private int salary;
	
	
}
