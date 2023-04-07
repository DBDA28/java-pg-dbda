import java.util.Scanner;
class UserInput {
	public static void main(String[] args) {
		//take input from user via system input stream
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the num1: ");
		int num1 = sc.nextInt();
		System.out.println("enter the num1: ");
		int num2 = sc.nextInt();
		System.out.println("the sume of numbers:"+(num1+num2));
		sc.close();
	}

}
