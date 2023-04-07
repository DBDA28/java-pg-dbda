package com.customexceptions;

@SuppressWarnings("serial")
public class InvalidAccountDetails extends Exception {
	public InvalidAccountDetails(String message) {
	super(message);
	}

}//end of InvalidAccountDetails class
