package com.question3;

public class FinallyConcept {

	//Irrespective of try and catch if we want to execute some code ,then we can used 
	//finally block.
	//this block executed if exception is occurred or not.
	//It is block always used with try and catch
	
	public static void main(String[] args) {
		
		try {
			int result=100/0;
			System.out.println("result:"+result);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("This block always Executed.");
		}
	}
	
}
