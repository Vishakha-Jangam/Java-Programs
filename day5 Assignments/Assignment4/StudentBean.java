package com.Assignment4;

public class StudentBean {

	int roll;
	String name;
	String address;
	int marks;
	public StudentBean(int roll2, String name2,String address, int marks2) {
		this.roll=roll2;
		this.name=name2;
		this.address=address;
		this.marks=marks2;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	

		
		
	
}
