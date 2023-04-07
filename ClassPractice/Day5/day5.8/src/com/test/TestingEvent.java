package com.test;

import com.event.*;
import java.util.Scanner;

public class TestingEvent {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// create array of references to refer to student or faculty
		System.out.println("enter the no of participants");
		Person[] participants = new Person[sc.nextInt()];// array of references
		boolean exit = false;
		int counter = 0;
		while (!exit) {
			System.out.println(
					"1. reg student| 2.reg faculty | 3. display all details | 4. display specific details | 0. exit");
			switch (sc.nextInt()) {
			case 1:// register student
				if (participants.length > counter) {
					System.out.println("enter student details: firstname, lastname, age, rollno, course, cgpa");
				participants[counter++] = new Students(sc.next(), sc.next(), sc.nextInt(), sc.nextInt(), sc.next(),
						sc.nextInt());
				System.out.println("student registered");
				} else
					System.out.println("event if full");
				break;

			case 2:// register faculty
				if (counter < participants.length) {
					System.out.println("enter faculty details: firstname, lastname, age, exp_in_years, domain");
					participants[counter++] = new Faculty(sc.next(), sc.next(), sc.nextInt(), sc.nextInt(), sc.next());
					System.out.println("faculty registered");
				} else
					System.out.println("event is full");
				break;
			case 3://display all details
				for(Person p : participants) {
					System.out.println(p);
				}
				break;
			case 4:
				break;
			case 0:
				System.out.println("program terminated");
				exit = true;
				break;
			default:
				System.out.println("Invalid input");
				break;
			}//end of switch-case

		}//end of while

	}// end of main

}// end of class TestingEvent
