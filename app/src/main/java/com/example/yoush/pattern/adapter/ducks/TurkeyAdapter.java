package com.example.yoush.pattern.adapter.ducks;

/**
 * Created by maomacheal on 2018/4/7.
 */

public class TurkeyAdapter implements Duck {

    Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        for (int i = 0; i < 5; i++){
            turkey.fly();
        }
    }
}
