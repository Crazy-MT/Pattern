package com.example.yoush.pattern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.yoush.pattern.javaobserverpattern.CurrentConditionsDisplay;
import com.example.yoush.pattern.javaobserverpattern.ForecastDisplay;
import com.example.yoush.pattern.javaobserverpattern.HeatIndexDisplay;
import com.example.yoush.pattern.javaobserverpattern.StatisticsDisplay;
import com.example.yoush.pattern.javaobserverpattern.WeatherData;
import com.example.yoush.pattern.strategypattern.Duck;
import com.example.yoush.pattern.strategypattern.FlyRocketPowered;
import com.example.yoush.pattern.strategypattern.MallardDuck;
import com.example.yoush.pattern.strategypattern.ModelDuck;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 策略模式
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();

        // 观察者模式
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}
