package com.interf;

public interface Greetings {
	public void morning();
	public void afternoon();
	public void evening();
	public void night();

}
class English implements Greetings{
	
	@Override
	public void morning() {
		
		System.out.println("Good Morning");
	}
	
	@Override
	public void afternoon() {
		
		System.out.println("Good Afternoon");
	}
	
	@Override
	public void evening() {
		
		System.out.println("Good Evening");
	}
	
	@Override
	public void night() {
		
		System.out.println("Good Night");
	}
	
}

class Hindi implements Greetings{
	
	@Override
	public void morning() {
		
		System.out.println("Shubodhay");
	}
	
	@Override
	public void afternoon() {
		
		System.out.println("Shubdopahar");
	}
	
	@Override
	public void evening() {
		
		System.out.println("Shubsadhya");
	}
	
	@Override
	public void night() {
		
		System.out.println("Shubratri");
	}
	
}

class Telugu implements Greetings{
	
	@Override
	public void morning() {
		
		System.out.println("Shubodhayam");
	}
	
	@Override
	public void afternoon() {
		
		System.out.println("Subhamadhayahnam");
	}
	
	@Override
	public void evening() {
		
		System.out.println("Subhasayantram");
	}
	
	@Override
	public void night() {
		
		System.out.println("Subharatri");
	}
	
}
