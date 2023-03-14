package com.demo.factory;

public interface Cycle {
	public String getCycleDetails();

}

class Unicycle implements Cycle {

	public String getCycleDetails() {
		return ("Cycle with one wheel");

	}

}

class Bicycle implements Cycle {

	public String getCycleDetails() {
		return ("Cycle with two wheel");

	}

}

class Tricycle implements Cycle {

	public String getCycleDetails() {
		return ("Cycle with three wheel");

	}

}
