package com.question2;

public class InvalidAgeException extends Exception{

	public InvalidAgeException() {
		
	}
	public InvalidAgeException(String errorMsg) {
		super(errorMsg);
	}
}
