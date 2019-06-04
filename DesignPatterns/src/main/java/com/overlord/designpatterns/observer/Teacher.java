package com.overlord.designpatterns.observer;

import java.util.Observable;

/**
 * 内置被观察者接口
 */
public class Teacher extends Observable {
    private String info;
    private String name;
    public Teacher(String info,String name){
        this.info = info;
        this.name = name;
    }

    public void setWork(){
        setChanged();
        notifyObservers(info);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
