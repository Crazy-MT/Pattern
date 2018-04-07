package com.example.yoush.pattern.observer.observerpattern;

/**
 * Created by maomacheal on 2018/3/25.
 */

public interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
