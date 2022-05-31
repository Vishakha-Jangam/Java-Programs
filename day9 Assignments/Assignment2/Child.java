package com.Assignment2;
import java.util.Scanner;

final public class Child extends Parent{

	Child(int i) {
		super(i);
		// TODO Auto-generated constructor stub
	}

		@Override
		void method1() {
			if(i>0 && i<11) {
				System.out.println("Number:"+i);
			}
			System.out.println("method1 inside the Child Class");
		}
		
		void method4() {
			System.out.println("method4 inside the child class");
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter Number:");
		int num=sc.nextInt();
		
		
		if(num>0 && num<11) {
			Child p= new Child(num);
			
			p.method1();
			p.method2();
			p.method3();
			
			p.method4();
			
		}else {
			Child  p=new Child(0);
			
			System.out.println("Invalid Number");
			p.method1();
			p.method2();
			p.method3();
			p.method4();
		}
		
	}

}
