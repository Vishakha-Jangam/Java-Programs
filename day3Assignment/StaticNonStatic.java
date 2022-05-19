package com.day3Assignment;

public class StaticNonStatic {

// Static Variables: static Variables which we can access directly inside the main method by using three ways
//are as follows
		
//	Non Static Variables: non-static Variables are not directly accessible inside the static area i.e those elements which we can not directly access in the main method,
//we should have to create an object to access that variable 
	
	int age = 23;//non_static Variable
	static int marks=90;//static variable
	
	public static void main(String[] args) {
		System.out.println(marks);//1.directly access
		//or
		System.out.println(StaticNonStatic.marks);//2.using class name dot
		//or
		StaticNonStatic st = new StaticNonStatic();
		System.out.println(st.marks);//3.using object 
		
		System.out.println(st.age);//access using object only
	}
	
}
