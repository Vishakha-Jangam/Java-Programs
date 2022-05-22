package com.Assignment3;



public class Student {
	private int roll;
	private String name;
	private String address;
	private String collageName;
	
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

	public String getCollageName() {
		return collageName;
	}

	public void setCollageName(String collageName) {
		this.collageName = collageName;
	}

	public static Student getStudent(boolean isFromNIT) {
		if(isFromNIT) {
			Student s =new Student(101, "Abc", "Pune");
			s.setCollageName("NIT");
			return s;
		}else {
			Student s1 =new Student(102,"Xyz","Mumbai","other");
			return s1;
		}
	
	}
	
	public Student( int roll,String name,String address) {
		this.roll=roll;
		this.name=name;
		this.address=address;
		this.collageName="NIT";
	}

	public Student(int roll, String name, String address, String college) {
		
		this.roll=roll;
		this.name=name;
		this.address=address;
		this.collageName=college;
	}
}
