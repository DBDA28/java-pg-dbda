package p2;

import p1.*;
public class Tester {
	public static void main(String[] args) {
		//direct referencing
		ConsolePrinter cp = new ConsolePrinter();
		cp.print("hello world");
		FilePrinter fp = new FilePrinter();
		fp.print("hello world");
		NetworkPrinter np = new NetworkPrinter();
		np.print("hello world");

		
	}//end of main

}//end of class Tester
