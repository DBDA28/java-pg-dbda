package com.banking;

import java.time.LocalTime;
import java.util.ArrayList;

public class BankAccount {
	//acct number(int) , customer name(string), pin (string) account type (enum : SAVING,CURRENT,FD,DMAT,LOAN) , account balance(double) , creation date(localdate)
private int accountNumber;
private String CustomerName;
private String pin;
private AccountType accounttype ;
private double balance;
LocalTime time = LocalTime.now();  

public BankAccount(int accountNumber, String CustomerName, String pin, AccountType accounttype,double balance,LocalTime time) {
	super();
	this.accountNumber = accountNumber;
	this.CustomerName = CustomerName;
	this.pin= pin;
	this.accounttype = accounttype;
	this.balance = balance;
	this.time = time;
	
	
}

public BankAccount(int nextInt, String next, String next2, String next3, double nextDouble, LocalTime now,
		ArrayList<BankAccount> bankacc) {
	// TODO Auto-generated constructor stub
}

public int getAccountNumber() {
	return accountNumber;
}

public void setAccountNumber(int accountNumber) {
	this.accountNumber = accountNumber;
}

public String getCustomerName() {
	return CustomerName;
}

public void setCustomerName(String customerName) {
	CustomerName = customerName;
}

public String getPin() {
	return pin;
}

public void setPin(String pin) {
	this.pin = pin;
}

public AccountType getAccounttype() {
	return accounttype;
}

public void setAccounttype(AccountType accounttype) {
	this.accounttype = accounttype;
}

public double getBalance() {
	return balance;
}

public void setBalance(double balance) {
	this.balance = balance;
}

public LocalTime getTime() {
	return time;
}

public void setTime(LocalTime time) {
	this.time = time;
}

@Override
public String toString() {
	return "BankAccount [AccountNumber=" + accountNumber + ", CustomerName=" + CustomerName + ", AccountType="
			+ accounttype + ", balance=" + balance + ", Time of creation="+ time+"]";
}
}
