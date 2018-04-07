package com.example.yoush.pattern.strategy;

import android.util.Log;

/**
 * Created by yoush on 2018/3/15.
 */

public class Quack implements QuackBehavior {
    private static final String TAG = "Quack";
    @Override
    public void quack() {
        Log.e(TAG, "quack: ");
    }
}
