package com.tester;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;


import com.banking.BankAccount;
import com.utils.Validation;

public class Test {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			ArrayList<BankAccount> bankacc = new ArrayList<BankAccount>(100);
			boolean exit = false;

			while (!exit) {
			System.out.println(
					"Choose the task you want to perform: - \n 1.Create Account \n 2.Netbanking Login \n 3.Withdraw funds \n 4.Deposit funds  \n 5.Funds Transfer \n 6.Close Account \n 7.Log out \n 8.Exit ");
			try {
				switch (sc.nextInt()) {
				case 1:
					System.out.println(
							//acct number(int) , customer name(string), pin (string) account type (enum : SAVING,CURRENT,FD,DMAT,LOAN) , account balance(double) , creation date(localdate)

							"Enter Bank Account details : Account Number, Customer Name, Pin, Account Type, Balance");
				
					break;
				case 2:
					
					break;

				case 3:

					break;

				case 4:

					break;
				case 5:

					break;
				case 6:

					break;
				case 7:

					break;

				case 8:
					exit = true;
					System.out.println("Terminated");
					break;

				}
			} catch (Exception e) {
				e.printStackTrace();
				sc.nextLine();// to read off all pending tokens from the scanner
			}
			
			}
		} 
			catch (Exception e) {
				e.printStackTrace();
				
		}
		
	}
	}

