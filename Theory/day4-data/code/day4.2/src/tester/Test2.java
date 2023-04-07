package tester;

import inheritance.*;

public class Test2 {

	public static void main(String[] args) {
		Student s1 = new Student("Rama", "Kher", 24, 100, "PG-DBDA", 70000, 79, 2020);
		Faculty f1=new Faculty("Mihir", "Rao", 40, 14, "Banking, Security");
		System.out.println(s1.getDetails());
		System.out.println(f1.getDetails());
	}

}
