package com.demo.threads;

public class Task extends Thread {

	@Override
	public void run() {
		String threadName = Thread.currentThread().getName();
		System.out.println(threadName + " " + "started");
		try {
			for (int i = 0; i <= 5; i++) {
				System.out.println(threadName + " " + "running");
				Thread.sleep(1000);

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(threadName + " " + "ended");

	}
}
