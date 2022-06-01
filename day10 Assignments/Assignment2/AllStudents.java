package com.Assignment2;

import java.util.Scanner;

public class AllStudents {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Science Student Details");
		System.out.println("Name of Student");
		String name=sc.next();
		
		System.out.println("Enter Address:");
		String address=sc.next();
		System.out.println("Enter Marks of Physics:");
		int pm =sc.nextInt();
		
		System.out.println("Enter Marks of chemistry:");
		int cm =sc.nextInt();
		
		System.out.println("Enter Marks of maths:");
		int mm=sc.nextInt();
		
		
		System.out.println("History Student Details");
		System.out.println("Name of Student");
		String hname=sc.next();
		
		System.out.println("Enter Address:");
		String haddress=sc.next();
		System.out.println("Enter Marks of History:");
		int hm=sc.nextInt();
		System.out.println("Enter Marks of civics:");
		int cim=sc.nextInt();
		
		ScienceStudent ss =new ScienceStudent(name,address,pm,cm,mm);
		System.out.println("-----------------------------------");
		System.out.println("Science Student card");
		double percent1=ss.getPercentage();
		System.out.println("Percentage:"+percent1+"%");
		
		HistoryStudent hs =new HistoryStudent(hname,haddress,hm,cim);
		System.out.println("----------------------------------");
		System.out.println("History Student card");
		double percent2=hs.getPercentage();
		System.out.println("Percentage:"+percent2+"%");
		
		
		
		
		
	}

}
