package com.Vignesh;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle{

	public void drive() {
		System.out.println("I'm Coming soon");
	}
}
