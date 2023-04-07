import java.util.Scanner;
public class Customer {
	private String name;
	private String email;
	private int age;
	private double cred;

	public String getDetails()
	{
		return this.name+" "+this.email+" "+this.age+" "+this.cred;
	}
	
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Customer c1 = new Customer();
	System.out.println("enter the name");
	c1.name=sc.next();
	System.out.println("enter the email");
	c1.email=sc.next();
	System.out.println("enter the age");
	c1.age=sc.nextInt();
	System.out.println("enter the credit");
	c1.cred=sc.nextDouble();
	System.out.println(c1.name+" "+c1.email+" "+c1.age+" "+c1.cred);
	
}
}

