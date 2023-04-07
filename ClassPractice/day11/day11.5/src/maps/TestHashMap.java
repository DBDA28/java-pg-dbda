package maps;

import java.util.HashMap;

public class TestHashMap {

	public static void main(String[] args) {
		// create empty HashMap to store student details: default constructor
		HashMap<String, Student> students = new HashMap<>();// size=0, init capacity=16
		// to add the entry in the map
		// Map API: public V put(K,V): inserts new entry --returns null
		// in case of dup key -- replaces old value by new val and returns -- old value

		Student[] studentArr = { new Student("dbda-001", "Rama", 78), new Student("dbda-009", "Rama", 78),
				new Student("dbda-004", "jaya", 8), new Student("dbda-003", "sushma", 78),
				new Student("dbda-005", "nirma", 7), new Student("dbda-001", "dudh", 79),
				new Student("dbda-004", "saphedi", 70), };
		// populate the map using for-each
		for (Student s : studentArr)
			System.out.println("put returns" + students.put(s.getPrn(), s));
		for (Student s : students.values())
			System.out.println(s);

	}// end of main

}// end of TestHashMap class
