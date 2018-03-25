package com.example.yoush.pattern.strategypattern;

import android.util.Log;

/**
 * Created by yoush on 2018/3/15.
 */

public class SqueakQuack implements QuackBehavior {
    private static final String TAG = "SqueakQuack";
    @Override
    public void quack() {
        Log.e(TAG, "quack: squeak" );
    }
}
