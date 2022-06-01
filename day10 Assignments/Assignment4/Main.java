package com.Assignment4;

public class Main {

	public static void main(String[] args) {
		Area a =new Area();
		int circle=a.circleArea(5);
		int rect=a.rectangleArea(10, 20);
		int square=a.squareArea(10);
		System.out.println("Area of Circle:"+circle);
		System.out.println("Area of Rectangle:"+rect);
		System.out.println("Area of Square:"+square);
	}

}
