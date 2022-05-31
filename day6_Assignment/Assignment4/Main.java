package com.Assignment4;
//Case1-
//If only one number is supplied then simply find the factorial of that number
//Ex- input-
//5
//Output-
//120
//Case2-
//If two numbers are supplied then find the absolute difference of the two numbers and then find
//the factorial of the resulting number.
//input-
//5 7
//Output-
//2! (absolute difference of 5 & 7 is 2)
//Case 3-
//If three or more numbers are supplied-
//Input-
//5 6 8 9
//Output-
//Error
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int length=args.length;
		System.out.println(length);
		
		switch(length)
		{
		case 1:
			int total=1;
			for(int i=1; i<=Integer.parseInt(args[0]); i++) {
           	  total =total*i;
             }
             System.out.println("Total :"+total);
             break;
		case 2:
			 int diff=Math.abs( Integer.parseInt(args[0])-Integer.parseInt(args[1]));
             int total2=1;
               for(int i=1; i<=diff; i++) {
             	  total2 =total2*i;
               }
              System.out.println( " Total: "+ total2);
              break;
              
		case 3:
			System.out.println("Error");              
			   break;
		}
	}

}
