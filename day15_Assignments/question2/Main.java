package com.question2;


import java.util.Scanner;

import com.question1.InvalidDateFormat;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		EmployeeBonus eb =new EmployeeBonus();
		try {
			System.out.println("Enter Joining Date in dd-MM-yyyy format:");
			String jd=sc.next();
			double bonus=eb.getBonus(jd);
			if(bonus!=0) {
				System.out.println("The Bonus Amount:"+bonus);
			}
			
		}catch (InvalidAgeException ie) {
			System.out.println(ie.getMessage());
		}
	}

}
