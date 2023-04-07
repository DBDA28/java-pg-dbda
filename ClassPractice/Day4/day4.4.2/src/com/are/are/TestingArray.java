package com.are.are;

import java.util.Scanner;
public class TestingArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);// creating an object of scanner class.
       //datatype        //datatype
		System.out.println("enter the size of the array");
		double[] arr = new double[sc.nextInt()];
		System.out.println("enter the array elements");
		for(int i =0;i<arr.length;i++) {
			arr[i]=sc.nextDouble();
		}
		System.out.println("the array elements are:");
		for(double i:arr) {
			System.out.print(i+" ");
			
		}
		
		sc.close();

	}

}
