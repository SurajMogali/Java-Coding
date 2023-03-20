package com.demo.collections;

import java.util.Arrays;
import java.util.Vector;

public class VectorExample {

	Vector<Integer> vector = new Vector<>();
	public void addvector() {
		for(int i:vector)
		{
			vector.add(i);
		}
		
		
		
		
	}
	
	public static void main(String[] args) {
		VectorExample e=new VectorExample();
		e.addvector();
		System.out.println(e);
	}
	

}

