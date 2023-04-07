package com.tester;

import com.p1.*;
public class tester3 {
	public static void main(String[] args) {
		Printer[] printers = {new ConsolePrinter(),new FilePrinter(), new NetworkPrinter()};
		String[] messages = {"hello console world", "hello file printer world", "hello network printer world"};
		int i=0;
		for(Printer p : printers ) {
			p.print(messages[i++]);
		}//end of for loop
		
	}//end of main method

}//end of tester3
