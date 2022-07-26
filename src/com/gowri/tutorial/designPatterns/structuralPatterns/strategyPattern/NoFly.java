package com.gowri.tutorial.designPatterns.structuralPatterns.strategyPattern;

public class NoFly implements FlyBehaviour{

	@Override
	public void performFly() {
		System.out.println("Warnin....I wont fly");
	}

}
