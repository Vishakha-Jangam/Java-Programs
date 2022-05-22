package com.Assignment2;

public class Ticket {

	 private int ticketid;
	 private int price; 
	 private static int availableTickets;
	 public int getTicketid() {
		return ticketid;
	}
	public void setTicketid(int ticketid) {
		this.ticketid = ticketid;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public static int getAvailableTickets() {
		return availableTickets;
	}
	public static void setAvailableTickets(int availableTickets) {
		if(availableTickets>0) {
		Ticket.availableTickets = availableTickets;
		}else {
			Ticket.availableTickets =0;
		}
	}
	public int calculateTicketCost(int nooftickets) {
		if(availableTickets>nooftickets) {
			availableTickets=availableTickets-nooftickets;
			int totalAmount=nooftickets*price;
			return totalAmount;
		}else {
			return -1;
		}
		
	}
	 
}
