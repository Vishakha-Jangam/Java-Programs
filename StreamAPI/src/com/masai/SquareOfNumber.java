package com.masai;

import java.util.List;
import java.util.stream.Collectors;

public class SquareOfNumber {

	public static void main(String[] args) {
		
		List<Integer> numbers = List.of(2,3,4,5,6);
		
//		List<Integer> sq=numbers.stream().map(e -> e*e).collect(Collectors.toList());
//
//		System.out.println(sq);
//		
		
//		List<Integer> sq=numbers.stream().map(e -> e*e).filter(e->e>10).collect(Collectors.toList());

		double sq=numbers.stream().map(e -> e*e).filter(e->e>10).mapToInt(e->e).average().getAsDouble();
		System.out.println(sq);
		System.out.println(Math.round(sq*100) / 100.0);
	}

}
