package com.Assignment2;


public class Demo {
	int i;
    String s;
    float f;
	public Demo(){
		System.out.println("inside Demo().......");
	}
	public Demo(String s){
		this();
		this.s=s;
		System.out.println("inside Demo(String s)...");
	}
	public Demo(float f){
		this("Hello");
		this.f=f;
		System.out.println("inside Demo(float f)......");
	}
	public Demo(int i){
		this(20.5f);
		this.i=i;
		System.out.println("inside Demo(int i)....");
		}
	public static void main(String[] args) {
		
		Demo d1=new Demo(100);
		
		
	}
}
