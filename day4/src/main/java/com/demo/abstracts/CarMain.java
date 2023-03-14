package com.demo.abstracts;

public class CarMain {

	public static void main(String[] args) {
		AbstractExample a=new AbstractExample() {
			
			@Override
			public String car() {
				
				return "This is anonymus class";
				
			}
		};
		System.out.println("Main class");
		

	}

}
