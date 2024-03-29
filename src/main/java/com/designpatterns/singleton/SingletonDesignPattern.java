package com.designpatterns.singleton;

//Eager Initialization Example

public class SingletonDesignPattern {

	static SingletonDesignPattern s = null; // Lazy Initialization

	public static void main(String[] args) {

	}

	// private constructor
	private SingletonDesignPattern() {

	}

	// static method to return the 'SingletonDesignPattern' Class static object 's'.
	static SingletonDesignPattern m1() {
		if (s == null) {
			s = new SingletonDesignPattern();
		}
		return s;
	}
}
