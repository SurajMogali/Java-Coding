package com.demo.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Greeting {

	@Autowired
	GoodMorning good;

	public void greetmorning() {
		System.out.println(good.greetMessage());

	}

}
