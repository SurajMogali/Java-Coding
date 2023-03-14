package com.demo.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListNumbers {
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();

		numbers.add(6);
		numbers.add(8);
		numbers.add(0);
		numbers.add(5);
		System.out.println(numbers);

		List<Integer> numbers2 = Arrays.asList(4, 7, 9, 3, 8);
		System.out.println(numbers2);

		numbers.remove(2);
		System.out.println(numbers);

		int getnumber = numbers.get(0);
		System.out.println(getnumber);

		Bus bus1 = new Bus(23, 4);
		Bus bus2 = new Bus(24, 8);
		Bus bus3 = new Bus(25, 6);
		Bus bus4 = new Bus(26, 7);

		List<Bus> buslist = new ArrayList<>();
		buslist.add(bus1);
		buslist.add(bus2);
		buslist.add(bus3);
		buslist.add(bus4);
		System.out.println(buslist);
		
		for(Bus i : buslist)
		{
			System.out.println(i);
		}

	}

}
