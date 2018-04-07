package com.example.yoush.pattern.singleton.subclass;

/**
 * Created by maomacheal on 2018/4/7.
 */

public class Singleton {

    protected static Singleton uniqueInstance;

    protected Singleton(){};

    public static synchronized Singleton getInstance(){
        if (uniqueInstance == null){
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }
}
