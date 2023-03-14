package com.demo.collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		
		Queue<String> q=new LinkedList<>();
		q.add("hi");
		q.add("suraj");
		System.out.println(q);
		System.out.println(q.peek());
		String s2=q.poll();
		System.out.println(q);
		
		
		
		

	}

}
