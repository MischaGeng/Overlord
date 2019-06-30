package com.overlord.designpatterns.memento;

/*
 * @Description:
 *
 * @author MischaGeng
 * @Created Date: 2019/06/30
 * @Since JDK 1.8
 * @Title: MementoPatternDemo
 * @ProjectName overlord
 *
 * @Modified by:
 * @Modified date:
 * @Problem no:
 */
public class MementoPatternDemo {
    public static void main(String[] args) {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();
        originator.setState("State #1");
        originator.setState("State #2");
        careTaker.add(originator.saveStateToMemento());
        originator.setState("State #3");
        careTaker.add(originator.saveStateToMemento());
        originator.setState("State #4");

        System.out.println("Current State: " + originator.getState());
        originator.getStateFromMemento(careTaker.get(0));
        System.out.println("First saved State: " + originator.getState());
        originator.getStateFromMemento(careTaker.get(1));
        System.out.println("Second saved State: " + originator.getState());
    }
}
