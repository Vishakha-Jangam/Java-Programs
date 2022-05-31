package com.Assignment2;

public class Student {

	int studId;
	String studName;
	double examFee;

	public int getStudId() {
		return studId;
	}
	public void setStudId(int studId) {
		this.studId = studId;
	}
	public String getStudName() {
		return studName;
	}
	public void setStudName(String studName) {
		this.studName = studName;
	}
	public double getExamFee() {
		return examFee;
	}
	public void setExamFee(double examFee) {
		this.examFee = examFee;
	}
	public void displayDetails(){
		System.out.println("Student ID:"+studId);
		System.out.println("Student Name:"+studName);
	}
	public double payFee(double fee,double paid){
		double remain = fee-paid;
		if(remain<0) {
		return 0;
		}
		return remain;
	}
	
	
}
