package com.demo.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

		GreetService greeter = (GreetService) ctx.getBean("greetService");
		greeter.greet();

		ApplicationContext ctx2 = new AnnotationConfigApplicationContext(AppConfig.class);
		Greeting g = (Greeting) ctx2.getBean("greeting");
		g.greetmorning();

	}

}
