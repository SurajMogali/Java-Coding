package com.demo.annotation;

import org.springframework.stereotype.Component;

@Component
public class GoodEvening implements Greet {

	@Override
	public String greetMessage() {
		return "Good Evening";
	}

}
