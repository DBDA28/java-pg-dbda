package com.p1;

public class MyFormula implements Formula {

	@Override
	public double calculate(double a, double b) {
		System.out.println("abstract method implementaion");
		//how to access a static method from the implementation class?
		Formula.show();
		return a+b;
	}
	
	//@Override
	public static void show() {
		System.out.println("in class's static method");
		
	}
	

}
