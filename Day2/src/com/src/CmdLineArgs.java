package com.src;
import java.util.Scanner;

public class CmdLineArgs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int n;
		
		if(args.length>0)
		{
			n=Integer.parseInt(args[0]);
		}
		else {
			System.out.println("Enter a value:");
			n=sc.nextInt();
			
		}
		
		//reverse of a number
		
		int rem=0,rev=0;
		while(n>0) 
		{
			rem=n%10;
			rev=rev*10+rem;  //reversing the given numbers
			n=n/10;
		}
		System.out.println(rev+" is a reversed number");
		
		
		//checking if reversed number is prime or not	
		
		
		int temp=0;
		for(int i=2;i<=rev/2;++i)
		{
				
			if(rev%i==0)
			{
				temp=1;
				break;
					
			}
		}
		if(temp==0) 
			System.out.println(rev+" is a prime number");
		else
			System.out.println(rev+" is not prime number");
		
		sc.close();
	}
}

