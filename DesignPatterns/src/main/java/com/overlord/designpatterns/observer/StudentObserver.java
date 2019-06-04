package com.overlord.designpatterns.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * 内置观察者接口
 */
public class StudentObserver implements Observer {
    private String name;

    public StudentObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        Teacher t = (Teacher)o;
        System.out.println(t.getName());
        System.out.println(name+":receive"+arg);
    }
}
