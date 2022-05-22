package com.Assignment1;

import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 Employee newEmployee = Employee.getEmployeeDetails();
	      
	        System.out.println("Enter Pf Percentage:");
			int per=sc.nextInt();
			double percent=Employee.getPFPercentage(per);//method1
			newEmployee.calculateNetSalary(percent);//method2
	        
			
			System.out.println();
	        System.out.println("----------------------------------");
	        System.out.println("Id : " + newEmployee.getEmployeeId());
	        System.out.println("Name : " + newEmployee.getEmployeeName());
	        System.out.println("Salary : " + newEmployee.getSalary());
	        System.out.println("Net Salary:"+newEmployee.getNetSalary());

		}

	
}
