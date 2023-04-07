package com.exception;

public class Test1 {

	public static void main(String[] args) {
		try {
			int[] arr = { 10, 30, 42, 554 };
			System.out.println(arr[3]);// AOBException
			System.out.println("int value" + Integer.parseInt("abc1234"));// NumberFormatException
			int numerator = 100;
			int denominator = 0;
			System.out.println("result" + (numerator / denominator));// ArithmeticException
			String s = null;
			System.out.println("char at 0th index" + s.charAt(0));// NPException
			System.out.println("main over...");
		} catch (Exception e) {
			System.out.println("in catch-all");
			System.out.println("getting Error message: "+e.getMessage());
			System.out.println("printing Error message: "+e.toString());
			e.printStackTrace();
		}
		System.out.println("main over");

	}

}
