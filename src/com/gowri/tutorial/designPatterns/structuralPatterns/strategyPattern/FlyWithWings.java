package com.gowri.tutorial.designPatterns.structuralPatterns.strategyPattern;

public class FlyWithWings implements FlyBehaviour {

	@Override
	public void performFly() {
		System.out.println("I Fly with wings");
	}

}
