package com.gowri.tutorial.designPatterns.structuralPatterns.strategyPattern;

public class MallardDuck extends Duck{
	
	public MallardDuck() {
		super();
		super.setFlyBehaviour(new FlyWithWings());
		super.setQuackBehaviour(new Quack());
	}

	@Override
	public void display() {
		System.out.println("I am a mallard Duck");
	}

}
