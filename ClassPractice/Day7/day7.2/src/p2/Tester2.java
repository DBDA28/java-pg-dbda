package p2;

import p1.*;
public class Tester2 {

	public static void main(String[] args) {
		Printer[] printers = {new ConsolePrinter(),new FilePrinter(),new NetworkPrinter()};
		
String[] mesgs= {"Raju","Shyam","BabuRao"};
int i=0;
for (Printer string : printers) {
	string.print(mesgs[i++]);
} 


	}//end of main

}//end of class Tester2
