package com.Assignment1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bird b1 = new Parrot();
		//with this b1 reference call the fly method of
		b1.fly();
		//and after downcasting this b1 reference to the
		//Parrot class object, call the sing method also
		((Parrot)b1).sing();

	}

}
