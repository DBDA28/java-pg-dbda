package arrays;
import java.util.Scanner;
/*
 * Accept size of a double[] from user
 * accept array data : for / for-each????
 * display arry data
 */

public class Test1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of the array to hold double values");
		double[] data=new double[sc.nextInt()];//10
		//populate the array : for-each
		for(double d : data)
		{
			System.out.println("enter array data");
			d=sc.nextDouble();
		}
		//display array data : for-each
		for(double d : data)
			System.out.print(d+" ");
		
		
		sc.close();
		
		

	}

}
