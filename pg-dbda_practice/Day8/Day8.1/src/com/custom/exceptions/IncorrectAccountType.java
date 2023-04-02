package com.custom.exceptions;

@SuppressWarnings("serial")
public class IncorrectAccountType extends Exception {

	public IncorrectAccountType(String message) {
		super(message);
	}

}
