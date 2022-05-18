package com.day3Assignment;

public class CheckWhether {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean isSnowing = false;
		boolean isRaining = true;
		double temperature = 60.0;
		
		if(isSnowing || isRaining || temperature<50) {
			System.out.println("Let’s stay home.");
		}else {
			System.out.println("Let’s go out!");
		}

	}

}
