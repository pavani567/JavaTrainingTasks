package com.suite;

public class Some {
	private String message;
	public void some(String message)
	{
		this.message=message;
	}
	public String appendMessage()
	{
		message="hello "+message;
		return message;
	}
	public String printMessage()
	{
		System.out.println(message);
		return message;
	}
}
