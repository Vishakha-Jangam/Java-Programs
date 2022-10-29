package com.masai;

import java.util.List;
import java.util.stream.Collectors;

public class EvenAndOdd {

	public static void main(String[] args) {
		
	List<Integer> numbers = List.of(5,8,9,3,6,1,4,50); 
		
	List<Integer> evenList=	numbers.stream().filter(e -> e%2 ==0).collect(Collectors.toList());
	System.out.println(evenList);
	
	
	List<Integer> oddlist=numbers.stream().filter(e -> e%2!=0).collect(Collectors.toList());
	System.out.println(oddlist);
	
	
	}

}
