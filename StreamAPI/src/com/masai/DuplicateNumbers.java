package com.masai;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateNumbers {

	public static void main(String[] args) {
		
		List<Integer> list = List.of(1,1,8,1,2,3,5,6);

		
//		Set<Integer> set =new HashSet<>();
//		
//		Set<Integer> ans=list.stream().filter(e -> !set.add(e)).collect(Collectors.toSet());
//	
//		System.out.println(ans);
		
	  Set<Integer> set=	list.stream().filter(e->Collections.frequency(list, e)>1)
		 .collect(Collectors.toSet()); 
	  System.out.println(set);
	}

}
