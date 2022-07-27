package com.gowri.tutorial.designPatterns.behaviouralPatterns.observerPattern;

public class CurrentConditionsDisplay implements Observer, DisplayMeasurement{

	@Override
	public void display(MeasurementModel measurementModel) {
		System.out.println("Temparature: " +measurementModel.getTemp()+ 
				" Pressure: " +measurementModel.getPressure()+ 
				" Humid: " +measurementModel.getHumid());
	}

	@Override
	public void notify(MeasurementModel measurementModel) {
		this.display(measurementModel);
	}

}
