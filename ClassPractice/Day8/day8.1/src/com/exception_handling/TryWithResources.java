package com.exception_handling;

//try-with resources eliminates the use of finally block to close the resources.
import java.util.Scanner;
public class TryWithResources {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			System.out.println("Enter complete name");
			System.out.println("hello, "+sc.nextLine());// next line returns the line
			
			//JVM will automagically call: sc.close()
			//Why? Scanner Class implements: AutoCloseable i/f
			
		}//end of try block
	
	}//end of main
	
}//end of TryWithResources class
