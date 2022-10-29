package com.masai;

import java.util.stream.Collectors;

public class VowelsCount {

	public static void main(String[] args) {
		
		String input ="Aayali";
		
		long count= input.chars().filter(e-> Integer.valueOf(e)=='a'
				||Integer.valueOf(e)=='e'
				||Integer.valueOf(e)=='i' 
				||Integer.valueOf(e)=='o' 
				||Integer.valueOf(e)=='u'
				||Integer.valueOf(e)=='A' 
				||Integer.valueOf(e)=='E' 
				||Integer.valueOf(e)=='I' 
				||Integer.valueOf(e)=='O' 
				||Integer.valueOf(e)=='U' 
				).count();
	    System.out.println(count);
	}

}
