package com.gowri.tutorial.designPatterns.behaviouralPatterns.strategyPattern;

public class TestStrategyPattern {

	public static void main(String[] args) {
		Duck duck = new MallardDuck();
		duck.performFly();
		duck.perfomrQuack();
		
		Duck modelDuck = new ModelDuck();
		modelDuck.performFly();
		modelDuck.perfomrQuack();
		
		//Adding fly behavior Dynamically
		modelDuck.setFlyBehaviour(new FlyAsRocket());
		modelDuck.performFly();

	}

}
