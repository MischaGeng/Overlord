package com.overlord.designpatterns.mediator;

/**
 * 抽象中介者角色
 */
public abstract class Mediator {
    public abstract void register(Person person);

    public abstract void contact(Person person, String msg);
}
