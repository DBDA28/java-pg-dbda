package inheritance;

public class Student extends Person {
	//additional state for Student class
	private int gradYear;
	private String course;
	private int fees;
	private int marks;

	
	public Student(String fname,String lname, int a,int gradYear,String course, int fees, int marks) {
		//invoke explicitly matching constructor of the super class.
		super(fname, lname, a);
		System.out.println("in the student class");
		this.gradYear=gradYear;
		this.course=course;
		this.fees=fees;
		this.marks=marks;

	}
	public String getDetails() {
		return " "+gradYear+" "+course+" "+fees+" "+marks;
	}

	public String getCompleteStudent() {
		return "person"+" "+super.getDetails()+s1.getDetails();
	}

}
