package com.tester;
import java.util.InputMismatchException;
import java.util.Scanner;
import com.needforspeed.DurghatnaSeDerBhali;
import com.utils.PolsAaGayi;
public class tester {

//	public static void main(String[] args) throws DurghatnaSeDerBhali { //without catch program aborts no printing main over
	public static void main(String[] args)  {
		try(Scanner sc =  new Scanner(System.in)){
			System.out.println("Enter the speed");
			PolsAaGayi.validateSpeed(sc.nextInt());
		}//end of try-with resources
		catch(DurghatnaSeDerBhali e) {
			System.out.println("error");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		catch(InputMismatchException e) {
			System.out.println("error");
		}
		System.out.println("main over");

	}//end of main

}//end tester class
