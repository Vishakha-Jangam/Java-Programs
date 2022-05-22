package com.Assignment1;

public class Student {
	 private int roll;
	   private String name;
	   private int age;
	   private int marks;
	   
		
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
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			if(18<age&& age<60) {
			this.age = age;
			}else {
				this.age=0;
			}
			
		}
		public int getMarks() {
		
			return marks;
			
		}
		public void setMarks(int marks) {
			if(marks>0 && marks<500) {
			this.marks = marks;
			}
			else {
				this.marks=0;
			}
		}
		public Student(int roll, String name, int age, int marks) {
			this.setRoll(roll);
			this.setName(name);
			this.setAge(age);
			this.setMarks(marks);
			System.out.println("rollNo:"+this.getRoll());
			System.out.println("Name:"+this.getName());
			System.out.println("Age:"+this.getAge());
			System.out.println("Marks:"+this.getMarks());
		}
	    public Student() {
	    	
		}
}

