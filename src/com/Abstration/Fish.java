package com.Abstration;

public class Fish extends Animal {

	@Override
	String move() {

		return "Fish move by swimming.";
	}

	@Override
	String eat() {

		return "Fish eat seefood.";
	}

}
