package com.training.threads;

public class ThreadPriority extends Thread{

	public void run(){
		System.out.println(" Thread : "+ Thread.currentThread().getName());
		System.out.println(" Thread : "+ Thread.currentThread().getPriority());
		
	}
	
	public static void main(String args[]){
		
		ThreadPriority t1 = new ThreadPriority();
		ThreadPriority t2 = new ThreadPriority();
		ThreadPriority t3 = new ThreadPriority();
		
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		t3.setPriority(Thread.NORM_PRIORITY);
		
		t1.start();
		t2.start();
		t3.start();
	
	}
}
