package com.training.threads;

public class ThreadSleep extends Thread {

	public void run() {

		for (int i = 1; i < 5; i++) {

			
				try {
					Thread.sleep(400);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
			System.out.println(i);
		}
	}

	public static void main(String args[]) {

		ThreadSleep t1 = new ThreadSleep();
		ThreadSleep t2 = new ThreadSleep();

		t1.start();
		t2.start();
	}

}
