package com.src;
import java.util.Scanner;
public class TwoDAccept {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a[][]=new int[2][2]; //2Dimensional arrays created 
		int b[][]=new int[2][2];
		int c[][]=new int[2][2];
		
		System.out.println("Enter 4 elements for array a");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter 4 elements for array b");
		for(int m=0;m<b.length;m++)
		{
			for(int n=0;n<b.length;n++)
			{
				b[m][n]=sc.nextInt();
			}
		}
		
		System.out.println("Addition of matrixs:");
		
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				c[i][j]=a[i][j]+b[i][j]; //Adding matrices
			}
		}
		
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(c[i][j]+" ");  //printing matrix element
			}
			System.out.println(" ");
		}
		
		System.out.println("Subtraction of matrixs:");
		
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				c[i][j]=a[i][j]-b[i][j]; //Subtracting matrices
			}
		}
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(c[i][j]+" ");  //printing matrix element
			}
			System.out.println(" ");
		}
		
		System.out.println("Multiplication of matrixs:");
		
		for(int i=0;i<2;i++){    
			for(int j=0;j<2;j++){    
			c[i][j]=0;      
			for(int k=0;k<2;k++)      
			{      
			c[i][j]+=a[i][k]*b[k][j];      //Multiplying matrices
			} 
			System.out.print(c[i][j]+" ");  //printing matrix element  
			}  
			System.out.println();
		}
		sc.close();
	}
}
