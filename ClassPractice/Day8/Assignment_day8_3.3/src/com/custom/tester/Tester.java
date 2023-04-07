package com.custom.tester;

import com.banking.BankAccount;
import com.banking.utils.Validation;

import java.util.Arrays;
import java.util.Scanner;

public class Tester {
	public static void main(String[] args) {
		//?1.Use try-with-resources for creating scanner.
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("enter the no of bank accounts to be created");
			BankAccount[] acc = new BankAccount[sc.nextInt()];// creating a array of references
			for(int i=0;i<acc.length;i++) {
				//?2. Accept  inputs for creating new account.
				System.out.println(
						"enter the bank details: 1. account number 2. customer name 3. account balance 4. account type ");
				acc[i] = Validation.validateAllRules(sc.nextInt(), sc.next(), sc.nextDouble(), sc.next());
			}
			//?3. Use equals method , to check if they are same or different.
			System.out.println(acc[0].equals(acc[1]) ? "same accounts" : "different accounts");

			for (BankAccount b : acc) {
				System.out.println(b);
			} // end of for-each. display registered account details

			//?4. Test withdraw n deposit methods.
			System.out.println(acc[0].deposit(3000));
			System.out.println(acc[0].withdraw(1000));
			for (BankAccount b : acc) {
				System.out.println(b);
			} // end of for-each. displaying updated account details
			
			
		} // end of try-with resources block
		catch (Exception e) {
			e.printStackTrace();
		} // end of catch block

	}// end of main

}// end of tester Class
