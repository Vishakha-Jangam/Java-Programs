package com.masai;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class removeSpace {

	public static void main(String[] args) {
		String str ="Vish akha";
		
		String ans=Stream.of(str).map(e -> e.replace(" ", ""))
		.collect(Collectors.toList()).get(0);
		
		System.out.println(ans);
	}

}
