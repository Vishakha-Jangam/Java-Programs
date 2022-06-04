package com.question1;

public interface Z extends X,Y{

	void funZA();
	@Override
	public default void funX() {
		System.out.println("inside default method override in Z");
	}
}

class ZImpl implements Z{

	@Override
	public void funXA() {
		System.out.println("inside override funXA in Z");
		
	}

	@Override
	public void funYA() {
		System.out.println("inside override funYA in Z");
		
	}

	@Override
	public void funZA() {
		System.out.println("inside override funZA in Z");
		
	}
	
	
	
}
