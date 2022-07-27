package com.gowri.tutorial.designPatterns.behaviouralPatterns.observerPattern;

public class TestObserverPattern {
	public static void main(String[] args) {
		WeatherDataSubject weatherDataSubject = new WeatherDataSubject();
		Observer forecastObserver = new ForecastDisplay();
		Observer currentConditionsObserver = new CurrentConditionsDisplay();
		
		weatherDataSubject.addObserver(forecastObserver);
		weatherDataSubject.addObserver(currentConditionsObserver);
		
		MeasurementModel newMeasurement = new MeasurementModel();
		newMeasurement.setHumid(60);
		newMeasurement.setPressure(40);
		newMeasurement.setTemp(30);
		
		weatherDataSubject.sendMeasurementChanged(newMeasurement);
		newMeasurement.setHumid(40);
		newMeasurement.setPressure(40);
		newMeasurement.setTemp(40);
		weatherDataSubject.sendMeasurementChanged(newMeasurement);
	}
}
