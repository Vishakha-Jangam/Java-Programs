package com.Assignment2;

public class Cat extends Animal {

	Cat(String color){
		super(color);
	}
	
	@Override
	void eat(String name) {
		System.out.println(name+"is Eating......");
	}
	
}
