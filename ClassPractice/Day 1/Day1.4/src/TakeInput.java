import java.util.Scanner;
public class TakeInput {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		String Sum =sc.next();
		System.out.println(Sum+":"+(num1+num2));
		sc.close();
		}
}
