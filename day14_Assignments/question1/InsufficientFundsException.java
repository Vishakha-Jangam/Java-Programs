package com.question1;

public class InsufficientFundsException extends Exception {

	public InsufficientFundsException () {
		
	}
	public InsufficientFundsException(String errorMessage) {
		super(errorMessage);
	}
}
