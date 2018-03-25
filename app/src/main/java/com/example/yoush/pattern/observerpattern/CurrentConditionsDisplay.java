package com.example.yoush.pattern.observerpattern;

import android.util.Log;

/**
 * Created by maomacheal on 2018/3/25.
 */

public class CurrentConditionsDisplay implements Observer,DisplayElement {

    private static final String TAG = "CurrentConditionsDisplay";

    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        Log.e(TAG, "Current conditions:" + temperature + " F degrees and " + humidity + "% humidity");
    }
}
