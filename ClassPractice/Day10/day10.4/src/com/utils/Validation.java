package com.utils;

import com.banking.BankAccount;
import com.customexceptions.InvalidAccountDetails;

public class Validation {

	private static final double BALANCE;
	private static final String[] ACCOUNTTYPE;

	static {
		BALANCE = 1000;
		ACCOUNTTYPE = new String[] { "SAVINGS", "FD" };
	}

	public static BankAccount validateAllRules(int accountNumber, String customerName, String accountType, double balance) throws InvalidAccountDetails {
		
		
		
		
		
			
		return new BankAccount( accountNumber,  customerName,  accountType,  balance);
	}//end of validateAllRules method

	public static void validationBalance(int bal) throws InvalidAccountDetails {
		if (bal < BALANCE) {
			throw new InvalidAccountDetails("Low Balance!");
		}
		System.out.println("validationBalance over");

	}// end of validationRules method
	
	public static void validationAccountType() throws InvalidAccountDetails{
		
		for(String s: ACCOUNTTYPE) {
			if(ACCOUNTTYPE.equals(s)) {
				System.out.println("valid type of acc");
			}
			throw new InvalidAccountDetails("wrong type");
		}
	}
}// end of Validation class
