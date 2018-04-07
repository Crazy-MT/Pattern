package com.example.yoush.pattern.adapter.ducks;

/**
 * Created by maomacheal on 2018/4/7.
 */

public class MallardDuck implements Duck {
    @Override
    public void quack() {
        System.out.print("Quack");
    }

    @Override
    public void fly() {
        System.out.print("I'm flying");
    }
}
