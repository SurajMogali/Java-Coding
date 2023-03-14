package com.demo.factory;

public class CycleFactory {
	public static  Cycle createCycle(String input) {
		if (input.equals("uni")) {
			return new Unicycle();

		} else if (input.equals("bi")) {
			return new Bicycle();

		}
		if (input.equals("tri")) {
			return new Tricycle();

		} else
			throw new RuntimeException("Invalid input");
	}

}
