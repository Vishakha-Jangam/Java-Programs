package com.masai;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SecondHighest {

	public static void main(String[] args) {
		
		List<Integer> list = List.of(25,10,60,79,58,22,36,46,10,79);
		
		
	 int num=list.stream().sorted(Collections.reverseOrder()).distinct()
		.skip(1).findFirst().get();
	 System.out.println(num);
	}

}
