package arrays;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array");
		double data[] = new double[sc.nextInt()];
		System.out.println("the lenght of the array: " + data.length);
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i] + " ");
		}
		System.out.println();
		System.out.println("loaded class name: " + data.getClass());// class name is [D i..e one dimensional array
																	// having data type double.
		for (int i = 0; i < data.length; i++) {
			System.out.println("enter the " + "array element no." + (i + 1));
			data[i] = sc.nextDouble();

		}
		System.out.println("the elements of the array are: ");
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i] + " ");
		}
		System.out.println();
		System.out.println("loaded class name: " + data.getClass());
		sc.close();
	}
}
