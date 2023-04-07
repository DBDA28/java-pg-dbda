package test_static;

import java.util.Scanner;
//import ALL static memebrs of the System class
import static java.lang.System.*;
import static java.lang.Math.sqrt;

public class Test1 {
	private int i;
	private static int j;
	// static init block
	static {
		out.println("in 1st static init block");
		//can access directly : ONLY static members
		j=100;
	//	i=100;
		showStatic();
		
	}
	static {
		out.println("in 2nd static init block");
	}

	// ctor
	public Test1(int i) {
		this.i = i;
	}

	// static method
	public static void showStatic() {
		// System.out.println("i="+i);
		out.println("j=" + j);
		// show();

	}

	// non static method
	public void show() {
		out.println("i=" + i);
		out.println("j=" + j);
		showStatic();
	}

	public static void main(String[] args) {
		out.println("in main");
		// System.out.println(this);
		// show();
		// create instance
		Test1 t1 = new Test1(1234);
		t1.show();
		Scanner sc = new Scanner(in);
		out.println("Enter a number to find sq root");
		double val = sqrt(sc.nextDouble());
		System.out.println("sqrt " + val);

		sc.close();

	}

}
