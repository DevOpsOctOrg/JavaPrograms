package com.training.threads;

public class JoinThread  extends Thread{

	 public void run(){
		 for(int i = 1 ; i < 5 ; i++){
			 try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				 System.out.println(e);
			}
			 System.out.println(i);
		 }
	 }
		
	public static void main(String args[]){
		JoinThread t1 =  new JoinThread();
		JoinThread t2 =  new JoinThread();
		JoinThread t3 =  new JoinThread();
		
		t1.start();
		
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		t2.start();
		t3.start();
	}
	
}
