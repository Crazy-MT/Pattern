package com.example.yoush.pattern.singleton.stat;

/**
 * Created by maomacheal on 2018/4/7.
 */

public class Singleton {

    private static Singleton uniqueInstance = new Singleton();

    private Singleton(){}

    public static Singleton getInstance(){
        return uniqueInstance;
    }

    public String getDescription(){
        return "I'm a statically initialized Singleton";
    }
}
