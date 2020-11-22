package com.inh;

public class Student {
	
	String name;
	int rollno;
	int marks;
	
}
class MyRecord extends Student {
	
	public void percentage() {
		
		int pct=(marks/100)*10;
		System.out.println("Percentage "+pct);
	}
	public void display() {
		
		System.out.println("Name:"+name);
		System.out.println("Rollnumber"+rollno);
	}
}