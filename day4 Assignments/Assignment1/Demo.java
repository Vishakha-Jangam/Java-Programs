package com.Assignment1;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		s1.setRoll(101);
		s1.setAge(30);
		s1.setName("abc");
		s1.setMarks(300);
		
		System.out.println("rollNo:"+s1.getRoll());
		System.out.println("Name:"+s1.getName());
		System.out.println("Age:"+s1.getAge());
		System.out.println("Marks:"+s1.getMarks());
		System.out.println("----------------------");
		Student s2 =  new Student(1,"xyz",30,350);
	}

}
