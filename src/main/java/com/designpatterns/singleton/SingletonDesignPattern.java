package com.designpatterns.singleton;

//Eager Initialization Example

public class SingletonDesignPattern {

	// this static object will be return from static method 'm1()'.
	static SingletonDesignPattern s = new SingletonDesignPattern();

	// private constructor
	private SingletonDesignPattern() {

	}

	// static method to return the 'SingletonDesignPattern' Class static object 's'.
	static SingletonDesignPattern m1() {
		return s;
	}
}
