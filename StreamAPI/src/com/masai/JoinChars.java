package com.masai;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class JoinChars {

	public static void main(String[] args) {
		
		  List<Character> list = Arrays.asList('D', 'e', 'm', 'o');
		
	      String str = list.stream().map(String::valueOf).collect(Collectors.joining());
	      
	      System.out.println(str);
		

	}

}
