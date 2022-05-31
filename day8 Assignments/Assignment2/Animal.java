package com.Assignment2;

public class Animal {
	String color;
	
	Animal(String color){
		this.color=color;
	}
	
	void eat(String name) {
		System.out.println(name+"is eating food......");
	}
	
	void show(String name) {
		System.out.println(name+" is of "+color+" color");
	}

}
