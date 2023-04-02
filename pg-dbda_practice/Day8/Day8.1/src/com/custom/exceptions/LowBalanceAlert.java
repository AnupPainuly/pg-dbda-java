package com.custom.exceptions;

@SuppressWarnings("serial")
public class LowBalanceAlert extends Exception {
	
	public LowBalanceAlert(String message) {
		super(message);
		
	}//end of constructor
}//end of LowBalanceAlert class
