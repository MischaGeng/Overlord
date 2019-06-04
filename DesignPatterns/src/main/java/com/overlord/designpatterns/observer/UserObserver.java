package com.overlord.designpatterns.observer;

/**
 * 具体观察者类
 */
public class UserObserver implements Observers {
    private String name;
    public UserObserver(String name){
        this.name = name;
    }
    public void updateInfo(String message) {
        //do something
        System.out.println(name+":"+message);
    }
}
