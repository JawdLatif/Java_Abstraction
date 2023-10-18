package com.Abstration;

public class Bird extends Animal {

	@Override
	String move() {

		return "Birds moves by flying.";
	}

	@Override
	String eat() {

		return "Birds eat birdfood.";
	}

}
