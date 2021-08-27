package com.hq.observer;

public class ObserverPerson implements Observer {

    //属性
    private String name;

    //这个具体的观察者订阅的主题
    private Subject subject;

    //构造方法
    public ObserverPerson(String name, Subject subject) {
        this.name = name;
        this.subject = subject;
        //我要注册我自己到一个指定的主题上
        subject.registerObserver(this);
    }

    @Override
    public void update(String msg) {
        System.out.println(name + msg);
    }
}
