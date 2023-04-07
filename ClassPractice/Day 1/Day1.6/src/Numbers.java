import java.util.Scanner;

public class Numbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num2=0;
		for (int i = 0; i < 5; i++) {
		System.out.println("enter num");
		int num1=sc.nextInt();
		num2 =num1+num2;
		}
		System.out.println("Sum:"+ num2 );
		sc.close();
		}
}

	


