package com.gowri.tutorial.designPatterns.structuralPatterns.strategyPattern;

public class Quack implements QuackBehaviour {

	@Override
	public void performQuack() {
		System.out.println("I quack Beep Beep");

	}

}
