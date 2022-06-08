package com.question1;

import java.util.Scanner;

public class AccountDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account ac =new Account();
		ac.accountNumber="SBI123456";
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Amount to deposit:");
		double amount =sc.nextDouble();
		ac.deposit(amount);
		
		try {
			System.out.println("Enter Amount to withdraw:");
			double amt =sc.nextDouble();
			double bal=ac.withdraw(amt);
			System.out.println("Balance:"+bal);
		} catch (InsufficientFundsException e) {
			// TODO Auto-generated catch block
			System.out.println("Insufficient Balance");
		}finally {
			sc.close();
		}
		
		

	}

}
