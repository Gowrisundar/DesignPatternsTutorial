package com.gowri.tutorial.designPatterns.behaviouralPatterns.observerPattern;

public class MeasurementModel {
	private int temp;
	private int humid;
	private int pressure;
	
	public int getTemp() {
		return temp;
	}
	public void setTemp(int temp) {
		this.temp = temp;
	}
	public int getHumid() {
		return humid;
	}
	public void setHumid(int humid) {
		this.humid = humid;
	}
	public int getPressure() {
		return pressure;
	}
	public void setPressure(int pressure) {
		this.pressure = pressure;
	}
}
