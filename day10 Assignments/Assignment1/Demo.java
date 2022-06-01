package com.Assignment1;

import java.util.Scanner;

public class Demo {

	public Hotel provideFood(int amount) {
		if(amount>200 && amount<1000) {
			RoadSideHotel rsh= new RoadSideHotel();
			return rsh;
		}else if(amount>1000){
			TajHotel th =new TajHotel();
			return th;
		}else {
			return null;
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter Amount :");
		int amt =sc.nextInt();
		
		Demo d1 =new Demo();
		Hotel hotel=d1.provideFood(amt);
		
		
		if(hotel!=null) {
		
			hotel.chickenBiryani();
			hotel.masalaDosa();
			if(hotel instanceof TajHotel) {
			((TajHotel) hotel).welcomeDrink();
		     }
		}else {
			System.out.println("Please Enter amount greater than 200");
		}
		
	}
}
