package com.Assignment3;

public class Main {

	public static void main(String[] args) {
		//Animal animal =new Animal();// compile time error because we can not create object of abstract class
		Animal a1=new Dog();
		
		a1.show("Dog");//Concrete method of parent is also accessible here because Dog Is-A Animal
		a1.makeNoise();
		
		Animal a2=new Cat();
		
		a2.show("Cat");
		a2.makeNoise();
	}

}
