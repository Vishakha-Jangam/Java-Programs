package com.masai;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SumStream {

	public static void main(String[] args) {
		
		List<Integer> list = List.of(2,2,3,4,5);
		
		int sum= list.stream().reduce((a,b)-> a+b).get();
	
		System.out.println(sum);
	}
}
