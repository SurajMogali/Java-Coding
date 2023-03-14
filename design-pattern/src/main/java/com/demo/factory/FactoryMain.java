package com.demo.factory;

public class FactoryMain {

	public static void main(String[] args) {
		Cycle cycle= CycleFactory.createCycle("uni");
		System.out.println(cycle.getCycleDetails());
		

	}

}
