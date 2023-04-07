package inheritance;

public class Person {
	private String firstname, lastname;
	private int age;
	public Person(String firstname, String lastname, int age) {
		System.out.println("in the person class");
		this.firstname=firstname;
		this.lastname=lastname;
		this.age=age;
	}
	//add overloaded arg less constructor
	
	public String getDetails() {
		return "person"+" "+firstname+" "+lastname+" "+age;
	}

	
}
