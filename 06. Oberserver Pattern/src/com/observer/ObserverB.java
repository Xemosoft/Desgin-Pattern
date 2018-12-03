package com.observer;

public class ObserverB implements Observer {
    @Override
    public void update(String weather) {
        System.out.println("ObserverB : " + weather);
    }
}
