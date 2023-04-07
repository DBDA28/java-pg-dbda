import java.util.Scanner;
public class ForLoopInput {
	public static void main(String[] args) {
		//take input of start and end of a range and add all the numbers in between
		Scanner sc = new Scanner(System.in); //creating an object sc of Scanner class.
		System.out.println("enter the starting range: ");
		int start = sc.nextInt();
		System.out.println("enter the ending range: ");
		int end = sc.nextInt();
		if (end<start) {
			System.out.println("incorrect range");
		}//end of if
		else {
		int result=0;
		for(int i=start;i<=end;i++) {
			result = result + i;
		}
		System.out.println("sum: "+result);
		sc.close();	//closing the scanner
		}//end of else
	}//end of main

}
