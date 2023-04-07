package tester;

import inheritance.*;
import java.util.Scanner;

public class EventOrganizer {

	public static void main(String[] args) {
		// create Scanner
		Scanner sc = new Scanner(System.in);
		// create and array of refs to refer to student or faculty
		System.out.println("Enter the no of participants:");
		Person[] participants = new Person[sc.nextInt()];
		boolean exit=false;
		int counter = 0;
		while (!exit) {
			System.out.println(
					"1.Register Students 2. Register Faculty 3. Display details of all 4. Display specific participant details 0. Exit");
			switch (sc.nextInt()) {
			case 1: //Register students
				if(counter<participants.length) {
				System.out.println(
						"enter student details: firstname, lastname, age, rollno, course, fees, marks, gradYear");
				participants[counter++] = new Student(sc.next(), sc.next(), sc.nextInt(), sc.nextInt(), sc.next(),
						sc.nextDouble(), sc.nextInt(), sc.nextInt());
				System.out.println("Student registered");
				}
				else
					System.out.println("even is full!!");
				break;

			case 2: //Register faculty
				if(counter<participants.length) {
				System.out.println("enter faculty details: firstname, lastname, age, trainingExp, domain ");
				participants[counter++] = new Faculty(sc.next(), sc.next(), sc.nextInt(), sc.nextInt(), sc.next());
				System.out.println("faculty registered");
				}
				else
					System.out.println("event is full");
				break;

			case 3://Display details all
				System.out.println("all participants");
				for (Person p : participants) {
					System.out.println(p);
					if(p!=null)
						System.out.println(p); // run time poly: JVM resolvers the method binding here using the type of
												// the object(Student or a faculty)
				}
				break;

			case 4://Display specific participant details
				System.out.println("enter seat no");
                  int index=sc.nextInt()-1 ;
                  if(index>= 0 && index <counter) {
                	  System.out.println("printing specific participants details: ");
                	  System.out.println(participants[index]);//run time poly
                  }
                  else
                	  System.out.println("Invalid seat no!!!");

				break;

			case 0: //exit
				System.out.println("program terminated");
				exit = true;
				break;

			default:
				System.out.println("Invalid Input");
				break;
			}// end of switch-case

		} // end of while

		// close Scanner
		sc.close();

	}// end of main method

}// end class
