package test;


import p1.Adder;
import p1.Computable;
import p1.Multiplier;

public class tester1 {

	public static void main(String[] args) {
		System.out.println(testCompute(20, 10, new Adder()));
		System.out.println(testCompute(20, 10, new Multiplier()));

	}
	//add static method to test any math operation.
	private static double testCompute(double a, double b, Computable ref) {

		return ref.compute(a, b);
	}

}
