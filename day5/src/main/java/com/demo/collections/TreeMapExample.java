package com.demo.collections;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {

		Map<Integer, String> m = new TreeMap<>();
		m.put(8, "seven");
		m.put(2, "two");
		m.put(3, "eight");
		m.put(4, "four");
		m.put(10, "ten");
		m.put(1, "six");

		System.out.println(m);
		System.out.println(m.remove(2));
		System.out.println(m);
		System.out.println(m.containsKey(2));
		m.put(4, "fore"); // Overriding value

		for (Entry<Integer, String> e : m.entrySet()) {
			System.out.println(e.getKey() + " " + e.getValue());
		}

	}

}
