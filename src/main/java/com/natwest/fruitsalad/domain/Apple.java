package com.natwest.fruitsalad.domain;

import org.springframework.stereotype.Component;

@Component
public class Apple {
	
	String typeofapple;
	int noofapple;
	String taste;
	
	public Apple() {
		System.out.println("Apples are good in a fruit salad");
		
	}
	
	public void secondaryIngredient() {
		System.out.println("Second Apple");
		
	}

}
