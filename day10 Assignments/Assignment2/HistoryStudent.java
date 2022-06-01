package com.Assignment2;

public class HistoryStudent extends Student {

	int historyMarks;
	int civicsMarks;
	public HistoryStudent(String name, String address,int hm,int cim) {
		super(name, address);
		this.historyMarks=hm;
		this.civicsMarks=cim;
		
	}

	@Override
	double getPercentage() {
		double sum = (this.historyMarks+this.civicsMarks);
		double percent=((sum/200)*100);
		System.out.println("Name :"+ name); 
		System.out.println("Address:"+ address);
		return percent;
	}

}
