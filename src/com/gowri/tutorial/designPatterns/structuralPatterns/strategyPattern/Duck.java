package com.gowri.tutorial.designPatterns.structuralPatterns.strategyPattern;

public abstract class Duck {
	
	private FlyBehaviour flyBehaviour;
	private QuackBehaviour quackBehaviour;
	
	public abstract void display();
	
	public void performFly() {
		this.flyBehaviour.performFly();
	}
	
	public void perfomrQuack() {
		this.quackBehaviour.performQuack();
	}
	
	public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
		this.flyBehaviour = flyBehaviour;
	}
	
	public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
		this.quackBehaviour = quackBehaviour;
	}
	
}
