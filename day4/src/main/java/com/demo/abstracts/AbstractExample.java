package com.demo.abstracts;

public abstract class AbstractExample {

	public abstract String car();
	
	

}

class Speed extends AbstractExample {

	@Override
	public String car() {

		return "This car has more speed";
	}

}


