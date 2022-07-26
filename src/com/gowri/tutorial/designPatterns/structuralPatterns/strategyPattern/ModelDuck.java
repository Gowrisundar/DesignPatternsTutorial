package com.gowri.tutorial.designPatterns.structuralPatterns.strategyPattern;

public class ModelDuck extends Duck{
	
	public ModelDuck() {
		super.setFlyBehaviour(new NoFly());
		super.setQuackBehaviour(new Quack());
	}

	@Override
	public void display() {
		System.out.println("I am a model Duck");
	}

}
