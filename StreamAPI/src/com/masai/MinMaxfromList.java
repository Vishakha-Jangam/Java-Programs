package com.masai;

import java.util.Comparator;
import java.util.List;

public class MinMaxfromList {

	public static void main(String[] args) {
		
		List<Integer> list = List.of(10,20,80,40,60);
		
		int max=list.stream().max(Comparator.comparing(Integer::valueOf)).get();

		int m= list.stream().mapToInt(e->e).max().getAsInt();
		System.out.println(m+" "+max);
		
		
	    int min=list.stream().min(Comparator.comparing(Integer::valueOf)).get();
	    int mi= list.stream().mapToInt(e->e).min().getAsInt();
		System.out.println(min+" "+mi);
	}

}
