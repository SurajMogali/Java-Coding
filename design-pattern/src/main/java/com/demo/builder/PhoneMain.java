package com.demo.builder;

public class PhoneMain {

	public static void main(String[] args) {
		Phone phone=new Phone("Android",4,"Snapdaragon",4500);
		System.out.println(phone);
		
		Phone p1=new PhoneBuilder().setOs("Oxygen").setBattery(6000).getPhone();
		System.out.println(p1);
		
		
		
		
		

	}

}
