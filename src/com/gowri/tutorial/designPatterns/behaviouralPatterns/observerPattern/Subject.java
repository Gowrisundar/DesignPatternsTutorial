package com.gowri.tutorial.designPatterns.behaviouralPatterns.observerPattern;

public interface Subject {

	public void addObserver(Observer observer);
	public void removeObserver(Observer observer);
	public void notifyObserver(MeasurementModel notifyModel);
}
