package com.inh;
import java.util.Scanner;
public class Number {
	
	int n1,n2;
	public void accept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any 2 numbers:");
		n1=sc.nextInt();
		n2=sc.nextInt();
		
		sc.close();
	}
}
	

class Derived extends Number {
	
	
	public static int dispMax(int n,int m)
	{
		
		    int maxValue = 0;
	        if(n > m)
	        {
	                maxValue = n;
	        }
	        else
	        	maxValue = m;
	        
	        return maxValue;
    }
		
	
	public static int dispMin(int n,int m)
	{
		
		
	        int minValue = 0;
	        
	        if(n < m)
	        {
	        	minValue = n;
	        }
	        else
	        	minValue = m;
	        
	        return minValue;
	}
	
	public void display() 
	{
		System.out.println("Minimum Value = " +dispMin(n1,n2));
	       
	    System.out.println("Maximum Value = " +dispMax(n1,n2));
	}
	
	
}
