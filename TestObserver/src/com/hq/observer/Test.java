package com.hq.observer;

public class Test {

    public static void main(String[] args) {

        //创建一个主题
        Sport3DSubject subject = new Sport3DSubject();

        //创建三个观察者
        ObserverPerson p1 = new ObserverPerson("张三",subject);
        ObserverPerson p2 = new ObserverPerson("李四",subject);
        ObserverPerson p3 = new ObserverPerson("王五",subject);

        //取消订阅
        subject.removeObserver(p2);

        subject.setMsg("您好，本期的开奖结果是01 32 02 22 12");
    }
}
