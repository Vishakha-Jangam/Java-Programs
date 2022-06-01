package com.Assignment3;

public abstract class Animal {
   //abstract class contains abstract method and concrete methods 
  //we can not create object of abstract class
 //by using abstract class we achieve partial abstraction 0-100% 
	abstract void makeNoise();
	void show(String name) {
	  System.out.println(name+" is a Animal");
  }
}

class Dog extends Animal{
//we need to override all abstract methods inside child class, otherwise we need to mark that child
//class also an abstract	
	
	@Override
	void makeNoise() {
		System.out.println("Barking.....");
	}
	
}
class Cat extends Animal{

	@Override
	void makeNoise() {
		System.out.println("Meww.....");
		
	}
	
}