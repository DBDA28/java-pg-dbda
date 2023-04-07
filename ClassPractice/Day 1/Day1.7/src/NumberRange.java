import java.util.Scanner;

public class NumberRange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter start range:");
		int start= sc.nextInt();
		System.out.println("Enter the end point");
		int end= sc.nextInt();
		if (end < start) {
		System.out.println("Error");
	     		}
		for (int i = start; i < end+1; i++) {
		System.out.println(i + " ");
		sc.close();
		}

	}

}
