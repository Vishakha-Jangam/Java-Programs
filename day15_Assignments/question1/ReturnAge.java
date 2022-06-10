package com.question1;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class ReturnAge {

	public int getAge(String dob) throws InvalidDateFormat{
		try {
		LocalDate cdate = LocalDate.now();
		
		DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd-MM-yyyy");
		
		LocalDate udob = LocalDate.parse(dob,dtf);
		
		Period diff = Period.between(udob,cdate);
		
		int ans=diff.getYears();
		return ans;
		}catch (DateTimeParseException e) {
			InvalidDateFormat ie =new InvalidDateFormat("Date should not be in Future");
			throw ie;
		}
		
	}
	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		ReturnAge ra =new ReturnAge();
		
		System.out.println("Enter Date of birth in dd-MM-yyyy pattern");
		String dob =sc.next();
	
		try {
			System.out.println("Your Age is :"+ra.getAge(dob));
		} catch (InvalidDateFormat e) {
			
			System.out.println(e.getMessage());
		}
		
		

	}

}
