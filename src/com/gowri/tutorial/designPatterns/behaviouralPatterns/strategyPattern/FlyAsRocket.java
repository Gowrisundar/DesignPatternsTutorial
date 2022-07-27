package com.gowri.tutorial.designPatterns.behaviouralPatterns.strategyPattern;

public class FlyAsRocket implements FlyBehaviour {

	@Override
	public void performFly() {
		System.out.println("I Fly Like Rocket");
	}

}
