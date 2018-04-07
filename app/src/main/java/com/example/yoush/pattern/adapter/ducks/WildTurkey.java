package com.example.yoush.pattern.adapter.ducks;

/**
 * Created by maomacheal on 2018/4/7.
 */

public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.print("Gobble gobble");
    }

    @Override
    public void fly() {
        System.out.print("I'm flying a short distance");
    }
}
