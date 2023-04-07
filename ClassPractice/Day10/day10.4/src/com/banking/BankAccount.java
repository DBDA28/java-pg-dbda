package com.banking;

import java.util.Objects;
//Incomplete
public class BankAccount {
	private int accountNumber;
	private String customerName;
	private String accountType;
	private double balance;

	public BankAccount(int accountNumber, String customerName, String accountType, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.customerName = customerName;
		this.accountType = accountType;
		this.balance = balance;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public int hashCode() {
		return Objects.hash(accountNumber, accountType, balance, customerName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BankAccount other = (BankAccount) obj;
		return accountNumber == other.accountNumber;
	}

	@Override
	public String toString() {
		return "BankAccount [accountNumber=" + accountNumber + ", customerName=" + customerName + ", accountType="
				+ accountType + ", balance=" + balance + "]";
	}
	
	

}
