package com.inh;

public class Student1 {
	
	String name;
	int rollno;
	
}
class Record extends Student {
	
		String address;
		
		public void display() {
		
		System.out.println("Name:"+name);
		System.out.println("Rollnumber"+rollno);
		System.out.println("Address:"+address);
	}

}
