package com.exception;
//example of checked exception: since InterruptedException Does not extend form RuntimeException.
//javac forces handling of the checked exceptions.
//two ways to satisfy the javac. 1. wrap the code in try-catch
public class Test2 {
	public static void main(String[] args) {
		System.out.println("before");
		try {
		Thread.sleep(5000); //Compiler Angry: unhandled checked exception
		}
		catch(InterruptedException e) {
			System.out.println("error");
		}

		System.out.println("after");
	}

}
