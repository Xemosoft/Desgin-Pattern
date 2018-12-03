package com.observer;

import java.util.ArrayList;
import java.util.List;

public class Observable {

    List<Observer> observerList = new ArrayList<>();
    private String notification;

    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    public void setNotification(String notification) {
        this.notification = notification;
        notifyObservers();
    }

    private String getNotification() {
        return notification;
    }

    private void notifyObservers(){
        for (Observer observer : observerList) {
            observer.update(getNotification());
        }
    }

}
