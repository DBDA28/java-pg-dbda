package com.event;

public class Person {
	//fields
	private String firstname, lastname;
	private int age;
	
	public Person(String firstname, String lastname, int age) {
		this.firstname=firstname;
		this.lastname=lastname;
		this.age=age;
	}//end of ctor
	
	public String getFirstName(){
		return firstname;
	}//end of name getter
	
	public String getDetails() {
		return this.firstname+" "+this.lastname+" "+this.age;
	}

	



}//end of class Person
