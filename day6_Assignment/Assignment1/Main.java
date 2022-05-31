package com.Assignment1;

import java.util.Scanner;

public class Main {

	public static String reversString(String input){
		
		//write the logic
		
		char s[] = input.toCharArray();
		String bag="";
		
		for(int i=s.length-1;i>=0;i--) {
			bag=bag+s[i];
		}
		return bag;
		
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String to reverse");
		String orignalString = sc.next();
		String result = reversString(orignalString);
		System.out.println("Original String is :"+ orignalString);
		System.out.println("Reversed String is :"+ result);
	}

}
