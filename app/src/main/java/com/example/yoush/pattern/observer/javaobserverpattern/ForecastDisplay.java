package com.example.yoush.pattern.observer.javaobserverpattern;

import android.util.Log;

import java.util.Observable;
import java.util.Observer;

public class ForecastDisplay implements Observer, DisplayElement {
	private static final String TAG = "ForecastDisplay";
	private float currentPressure = 29.92f;  
	private float lastPressure;

	public ForecastDisplay(Observable observable) {
		observable.addObserver(this);
	}

	public void update(Observable observable, Object arg) {
		if (observable instanceof WeatherData) {
			WeatherData weatherData = (WeatherData)observable;
			lastPressure = currentPressure;
			currentPressure = weatherData.getPressure();
			display();
		}
	}

	public void display() {
		if (currentPressure > lastPressure) {
			Log.e(TAG, "Improving weather on the way!" );
		} else if (currentPressure == lastPressure) {
			Log.e(TAG, "More of the same");
		} else if (currentPressure < lastPressure) {
			Log.e(TAG,  "Watch out for cooler, rainy weather");
		}
	}
}
