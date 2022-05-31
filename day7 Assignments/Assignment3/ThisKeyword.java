package com.Assignment3;

public class ThisKeyword {

	 // instance variable
    int a = 10;
 
    // static variable
    static int b = 20;
 
    void PrintThis() {
    	this.a = 100; 
        System.out.println(a);
        //this is used to refer current-class’s instance as well as static members.
        this.b = 600;
        System.out.println(b);
        
        this.a = 9000;
        System.out.println(a);
 
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ThisKeyword().PrintThis();
	}

}
