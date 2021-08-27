package com.hq.observer;

public interface Subject {

    //注册观察者
    public void registerObserver(Observer observer);

    //取消观察者
    public void removeObserver(Observer observer);

    //通知观察者
    public void notifyObserver();
}
