package arrays;

import java.util.Scanner;

/*
 * Objective -- Accept no of data samples(of type double) from User(using scanner)
Create suitable array & display it using for-loop , to confirm default values.

Accept data from User(scanner) & store it in the array.
Display array data using  for loop.

 */
public class TestPrimitiveArray {

	public static void main(String[] args) {
		// create scanner cls instance to wrap std i/p
		int num = 12345;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of the array");
		double[] data;// data : array type of ref , mem allocated on stack , no of bytes decided by
						// JVM
	//  System.out.println(data);
		data=new double[sc.nextInt()];//3
		System.out.println("length of the array "+data.length);
		for(int i=0;i<data.length;i++)
			System.out.print(data[i]+" ");
		System.out.println();
		System.out.println("loaded class "+data.getClass());//[D
		for(int i=0;i<data.length;i++)
		{
			System.out.println("Enter array data");
			data[i]=sc.nextDouble();
		}
		System.out.println("array data after :");
		for(int i=0;i<data.length;i++)
			System.out.print(data[i]+" ");
		
		sc.close();

	}

}
