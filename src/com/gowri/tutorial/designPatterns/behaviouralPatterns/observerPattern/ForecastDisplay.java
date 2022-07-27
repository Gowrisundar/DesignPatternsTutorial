package com.gowri.tutorial.designPatterns.behaviouralPatterns.observerPattern;

public class ForecastDisplay implements Observer, DisplayMeasurement{

	@Override
	public void display(MeasurementModel measurementModel) {
		System.out.println(getTemperatureForecast(measurementModel.getTemp()));
		System.out.println(getHumidForecast(measurementModel.getHumid()));
		System.out.println(getPressureForecast(measurementModel.getPressure()));
	}

	@Override
	public void notify(MeasurementModel measurementModel) {
		this.display(measurementModel);
	}
	
	private String getTemperatureForecast(int temp) {
		String tempForecast = "";
		if(40 < temp) {
			tempForecast = "Nice climate";
		} else {
			tempForecast = "High Temperature";
		}
		return tempForecast;
	}
	
	private String getHumidForecast(int humid) {
		String humidForecast = "";
		if(30 < humid) {
			humidForecast = "Nice Humid";
		} else {
			humidForecast = "High Humid";
		}
		return humidForecast;
	}
	
	private String getPressureForecast(int pressure) {
		String pressureForecast = "";
		if(40 < pressure) {
			pressureForecast = "Nice Pressure";
		} else {
			pressureForecast = "High Pressure";
		}
		return pressureForecast;
	}

}
