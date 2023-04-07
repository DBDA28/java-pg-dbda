import java.util.Scanner;

class EmployeeDetails {
	public static void main(String[] args) {
		//take input of various employee details and print them.
		Scanner sc = new Scanner(System.in);
		System.out.printf("emp name: %s, emp ID: %d, salary: %.3f, Employment Status: %b",sc.next(),sc.nextInt(),sc.nextFloat(),sc.nextBoolean());
		sc.close();
		}

}
