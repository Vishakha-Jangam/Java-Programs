package com.masai;

import java.util.List;
import java.util.stream.Collectors;

public class NumberStartsWith {

	public static void main(String[] args) {
		List<Integer> list =List.of(201,211,583,568,781,200);
		
//		List<String> slist=list.stream().map(e -> String.valueOf(e))
//		.filter(e-> e.charAt(0)=='2').collect(Collectors.toList());

		List<String> slist=list.stream().map(e -> String.valueOf(e))
				.filter(e-> e.startsWith("5")).collect(Collectors.toList());

		System.out.println(slist);
	}

}
