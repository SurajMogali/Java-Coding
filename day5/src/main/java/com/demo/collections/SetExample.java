package com.demo.collections;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {
		Set<Integer> set1 = new HashSet<>();
		for (int i = 0; i <=20; i++) {
			set1.add(i);

		}
		System.out.println(set1);
		set1.remove(Integer.valueOf(4));
		System.out.println(set1);
		System.out.println(set1.size());
		System.out.println(set1.contains(2));
		System.out.println(set1.isEmpty());
		set1.clear();
		System.out.println(set1);
		set1.add(4);
		set1.add(4);
		set1.remove(Integer.valueOf(4));
		System.out.println(set1);
		
		
		

	}

}
