package com.tester;

import com.p1.*;

public class tester2 {
	public static void main(String[] args) {

		Printer p = new ConsolePrinter(); // indirect referencing
		p.print("hello Console world");// JVM resolves the method print binding by the instance of ConsolePrinter.
										// Runtime polymorphism | dynamic dispatch method | dynamic binding | late binding

		p = new FilePrinter();//upcasting
		p.print("hello file printer world ");
		
		p = new NetworkPrinter();//upcasting
		p.print("hello network printer world");

	}//end of main method

}//end of tester2 class
