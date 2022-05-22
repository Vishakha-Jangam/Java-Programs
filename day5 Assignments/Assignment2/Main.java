package com.Assignment2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ticket tc = new Ticket();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the ticketid:");
		int id =sc.nextInt();
		tc.setTicketid(id);
		
		System.out.println("Enter the price:");
		int price= sc.nextInt();
		tc.setPrice(price);
		
		System.out.println("Enter the no of tickets:");
		int noTickets =sc.nextInt();
		
		
		System.out.println("Available tickets:");
		int avail = sc.nextInt();
		tc.setAvailableTickets(avail);
		
		int amt=tc.calculateTicketCost(noTickets);
		System.out.println("Total Amount:"+ amt);
		System.out.println("Available ticket after booking:"+tc.getAvailableTickets());
	}

}
