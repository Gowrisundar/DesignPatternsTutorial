package com.gowri.tutorial.designPatterns.behaviouralPatterns.strategyPattern;

public class FlyWithWings implements FlyBehaviour {

	@Override
	public void performFly() {
		System.out.println("I Fly with wings");
	}

}
