package com.Assignment3;


public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=Student.getStudent(true);
		System.out.println("Student1 details");
		System.out.println("Name:"+s.getName());
		System.out.println("Roll No:"+s.getRoll());
		System.out.println("Address:"+s.getAddress());
		System.out.println("College Name:"+s.getCollageName());
		Student s1=Student.getStudent(false);
		System.out.println();
		System.out.println("Student2 details");
		System.out.println("Name:"+s1.getName());
		System.out.println("Roll No:"+s1.getRoll());
		System.out.println("Address:"+s1.getAddress());
		System.out.println("College Name:"+s1.getCollageName());
	}

}
