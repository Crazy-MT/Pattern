package com.example.yoush.strategypattern.strategypattern;

import android.util.Log;

/**
 * Created by yoush on 2018/3/15.
 */

public class MallardDuck extends Duck {
    private static final String TAG = "MallardDuck";

    public MallardDuck() {
        mQuackBehavior = new MuteQuack();
        mFlyBehavior = new FlyNoWay();
    }

    @Override
    public void display() {
        Log.e(TAG, "display: i am a real mallard duck");
    }
}
