package com.generic;

public class tester {
	public static void main(String[] args) {
		Holder<Integer> h1 = new Holder<Integer>(1234);//int --> Integer: auto boxing
		int data = h1.getRef();//no need to explicit down casting, only conversion Integer --> int: auto un-boxing
		System.out.println(data);
		//create holder class instance to hold the String
		Holder<String> h2 = new Holder<String>("hello");//no implicit conversion
		String s = h2.getRef();
		System.out.println(s);
		//h1=h2;//javac error: since h1: Holder<Integer> ==> totally incompatible Holder<String>
				

	}//end of main

}//end of tester Class
