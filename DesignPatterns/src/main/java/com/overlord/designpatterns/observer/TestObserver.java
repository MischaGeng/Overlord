package com.overlord.designpatterns.observer;

public class TestObserver {
    public static void main(String[] args){
        //创建被观察者
        Observerable observerable = new UserServer();
        //创建观察者
        Observers o1 = new UserObserver("o1");
        Observers o2 = new UserObserver("o2");
        Observers o3 = new UserObserver("o3");
        observerable.registerObserver(o1);
        observerable.registerObserver(o2);
        observerable.registerObserver(o3);
        observerable.notifyMessage("all user stand up");
    }
}
