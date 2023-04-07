package inheritance;
//import inheritance.*;
public class Tester {

	public static void main(String[] args) {
		Student s1 = new Student("Ram","Bo",24,1947,"PG-DAI",160000,100);
		Faculty f1 = new Faculty("Bo","Bo",24,10,"AI");
		System.out.println(s1.getDetails());
		System.out.println(f1.getDetails());

	}

}
