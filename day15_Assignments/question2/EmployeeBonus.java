package com.question2;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

import com.question1.InvalidDateFormat;

public class EmployeeBonus {

	public double getBonus(String joinDate) throws InvalidAgeException{
		double bonus=0;
		try {
		LocalDate cdate =LocalDate.now();

		DateTimeFormatter dtf =DateTimeFormatter.ofPattern("dd-MM-yyyy");

		LocalDate udate =LocalDate.parse(joinDate,dtf);		
		Period diff=Period.between(udate, cdate);
		int yrs=diff.getYears();
		
		if(udate.isAfter(cdate))
			throw new InvalidAgeException("Age should not be in the future ");
		
		if(yrs<1) {
			bonus=5000;
		}else if(yrs>1 && yrs<2) {
			bonus=8000;
		}else {
			bonus=10000;
		}
		
		}catch(DateTimeParseException e) {
			InvalidAgeException ie =new InvalidAgeException("Please pass the date in the correct format");
			throw ie;
		}
		return bonus;
	}
}
