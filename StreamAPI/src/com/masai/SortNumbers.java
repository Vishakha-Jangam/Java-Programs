package com.masai;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortNumbers {

	public static void main(String[] args) {
		
		List<Integer> list= List.of(20,30,10,90,40,73,56);
		
		List<Integer> sort= list.stream().sorted().collect(Collectors.toList());

		System.out.println(sort);
		
		
		List<Integer> reverse= list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
	
		List<Integer> rlist= list.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		
	    System.out.println(reverse);
	    System.out.println(rlist);
	    
	}

}
