package com.Assignment3;

public interface Vehicle {

	//by using we can achieve 100% abstraction
	//for creating child here we used implements keyword
	//all the methods are by default public static abstract
	//all the variables are by default public static final
	int i=100;//<-----public static final
	void start();//<-- public static abstract
    void breaks();
}

class Car implements Vehicle{
//we need to override all the methods of interface in child class,otherwise we need to make child class as abstract
	@Override
	public void start() {
		System.out.println("Car is running....");
		
	}

	@Override
	public void breaks() {
		System.out.println("Car is Stop ...........");
		
	}
	
}

class Bike implements Vehicle{

	@Override
	public void start() {
		System.out.println("Bike is running....");
		
	}

	@Override
	public void breaks() {
		System.out.println("Bike is Stop ...........");
		
	}
	
}