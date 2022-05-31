package com.Assignment3;


	public class Main{
		public int[] findAndReturnPrimeNumbers(int[] inputArray){
		//write the logic to iterate through the supplied inputArray and
			 int k=0;
			 int [] secArray=new int[inputArray.length];
			for(int i=0;i<inputArray.length;i++) {
				int count=0;
				int num= inputArray[i];
				for(int j=1;j<=num;j++) {
				if(num%j==0) {
					count++;
				}
			  }
				if(count==2) {
					secArray[k]=inputArray[i];
					k++;
				}
			}
			
		//determine each element whether it is prime or not
		//create a second array of int
		//if any number is prime inside the inputArray then add that number inside the second
		//array
		//and return the second array
		//if no prime number is found then return the empty array.
			int flag=0;
			for(int i=0;i<secArray.length;i++) {
				if(secArray[i]==0) {
					flag++;
				}
			}
			
			if(flag==secArray.length) {
				return  null;
			}else {
				return secArray;
			}
			
		}
		public static void main(String[] args){
		//Create the object of Main class
			Main m1=new Main();
			
		//on the object of Main class call the findAndReturnPrimeNumbers method
		  
		//by supplying the following array as the parameter
		 int[] arr = {10,12,5,20,11,14,15};
		 int[] res=m1.findAndReturnPrimeNumbers(arr);
		 if(res==null) {
			 System.out.println("Prime number not found in the supplied Array");
		 }else {
		 for(int i=0;i<res.length;i++) {
			 if(res[i]!=0) {
			 System.out.print(res[i]+" ");
			 }
		 }
		 }
		//print each element from the returned array of findAndReturnPrimeNumbers method
		//if findAndReturnPrimeNumbers method returns an empty array then print the following
		//message:
		// "Prime number not found in the supplied Array"
		}
		}

