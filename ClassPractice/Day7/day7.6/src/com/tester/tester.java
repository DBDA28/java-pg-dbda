package com.tester;

import com.p1.*;

public class tester {
	public static void main(String[] args) {
		System.out.println("Printing the constant field of i/f " + Printer.SPEED);
		Printer[] printers = { new ConsolePrinter(), new FilePrinter(), new NetworkPrinter() };
		String[] msg = { "msg1", "msg2", "msg3" };
		int i = 0;
		for (Printer p : printers) {
			if (p instanceof FilePrinter) {
				((FilePrinter) p).openFile("tmp.txt"); // type-casting
				((FilePrinter) p).closeFile("tmp.txt"); // type-casting
				p.print(msg[i++]);
			} else
				p.print(msg[i++]);
		}

	}// end of main

}// end of tester class
