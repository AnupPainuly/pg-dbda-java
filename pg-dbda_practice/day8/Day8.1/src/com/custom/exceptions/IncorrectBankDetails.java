package com.custom.exceptions;

@SuppressWarnings("serial")
public class IncorrectBankDetails extends Exception {
	public IncorrectBankDetails(String message) {
		super(message);

	}
}
