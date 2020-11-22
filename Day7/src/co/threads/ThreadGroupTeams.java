package co.threads;

public class ThreadGroupTeams {

	public static void main(String[] args) {
		
		
		ThreadGroup velocity = new ThreadGroup("Velocity"); 
              Pavani thread = new Pavani (velocity, "Thread-"); 
             thread.start();
           
             Lekha thread1 = new Lekha (velocity, "Thread1-" ); 
             thread1.start();
             
             Chandana thread2 = new Chandana (velocity, "Thread2-"); 
             thread2.start();
             
            Akshith thread3 = new Akshith (velocity, "Thread3-"); 
            thread3.start();
            
            Bhagya thread4 = new Bhagya (velocity, "Thread4-" ); 
            thread4.start();
        
            
           ThreadGroup datapirates = new ThreadGroup("datapirates"); 
            Rajesh thread5 = new Rajesh (datapirates, "Thread5-"); 
           thread5.start();
         
           D1 thread6 = new D1(datapirates, "Thread6-" ); 
           thread6.start();
           
           D2 thread7 = new D2 (datapirates, "Thread7-"); 
           thread7.start();
           
           D3 thread8 = new D3 (datapirates, "Thread8-"); 
          thread8.start();
            
       }

}

class Pavani extends Thread
{
	Pavani(ThreadGroup tg, String name)
    {
        super(tg, name);
    }

    public void run() 
    {
        
        System.out.println("Pavani reached."); 
    }
}
class Lekha extends Thread
{
	Lekha(ThreadGroup tg, String name)
    {
        super(tg, name);
    }

    public void run() 
    {
        
        System.out.println("Lekha reached."); 
    }
}

class Chandana extends Thread
{
	Chandana(ThreadGroup tg, String name)
    {
        super(tg, name);
    }

    public void run() 
    {
        
        System.out.println("Chandana reached."); 
    }
}

class Akshith extends Thread
{
	Akshith(ThreadGroup tg, String name)
    {
        super(tg, name);
    }

    public void run() 
    {
        
        System.out.println("Akshith reached."); 
    }
}

class Bhagya extends Thread
{
	Bhagya(ThreadGroup tg, String name)
    {
        super(tg, name);
    }

    public void run() 
    {
        
        System.out.println("Bhagya reached."); 
    }
}

class Rajesh extends Thread
{
	Rajesh(ThreadGroup tg, String name)
    {
        super(tg, name);
    }

    public void run() 
    {
        
        System.out.println("Rajesh reached."); 
    }
}

class D1 extends Thread
{
	D1(ThreadGroup tg, String name)
    {
        super(tg, name);
    }

    public void run() 
    {
        
        System.out.println("D1 reached."); 
    }
}

class D2 extends Thread
{
	D2(ThreadGroup tg, String name)
    {
        super(tg, name);
    }

    public void run() 
    {
        
        System.out.println("D2 reached."); 
    }
}

class D3 extends Thread
{
	D3(ThreadGroup tg, String name)
    {
        super(tg, name);
    }

    public void run() 
    {
        
        System.out.println("D3 reached."); 
    }
}