package com.demo.builder;

public class Phone {
	String os;
	int ram;
	String processor;
	double battery;

	public Phone(String os, int ram, String processor, double battery) {

		this.os = os;
		this.ram = ram;
		this.processor = processor;
		this.battery = battery;
	}

	public Phone() {
		
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public String getProcessor() {
		return processor;
	}

	public void setProcessor(String processor) {
		this.processor = processor;
	}

	public double getBattery() {
		return battery;
	}

	public void setBattery(double battery) {
		this.battery = battery;
		
	}

	@Override
	public String toString() {
		return "Phone [os=" + os + ", ram=" + ram + ", processor=" + processor + ", battery=" + battery + "]";
	}
	
	
	
	

	
}
