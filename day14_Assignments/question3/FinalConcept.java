package com.question3;

public class FinalConcept {
	//final keyword is used when we want variable can always store same value,
	//which is fixed;
	//we can used final keyword in 3 places:
	//1.if we make variable as final,then no one can change the value of that variable;
	//2.if we make method as final,then we can not override that method;
	//3.If we create class as final, then we can not extends that class;

	
		final int i=100;
		final void getI() {
			//this method can not be overridden
		}
		
		final class A{
			//this class can not extends by its child class
		}

	

}
