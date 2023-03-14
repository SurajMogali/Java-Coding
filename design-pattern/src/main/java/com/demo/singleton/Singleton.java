package com.demo.singleton;

public class Singleton {
	private static Singleton singleton;
	
	private Singleton()
	{
		System.out.println("Singleton initiated");
	}
	
	public static Singleton instance() {
		 if(singleton==null)
		 {
			 singleton=new Singleton();
			 return singleton;
			 
		 }
		 else
		 {
			 return singleton;
		 }
			
		
	}
	
	
	

}
