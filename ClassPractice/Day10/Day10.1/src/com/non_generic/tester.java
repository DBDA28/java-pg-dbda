package com.non_generic;

public class tester {
	public static void main(String[] args) {
		//create holder class instance to hold: int
		Holder h1 = new Holder(1234);//int --> Integer --> Object
		int data = (int)h1.getRef();//to access data, explicit down casting is required
		System.out.println(data);
		//create Holder class instance to hold a literal string: "hello"
		Holder h2 = new Holder("hello");//String --> Object: upcasting
		String s = (String) h2.getRef();
		System.out.println(s);
		h1=h2;
		data = (Integer)h1.getRef();//ClasscastException
		System.out.println("main over");

	}//end of main

}//end of tester Class
