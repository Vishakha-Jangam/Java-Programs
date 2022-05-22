package com.Assignment3;

import java.util.Scanner;

public class AccountDetails {
	static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) {
		AccountDetails ad =new AccountDetails();
		Account acc =ad.getAccountDetails();
		acc.withdraw(ad.getWithdrawAmount());

	}
	public Account getAccountDetails() {
		
		Account ac =new Account();

		System.out.println("Enter account id:");
		int id=sc.nextInt();
		ac.setAccountId(id);
		
		System.out.println("Enter account type:");
		String type=sc.next();
		ac.setAccountType(type);
		
		System.out.println("Enter balance:");
		int bal=sc.nextInt();
		
		while(bal<=0) {
			System.out.println("Balance should be positive");
			System.out.println("Enter balance:");
			bal=sc.nextInt();
		}
			ac.setBalance(bal);
		return ac;
	}
	public int getWithdrawAmount() {
		System.out.println("Enter amount to be withdrawn:");
		int amount=sc.nextInt();
		while(amount<=0) {
			System.out.println("Amount should be positive");
			System.out.println("Enter amount to be withdrawn:");
			amount=sc.nextInt();
		}
		return amount;
	}
}
