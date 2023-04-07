package com.tester;

import java.util.Scanner;

import com.banking.BankAccount;

public class Test {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("enter no of bank accounts to be created");
			BankAccount[] accounts = new BankAccount[sc.nextInt()];
			int counter=0;
			for (int i = 0; i < accounts.length; i++) {
				System.out.println("enter the bank account details");
				accounts[counter++]=new BankAccount(sc.nextInt(), sc.next(), sc.next(), sc.nextDouble());
			System.out.println(accounts[i]);
			}
			

		} // end of try-with-resources block

	}// end of main

}// end of Test class
