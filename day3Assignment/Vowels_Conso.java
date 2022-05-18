package com.day3Assignment;

public class Vowels_Conso {

	void checkChar(char c) {
		// TODO Auto-generated method stub
		if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U'|| c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
			System.out.println("character "+c+" is vowel");
		}else if((c>='a'&&c<='z')||(c>='A'&&c<='Z')) {
			System.out.println("character "+c+" is Consonant");
		}else {
		System.out.println("invalid character");		
	}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vowels_Conso vc =new Vowels_Conso();
		
		vc.checkChar('e');
		vc.checkChar('Z');
		vc.checkChar('#');
		
	}

	 

}
