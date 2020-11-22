package com.interf;

public class OrderMain {
	OrderMain(){
		System.out.println("cat");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OrderMain orderMain=new OrderMain();
		System.out.println("ant");
	}
	static {
		System.out.println("dog");
	}
	{
		System.out.println("man");
	}

}
