package com.question2;

import java.util.Scanner;

public class UserRegistration {

	public void registerUser(String username,String userCountry) throws InvalidCountryException {
		
		if(userCountry.equals("India")) {
			System.out.println("User registration done successfully");
		}else {
			throw new InvalidCountryException("User Outside India cannot be registered");
			
		}
	}
	public static void main(String[] args) {
		
		UserRegistration ur =new UserRegistration();
		
		
		try {
			
			Scanner sc =new Scanner(System.in);
			System.out.println("Enter UserName:");
			String uname=sc.next();
			
			System.out.println("Enter Country:");
			String country=sc.next();
			ur.registerUser(uname, country);
		} catch (InvalidCountryException e) {
			System.out.println(e.getMessage());
		}
		

	}

}
