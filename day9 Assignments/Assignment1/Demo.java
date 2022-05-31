package com.Assignment1;
import java.util.Scanner;
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc =new Scanner(System.in);
		for(int i=0;i<2;i++) {
			Student stud =new Student();
			
			System.out.println("Enter Student Roll Number:");
			int roll=sc.nextInt();
			System.out.println("Enter Student Name:");
			String name =sc.next();
			System.out.println("Enter Student Marks:");
			int marks= sc.nextInt();
			
			stud.displayDetails(roll,name,marks);
			System.out.println(stud);
			
			System.out.println();
			
		}
	}

}
