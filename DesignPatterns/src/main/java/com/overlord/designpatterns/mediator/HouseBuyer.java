package com.overlord.designpatterns.mediator;

/**
 * 具体同事角色
 */
public class HouseBuyer extends Person {
    public HouseBuyer(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void send(String msg) {
        mediator.contact(this, msg);
    }

    @Override
    public void receive(String msg) {
        System.out.println("HouseBuyer received :" + msg);
    }
}
