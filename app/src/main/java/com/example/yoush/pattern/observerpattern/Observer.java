package com.example.yoush.pattern.observerpattern;

/**
 * Created by maomacheal on 2018/3/25.
 */

public interface Observer {
    void update(float temp, float humidity, float pressure);
}
