package com.demo.collections;

public class Bus {
	int seater;
	int wheel;

	public Bus(int seater, int wheel) {
		super();
		this.seater = seater;
		this.wheel = wheel;
	}

	public int getSeater() {
		return seater;
	}

	public void setSeater(int seater) {
		this.seater = seater;
	}

	public int getWheel() {
		return wheel;
	}

	public void setWheel(int wheel) {
		this.wheel = wheel;
	}

	@Override
	public String toString() {
		return "Bus [seater=" + seater + ", wheel=" + wheel + "]";
	}
	
	

}
