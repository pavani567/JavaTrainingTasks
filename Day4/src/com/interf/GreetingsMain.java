package com.interf;

public class GreetingsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Greetings g=new English();
		g.morning();
		g.afternoon();
		g.evening();
		g.night();
		
		g=new Hindi();
		g.morning();
		g.afternoon();
		g.evening();
		g.night();
		
		g=new Telugu();
		g.morning();
		g.afternoon();
		g.evening();
		g.night();
		
	}

}
