package com.day2Assignments;

public class PrimeFactorials {

	public static void main(String[]args) {
		
		int num=12;
		
		printPrimeFact(num);
	}

	 static void printPrimeFact(int num) {
		// TODO Auto-generated method stub
		 if(num<2 || num>100) {
				System.out.println("Invalid number");
			}else {
				for(int i=1;i<=num;i++) {
					
					if(num%i==0) {
					System.out.print(i+" ");
					}
				}
			}
	}
}
