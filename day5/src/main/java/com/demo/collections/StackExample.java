package com.demo.collections;

import java.util.Stack;

public class StackExample {
	public static void main(String[] args) {
		Stack<String> words=new Stack<>();
		words.push("hi");
		words.push("hello");
		System.out.println(words);
		System.out.println(words.peek());
		String s2= words.pop();
		System.out.println(words);
		
		
		
		
		
		
	}

}
