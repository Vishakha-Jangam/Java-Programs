package com.Assignment4;

public class AxisBank extends Bank{

	double rateOfInterest;
	
	@Override
	public void displayDetails() {
	
		System.out.println("Branch Name:"+this.branchName);
		System.out.println("IFSC Code:"+this.IfscCode);
		System.out.println("Rate of Intrest:"+this.rateOfInterest+"%");
		
	}
	public void getCreditCard() {
		System.out.println("Get the Credit Card from the Axis bank");
	}
}
