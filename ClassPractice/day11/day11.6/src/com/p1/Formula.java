package com.p1;

public interface Formula {
	double calculate(double a,double b);//public and abstract
	//public and concrete method
	default double sqrt(double a, double b) {
		System.out.println("in default method of i/f");
		return Math.sqrt((a*b));
	}

	static void show() {//public added implicitly
		System.out.println("in i/f static method");
	}

}
