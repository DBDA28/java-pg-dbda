package inheritance;

public class Student extends Person {
//additional state
	private int rollNo;
	private String enrolledCourse;
	private double fees;
	private int marks;
	private int gradYear;

	public Student(String fName, String lName, int age, int rollNo, String course, 
			double fees, int marks,
			int gradYear) {
       //invoke explicitly MATCHING ctor of the super class
		super(fName,lName,age);
		System.out.println("in student ctor");
		this.rollNo=rollNo;
		enrolledCourse=course;
		this.fees=fees;
		this.marks=marks;
		this.gradYear=gradYear;
	}
	//add a modified form of the getDetails method: to get Complete details of student
	//method overriding: run time Polymorphism
	//Polymorphism=> multiple or changing forms of the behavior
	//2 form of Poly: compile time (static) vs run time Poly (dynamic)
	//Rules:same method name, method args: same, ret type:same
	public String getDetails() {
		
		return "Student "+super.getDetails()+" roll no "+rollNo+" Enrollment Course "+enrolledCourse+" fee "+fees+" marks "+marks+" graduated in "+gradYear;
	}
	
}
