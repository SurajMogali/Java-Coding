package com.demo.threads;

public class ThreadMain {

	public static void main(String[] args) throws InterruptedException {
		String tName=Thread.currentThread().getName();
		System.out.println("Thread" + tName + "started......\n");
		
		ThreadExample myThread=new ThreadExample();
		myThread.start();
		myThread.setName("First");
		myThread.join();
		
		ThreadExample myThread2=new ThreadExample();
		myThread2.start();
		myThread2.setName("Second");
		myThread2.join();
		
		
		
		System.out.println("Thread" + tName + "ended......\n");
		

	}

}
