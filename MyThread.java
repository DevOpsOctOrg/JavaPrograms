package com.training.threads;

public class MyThread implements  Runnable{
	
	public void run(){
		System.out.println("The Thread started running");
	}
	
	 public static void main(String args[]){
		 MyThread t = new MyThread();
		 Thread t1 = new Thread(t);
		 t1.start();
		 
	 }
}
