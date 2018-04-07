package com.example.yoush.pattern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.yoush.pattern.observer.observerpattern.CurrentConditionsDisplay;
import com.example.yoush.pattern.observer.observerpattern.ForecastDisplay;
import com.example.yoush.pattern.observer.observerpattern.HeatIndexDisplay;
import com.example.yoush.pattern.observer.observerpattern.StatisticsDisplay;
import com.example.yoush.pattern.observer.observerpattern.WeatherData;
import com.example.yoush.pattern.singleton.chocolate.ChocolateBoiler;
import com.example.yoush.pattern.singleton.classic.Singleton;
import com.example.yoush.pattern.singleton.subclass.CoolerSingleton;
import com.example.yoush.pattern.singleton.subclass.HotterSingleton;
import com.example.yoush.pattern.strategy.Duck;
import com.example.yoush.pattern.strategy.FlyRocketPowered;
import com.example.yoush.pattern.strategy.MallardDuck;
import com.example.yoush.pattern.strategy.ModelDuck;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

/*        // 策略模式
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
        weatherData.setMeasurements(78, 90, 29.2f);*/

        Singleton singleton = Singleton.getInstance();
        System.out.print(singleton.getDescription());

        ChocolateBoiler boiler = ChocolateBoiler.getInstance();
        boiler.fill();
        boiler.boil();
        boiler.drain();

        ChocolateBoiler boiler1 = ChocolateBoiler.getInstance();

        com.example.yoush.pattern.singleton.subclass.Singleton foo = CoolerSingleton.getInstance();
        com.example.yoush.pattern.singleton.subclass.Singleton bar = HotterSingleton.getInstance();
        System.out.print(foo);
        System.out.print(bar);

    }
}

