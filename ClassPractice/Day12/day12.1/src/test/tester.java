package test;

import p1.Adder;
import p1.Multiplier;

public class tester {

	public static void main(String[] args) {
		Adder a = new Adder();
		System.out.println(a.compute(20, 5));
		//multiply
		Multiplier m = new Multiplier();
		System.out.println(m.compute(11, 12));

	}
}	