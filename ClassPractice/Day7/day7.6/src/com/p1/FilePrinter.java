package com.p1;

public class FilePrinter implements Printer {
	
	public void print(String msg) {
		System.out.println("Printing message "+msg+" on the file printer");
		System.out.println("Printing speed "+SPEED);
	}//end of print method
	
	public void openFile(String filename) {
		System.out.println("opening file"+filename);
	}
	public void closeFile(String filename) {
		System.out.println("closing file"+filename);
	}

}//end of FilePrinter class
