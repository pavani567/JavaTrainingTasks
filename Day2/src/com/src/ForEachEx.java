package com.src;
import java.util.Scanner;
public class ForEachEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
		for(int i:a) {
			a[i]=sc.nextInt();
		}
		for(int i:a) {
			System.out.print(i+" ");
		}
		sc.close();
	}

}
