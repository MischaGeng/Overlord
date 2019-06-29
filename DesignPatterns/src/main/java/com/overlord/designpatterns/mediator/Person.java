package com.overlord.designpatterns.mediator;

/**
 * 抽象同事角色
 */
public abstract class Person {
    protected Mediator mediator;

    public Person(Mediator mediator) {
        this.mediator = mediator;
        this.mediator.register(this);
    }

    public abstract void send(String msg);

    public abstract void receive(String msg);
}
