package com.example.yoush.pattern.strategy;

import android.util.Log;

/**
 * Created by yoush on 2018/3/15.
 */

public class FlyRocketPowered implements FlyBehavior {

    private static final String TAG = "FlyRocketPowered";
    @Override
    public void fly() {
        Log.e(TAG, "i am flying with a rocket");
    }
}
