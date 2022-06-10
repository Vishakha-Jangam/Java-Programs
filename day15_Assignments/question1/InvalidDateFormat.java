package com.question1;

public class InvalidDateFormat extends Exception{

	public InvalidDateFormat() {
		
	}
	public InvalidDateFormat(String errorMsg) {
		super(errorMsg);
	}
}
