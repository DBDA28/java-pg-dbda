import java.util.Scanner;
public class EmployeeID {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter emp id,fname, lname, salary ,permanent,dept name");
		System.out.printf("Emp Id %d FullName %s %s Salary %.3f " + "Is Permanent %b Dept %s %n",
		sc.nextInt(),sc.nextDouble(),sc.nextBoolean(),sc.next());
		sc.close();

	}

}
