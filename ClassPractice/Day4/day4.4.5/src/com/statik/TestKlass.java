package com.statik;
import java.util.Scanner;
import static java.lang.Math.*;
public class TestKlass {
	private int i;
	private static int j; //static field
	
	static {
		//i=100;//can not initialize non static field in static initializer method
		j=100;
	}//end of static initializer box
	public TestKlass(int i) { //ctor can made for non-static fields only.
		this.i=i;
		
	}//end of ctor
	
	public static void showStatik() {
		//System.out.println(i);//can not call non static field 'i' form static method
		System.out.println(j);
	}
	
	public void show() {
		System.out.println(i);//we can access non staic field from non static method
		System.out.println(j);//we can access static field form non static method
	}
	
	public static void main(String[] args) {
		TestKlass t1 = new TestKlass(123);
		t1.show();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number to know the square root");
		double val = sqrt(sc.nextDouble());
		System.out.println("the square root: "+val);
		
	}

}//end of TestKlass
