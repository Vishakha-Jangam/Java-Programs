package com.day3Assignment;

public class Student {

	int roll;
	String name;
	int marks;
	
	void displayStudentDetails(int roll, String name, int marks) {
		System.out.println("Roll is:" + roll);
		System.out.println("Name is:" + name);
		System.out.println("Marks is:" + marks);
	}
	
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.roll=01;
		s1.name="abc";
		s1.marks=90;
		s1.displayStudentDetails(s1.roll,s1.name,s1.marks);
		Student s2=s1;
		s1=null;
		s2.displayStudentDetails(02, "xyz", 96);
		s2=null;
		
	}
}
