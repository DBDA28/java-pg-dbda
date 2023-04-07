package inheritance;

public class Faculty extends Person {
	//additional state for Student class
	private int train;
	private String domain;
	

	public Faculty(String fname,String lname, int a,int train,String domain) {
		//invoke explicitly matching constructor of the super class.
		super(fname, lname, a);
		System.out.println("in the Faculty class");
		this.train=train;
		this.domain=domain;

	}


	
}
