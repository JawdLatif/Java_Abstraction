package com.Abstration;

public class AnimalsDetials {

	public static void main(String[] args) {
		System.out.println("**********Bird**********\n");

		Animal obj1 = new Bird();
		System.out.println(obj1.move());
		System.out.println(obj1.eat());
		obj1.detials();
		System.out.println("**********Fish**********\n");

		Animal obj2 = new Fish();
		System.out.println(obj2.move());
		System.out.println(obj2.eat());
		obj2.detials();

	}

}
