package com.src;
import java.util.Scanner;
public class AcceptnElements {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in); //Accepting input from user
		System.out.println("Enter n numbers:");
		int n=sc.nextInt();
		
		int a[]=new int[n];  //creating array 'a' with size 'n'
		
		System.out.println("Enter "+n+" numbers:");
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Given "+n+" numbers are:"); //Displays the given numbers
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
			
		}
		
		//Checking and printing prime numbers
		
		System.out.println("Printing the Prime Numbers from the given numbers");
		
		for (int i = 0; i < n; i++)
		{
			if (checkPrime(a[i]))
			{
				System.out.println(a[i]);
			}
		}
		System.out.println(" ");
		System.out.println("Perfect number");
		IsPerfectNum ipn = new IsPerfectNum();
		
		for (int i = 0; i < n; i++) {
			
			System.out.println("Is perfect number: "+ipn.isPerfectNum(a[i]));
			
			if (checkPalindrome(a[i])) 
			{
				System.out.println(a[i] + " is a Palindrome");
			} 
			else
			{
				System.out.println(a[i] + " is not a Palindrome");
			}
			if (checkArmstrong(a[i])) {
				System.out.println(a[i] + " is a Armstrong Number\n");
			} 
			else 
			{
				System.out.println(a[i] + " is not a Armstrong Number\n");
			}
		}
		
		sc.close();
	}

	public static boolean checkPrime(int n)
	{
		if (n <= 1)
			return false;

		int i = 2;
		while (i <= n / 2)
		{
			if ((n % i) == 0)
				return false;
			i++;
		}
		return true;
	}
	
	public static boolean checkPalindrome(int a)
	{
		int sum = 0;
		int rem = 0;
		int temp = a;
		while (a > 0) 
		{
			rem = a % 10;
			sum = sum * 10 + rem;
			a /= 10;
		}
		if (temp == sum) 
		{
			return true;
		}
		return false;
	}

	public static boolean checkArmstrong(int a) 
	{
		
		int sum = 0;
		int count =0;
		int temp = a;
		int rem = 0;
		while (a > 0)
		{
			rem = a % 10;
			count++;
			a /= 10;
		}
		a = temp;
		while (a > 0) 
		{
			rem = a % 10;
			sum += Math.pow(rem, count);
			a /= 10;
		}
		if (sum == temp) 
		{
			return true;
		}
		return false;
	}
}


