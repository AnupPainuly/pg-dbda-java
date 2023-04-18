package com.custom_Exception;

@SuppressWarnings("serial")
public class InvalidBankDetailsException extends Exception {
	public InvalidBankDetailsException(String message) {
		super(message);
	}

}
