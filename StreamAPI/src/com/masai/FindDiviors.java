package com.masai;

import java.util.ArrayList;
import java.util.List;

public class FindDiviors {

	
	public static void main(String[] args) {
		int n=12;
		
		List<Integer> divisorList = new ArrayList<>();
		for (int i=1;i<=n;i++) {
            if (n%i==0)
                divisorList.add(i);
		}
		
		System.out.println(divisorList);
		
		
		
		
	}
}
