package com.question2;

import java.util.Scanner;

public class Mobile {

	String[] outdatedModels = {"note4","note5","note6","note7"};
	public void searchOutdatedModel(String companyNm, String... model) {
		
		
		for(int i=0;i<model.length;i++) {
			String s=model[i];
			for(int j=0;j<outdatedModels.length;j++) {
			if(outdatedModels[j].equals(s)) {
				System.out.println(s+"_OUTDATED");
				break;
			}
//			else {
//				System.out.println("false");
//				break;
//			}
			}
		}
	}
	
	
	public static void main(String[] args) {
		
		Mobile mob=new Mobile();
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter how many models wants to check:");
		int num=sc.nextInt();
		
		String[] models=new String[num];
		for(int i=0;i<num;i++) {
			System.out.println("Enter model:");
			String model=sc.next();
			models[i]=model;
		}
		
			mob.searchOutdatedModel("Samsung", models);
		
	}
}
