package com.question1;

public interface X {

	public default void funX(){
		System.out.println("inside default funX()");
	}
	
	public static void funXS() {
		System.out.println("inside static funXS()");
	}
	
	void funXA();
}
