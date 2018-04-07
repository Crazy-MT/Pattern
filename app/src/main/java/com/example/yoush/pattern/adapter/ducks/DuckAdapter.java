package com.example.yoush.pattern.adapter.ducks;

import java.util.Random;

/**
 * Created by maomacheal on 2018/4/7.
 */

public class DuckAdapter  implements Turkey{

    Duck duck;
    Random rand;

    public DuckAdapter(Duck duck) {
        this.duck = duck;
        rand = new Random();
    }

    @Override
    public void gobble() {
        duck.quack();
    }

    @Override
    public void fly() {
        if (rand.nextInt(5) == 0){
            duck.fly();
        }
    }
}
