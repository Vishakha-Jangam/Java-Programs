package com.Assignment4;

import java.util.Scanner;

import com.Assignment1.Main;


public class Demo {

	public static Bank getBank(String bank) {
		
		System.out.println("Bank:"+bank);
		if(bank.equals("Axis")) {
			AxisBank axisbank =new AxisBank();
			axisbank.branchName="Pune";
			axisbank.IfscCode="AXIS3243";
			axisbank.rateOfInterest=5;
			return axisbank;
		}else if(bank.equals("ICICI")) {
			ICICIBank icicibank = new ICICIBank();
			icicibank.branchName="Mumbai";
			icicibank.IfscCode="ICICI4324";
			icicibank.rateOfInterest=10;
			return icicibank;
		}else {
			return null;
		}
		
	}
		public static void main(String[]args) {
			
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter Bank Name:");
			String bname =sc.next();
			
			Bank b =Demo.getBank(bname);
			
			if(b instanceof  ICICIBank) {
				System.out.println("Displaying Details of ICICIBank Holder");
				System.out.println();
				b.displayDetails();
				
			}else if(b instanceof AxisBank) {
				System.out.println("Displaying Details of AxisBank Holder");
				System.out.println();
				b.displayDetails();
				new AxisBank().getCreditCard();
			}
			 else {
				  System.out.println("Please Enter the correct Bank Name");
				  
			  }

		}
		
	}

