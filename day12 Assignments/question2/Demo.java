package com.question2;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Demo {

	
	public boolean validate(String name, String mobileNum, String aadharCard) {
		
		boolean nm=Pattern.matches("[a-zA-Z]{3,8}", name);
		boolean adhn=Pattern.matches("[0-9]{12}", aadharCard);
		boolean mobn=Pattern.matches("[6789]{1}[0-9]{9}", mobileNum);
		if(nm==true && adhn==true && mobn==true) {
			return true;
		}else {
		return false;
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Your Name:");
		String name=sc.next();
		
		System.out.println("Enter Aadhar Number:");
		String aadhar =sc.next();
		
		
		System.out.println("Enter Mobile Number:");
		String mobile=sc.next();
		
		Demo d1 =new Demo();
		boolean result=d1.validate(name, mobile, aadhar);
		if(result) {
			Citizen c =new Citizen();
			c.setName(name);
			c.setAadharNumber(aadhar);
			c.setMobileNumber(mobile);
			System.out.println("Name:"+c.getName());
			System.out.println("AadharNumber:"+c.getAadharNumber());
			System.out.println("Mobile Number:"+c.getMobileNumber());
		}else {
			System.out.println("Somthing went Wrong..........");
		}
		
		
	}
	
}
