package com.demo.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapExample {

	public static void main(String[] args) {

		Map<Integer, String> m = new HashMap<>();
		m.put(1, "one");
		m.put(2, "two");
		m.put(3, "three");
		m.put(4, "four");
		m.put(5, "five");
		m.put(6, "six");

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
