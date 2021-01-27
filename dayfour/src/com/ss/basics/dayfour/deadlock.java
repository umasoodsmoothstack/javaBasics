package com.ss.basics.dayfour;

public class deadlock {
	
	//Initialize variables
	Integer count = 0;
	
	// Initialize method
	synchronized public void increment () {
		count++;
	}
	

	public static void main(String[] args) throws InterruptedException {
		// Create threads
		deadlock d = new deadlock();
		
		// Create two threads that access the d instance at the same time
		Thread t1 = new Thread ("First thread") {
			public void run () {
				while (true) {
					synchronized (d) {
						d.increment();
					}
				}
			}
		};
		
		Thread t2 = new Thread ("Second thread") {
			public void run () {
				while (true) {
					synchronized (d) {
						d.increment();
					}
				}
			}
		};
		
		
		// Start both threads. Deadlock confirmed
		t1.start();
		t2.start();
	}

}
