package com.Assignment3;

public class Demo {

	public static void main(String[] args) {
		//Vehicle v1=new Vehicle();//compile time error because we can not create object of interface 
		Vehicle v1 =new Car();
		v1.start();
		v1.breaks();
		
		System.out.println("Variable value:"+v1.i);//here we can access the interface variable because it is static
		// v1.i=700;// but we can not change the value of variable due to this is final variable
		
		Vehicle v2 =new Bike();
		v2.start();
		v2.breaks();
		
	
	}
}
