package com.Assignment2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Hosteller Stud1=new Hosteller(50000);
		double r1=Stud1.payFee(Stud1.getHostelFee(),30000);
		
		DayScholar Stud2 =new DayScholar(40000);
		double r2=Stud2.payFee(Stud2.getTransportFee(),25000);
		
		System.out.println("Hosteller's Remaining Fee:"+r1);
		System.out.println("DayScholor's Remaining Fee:"+r2);
	}

}
