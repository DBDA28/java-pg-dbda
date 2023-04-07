package maps;

public class Student {
	private String prn;
	private String name;
	private int marks;
	
	public Student(String prn, String name, int marks) {
		super();
		this.prn=prn;
		this.name=name;
		this.marks=marks;

	}

	@Override
	public String toString() {
		return "Student [prn=" + prn + ", name=" + name + ", marks=" + marks + "]";
	}

	public String getPrn() {
		return prn;
	}

	public void setPrn(String prn) {
		this.prn = prn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}
	

}
