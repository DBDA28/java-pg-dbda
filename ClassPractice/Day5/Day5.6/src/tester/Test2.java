package tester;

import inheritance.*;

public class Test2 {

	public static void main(String[] args) {
		//when type of the ref is same as type of instance: direct referencing
		//Student type of ref(s1) ---> Student cls instance
		Student s1 = new Student("Rama", "Kher", 24, 100, "PG-DBDA", 70000, 79, 2020);
		Faculty f1=new Faculty("Mihir", "Rao", 40, 14, "Banking, Security");
		System.out.println(s1.getDetails());
		System.out.println(f1.getDetails());
		System.out.println(s1);//Implicitly calls toString method of object class `Sytem.out.println(s1.toString)`
		System.out.println(f1);
		Person p;//created person type of the ref
		p=s1;//upcasting: javac does it implicitly: Student Is-A Person: extends
		System.out.println(p);
	}

}
