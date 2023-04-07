package p2;

import p1.*;
public class Tester1 {

	public static void main(String[] args) {
		//indirect ref
		Printer p = new ConsolePrinter(); //interface type of ref, mem allocated on stack(local var), size if JVM dependent.
		//Interface ref can DIRECTLY (w/o type casting) refer to ANY imple class instance
		p.print("hello world");//run time poly: print() to be invoked on which object: is decided by JVM
		p=new NetworkPrinter();// upcasting
		p.print("xin chao");
		p=new FilePrinter();
		p.print("namaste");


	}//end of main

}//end of class Tester1
