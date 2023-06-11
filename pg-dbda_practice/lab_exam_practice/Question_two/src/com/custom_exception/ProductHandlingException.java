package com.custom_exception;

@SuppressWarnings("serial")
public class ProductHandlingException extends Exception {
	public ProductHandlingException(String message) {
		super(message);
	}
}
