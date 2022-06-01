package com.Assignment1;

public interface Hotel {
	
	void chickenBiryani();
	void masalaDosa();
}

class TajHotel implements Hotel{

	@Override
	public void chickenBiryani() {
		System.out.println("chickenBiryani from Taj Hotel");
	}

	@Override
	public void masalaDosa() {
		System.out.println("masalaDosa from Taj Hotel");
	}
	public void welcomeDrink(){
		System.out.println("Welcome Drink from the TajHotel");
		}
	
}

class RoadSideHotel implements Hotel{

	@Override
	public void chickenBiryani() {
		System.out.println("chickenBiryani from RoadSideHotel");
	}

	@Override
	public void masalaDosa() {
		System.out.println("masalaDosa from RoadSideHotel");
	}
	
}
