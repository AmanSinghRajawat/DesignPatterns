package com.designpatterns.singleton;

public class Test {
	public static void main(String[] args) {

		SingletonDesignPattern s1 = SingletonDesignPattern.m1();
		SingletonDesignPattern s2 = SingletonDesignPattern.m1();
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());

	}
}
