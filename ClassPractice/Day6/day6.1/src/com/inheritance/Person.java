package com.inheritance;

public class Person {
	private String firstName, lastName;
	private int age;
	public Person(String firstName,String lastName,int age)
	{
		System.out.println("in person ctor");
		this.firstName=firstName;
		this.lastName=lastName;
		this.age=age;
	}
	//add overloaded def arg less ctor
//	public Person() {
//		// TODO Auto-generated constructor stub
//	}
	//add a method to get complete details

	//overridden method
	public String getDetails()
	{
		return " "+firstName+" "+lastName+" age="+age+" ";
	}
}
