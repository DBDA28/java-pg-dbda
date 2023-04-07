package test_static;

import java.util.Scanner;
//import All static members of the System class
import static java.lang.System.*;
import static java.lang.Math.*;

public class Test1 {
	private int i;
	private static int j;
	//static initializer block. Static initializer block is called before main method.
	static {
		System.out.println("In 1st static init block");
	    //can access directly: Only Static member
		j=100;
		//i=21;//can not initialize non static member.
		ShowStatic();
	}
	static {
		System.out.println("In 2nd static init block");
	}
	
	
	public Test1(int i) {
		//super();//making a call to immediate super class ctor.
		this.i = i;
	}//end of ctor
	
	public static void ShowStatic() {
		//System.out.println("i="+i);//can not access non static member from a static method.
		System.out.println("i="+j);
	}
	public void show() {
		System.out.println("i="+i);
		System.out.println("i="+j);
		ShowStatic();

	}

	public static void main(String[] args) {
		//System.out.println(this);// can not access this in static method
		Test1 t1 = new Test1(1234);
		
		Scanner sc = new Scanner(in);
		
		
		

	}//end of main

}
