package com.demo.threads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CaseChangerp implements Callable<String> {

	private String name = "suraj";

	public String call() throws Exception
	
	{
		System.out.println(Thread.currentThread().getName());
		String str=name.toUpperCase();
		return str;

	}
	
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		CaseChangerp caseChangerp=new CaseChangerp();
		ExecutorService service=Executors.newCachedThreadPool();
		Future<String> future=service.submit(caseChangerp);
		System.out.println(future.get());
		service.shutdown();
		
		
	}

}
