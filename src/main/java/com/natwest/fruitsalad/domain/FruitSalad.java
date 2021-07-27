package com.natwest.fruitsalad.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FruitSalad {
	
	@Autowired
	private Apple apple;
	@Autowired
	private Banana banana;
	
	public void printFruitSalad() {
		System.out.println("Mix fruit together");
		
		apple.secondaryIngredient();
		banana.secondaryIngredient();
	}

}
