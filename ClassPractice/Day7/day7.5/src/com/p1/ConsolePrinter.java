package com.p1;

public class ConsolePrinter implements Printer {
	
	public void print(String somemsg) {

		System.out.println("Printing message "+somemsg+" on the console");
	}//end of print method

}//end of ConsolePrinter class
