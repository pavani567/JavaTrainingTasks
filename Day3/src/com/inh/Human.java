package com.inh;
public class Human {
	String name,gender;
	
	public static String find(int w_age, int m_age) {
		String elder=" ";
		
		if(w_age>m_age) {
			elder="Pavani";
		}
		else
			elder="Siddu";
		
		return elder;
	}
	public void display() 
	{
		System.out.println(find(21,25)+" is elder"); 
	}
}

class Woman extends Human{
	int age;
	public Woman() {
		
		age=21;
		super.name="Pavani";
		super.gender="Female";
		System.out.println("Name: "+super.name);
		System.out.println("Gender: "+super.gender);
		System.out.println("Age: "+age);
	}
}
class Man extends Human{
	int age;
	public Man() {
		age=25;
		super.name="Siddu";
		super.gender="Male";
		System.out.println("Name: "+super.name);
		System.out.println("Gender: "+super.gender);
		System.out.println("Age: "+age);
	}
}



