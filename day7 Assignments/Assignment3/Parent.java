package com.Assignment3;

public class Parent {

	// instance variable
    int a = 10;
 
    // static variable
    static int b = 20;
    
    public Parent() {
    	
    }
}
    class child extends Parent{
    	
    	public child() {
    		super();
    		//// here super keyword are used to just call the parent class constructor;
    	}
    	void printThis() {
   
    		System.out.println(super.a);//super is used to refer super-class’s instance as well as static members.
    		System.out.println(super.b);
    	}
    
    public static void main(String[] args) {
		new child().printThis();
	
		
	}

}
