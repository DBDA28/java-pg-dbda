package com.tester;

import com.p1.*;
public class tester1 {
	public static void main(String[] args) {
		ConsolePrinter cp = new ConsolePrinter(); //direct referencing
		cp.print("hello console world");
		
		FilePrinter fp = new FilePrinter();
		fp.print("hello file printer world");
		
		NetworkPrinter np = new NetworkPrinter();
		np.print("hello network printer world");

	}//end of main method

}//end of tester class
