package com.example.yoush.pattern.observerpattern;

import android.util.Log;

public class ForecastDisplay implements Observer, DisplayElement {
	private static final String TAG = "ForecastDisplay";
	private float currentPressure = 29.92f;  
	private float lastPressure;
	private WeatherData weatherData;

	public ForecastDisplay(WeatherData weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	public void update(float temp, float humidity, float pressure) {
        lastPressure = currentPressure;
		currentPressure = pressure;

		display();
	}

	public void display() {
		if (currentPressure > lastPressure) {
			Log.e(TAG, "Improving weather on the way!");
		} else if (currentPressure == lastPressure) {
			Log.e(TAG, "More of the same");
		} else if (currentPressure < lastPressure) {
			Log.e(TAG, "Watch out for cooler, rainy weather");
		}
	}
}
