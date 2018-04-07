package com.example.yoush.pattern.singleton.subclass;

/**
 * Created by maomacheal on 2018/4/7.
 */

public class CoolerSingleton extends Singleton {

    protected static Singleton uniqueInstance;

    private CoolerSingleton(){
        super();
    }
}
