package com.p1;

public class MyFormula2 implements Formula {

	@Override
	public double calculate(double a, double b) {
		System.out.println("abstract method implementaion: substraction");
		return a-b;
	}

	@Override
	public double sqrt(double a, double b) {
		System.out.println("overridding default method");
		return Math.sqrt(a-b);
	}
	
	

}
