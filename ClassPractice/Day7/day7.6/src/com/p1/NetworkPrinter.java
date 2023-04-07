package com.p1;

public class NetworkPrinter implements Printer {
	
	public void print(String msg) {
		System.out.println("Printing message "+msg+" on the network printer");
		System.out.println("Printing speed "+SPEED);
	}//end of print method

}//end of NetworkPrinter class
