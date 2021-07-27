package com.natwest.fruitsalad.domain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class FruitSaladApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(FruitSaladApplication.class, args);
		System.out.println(context.getBean("message", String.class));
		FruitSalad fs = context.getBean(FruitSalad.class);
		fs.printFruitSalad();
	}

}
