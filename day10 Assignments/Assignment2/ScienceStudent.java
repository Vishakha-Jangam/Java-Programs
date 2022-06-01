package com.Assignment2;

public class ScienceStudent extends Student {

	int phisicsMarks;
	int chemistryMarks;
	int mathsMarks;

	public ScienceStudent(String name, String address,int pm,int cm,int mm) {
		super(name, address);
		this.phisicsMarks=pm;
		this.chemistryMarks=cm;
		this.mathsMarks=mm;
		
	}

	@Override
	double getPercentage() {
		double sum =(this.phisicsMarks+this.chemistryMarks+this.mathsMarks);
		double  percent=((sum/300)*100);
		System.out.println("Name :"+ name); 
		System.out.println("Address:"+address);
		return percent;
	}
	
	
}
