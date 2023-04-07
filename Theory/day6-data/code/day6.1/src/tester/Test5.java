package tester;

import inheritance.Faculty;
import inheritance.Person;
import inheritance.Student;

public class Test5 {

	public static void main(String[] args) {
		Person p = new Student("Rama", "Kher", 24, 100, "PG-DBDA", 70000, 79, 2020);//up casting
		System.out.println(p);
		
	//	p.study();//javac err : javac resolves the method binding by the type of ref :Person
		//Person class DOES NOT have the study()
		//explicit down casting is required to satisfy javac
		((Student)p).study();
	//	((Faculty)p).teach();//no javac err , run time err : ClassCastException : Student can't be cast to Faculty
		
		p = new Faculty("Mihir", "Rao", 40, 14, "Banking, Security");//up casting
		System.out.println(p);
		//invoke teach method on this faculty
	//	p.teach();
		((Faculty)p).teach();//down casting
		((Student)p).study();//no javac err BUT run time err : java.lang.ClassCastException
		//reason : Faculty can not be cast to a Student

	}

}
