package com.natwest.fruitsalad.domain;

import org.springframework.stereotype.Component;

@Component
public class Banana {
	
	int numberofbanana;
	String taste;
	String texture;
	
	public Banana() {
		System.out.println("Bananas are good in a fruit salad");
		
	}
	
	public void secondaryIngredient() {
		System.out.println("Second Banana");
		
	}

}
