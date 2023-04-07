import java.util.Scanner;
public class ProductOfNumbersMethod {
	public static void main(String[] args) {
		//take input start and end range from user and print the product using a method.
		multiply();//calling method does not require object as it a static method and class is not required since method is inside the scope of class.
	}
	private static void multiply() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the start of the range: ");
		int start = sc.nextInt();
		System.out.println("enter the start of the range: ");
		int end = sc.nextInt();
		int result=1;
		for(int i=start;i<=end;i++) {
			result = result * i;
		}
		System.out.println("product: "+result);
		sc.close();
	}
	

}
