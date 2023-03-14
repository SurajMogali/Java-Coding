package com.demo.threads;

public class ThreadExample2 implements Runnable {

	public void run() {
		String threadName = Thread.currentThread().getName();
		System.out.println("Thread" + threadName + "started......\n");
		try {
			for (int i = 0; i < 10; i++) {
				System.out.println("Thread" + threadName + "running....\n");
				Thread.sleep(1000);
			}

		} catch (InterruptedException ex) {
			ex.printStackTrace();

		}
		System.out.println("Thread" + threadName + "ended......\n");

	}

}
