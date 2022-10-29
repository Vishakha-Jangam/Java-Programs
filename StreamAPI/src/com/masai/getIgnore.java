package com.masai;

import java.util.List;
import java.util.stream.Collectors;

public class getIgnore {

	public static void main(String[] args) {
		
		List<Integer> list= List.of(1,5,6,7,8,3,2,0);
		
	List<Integer> top=	list.stream().limit(5).collect(Collectors.toList());

	System.out.println(top);
	
	
	List<Integer> skip= list.stream().skip(2).collect(Collectors.toList());
	System.out.println(skip);
	}

}
