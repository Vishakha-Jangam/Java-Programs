package com.Assignment2;

public class Hosteller extends Student {

	 private double	hostelFee;

		public double getHostelFee() {
		return hostelFee;
	}
		
		public void setHostelFee(double hostelFee) {
			this.hostelFee = hostelFee;
		}
		
	public Hosteller (double fee) {
		this.hostelFee=fee;
	}
			
}
