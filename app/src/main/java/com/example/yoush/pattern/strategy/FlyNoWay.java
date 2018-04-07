package com.example.yoush.pattern.strategy;

import android.util.Log;

/**
 * Created by yoush on 2018/3/15.
 */

public class FlyNoWay implements FlyBehavior {

    private static final String TAG = "FlyNoWay";
    @Override
    public void fly() {
        Log.e(TAG, "fly: i cannot fly ");
    }
}
