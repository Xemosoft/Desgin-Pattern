package com.observer;

public class ObserverA implements Observer {
    @Override
    public void update(String weather) {
        System.out.println("ObserverA : " + weather);
    }
}
