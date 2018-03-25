package com.example.yoush.pattern.strategypattern;

import android.util.Log;

/**
 * Created by yoush on 2018/3/15.
 */

public abstract class Duck {
    private static final String TAG = "Duck";
    FlyBehavior mFlyBehavior;
    QuackBehavior mQuackBehavior;

    public Duck(){}

    public abstract void display();

    public void performFly(){
        mFlyBehavior.fly();
    }

    public void performQuack(){
        mQuackBehavior.quack();
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        mFlyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        mQuackBehavior = quackBehavior;
    }

    public void swim(){
        Log.e(TAG, "All ducks float,event decoys" );
    }

}
