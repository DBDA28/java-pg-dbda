package com.event;

public class Faculty extends Person {
	
	//fields
	private int exp_in_years;
	private String domain;
	
	public Faculty(String firstname, String lastname, int age, int exp_in_years, String domain) {
	super(firstname, lastname, age);
	this.exp_in_years=exp_in_years;
	}//end of ctor

}//end of class Faculty
