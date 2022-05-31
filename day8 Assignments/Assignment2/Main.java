package com.Assignment2;

public class Main {
	
//Explain ClassCastException with the help of the example.
	
//	ClassCastException in java is one of the unchecked exception that occur when we try to convert one class type 
//	object into another class type;
//	that means ClassCastException is thrown when we cast object of parent class to child class object.
//	However it can also thrown when we try to convert the objects of two individual classes that don't have any 
//	relationship between them

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cat cat =new Cat("Black");
		Animal animal =new Animal("White");
		animal=cat;
		animal.show("My Cat");
		
		Animal animal1=new Animal("White");
		Cat c=((Cat)animal1);
		
	}

}
