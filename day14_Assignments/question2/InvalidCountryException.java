package com.question2;

public class InvalidCountryException extends Exception {

	public InvalidCountryException() {
		
	}
    public InvalidCountryException(String errormsg) {
		super(errormsg);
	}
}
