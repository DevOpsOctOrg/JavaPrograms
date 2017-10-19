package com.training.threads;

public class ThreadNames extends Thread{
    
	public void run(){
		System.out.println("Threads running");
	}
	
	
	public static void main(String args[]){
		
		ThreadNames t1 = new ThreadNames();
		ThreadNames t2 = new ThreadNames();
		System.out.println("Thread t1  name before changing  "+ t1.getName());
		System.out.println("Thread t2 name before changing  "+ t2.getName());
		
		t1.start();
		t2.start();
		
		t1.setName("Bank Deposit");
		System.out.println("Thread name after changing  "+ t1.getName());
	}
}
