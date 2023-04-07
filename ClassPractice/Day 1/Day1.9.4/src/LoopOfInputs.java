import java.util.Scanner;
public class LoopOfInputs {
//	public static void main(String[] args) {
//		//take five input from the user and add them using for loop.
//		Scanner sc = new Scanner(System.in);
//		int result=0;
//		for(int i=0;i<5;i++) {
//			System.out.print("enter the number; ");
//			int num=sc.nextInt();
//			result=result+num;
//		}
//		System.out.println("sum:"+result);
//		sc.close();		
//	}
	public static void main(String[] args) {
		//take five input form the user and add the using while loop.
		Scanner sc = new Scanner(System.in);
		int result=0;
		int i=0;
		while(i<5) {
			System.out.print("enter the number:");
			int num=sc.nextInt();
			result=result+num;
			i++;
		}
		System.out.println("sum: "+result);
		sc.close();
	}
	
	
}
