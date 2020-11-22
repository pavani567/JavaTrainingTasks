package com.interf;

public class UniversityMain {

	public static void main(String[] args) {
		
		University u=new University();
		u.closed();
		University.Electronics q=new University.Electronics();
		
		q.closes();
		University.Computers c=u.new Computers();
		c.students();
		c.teachers();
		University1 mechanical=new University1()
		{
			public void students()
			{
				System.out.println("All Students of mechanical are suspended");
			}

			@Override
			public void teachers() {
				// TODO Auto-generated method stub
				System.out.println("College is remain closed and search for new college");
			}
			
		};
		mechanical.students();
		mechanical.teachers();
		
	}
	

}
