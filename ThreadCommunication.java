package com.training.threads;

class Customer {
	int amount = 1000;

	synchronized void withdraw(int amount) {
		System.out.println("going to withdraw..");

		if (this.amount < amount) {
			System.out.println("Less Balance ; waiting for the deposit");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.amount -= amount;
		System.out.println("withdraw completed");
	}

	synchronized void deposit(int amount) {
		System.out.println(" going to deposit");
		this.amount += amount;
		System.out.println(" deposit completed");
		notify();
	}

}

public class ThreadCommunication {

	public static void main(String args[]) {
		final Customer cust = new Customer();

		new Thread() {
			public void run() {
				cust.withdraw(15000);
			}
		}.start();

		new Thread() {
			public void run() {
				cust.deposit(10000);
			}
		}.start();

	}

}
