package com.Assignment4;


public class PrintNum {
	 void output(int num) {
			if(num%2==1) {
				System.out.println("Ouput:"+ num);
			}else if(num%2==0) {
				int rem=num%10;
				int ans=10-rem;
				num=num+ans;
				System.out.println("Output:"+ num);
			}else if(num<0) {
				System.out.println("Error");
			}
			
			
		}
		
		public static void main(String[] args) {
			
			PrintNum w = new PrintNum();
			w.output(44);
			w.output(45);
			w.output(-5);
		}

		
}
