package com.exception;

public class ObjectReference {

	public static void main(String[] args) {
		
		try {
			Addition addition = new Addition();
			addition = null;
			@SuppressWarnings("null")
			int sum = addition.add(21,43);
			System.out.println(sum);
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
