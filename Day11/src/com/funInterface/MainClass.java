package com.funInterface;

public class MainClass {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FunctInterface len=(a,b)->
		{
			System.out.println(a.length());
			System.out.println(b.length());
		};
		len.string("anu", "abc");
		len=(a,b)->
		{
			System.out.println(a.concat(b));
		};
		len.string("anu", "abc");
		len=(a,b)->
		{
			System.out.println(a.compareTo(b));
		};
		len.string("anu", "abc");
	}
}
