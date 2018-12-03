package com.observer;

public class Main {

    public static void main(String[] args) {

        Observable observable = new Observable();

        Observer observerA = new ObserverA();
        Observer observerB = new ObserverB();

        observable.addObserver(observerA);
        observable.addObserver(observerB);

        observable.setNotification("Rainy Season !!");

        observable.setNotification("Winter Season Coming !!");



    }

}
