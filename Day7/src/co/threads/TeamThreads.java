package co.threads;
import java.util.Random;

public class TeamThreads extends Thread
	{
		public String s1,s2;
		TeamThreads(String q1,String q2)
		{
			this.s1=q1;
			this.s2=q2;
		}
		public void run()
		{
			for(int i=1;i<=10;i++)
			{
				if(i==5)
				{
					System.out.println(s2+" from "+s1+"@ petrolpump");
				}
				Random r=new Random();
				int q=r.nextInt(4);
				counter c=new counter();
				c.count(q);
				
			}
		}
		TeamThreads()
		{
			
		}
	
}
