package com.example.yoush.pattern.observerpattern;

/**
 * Created by maomacheal on 2018/3/25.
 */

public interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
