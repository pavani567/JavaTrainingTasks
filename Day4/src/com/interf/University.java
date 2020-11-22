package com.interf;

public class University {

	int students;
	int teachers;
	public void closed()
	{
		System.out.println("College has been closed ");
	}
	static class Electronics
	{
		public void students()
		{
			System.out.println("All Students of electronics are suspended");
		}
		public void teachers()
		{
			System.out.println("Holidays are been declared by government");
		}
		public void closes()
		{
			System.out.println("College has been closed ");
		}
	}
	class Computers
	{
		public void students()
		{
			System.out.println("All Students of computer science are suspended");
		}
		public void teachers()
		{
			System.out.println("Holidays");
		}
	}
	class Mechanical
	{
		public void students()
		{
			System.out.println("All Students are mechanical suspended");
		}
		public void teachers()
		{
			System.out.println("Holidays");
		}
	}
}
