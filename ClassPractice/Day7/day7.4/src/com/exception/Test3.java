package com.exception;
//example of checked exception: since InterruptedException Does not extend form RuntimeException.
//javac forces handling of the checked exceptions.
//two ways to satisfy the javac. 1. wrap the code in try-catch
public class Test3 {
	public static void main(String[] args) throws InterruptedException {
		//Meaning-- main is NOT handling the exception(if it comes)
		//It is delegating it to the compiler.
		System.out.println("before");
		Thread.sleep(5000); //Compiler Angry: un-handled checked exception
		System.out.println("after");
	}

}
