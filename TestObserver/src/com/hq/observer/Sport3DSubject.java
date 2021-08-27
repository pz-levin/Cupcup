package com.hq.observer;

import java.util.ArrayList;
import java.util.List;

public class Sport3DSubject implements Subject {

    //定义一个集合存储观察者对象
    private List<Observer> observers = new ArrayList<>();

    private String msg;

    /**
     * 注册观察者，一定有地方存储观察者的对象
     */
    @Override
    public void registerObserver(Observer observer) {
        //添加观察者
        observers.add(observer);

    }

    @Override
    public void removeObserver(Observer observer) {
        //校验这个观察者是否在集合中
        int index = observers.indexOf(observer);
        if(index > 0){
            observers.remove(index);
        }

    }

    @Override
    public void notifyObserver() {
        //遍历观察者
        for(Observer observer : observers){
            //发送消息
            observer.update(msg);
        }
    }

    /**
     * 给福彩主题对象设置要发送的信息
     */
    public void setMsg(String msg) {
        this.msg = msg;
        //通知观察者
        notifyObserver();
    }
}
