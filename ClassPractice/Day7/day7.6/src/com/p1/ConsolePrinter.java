package com.p1;

public class ConsolePrinter implements Printer {
	
	public void print(String msg) {
		System.out.println("Printing message "+msg+" on the console");
		System.out.println("Printing speed "+SPEED);
	}//end of print method

}//end of ConsolePrinter
