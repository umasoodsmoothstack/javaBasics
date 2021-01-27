package com.ss.basics.dayfour;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.Random;

public class ProducerConsumer {
	
	private static BlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(10);

	private static void producer() throws InterruptedException {
		Random random = new Random();
		
		while(true) {
			queue.put(random.nextInt(100));
		}
	}
	
	private static void consumer() throws InterruptedException {
		
		while (true) {
			
			// Run once a second
			Thread.sleep(1000);
			
			Integer value = queue.take();
				
			System.out.println("Value " + value + " has been taken.");
			
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread (new Runnable() {
			public void run() {
				try {
					producer();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		
		Thread t2 = new Thread (new Runnable() {
			public void run() {
				try {
					consumer();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		
		t1.start();
		t2.start();
		
	}

}
