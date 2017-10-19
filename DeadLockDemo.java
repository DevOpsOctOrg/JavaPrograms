package com.training.threads;

public class DeadLockDemo {

	public static Object Lock1 = new Object();
	public static Object Lock2 = new Object();

	public static void main(String args[]) {

		ThreadDemo1 T1 = new ThreadDemo1();
		ThreadDemo2 T2 = new ThreadDemo2();
		T1.start();
		T2.start();

	}

	private static class ThreadDemo1 extends Thread {
		public void run() {
			synchronized (Lock1) {
				System.out.println("Thread 1 is holding .. lock1");

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Thread 1 is waiting for lock2");

				synchronized (Lock2) {
					System.out.println("Thread 1 is holding Lock 1 and 2");
				}

			}
		}

	}

	private static class ThreadDemo2 extends Thread {
		public void run() {
			synchronized (Lock1) {
				System.out.println("Thread 2 is holding .. lock2");

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Thread 2 is waiting for lock1");

				synchronized (Lock2) {
					System.out.println("Thread 2 is holding Lock  1 and 2");
				}

			}
		}

	}

}
