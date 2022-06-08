package com.question1;

public class Account {

	String accountNumber;
	double balance;
	
	 void deposit(double amount) {
		balance=amount;
	 }
	 
	 double withdraw(double amount) throws InsufficientFundsException{
		 if(balance<amount) {
			 throw new InsufficientFundsException();
		 }else {
			 balance =balance-amount;
		 }
		 return balance;
	 }
}
