package com.util;

public class EnumDemo {

	enum Drink {
		SMALL(1), LARGE(2), EXLARGE(4);
		int size;

		Drink(int s) {
			size = s;
		}
	}

	public static void main(String[] args) {

		System.out.println(Drink.values());
	}
}
