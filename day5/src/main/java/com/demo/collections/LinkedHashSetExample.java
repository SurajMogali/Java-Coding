package com.demo.collections;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LinkedHashSetExample {

	public static void main(String[] args) {
		Set<Integer> set1 = new LinkedHashSet<>();
		for (int i = 20; i > 0; i--) {
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
		
		
		Set<Integer> set2 = new TreeSet<>();
		for (int i = 20; i > 0; i--) {
			set2.add(i);

		}
		System.out.println(set2);

	}

}
