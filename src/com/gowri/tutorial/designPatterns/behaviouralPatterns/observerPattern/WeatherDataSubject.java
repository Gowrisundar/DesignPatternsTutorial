package com.gowri.tutorial.designPatterns.behaviouralPatterns.observerPattern;

import java.util.ArrayList;
import java.util.List;

public class WeatherDataSubject implements Subject {
	List<Observer> observers; 
	public WeatherDataSubject() {
		this.observers = new ArrayList<Observer>();
	}
	@Override
	public void addObserver(Observer observer) {
		this.observers.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		this.observers.remove(observer);
	}

	@Override
	public void notifyObserver(MeasurementModel measurementModel) {
		for(Observer observer: this.observers) {
			observer.notify(measurementModel);
		}
	}
	
	public void sendMeasurementChanged(MeasurementModel measurementModel) {
		this.notifyObserver(measurementModel);
	}

}
