package co.threads;

public class ThreadMethods extends Thread{
	
	public void run() {
		
		for(int i=0;i<10;i++) 
		{
		System.out.println("thread methods");
		try 
		{
		System.out.println("thread is going to sleep");
		
		ThreadMethods.sleep(100);
		 
		System.out.println("thread wake up");
		} 
		catch (InterruptedException e) 
		{
			
		e.printStackTrace();
		}
		}
	}
	
	public static void main(String[] args) throws
	InterruptedException{
		
ThreadMethods t = new ThreadMethods();
		
		t.start();
		 
		System.out.println("getstate1 "+t.getState());
		
		System.out.println("getstate2 "+t.getState());
		System.out.println("getstate3 "+t.getState());
		System.out.println("getstate4 "+t.getState());
		System.out.println("thread Name "+t.getName());
		System.out.println("thread Priority "+t.getPriority());
		System.out.println("getstate5"+t.getState());
		System.out.println("ID "+t.getId());
		System.out.println("Stack trace"+t.getStackTrace());
		System.out.println("thread group"+t.getThreadGroup());
	
	}

}
