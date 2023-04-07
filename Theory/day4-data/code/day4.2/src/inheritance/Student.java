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
}
