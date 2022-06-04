package com.question1;

public interface Y {

	public default void funY(){
		System.out.println("inside default funY()");
	}
	
	public static void funYS() {
		System.out.println("inside static funYS()");
	}
	
	void funYA();
}
