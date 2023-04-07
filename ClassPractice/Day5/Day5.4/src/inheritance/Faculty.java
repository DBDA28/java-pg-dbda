package inheritance;

public class Faculty extends Person {
	private int trainingExp;
	private String domain;

//add a ctor to init complete state of the Faculty
	public Faculty(String firstName, String lastName, int age, int exp, String domain) {
		super(firstName, lastName, age);
		System.out.println("in faculty ctor");
		trainingExp = exp;
		this.domain = domain;
	}
public String getDetails() {
		
		return "Faculty "+super.getDetails()+" Experenice "+trainingExp+" Domain "+domain;
	}
@Override
public String toString() {
	return "Faculty "+super.toString()+"[trainingExp=" + trainingExp + ", domain=" + domain + "]";
}
}
