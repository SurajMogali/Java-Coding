package com.demo.annotation;

import org.springframework.stereotype.Component;

@Component
public class GoodMorning implements Greet {

	@Override
	public String greetMessage() {
		return "Good Morning";
	}

}
