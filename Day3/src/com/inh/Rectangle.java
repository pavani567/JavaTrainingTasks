package com.inh;
public class Rectangle {
	int length,width;
	public Rectangle() {
		length=6;
		width=3;
		System.out.println("Length: "+length);
		System.out.println("Width: "+width);
	}
	public void area() {
		
		int area=length*width;
		System.out.println("Area of rectangle : "+area);
	}
}
class Box extends Rectangle{
	
	int depth;
	
	public Box() {
		depth=2;
		System.out.println("Depth: "+depth);
	}
	
}
