package com.demo.threads;

public class ThreadMain2 {

	public static void main(String[] args) throws InterruptedException {
		String tName=Thread.currentThread().getName();
		System.out.println("Thread" + tName + "started......\n");
		
		Thread m1=new Thread(new ThreadExample2());
		m1.start();
		m1.setName("First");
		m1.join();
		
		Thread m2=new Thread(new ThreadExample2());
		m2.start();
		m2.setName("Second");
		m2.join();
		
		
		
		System.out.println("Thread" + tName + "ended......\n");
		
	}

}
