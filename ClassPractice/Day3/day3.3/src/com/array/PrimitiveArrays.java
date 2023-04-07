package com.array;

import java.util.Scanner;

class PrimitiveArrays {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		double data[] = new double[sc.nextInt()];
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i] + " ");
		}
		System.out.println();
		System.out.println("loaded class name:" + data.getClass());
		System.out.println("enter the array elements: ");
		for (int i = 0; i < data.length; i++) {
			data[i] = sc.nextDouble();

		}
		System.out.println("the array elements are: ");
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i] + " ");
		}
		System.out.println("loaded class name: " + data.getClass());
		sc.close();
	}

}
