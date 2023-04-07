import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter a:");
		int a = sc.nextInt();
		System.out.println("Enter b");
		int b = sc.nextInt();
		System.out.println("a=" + a);
		System.out.println("b=" + b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("Now a=" + a);
		System.out.println("Now b=" + b);
		sc.close();
	}
	

}
