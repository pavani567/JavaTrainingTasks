package com.threads;

public class MyRunnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    Thread thread = new Thread();
	    thread.start();
	    System.out.println("This code is outside of the thread");
	  }
	  public void run() {
	    System.out.println("This code is running in a thread");
	}

}
