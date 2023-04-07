package com.event;

public class Students extends Person {
	
	//fields
	private int rollno;
	private String course;
	private int cgpa;
	
	public Students(String firstname, String lastname, int age, int rollno, String course, int cgpa) {
		super(firstname, lastname, age);
		this.rollno=rollno;
		this.course=course;
		this.cgpa=cgpa;
		
	}//end of ctor
	
	public String getDetails() {
		return super.getDetails()+this.rollno+" "+this.course+" "+this.cgpa;
	}


}//end of class Students
