package com.funInterface;
import java.util.Arrays;
	   
public class ArrayFunc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a= {1,2,3,4};
		int[] b= {4,3,5,6,7};
		
		//length of strings
		System.out.println(a.length);
		System.out.println(b.length);
		
		//reverse of strings
		Arrays.sort(a, (Integer one, Integer two) -> { return (two- one); });
	      System.out.println("Reverse of Array elements");
	      System.out.println(Arrays.toString(a));
	}

}
