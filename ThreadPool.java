package com.training.threads;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool {

	public static void main(String args[]) {
		ExecutorService executor = Executors.newFixedThreadPool(5);
		
		for (int i = 0; i < 10; i++) {
			Runnable worker = new WorkingThread(" " + i);
			executor.execute(worker);
		}
		executor.shutdown();
		System.out.println("Finished all thread");
	}

}
