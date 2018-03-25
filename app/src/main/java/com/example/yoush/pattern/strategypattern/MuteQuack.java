package com.example.yoush.pattern.strategypattern;

import android.util.Log;

/**
 * Created by yoush on 2018/3/15.
 */

public class MuteQuack implements QuackBehavior {
    private static final String TAG = "MuteQuack";
    @Override
    public void quack() {
        Log.e(TAG, "quack: silence" );
    }
}
