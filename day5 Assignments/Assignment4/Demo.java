package com.Assignment4;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Please enter Number of Students:");
		int num=sc.nextInt();
		
		StudentBean [] students =new StudentBean[num];
		
		for(int i=0;i<students.length;i++) {
			System.out.println("Enter the details of Student"+(i+1));
			System.out.println("Enter Roll no:");
			int roll =sc.nextInt();
			
			System.out.println("Enter Name");
			String name=sc.next();
			
			System.out.println("Enter Marks:");
			int marks=sc.nextInt();
			
			System.out.println("Enter Address:");
			String address=sc.next();
			
			students[i]=new StudentBean(roll,name,address,marks);
		}
		
		
		System.out.println("Student Details are:");
		System.out.println("====================");
		int sum=0;
		for(StudentBean student:students) {
			System.out.println("Roll no is:"+student.getRoll());
			System.out.println("Name is:"+student.getName());
			System.out.println("Marks is:"+student.getMarks());
			sum+=student.getMarks();
			System.out.println("##########################");
		}
		
		System.out.println("Average of marks:"+sum/students.length);
		
	}
}
