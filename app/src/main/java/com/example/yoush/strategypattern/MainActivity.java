package com.example.yoush.strategypattern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.yoush.strategypattern.strategypattern.Duck;
import com.example.yoush.strategypattern.strategypattern.FlyRocketPowered;
import com.example.yoush.strategypattern.strategypattern.MallardDuck;
import com.example.yoush.strategypattern.strategypattern.ModelDuck;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
