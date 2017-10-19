package com.training.threads;

public class WorkingThread implements Runnable {

	private String message;

	public WorkingThread(String s) {
		this.message = s;
	}

	public void run() {
		System.out.println(Thread.currentThread().getName() + " Start message = " + message);
		processmessage();
		System.out.println(Thread.currentThread().getName() + " End");
	}

	private void processmessage() {

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
